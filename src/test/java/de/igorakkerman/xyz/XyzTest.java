package de.igorakkerman.xyz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class XyzTest {

    @Test
    void nullValue() {
        assertThatThrownBy(() -> new Xyz().process(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void empty() {
        assertThat(new Xyz().process(0))
                .isZero();
    }
}
