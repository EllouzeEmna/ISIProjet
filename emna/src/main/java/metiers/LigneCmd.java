package metiers;

public class LigneCmd {

	private int NumCmd;
	private String IdMedicament;
	private int Qte;
	private double Prix;

	public LigneCmd(int numCmd, String idMedicament, int qte, double prix) {
	super();
	NumCmd = numCmd;
	IdMedicament = idMedicament;
	Qte = qte;
	Prix = prix;
	}

	public int getNumCmd() {
	return NumCmd;
	}

	public String getIdMedicament() {
	return IdMedicament;
	}

	public int getQte() {
	return Qte;
	}

	public void setQte(int qte) {
	Qte = qte;
	}

	public double getPrix() {
	return Prix;
	}

	public void setPrix(double prix) {
	Prix = prix;
	}

	@Override
	public String toString() {
	return "LigneCmd [NumCmd=" + NumCmd + ", IdMedicament=" + IdMedicament + ", Qte=" + Qte + ", Prix=" + Prix
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
	LigneCmd other = (LigneCmd) obj;
	if (IdMedicament == null) {
	if (other.IdMedicament != null)
	return false;
	} else if (!IdMedicament.equals(other.IdMedicament))
	return false;
	if (NumCmd != other.NumCmd)
	return false;
	return true;
	}
}
