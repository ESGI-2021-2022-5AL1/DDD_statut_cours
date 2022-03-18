package fr.esgi.ddd.infrastructure;

import fr.esgi.ddd.model.Cours;
import fr.esgi.ddd.model.Notification;

public class NotificationCourriel implements Notification {

    private Cours cours;

    public NotificationCourriel(Cours cours) {
        this.cours = cours;
    }

    public String notifier() {
        this.cours.professeur.notifier();
        for(int i = 0; i < this.cours.eleves.size(); i++)
            this.cours.eleves.get(i).notifier();
        return "Les notifications sont envoyées";
    }
}
