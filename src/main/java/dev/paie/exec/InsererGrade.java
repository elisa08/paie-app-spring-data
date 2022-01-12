package dev.paie.exec;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entite.Grade;
import dev.paie.repository.GradeRepository;
@Controller
@Profile("isertGrade")
public class InsererGrade implements CommandLineRunner{
	
	private GradeRepository gradeRepo;
	
	public InsererGrade(GradeRepository gradeRepo) {
		
		super();
		this.gradeRepo= gradeRepo;
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Grade grade= new Grade();
		grade.setCode("Blabla");
		grade.setNbHeuresBase(new BigDecimal("158.00"));
		grade.setTauxBase(new BigDecimal("41"));
		
		gradeRepo.save(grade);
		
		System.out.println("grade inséré");
		
	}
	
	

}
