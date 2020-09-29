package com.glv.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="devis")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Devis implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 637612705314095815L;
	@Id
	@GeneratedValue
	private Long id; 
	private String typeInstallation;
	private String typeAscensseur;
	private int quantite;
	private Long chargeUtile;
	private String modeEntrainement;
	private String provenance;
	private float vitesse;
	private int arret;
	private String acces;
	private String typeGaine;
	private String dimensionTechnique;
	private int course;
	private Long hauteurSousDalle;
	private Long cuvette;
	private String localMachinerie;
	private String alimentationMoteur;
	private Long alimentationEclairage;
	private String typeManoeuvre;
	private String armoireCommande;
	private String modele;
	private String couleur;
	private String dimensionsCabine;
	private String plafond;
	private String revetementSol;
	private String miroir;
	private String porteCabine;
	private String accessoires;
	private String TypePorte;
	private String ouverture;
	private String passage;
	private String finition;
	private double montantUnitaire;
	private double montantTotal;
	private double tva;
	private double montantTtc;
	private String conditionsPaiement;
	private String delaiLivraison;
	private String garantie;
	private String controleTechnique;
	private String entretien; 
	private String nomClient;
	private String prenomClient;
	private String destinataire;
	private String emailClient;
	private String tel;
	private String disponibilité;
	private String etat;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_user")
	private Utilisateur user;
	
	public Devis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Devis(Long id, String typeInstallation, String typeAscensseur, int quantite, Long chargeUtile,
			String modeEntrainement, String provenance, float vitesse, int arret, String acces, String typeGaine,
			String dimensionTechnique, int course, Long hauteurSousDalle, Long cuvette, String localMachinerie,
			String alimentationMoteur, Long alimentationEclairage, String typeManoeuvre, String armoireCommande,
			String modele, String couleur, String dimensionsCabine, String plafond, String revetementSol, String miroir,
			String porteCabine, String accessoires, String typePorte, String ouverture, String passage, String finition,
			double montantUnitaire, double montantTotal, double tva, double montantTtc, String conditionsPaiement,
			String delaiLivraison, String garantie, String controleTechnique, String entretien, String nomClient,
			String prenomClient, String destinataire, String emailClient, String tel, String disponibilité,
			String etat, Utilisateur user) {
		super();
		this.id = id;
		this.typeInstallation = typeInstallation;
		this.typeAscensseur = typeAscensseur;
		this.quantite = quantite;
		this.chargeUtile = chargeUtile;
		this.modeEntrainement = modeEntrainement;
		this.provenance = provenance;
		this.vitesse = vitesse;
		this.arret = arret;
		this.acces = acces;
		this.typeGaine = typeGaine;
		this.dimensionTechnique = dimensionTechnique;
		this.course = course;
		this.hauteurSousDalle = hauteurSousDalle;
		this.cuvette = cuvette;
		this.localMachinerie = localMachinerie;
		this.alimentationMoteur = alimentationMoteur;
		this.alimentationEclairage = alimentationEclairage;
		this.typeManoeuvre = typeManoeuvre;
		this.armoireCommande = armoireCommande;
		this.modele = modele;
		this.couleur = couleur;
		this.dimensionsCabine = dimensionsCabine;
		this.plafond = plafond;
		this.revetementSol = revetementSol;
		this.miroir = miroir;
		this.porteCabine = porteCabine;
		this.accessoires = accessoires;
		TypePorte = typePorte;
		this.ouverture = ouverture;
		this.passage = passage;
		this.finition = finition;
		this.montantUnitaire = montantUnitaire;
		this.montantTotal = montantTotal;
		this.tva = tva;
		this.montantTtc = montantTtc;
		this.conditionsPaiement = conditionsPaiement;
		this.delaiLivraison = delaiLivraison;
		this.garantie = garantie;
		this.controleTechnique = controleTechnique;
		this.entretien = entretien;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.destinataire = destinataire;
		this.emailClient = emailClient;
		this.tel = tel;
		this.disponibilité = disponibilité;
		this.etat = "En attente";
		this.user = user;
	}
	
	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeInstallation() {
		return typeInstallation;
	}
	public void setTypeInstallation(String typeInstallation) {
		this.typeInstallation = typeInstallation;
	}
	public String getTypeAscensseur() {
		return typeAscensseur;
	}
	public void setTypeAscensseur(String typeAscensseur) {
		this.typeAscensseur = typeAscensseur;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Long getChargeUtile() {
		return chargeUtile;
	}
	public void setChargeUtile(Long chargeUtile) {
		this.chargeUtile = chargeUtile;
	}
	public String getModeEntrainement() {
		return modeEntrainement;
	}
	public void setModeEntrainement(String modeEntrainement) {
		this.modeEntrainement = modeEntrainement;
	}
	public String getProvenance() {
		return provenance;
	}
	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}
	public float getVitesse() {
		return vitesse;
	}
	public void setVitesse(float vitesse) {
		this.vitesse = vitesse;
	}
	public int getArret() {
		return arret;
	}
	public void setArret(int arret) {
		this.arret = arret;
	}
	public String getAcces() {
		return acces;
	}
	public void setAcces(String acces) {
		this.acces = acces;
	}
	public String getTypeGaine() {
		return typeGaine;
	}
	public void setTypeGaine(String typeGaine) {
		this.typeGaine = typeGaine;
	}
	public String getDimensionTechnique() {
		return dimensionTechnique;
	}
	public void setDimensionTechnique(String dimensionTechnique) {
		this.dimensionTechnique = dimensionTechnique;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public Long getHauteurSousDalle() {
		return hauteurSousDalle;
	}
	public void setHauteurSousDalle(Long hauteurSousDalle) {
		this.hauteurSousDalle = hauteurSousDalle;
	}
	public Long getCuvette() {
		return cuvette;
	}
	public void setCuvette(Long cuvette) {
		this.cuvette = cuvette;
	}
	public String getLocalMachinerie() {
		return localMachinerie;
	}
	public void setLocalMachinerie(String localMachinerie) {
		this.localMachinerie = localMachinerie;
	}
	public String getAlimentationMoteur() {
		return alimentationMoteur;
	}
	public void setAlimentationMoteur(String alimentationMoteur) {
		this.alimentationMoteur = alimentationMoteur;
	}
	public Long getAlimentationEclairage() {
		return alimentationEclairage;
	}
	public void setAlimentationEclairage(Long alimentationEclairage) {
		this.alimentationEclairage = alimentationEclairage;
	}
	public String getTypeManoeuvre() {
		return typeManoeuvre;
	}
	public void setTypeManoeuvre(String typeManoeuvre) {
		this.typeManoeuvre = typeManoeuvre;
	}
	public String getArmoireCommande() {
		return armoireCommande;
	}
	public void setArmoireCommande(String armoireCommande) {
		this.armoireCommande = armoireCommande;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getDimensionsCabine() {
		return dimensionsCabine;
	}
	public void setDimensionsCabine(String dimensionsCabine) {
		this.dimensionsCabine = dimensionsCabine;
	}
	public String getPlafond() {
		return plafond;
	}
	public void setPlafond(String plafond) {
		this.plafond = plafond;
	}
	public String getRevetementSol() {
		return revetementSol;
	}
	public void setRevetementSol(String revetementSol) {
		this.revetementSol = revetementSol;
	}
	public String getMiroir() {
		return miroir;
	}
	public void setMiroir(String miroir) {
		this.miroir = miroir;
	}
	public String getPorteCabine() {
		return porteCabine;
	}
	public void setPorteCabine(String porteCabine) {
		this.porteCabine = porteCabine;
	}
	public String getAccessoires() {
		return accessoires;
	}
	public void setAccessoires(String accessoires) {
		this.accessoires = accessoires;
	}
	public String getTypePorte() {
		return TypePorte;
	}
	public void setTypePorte(String typePorte) {
		TypePorte = typePorte;
	}
	public String getOuverture() {
		return ouverture;
	}
	public void setOuverture(String ouverture) {
		this.ouverture = ouverture;
	}
	public String getPassage() {
		return passage;
	}
	public void setPassage(String passage) {
		this.passage = passage;
	}
	public String getFinition() {
		return finition;
	}
	public void setFinition(String finition) {
		this.finition = finition;
	}
	public double getMontantUnitaire() {
		return montantUnitaire;
	}
	public void setMontantUnitaire(double montantUnitaire) {
		this.montantUnitaire = montantUnitaire;
	}
	public double getMontantTotal() {
		return montantTotal;
	}
	public void setMontantTotal(double montantTotal) {
		this.montantTotal = montantTotal;
	}
	public double getTva() {
		return tva;
	}
	public void setTva(double tva) {
		this.tva = tva;
	}
	public double getMontantTtc() {
		return montantTtc;
	}
	public void setMontantTtc(double montantTtc) {
		this.montantTtc = montantTtc;
	}
	public String getConditionsPaiement() {
		return conditionsPaiement;
	}
	public void setConditionsPaiement(String conditionsPaiement) {
		this.conditionsPaiement = conditionsPaiement;
	}
	public String getDelaiLivraison() {
		return delaiLivraison;
	}
	public void setDelaiLivraison(String delaiLivraison) {
		this.delaiLivraison = delaiLivraison;
	}
	public String getGarantie() {
		return garantie;
	}
	public void setGarantie(String garantie) {
		this.garantie = garantie;
	}
	public String getControleTechnique() {
		return controleTechnique;
	}
	public void setControleTechnique(String controleTechnique) {
		this.controleTechnique = controleTechnique;
	}
	public String getEntretien() {
		return entretien;
	}
	public void setEntretien(String entretien) {
		this.entretien = entretien;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	public String getEmailClient() {
		return emailClient;
	}
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDisponibilité() {
		return disponibilité;
	}
	public void setDisponibilité(String disponibilité) {
		this.disponibilité = disponibilité;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	
}
	