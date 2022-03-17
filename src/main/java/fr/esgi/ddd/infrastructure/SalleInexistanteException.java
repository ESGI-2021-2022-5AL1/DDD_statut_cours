package fr.esgi.ddd.infrastructure;

public class SalleInexistanteException extends Exception {

    public SalleInexistanteException(String message) {
        super(message);
    }
}
