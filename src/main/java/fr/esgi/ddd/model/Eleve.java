package fr.esgi.ddd.model;

public class Eleve implements Personne {

    @Override
    public String notifier() {
        return "L'élève est notifié";
    }
}
