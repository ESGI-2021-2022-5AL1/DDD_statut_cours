package fr.esgi.ddd.use_case.cours;

import fr.esgi.ddd.infrastructure.FausseReservation;
import fr.esgi.ddd.infrastructure.NotificationCourriel;
import fr.esgi.ddd.infrastructure.SalleInexistanteException;
import fr.esgi.ddd.model.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TestAnnulerCours {

    @Test
    public void testLibererSalle() throws SalleInexistanteException {
        ReservationRepository fausseReservation = new FausseReservation();
        AnnulerCours annulerCours = new AnnulerCours(fausseReservation);
        ArrayList<Reservation> reservations = fausseReservation.getReservations();

        Reservation reservation = new Reservation(
                1,
                1,
                LocalDateTime.of(
                        2022,
                        Month.MARCH,
                        28,
                        9,
                        0
                )
        );

        annulerCours.libererSalle(reservations, reservation.getReservationId());

        assertTrue(reservations.stream().map(Reservation::getReservationId).noneMatch(id -> id.equals(1)));
    }

    @Test
    public void testSalleInexistante() {
        ReservationRepository fausseReservation = new FausseReservation();
        AnnulerCours annulerCours = new AnnulerCours(fausseReservation);
        ArrayList<Reservation> reservations = fausseReservation.getReservations();

        Reservation reservation = new Reservation(
                4,
                1,
                LocalDateTime.of(
                        2022,
                        Month.MARCH,
                        28,
                        9,
                        0
                )
        );

        Assertions.assertThatExceptionOfType(SalleInexistanteException.class).isThrownBy(() ->
                annulerCours.libererSalle(reservations, reservation.getReservationId())
        );
    }

    @Test
    public void testNotification() {
        Professeur professeur = new Professeur();
        Eleve eleve1 = new Eleve();
        Eleve eleve2 = new Eleve();
        List<Eleve> eleves = new ArrayList<Eleve>();
        eleves.add(eleve1);
        eleves.add(eleve2);
        Cours cours = new Cours(professeur, eleves);
        NotificationCourriel notificationCourriel = new NotificationCourriel(cours);
        assertEquals(notificationCourriel.notifier(), "Les notifications sont envoyées");
    }
}