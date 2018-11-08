/**
 * 
 */
package fr.ms.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe de lancement du microservice de gestion des adresses.
 * 
 * @since 0.1
 * @author VRIGNAUD
 */
@SpringBootApplication
public class SOAManagerApp {

	/**
	 * Méthode de lancement principale
	 * 
	 * @param args : arguments du programme
	 */
	public static void main(String[] args) {
		SpringApplication.run(SOAManagerApp.class, args);
	}

}
