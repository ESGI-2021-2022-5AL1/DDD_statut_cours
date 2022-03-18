package fr.esgi.ddd.use_case.cours;

import fr.esgi.ddd.infrastructure.NotificationCourriel;
import fr.esgi.ddd.infrastructure.SalleInexistanteException;
import fr.esgi.ddd.model.*;

import java.util.ArrayList;

public class AnnulerCours {

    private Cours cours;
    private ReservationRepository fausseReservation;

    public AnnulerCours(ReservationRepository fausseReservation) {
        this.fausseReservation = fausseReservation;
    }

    public void annulerCours(Cours cours) {
        if ( this.cours instanceof CoursPresentiel ) {
            try {
                this.libererSalle(fausseReservation.getReservations(), cours.getReservation().getReservationId());
            } catch (SalleInexistanteException exception) {
                System.out.println(exception.getMessage());
            }
        }
        NotificationCourriel notificationCourriel = new NotificationCourriel(cours);
        System.out.println(notificationCourriel.notifier());
    }

    public void libererSalle(ArrayList<Reservation> reservations, int reservationId) throws SalleInexistanteException {
        if (reservations.stream().map(Reservation::getReservationId).noneMatch(id -> id == reservationId)) {
            throw new SalleInexistanteException("Salle inexistante");
        }
        reservations.removeIf(r -> r.getReservationId() == reservationId);
    }
}