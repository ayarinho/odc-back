package test.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import test.spring.entity.Cv;
import test.spring.entity.Entreprise;
import test.spring.entity.Particulier;
import test.spring.repository.CvRepository;
import test.spring.service.EntrepriseServiceImpl;
import test.spring.service.ParticulierServiceImp;


@RestController
@CrossOrigin(origins="*", allowedHeaders = "*" )
public class ParticulierRestController {
	
	
	 @Autowired
	 ParticulierServiceImp particulierService;
	 
	 @Autowired
	 
	  EntrepriseServiceImpl entrepriseService;
	 
	 
	 

		@PostMapping("/InscriptionParticulier")
		@ResponseBody
		
		public Particulier  InscriptionParticulier(@RequestBody Particulier  particulier){
			
		
			return particulierService.InscriptionParticulier(particulier);
		}
		
		@PostMapping("/AddCv/{idParticulier}")
		@ResponseBody
		
		public Cv  AddCv(@RequestBody Cv  cv , @PathVariable("idParticulier") Long idParticulier){
			
		
			return particulierService.AddCv(cv, idParticulier);
		}
		
		
		@PostMapping("/AddCv1")
		@ResponseBody
		
		public Cv  AddCv1(@RequestBody Cv  cv ){
			
		
			return particulierService.Addcv1(cv);
		}
		
		@PostMapping("/login/{email}/{password}")
		@ResponseBody
		
		public Object  Login(@PathVariable("email")String email,@PathVariable("password")String password){
			
		
			return particulierService.Login(email, password);
		}
		
		

		@PostMapping("/InscriptionEntreprise")
		@ResponseBody
		
		public Entreprise  InscriptionEntreprise(@RequestBody Entreprise  entreprise){
			
		
			return entrepriseService.InscriptionEntreprise(entreprise);
		}
		
		
		@PostMapping("/Login/{email}/{password}")
		@ResponseBody
		
		public Entreprise  LoginEntreprise(@PathVariable("email")String email,@PathVariable("password")String password){
			
		
			return entrepriseService.Login(email, password);
		}


		@GetMapping("/listCv")
		@ResponseBody
		
		public List<Cv> listCv(){
			
		
			return entrepriseService.ListCv();
		}
		
		
		@DeleteMapping("/deleteCv/{idCv}")
		@ResponseBody
		
		public void deleteCv(@PathVariable("idCv")Long idCv) {
			
			 
			 particulierService.deleteCv(idCv);
		}
		
		@PostMapping("/inscription3/{critere}")
		@ResponseBody
		
		public void  inscription(@PathVariable("critere")String critere,@RequestBody Particulier  particulier,Entreprise  entreprise){
			
		
			 particulierService.Inscription(critere, entreprise, particulier);
		}

		
}
