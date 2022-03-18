package fr.esgi.ddd.model;

public class Eleve implements Personne {

    @Override
    public void notifier() {
        System.out.println("L'élève est notifié");
    }
}
