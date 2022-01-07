package metiers;

import java.util.Date;

public class Commande {

	private int NumCmd;
	private String IdClient;
	private Date DateCmd;
	private double PrixTot;
	public Commande(int numCmd, String idClient, Date dateCmd, double prixTot) {
	super();
	NumCmd = numCmd;
	IdClient = idClient;
	DateCmd = dateCmd;
	PrixTot = prixTot;
	}
	public int getNumCmd() {
	return NumCmd;
	}

	public String getIdClient() {
	return IdClient;
	}

	public Date getDateCmd() {
	return DateCmd;
	}
	public void setDateCmd(Date dateCmd) {
	DateCmd = dateCmd;
	}
	public double getPrixTot() {
	return PrixTot;
	}
	public void setPrixTot(double prixTot) {
	PrixTot = prixTot;
	}
	@Override
	public String toString() {
	return "Commande [NumCmd=" + NumCmd + ", IdClient=" + IdClient + ", DateCmd=" + DateCmd + ", PrixTot=" + PrixTot
	+ "]";
	}

	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Commande other = (Commande) obj;
	if (NumCmd != other.NumCmd)
	return false;
	return true;
	}

}
