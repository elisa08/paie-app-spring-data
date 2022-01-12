package dev.paie.exec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entite.Entreprise;
import dev.paie.entite.Grade;
import dev.paie.entite.ProfilRemuneration;
import dev.paie.entite.RemunerationEmploye;
import dev.paie.repository.RemunerationRepository;
@Controller
@Profile("insererRemun")
public class InsererRemuneration implements CommandLineRunner{
	
	private RemunerationRepository remunerationRepo;
	
	

	public InsererRemuneration(RemunerationRepository remunerationRepo) {
		super();
		this.remunerationRepo = remunerationRepo;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RemunerationEmploye  remuneration= new RemunerationEmploye();
		Entreprise entreprise= new Entreprise();
		entreprise.setId(1);
		Grade grade= new Grade();
		grade.setId(1);
		ProfilRemuneration profil= new ProfilRemuneration();
		profil.setId(1);
		remuneration.setEntreprise(entreprise);
		remuneration.setGrade(grade);
		remuneration.setMatricule("AAB255");
		remuneration.setProfilRemuneration(profil);
		
		remunerationRepo.save(remuneration);
	
	}

}
