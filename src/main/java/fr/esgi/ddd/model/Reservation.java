package fr.esgi.ddd.model;

import java.time.LocalDateTime;

public class Reservation {
    int reservationId;
    int salleId;
    LocalDateTime horaire;

    public Reservation(int reservationId, int salleId, LocalDateTime horaire) {
        this.reservationId = reservationId;
        this.salleId = salleId;
        this.horaire = horaire;
    }

    public int getReservationId() {
        return reservationId;
    }

    public int getSalleId() {
        return salleId;
    }

    public LocalDateTime getHoraire() {
        return horaire;
    }
}