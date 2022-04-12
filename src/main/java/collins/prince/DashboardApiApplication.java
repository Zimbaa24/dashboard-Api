package collins.prince;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DashboardApiApplication {
	private static Logger log = LoggerFactory.getLogger(DashboardApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DashboardApiApplication.class, args);
	}

//	@Autowired
//	private WeatherService weatherService;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Optional<WeatherApiResponse> response = weatherService.requestDataFromApi("39.7447", "-75.5484");
//		if (response.isEmpty()) {
//			log.info("No Beuno");
//			return;
//		}
//		WeatherApiResponse data = response.get();
//		log.info(data.toString());
//	}


}
