package fr.esgi.ddd.model;

import java.time.LocalDate;
import java.util.List;

public class Cours {
    private int id;
    private String designation;
    public Professeur professeur;
    private LocalDate date;
    public List<Eleve> eleves;

    public Cours(Professeur professeur, List<Eleve> eleves) {
        this.professeur = professeur;
        this.eleves = eleves;
    }

    public Reservation getReservation(){
        return null;
    }
}