package dev.paie.exec;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entite.Cotisation;
import dev.paie.repository.CotisationRepository;

@Controller
@Profile("listerCotisations")
public class ListerCotisations implements CommandLineRunner{
	
	
	private CotisationRepository cotisationRepo;
	
	public ListerCotisations(CotisationRepository cotisationRepo) {
		
		this.cotisationRepo= cotisationRepo;
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Cotisation> cotisations = cotisationRepo.findAll();
		
		for (Cotisation cotisation : cotisations) {
			
			System.out.println(cotisation);
			
		}
		
	}
	
	

}
