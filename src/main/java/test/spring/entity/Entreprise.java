package test.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Entreprise  extends User  implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	

	private String RegistreCommerce;
	private String Email;
	private String nomEntreprise;
	private String nom;
	private String prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	private int numTel;
	private int numTel2;
	
	private String addresse;
	
	private String ville;
	
	private String pays;
	
	private String mail;
	
	private String password;
	
	private String critere;
	

	public String getCritere() {
		return critere;
	}

	
	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public void setCritere(String critere) {
		this.critere = critere;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRegistreCommerce() {
		return RegistreCommerce;
	}

	public void setRegistreCommerce(String registreCommerce) {
		RegistreCommerce = registreCommerce;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public int getNumTel2() {
		return numTel2;
	}

	public void setNumTel2(int numTel2) {
		this.numTel2 = numTel2;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Entreprise(String registreCommerce, String nomEntreprise, String nom, String prenom, Date dateNaissance,
			int numTel, int numTel2, String addresse, String ville, String pays, String mail) {
		super();
		RegistreCommerce = registreCommerce;
		this.nomEntreprise = nomEntreprise;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numTel = numTel;
		this.numTel2 = numTel2;
		this.addresse = addresse;
		this.ville = ville;
		this.pays = pays;
		this.mail = mail;
	}
	
	public Entreprise(Long id, String registreCommerce, String nomEntreprise, String nom, String prenom,
			Date dateNaissance, int numTel, int numTel2, String addresse, String ville, String pays, String mail,
			String password) {
		super();
		Id = id;
		RegistreCommerce = registreCommerce;
		this.nomEntreprise = nomEntreprise;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numTel = numTel;
		this.numTel2 = numTel2;
		this.addresse = addresse;
		this.ville = ville;
		this.pays = pays;
		this.mail = mail;
		this.password = password;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

}
