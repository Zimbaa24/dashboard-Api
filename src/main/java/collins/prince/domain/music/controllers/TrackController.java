package collins.prince.domain.music.controllers;

import collins.prince.domain.music.models.Hit;
import collins.prince.domain.music.models.Track;
import collins.prince.domain.music.services.TrackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3001")
@RequestMapping("track")
@Slf4j
public class TrackController {
    TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService){
        this.trackService = trackService;
    }

    @RequestMapping("")
    public ResponseEntity<List<Track>> requestMusic(@RequestParam(name = "song", required = false) String song,
                                                    @RequestParam(name = "artist", required = false) String artist){
        Optional<List<Hit>> response = trackService.requestDataFromApi();
        log.info(response.toString());
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
