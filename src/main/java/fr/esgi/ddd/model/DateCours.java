package fr.esgi.ddd.model;

import java.time.LocalDate;

public class DateCours {

    private final LocalDate dateCours;

    public DateCours(LocalDate dateCours) {
        this.dateCours = dateCours;
    }

    public LocalDate getDateCours() {
        return dateCours;
    }

    public LocalDate toLocalDate() {
        return dateCours;
    }
}