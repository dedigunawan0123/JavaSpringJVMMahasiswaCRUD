package com.example.demoMahasiswa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoMahasiswaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMahasiswaApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner(MahasiswaRepository repository) {
		return (args)->{
			repository.save(new Mahasiswa("34567", "Dedi Gunawan", 3.11f, "dedi@gmail.com"));
			repository.save(new Mahasiswa("45678", "Ali Badu", 3.22f, "ali@gmail.com"));
			
		};
	}
	
}

