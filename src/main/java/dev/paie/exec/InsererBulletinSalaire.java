package dev.paie.exec;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entite.BulletinSalaire;
import dev.paie.entite.Periode;
import dev.paie.entite.RemunerationEmploye;
import dev.paie.repository.BulletinRepository;
@Controller
@Profile("insererBulletin")
public class InsererBulletinSalaire implements CommandLineRunner{
	
	private BulletinRepository bulletinRepo;

	public InsererBulletinSalaire(BulletinRepository bulletinRepo) {
		super();
		this.bulletinRepo = bulletinRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		BulletinSalaire bulletin= new BulletinSalaire();
		Periode periode= new Periode();
		periode.setId(1);
	
		RemunerationEmploye remuneration= new RemunerationEmploye();
		remuneration.setId(1);
		
		bulletin.setPeriode(periode);
		bulletin.setPrimeExceptionnelle(new BigDecimal("1500.00"));
		bulletin.setRemunerationEmploye(remuneration);
		
		bulletinRepo.save(bulletin);
		

		
	}
	
	
	
	

}
