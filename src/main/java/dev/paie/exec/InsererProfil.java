package dev.paie.exec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entite.ProfilRemuneration;
import dev.paie.repository.ProfilRepository;
@Controller
@Profile("insererProfil")
public class InsererProfil implements CommandLineRunner{
	
	private ProfilRepository profilRepo;
	
	InsererProfil(ProfilRepository profilRepo){
		this.profilRepo = profilRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ProfilRemuneration profil= new ProfilRemuneration();
		
		profil.setCode("cadre");
		profilRepo.save(profil);
		System.out.println("Profil inséré");
		
		
	}
	
	

}
