package collins.prince.domain.music.services;

import collins.prince.domain.music.models.Hit;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TrackServiceImpl implements TrackService {
    private RestTemplate restTemplate;

    @Value("${track.api.key}")
    private String apiKey;

    public TrackServiceImpl(){restTemplate = new RestTemplate();}

    @PostConstruct
    public void setup(){
        requestDataFromApi();
    }

    @Override
    public Optional<List<Hit>> requestDataFromApi() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String url = "https://shazam.p.rapidapi.com/search?term=%s&locale=en-US&offset=0&limit=5";
            String requestUrl = String.format(url,"cream");
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Host", "shazam.p.rapidapi.com");
            headers.set("X-RapidAPI-Key", apiKey);
            HttpEntity entity = new HttpEntity(headers);
            ResponseEntity<JsonNode> response = restTemplate.exchange(requestUrl, HttpMethod.GET, entity, JsonNode.class);
            JsonNode map = response.getBody();
            JsonNode tracks = map.get("tracks");
            JsonNode hits = tracks.get("hits");
            Hit[] moreHits = mapper.convertValue(hits, Hit[].class);
            log.info(moreHits[0].toString());
            List<Hit> music = Arrays.asList(moreHits);
            return Optional.of(music);
        } catch (RuntimeException ex) {
            log.error(ex.getMessage());
            return Optional.empty();
        }

    }
}
