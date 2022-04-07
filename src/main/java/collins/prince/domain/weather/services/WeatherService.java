package collins.prince.domain.weather.services;

import collins.prince.domain.weather.models.WeatherApiResponse;

import java.util.Optional;

public interface WeatherService {
    Optional<WeatherApiResponse> requestDataFromApi(String lat, String lon);
}
