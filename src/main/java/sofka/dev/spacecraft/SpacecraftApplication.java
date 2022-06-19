package sofka.dev.spacecraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sofka.dev.spacecraft.models.MannedSpaceCraft;
import sofka.dev.spacecraft.models.SpaceCraft;
import sofka.dev.spacecraft.models.UnmannedSpaceCraft;
import sofka.dev.spacecraft.repositories.IMannedSpaceCraftRepository;

@SpringBootApplication
public class SpacecraftApplication {






	public static void main(String[] args) {


		SpringApplication.run(SpacecraftApplication.class, args);
	}

}
