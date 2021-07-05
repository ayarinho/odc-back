package test.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.spring.entity.Cv;
import test.spring.entity.Entreprise;
import test.spring.entity.Particulier;
import test.spring.repository.CvRepository;
import test.spring.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceImpl {

	  
	 @Autowired
      EntrepriseRepository entrepriseRepo;
	 
	 @Autowired
      CvRepository cvRepo;
	 
	 
	  
	 public Entreprise InscriptionEntreprise(Entreprise entreprise) {
		 
		   entrepriseRepo.save(entreprise);
		 
		   entreprise.setCritere("entreprise");
		 
		 return entreprise;
	 }
	 
	 
	 public List<Cv> ListCv(){
		 
		  	List<Cv> cvs= (List<Cv>) cvRepo.findAll();

		 
		 return cvs;	 
	 }
	 
	 
	  public Entreprise Login( String email , String password ) {
		  
		  	List<Entreprise> entreprises= (List<Entreprise>) entrepriseRepo.findAll();
	
	  
			for (Entreprise entreprise: entreprises) {
		
		    
				 if ( entreprise.getEmail().equals(email) && entreprise.getPassword().equals(password)) {
					 
					 
					 return entreprise;
					 
					 
				 }
				}
			return null;
		  
	  }
}
