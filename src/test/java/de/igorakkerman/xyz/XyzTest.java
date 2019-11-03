package de.igorakkerman.xyz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class XyzTest {

    @Test
    void zero() {
        assertThat(new Xyz().process(0)).isZero();
    }

    @Test
    void one() {
        assertThat(new Xyz().process(1))
                .isZero();
    }

    @Test
    void minus1() {
        assertThatThrownBy(() -> new Xyz().process(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("think positive");
    }
}
