package fr.esgi.ddd.infrastructure;

import fr.esgi.ddd.model.Reservation;
import fr.esgi.ddd.model.ReservationRepository;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

public class FausseReservation implements ReservationRepository {

    private ArrayList<Reservation> reservations;

    public FausseReservation() {

        reservations = new ArrayList<Reservation>();

        this.reservations.add(
                new Reservation(
                        1,
                        1,
                        LocalDateTime.of(
                                2022,
                                Month.MARCH,
                                28,
                                9,
                                0
                        )
                )
        );

        this.reservations.add(
                new Reservation(
                        2,
                        2,
                        LocalDateTime.of(
                                2022,
                                Month.MARCH,
                                29,
                                15,
                                30
                        )
                )
        );
    }

    @Override
    public ArrayList<Reservation> getReservations() {
        return this.reservations;
    }
}
