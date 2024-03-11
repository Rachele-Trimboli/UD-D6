package es1;

import java.util.Arrays;

public class InterException extends Exception {

    public InterException(int number) {
        super("Il numero fornito " + number + " è maggiore della lunghezza dell'array");
    }
}
