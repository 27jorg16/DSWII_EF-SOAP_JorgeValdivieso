package pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DswiiEfCacheJorgeValdiviesoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiEfCacheJorgeValdiviesoApplication.class, args);
	}

}
