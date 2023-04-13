package control;

import Utility.ErrorException;
import java.util.ArrayList;
import objets_metiers.Usager;
/**
 * 
 * @author Diallo & Janati
 */
public class UsagerControl {

    public static void ajouter(Usager usager) throws ErrorException {
        //Verifier la validité des informations
        usager.setNom(usager.getNom());
        usager.setPrenom(usager.getPrenom());
        usager.setDateNais(usager.getDateNais());
        usager.setSexe(usager.getSexe());
        usager.setAdresse(usager.getAdresse());
        usager.setTel(usager.getTel());

        usager.ajouter(usager);
    }

    public static void modifier(Usager usager) throws ErrorException {
        //Verifier que les informations sont valides
        usager.setNom(usager.getNom());
        usager.setPrenom(usager.getPrenom());
        usager.setDateNais(usager.getDateNais());
        usager.setSexe(usager.getSexe());
        usager.setAdresse(usager.getAdresse());
        usager.setTel(usager.getTel());

        usager.modifier(usager);
    }

    public static void supprimer(Usager usager) throws ErrorException {
        usager.delete(usager);
    }

    public static Usager findById(int id) throws ErrorException {
        return new Usager().findById(id);
    }

    public static ArrayList<Usager> findByNom(String nom) throws ErrorException {
        return new Usager().findByNom(nom);
    }
    
    public static ArrayList<Usager> getListUsagers() throws ErrorException {
        return new Usager().getListUsagers();
    }
}
