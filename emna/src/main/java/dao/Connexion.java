package dao;

import java.sql.SQLException;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class Connexion {

	private static String url ="jdbc:mysql://localhost:3306/isiproject";
	private static String utilisateur= "root";
	private static String motPasse="";
	private static Connection cnx;

	//=============== getInstance() ============================
	public static Connection getInstance()
	{
	try {
	if(cnx==null || cnx.isClosed()) {
	//Vérifier le chargement en mémoire du pilote JDBC
	Class.forName("com.mysql.jdbc.Driver");
	//Etablir la connexion
	cnx=DriverManager.getConnection(url,utilisateur,motPasse);
	System.out.println("Connexion à la base de données ");
	}
	}
	catch (ClassNotFoundException e) {
	System.out.println("Classe Driver introuvable");
	}
	catch (SQLException e) {
	System.out.println("L'établissement de la connexion a échoué.");
	}
	return cnx;
	}
	public static void close()
	{
	try{
	if(cnx!=null && !cnx.isClosed()) {
	cnx.close();}
	}
	catch(SQLException e){
	System.out.print("Erreur lors de la fermeture de la connexion ");
	}
	}

}
