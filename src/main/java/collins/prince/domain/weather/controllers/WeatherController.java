package collins.prince.domain.weather.controllers;

import collins.prince.domain.weather.models.Weather;
import collins.prince.domain.weather.models.WeatherApiResponse;
import collins.prince.domain.weather.services.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3001")
@RequestMapping("weather")
@Slf4j
public class WeatherController {
    private WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @RequestMapping("")
    public ResponseEntity<WeatherApiResponse> requestWeather(@RequestParam(name= "lon", required = false) String lon,
                                                             @RequestParam(name= "lat", required = false) String lat){
        Optional<WeatherApiResponse> response = weatherService.requestDataFromApi(lat, lon);
        log.info(response.toString());
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
