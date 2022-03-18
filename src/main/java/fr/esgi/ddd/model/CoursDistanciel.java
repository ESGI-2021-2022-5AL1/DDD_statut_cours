package fr.esgi.ddd.model;

import java.util.List;

public class CoursDistanciel extends Cours {
    private String UrlCours;

    public CoursDistanciel(Professeur professeur, List<Eleve> eleves) {
        super(professeur, eleves);
    }

    @Override
    public Reservation getReservation() {
        return null;
    }

}
