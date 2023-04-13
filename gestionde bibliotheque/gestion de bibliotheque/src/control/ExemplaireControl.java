package control;

import Utility.ErrorException;
import java.util.ArrayList;
import objets_metiers.Exemplaire;
import objets_metiers.Oeuvre;
/**
 * 
 * @author Diallo & Janati
 */
public class ExemplaireControl {

    public static void ajouter(Oeuvre oeuvre, String etatExemplaire) throws ErrorException {
         oeuvre = oeuvre.findById(oeuvre.getId());
        if (null == oeuvre) {
            throw new ErrorException("L'oeuvre n'existe pas");
        }
        Exemplaire exemplaire = new Exemplaire();
        exemplaire.ajouter(oeuvre, etatExemplaire);
    }

    public static void modifier(Exemplaire exemplaire) throws ErrorException {
        exemplaire.setId(exemplaire.getId());
        exemplaire.setEtat(exemplaire.getEtat());

        exemplaire.modifier(exemplaire);
    }

    public static void supprimer(Exemplaire exemplaire) throws ErrorException {
        exemplaire.delete(exemplaire);
    }

    public static Exemplaire findById(int id) throws ErrorException {
        Exemplaire exemplaire = new Exemplaire();
        return exemplaire.findById(id);
    }

    public static ArrayList<Exemplaire> findExemplaireDispo(Oeuvre oeuvre) throws ErrorException {
        Exemplaire exemplaire = new Exemplaire();
        return exemplaire.findExemplaireDispo(oeuvre);
    }

    public static ArrayList<Exemplaire> find(Oeuvre oeuvre) throws ErrorException {
        Exemplaire exemplaire = new Exemplaire();
        return exemplaire.find(oeuvre);
    }
}
