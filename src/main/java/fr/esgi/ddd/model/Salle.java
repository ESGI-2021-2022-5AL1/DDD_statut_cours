package fr.esgi.ddd.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Salle {
    private String id;
    private String nom;
    private String adresse;
    private int NumeroSalle;
    private int capacity;
    private String address;
    private List<String> equipments;
    private String participants;
    private List<LocalDate> availabilities;
    private Map<String, Object> info;
}