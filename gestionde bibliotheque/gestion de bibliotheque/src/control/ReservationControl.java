package control;

import Utility.ErrorException;
import static Utility.Utility.formatDate;
import static Utility.Utility.formatMillisToDate;
import java.util.ArrayList;
import java.util.Date;
import objets_metiers.Oeuvre;
import objets_metiers.Reservation;
import objets_metiers.Usager;
/**
 * 
 * @author Diallo & Janati
 */
public class ReservationControl {

    public static void reserver(int idUsager, String titre) throws ErrorException {
        Usager usager = new Usager();
        usager = usager.findById(idUsager);
        if (null == usager) {
            throw new ErrorException("L'usager n'est pas enregistré");
        }
        Oeuvre oeuvre =new Oeuvre();
        oeuvre = oeuvre.findByTitre(titre).get(0);
        if (null == oeuvre) {
            throw new ErrorException("L'oeuvre n'existe pas");
        }
        String datJour = formatMillisToDate(System.currentTimeMillis());
        Reservation reservation = new Reservation(usager, oeuvre, formatDate(datJour));
        reservation.reserver(usager, oeuvre, reservation.getDateReservation());
        //mettre à jour le nombre de reservation de l'oeuvre
        oeuvre.setNbResa(oeuvre.getNbResa() + 1);
        oeuvre.modifier(oeuvre);
    }

    public static void annuler(int idUsager, String titre)
            throws ErrorException {
        Usager usager = new Usager();
        usager = usager.findById(idUsager);
        if (null == usager) {
            throw new ErrorException("L'usager n'est pas enregistré");
        }
        Oeuvre oeuvre = new Oeuvre();
        ArrayList<Oeuvre> oeuvres = oeuvre.findByTitre(titre);
        oeuvre = (oeuvres==null) ? null : oeuvres.get(0);

        if (null == oeuvre) {
            throw new ErrorException("L'oeuvre n'existe pas");
        }
        Reservation reservation = new Reservation();
        reservation.findByReservation(usager, oeuvre);
        if (null == reservation) {
            throw new ErrorException("Aucune réservation de l'oeuvre '" + oeuvre.getTitre() + "'\n"
                    + " par l'usager '" + usager.getNom() + " " + usager.getPrenom() + "'"
                    + " n'a été trouvé");
        }
        String datJour = formatMillisToDate(System.currentTimeMillis());
        reservation.setDateAnnulation(formatDate(datJour));
        reservation.annuler(usager, oeuvre, reservation);
        //mettre à jour le nombre de reservation de l'oeuvre
        oeuvre.setNbResa(oeuvre.getNbResa() - 1);
        oeuvre.modifier(oeuvre);

    }
    
    public static Reservation findById(int id) throws ErrorException {
        Reservation reservation = new Reservation();
        return reservation.findById(id);
    }
    
    public static ArrayList<Reservation> findByDateReservaton(Date dateReservation) throws ErrorException{
        Reservation reservation = new Reservation();
        return reservation.findByDateReservaton(dateReservation);
    }
    
    public static Reservation findByReservation(Usager usager, Oeuvre oeuvre) throws ErrorException {
        Reservation reservation = new Reservation();
        return reservation.findByReservation(usager, oeuvre);
    }
    
    public static ArrayList<Reservation> findByReservation(Oeuvre oeuvre) throws ErrorException {
        Reservation reservation = new Reservation();
        return reservation.findByReservation(oeuvre);
    }
}
