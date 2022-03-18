package fr.esgi.ddd.model;

import java.time.LocalDate;

public interface SalleRepository {
    Salle reserver(LocalDate dateCours);

    void liberer(String spaceId);
}