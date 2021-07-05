package test.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
public class Particulier extends User  implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String Email;
	


	private String nom;
	private String prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	private int numTel;
	
	private String addresse;
	
	private String ville;
	
	private String NiveauEtude;
	
	private String password;
	
	private String critere;
	
	
	
	
	public String getCritere() {
		return critere;
	}

	public void setCritere(String critere) {
		this.critere = critere;
	}

	public Particulier(Long id, String email, String nom, String prenom, Date dateNaissance, int numTel,
			String addresse, String ville, String niveauEtude, String password, String critere, Profil profile,
			Set<Cv> cvs) {
		super();
		this.id = id;
		Email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numTel = numTel;
		this.addresse = addresse;
		this.ville = ville;
		NiveauEtude = niveauEtude;
		this.password = password;
		this.critere = critere;
		this.profile = profile;
		this.cvs = cvs;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Enumerated
	
	private Profil profile;
	
	
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy="particulier")
	private Set<Cv> cvs;


	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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

	public String getNiveauEtude() {
		return NiveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		NiveauEtude = niveauEtude;
	}

	public Profil getProfile() {
		return profile;
	}

	public void setProfile(Profil profile) {
		this.profile = profile;
	}

	public Set<Cv> getCvs() {
		return cvs;
	}

	public void setCvs(Set<Cv> cvs) {
		this.cvs = cvs;
	}

	public Particulier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Particulier(String email, String nom, String prenom, Date dateNaissance, int numTel, String addresse,
			String ville, String niveauEtude, String password, Profil profile, Set<Cv> cvs) {
		super();
		Email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numTel = numTel;
		this.addresse = addresse;
		this.ville = ville;
		NiveauEtude = niveauEtude;
		this.password = password;
		this.profile = profile;
		this.cvs = cvs;
	}
	
	public Particulier(Long id, String email, String nom, String prenom, Date dateNaissance, int numTel,
			String addresse, String ville, String niveauEtude, String password, Profil profile, Set<Cv> cvs) {
		super();
		this.id = id;
		Email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numTel = numTel;
		this.addresse = addresse;
		this.ville = ville;
		NiveauEtude = niveauEtude;
		this.password = password;
		this.profile = profile;
		this.cvs = cvs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
