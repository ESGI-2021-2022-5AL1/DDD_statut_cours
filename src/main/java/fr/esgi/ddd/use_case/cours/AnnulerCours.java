package fr.esgi.ddd.use_case.cours;

import fr.esgi.ddd.infrastructure.SalleInexistanteException;
import fr.esgi.ddd.model.*;

import java.util.List;

public class AnnulerCours {

    private final Cours cours;
    private final List<Eleve> eleves;
    private final Professeur professeur;

    public AnnulerCours(Cours cours, List<Eleve> eleves, Professeur professeur) {
        this.cours = cours;
        this.eleves = eleves;
        this.professeur = professeur;
    }

    public void annulerCours() {
        if ( this.cours instanceof CoursPresentiel ) {
            try {
                this.libererSalle();
            } catch (SalleInexistanteException exception) {
                System.out.println(exception.getMessage());
            }
        }
        // TODO : Notifier Eleves
        // Notifier Professeur
        // TODO : END
    }

    public void libererSalle() throws SalleInexistanteException {
        // TODO : Supprimer réservation
        // throw new SalleInexistanteException("Salle inexistante");
        // TODO : END
    }
}