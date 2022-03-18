package fr.esgi.ddd.use_case.cours;

import fr.esgi.ddd.infrastructure.SalleInexistanteException;
import fr.esgi.ddd.model.*;

public class AnnulerCours {

    private final Cours cours;

    public AnnulerCours(Cours cours) {
        this.cours = cours;
    }

    public void annulerCours() {
        if ( this.cours instanceof CoursPresentiel ) {
            try {
                this.libererSalle();
            } catch (SalleInexistanteException exception) {
                System.out.println(exception.getMessage());
            }
        }
        // TODO :
        // Notifier Eleves
        // Notifier Professeur
        // TODO : END
    }

    public void libererSalle() throws SalleInexistanteException {
        // TODO : Supprimer réservation
        // throw new SalleInexistanteException("Salle inexistante");
        // TODO : END
    }
}