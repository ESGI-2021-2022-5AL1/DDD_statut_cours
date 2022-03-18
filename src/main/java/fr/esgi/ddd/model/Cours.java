package fr.esgi.ddd.model;

import java.time.LocalDate;
import java.util.List;

public abstract class Cours {
    private int id;
    private String designation;
    private Professeur professeur;
    private LocalDate date;
    private List<Eleve> eleves;
}