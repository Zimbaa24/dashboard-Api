package collins.prince.domain.music.services;

import collins.prince.domain.music.models.Hit;

import java.util.List;
import java.util.Optional;

public interface TrackService {
    Optional<List<Hit>> requestDataFromApi();
}
