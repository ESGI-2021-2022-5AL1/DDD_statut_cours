package fr.esgi.ddd.model;

public class CoursPresentiel extends Cours {
    private Reservation reservation;

    public CoursPresentiel(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }
}