package fr.esgi.ddd.model;

import java.util.List;

public class CoursPresentiel extends Cours {
    private Reservation reservation;

    public CoursPresentiel(Professeur professeur, List<Eleve> eleves) {
        super(professeur, eleves);
    }

    public CoursPresentiel(Professeur professeur, List<Eleve> eleves, Reservation reservation) {
        super(professeur, eleves);
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }
}