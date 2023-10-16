/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

/**
 *
 * @author 2020
 */

    public class Manager extends Personne {
    private String departement;

    // Constructeur
    public Manager( String nom, double salaire) {
        super(nom, salaire);
        
    }

    // Getter et setter spécifique à Manager
    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    // Autres méthodes spécifiques à Manager si nécessaire
}







