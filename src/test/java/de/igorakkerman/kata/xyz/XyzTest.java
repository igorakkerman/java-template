package de.igorakkerman.kata.xyz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class XyzTest {

    @Test
    void zero() {
        assertThat(new Xyz().process(0))
                .isZero();
    }

    @Test
    void one() {
        assertThat(new Xyz().process(1))
                .isZero();
    }
}