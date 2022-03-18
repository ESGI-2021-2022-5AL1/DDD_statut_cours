package fr.esgi.ddd.model;

import java.util.List;

public interface ProfesseurRepository {
    List<Professeur> findAll();
}