package fr.esgi.ddd.use_case.cours;

import fr.esgi.ddd.infrastructure.FausseReservation;
import fr.esgi.ddd.infrastructure.SalleInexistanteException;
import fr.esgi.ddd.model.Reservation;
import fr.esgi.ddd.model.ReservationRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

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
}