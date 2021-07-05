package test.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.spring.entity.Cv;
import test.spring.entity.Entreprise;
import test.spring.entity.Particulier;
import test.spring.repository.CvRepository;
import test.spring.repository.EntrepriseRepository;
import test.spring.repository.ParticulierRepository;
import test.spring.repository.userRepository;

@Service
public class ParticulierServiceImp {
	
	
	 @Autowired
     ParticulierRepository userRepo;	
	 
	 @Autowired
      EntrepriseRepository entrepriseRepo;	
	
	 @Autowired
     CvRepository  cvRepo;
	  
	  public Object Login( String email , String password ) {
		  
		  	List<Particulier> particuliers= (List<Particulier>) userRepo.findAll();
	
		  	List<Entreprise> entreprises= (List<Entreprise>) entrepriseRepo.findAll();
		  	
			for (Particulier particulier: particuliers) {
		
		    
				 if ( particulier.getEmail().equals(email) && particulier.getPassword().equals(password)) {
					 
					 
					 return particulier;
				
				 }
				 
				}
			
			
			for (Entreprise entreprise: entreprises) {
				
			    
				 if ( entreprise.getEmail().equals(email) && entreprise.getPassword().equals(password)) {
					 
					 
					 return entreprise;
					 
					 
				 }
				}
			return null;
		  
	  }
	  
	  
	    
	   public Particulier InscriptionParticulier(Particulier particulier) {
		   
		   particulier.setCritere("particulier");
		   userRepo.save(particulier);
		   
		 
		   
		   return particulier;
		   
		 
	   }
	   
	   
	   public void Inscription(String critere, Entreprise entreprise,Particulier particulier) {
		   
		    if(critere.equals("particulier")) {
		    	
		    	 userRepo.save(particulier);
		    }else {
		    	
		    	entrepriseRepo.save(entreprise);
		    }
		    
		  
	      
		 
	   }
	   
	   
	   
	   
	   
	   public Cv Addcv1(Cv cv) {
		   
		   cvRepo.save(cv);
		    
		    return cv;
	   }
	    
	  public Cv AddCv(Cv cv, Long idParticulier ) {
		   
		     
		  	List<Particulier> particuliers= (List<Particulier>) userRepo.findAll();

		  	
		  	 for(Particulier part: particuliers) {
		  		 
		  		 if(part.getId().equals(idParticulier)) {
		  			 
		  			
		  			  Particulier e=userRepo.findById(idParticulier).get();
		  			  System.out.println(e.getAddresse() );
		  			  
		  			    cv.setParticulier(e);
		  			    cvRepo.save(cv);
		  			 
		  			   
		  			   return cv;
		  		 }
		  	 }
		  	 
		  	 return null;
		    
		   
		    
		   
	   }
	  
	  
	  public void deleteCv(Long idCv) {
		  
		   
		  cvRepo.deleteById(idCv);
		  
	  }
	   
	   
	   
	  
	  
	

}
