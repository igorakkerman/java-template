package de.igorakkerman.xyz;

public class Xyz {
    public int process(Integer input) {
        if (input == null)
            throw new IllegalArgumentException();

        return input;
    }
}
