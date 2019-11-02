package de.igorakkerman.kata.xyz;

public class Xyz {
    public int process(int input) {
        if (input < 0)
            throw new IllegalArgumentException("think positive");

        return 0;
    }
}
