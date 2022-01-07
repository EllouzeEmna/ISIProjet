package metiers;

import java.util.Date;

public class Medicament {

	private String IdMedicament;
	private String type;
	private String nom;
	private Date dateexpiration;
	private int qte;
	private double prixvente;
	
	public Medicament(String idMedicament, String type, String nom, Date dateexpiration, int qte, double prixvente) {
	super();
	IdMedicament = idMedicament;
	this.type = type;
	this.nom = nom;
	this.dateexpiration = dateexpiration;
	this.qte = qte;
	this.prixvente = prixvente;
	}

	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Medicament other = (Medicament) obj;
	if (IdMedicament == null) {
	if (other.IdMedicament != null)
	return false;
	} else if (!IdMedicament.equals(other.IdMedicament))
	return false;
	return true;
	}

	public String getIdMedicament() {
	return IdMedicament;
	}

	public String getType() {
	return type;
	}

	public void setType(String type) {
	this.type = type;
	}

	public String getNom() {
	return nom;
	}

	public void setNom(String nom) {
	this.nom = nom;
	}

	public Date getDateexpiration() {
	return dateexpiration;
	}

	public void setDateexpiration(Date dateexpiration) {
	this.dateexpiration = dateexpiration;
	}

	public int getQte() {
	return qte;
	}

	public void setQte(int qte) {
	this.qte = qte;
	}

	public double getPrixvente() {
	return prixvente;
	}

	public void setPrixvente(double prixvente) {
	this.prixvente = prixvente;
	}

	@Override
	public String toString() {
	return "Medicament [IdMedicament=" + IdMedicament + ", type=" + type + ", nom=" + nom + ", dateexpiration="
	+ dateexpiration + ", qte=" + qte + ", prixvente=" + prixvente + "]";
	}
}
