package io.nano.core.collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NanoIntIntMapTest {

    private final static float[] FILL_FACTORS = {0.25f, 0.5f, 0.75f, 0.9f, 0.99f};
    private static final int COUNT = 500;

    private IntIntMap makeMap(final int size, final float fillFactor) {
        return new NanoIntIntMap(size, fillFactor);
    }

    @BeforeEach
    void setUp() {
    }

    private void mapTestHelper(final float fillFactor) {
        final IntIntMap map = makeMap(128, fillFactor);
        for (int i = 0; i < COUNT; ++i) {
            assertThat(map.put(i, i)).as("put(%d,%d)", i, i).isEqualTo(-1);
            assertThat(map.size()).as("size()").isEqualTo(i + 1);
            assertThat(map.get(i)).as("get(%d)", i).isEqualTo(i);
        }

        // check the final state
        for (int i = 0; i < COUNT; ++i) {
            assertThat(map.get(i)).as("get(%d)", i).isEqualTo(i);
        }

        // now check the removal
        for (int i = 0; i < COUNT; ++i) {
            assertThat(map.remove(i)).as("remove(%d)", i).isEqualTo(i);
            assertThat(map.remove(i)).as("remove(%d)", i).isEqualTo(-1);
        }
        assertThat(map.size()).as("size()").isZero();
    }

    @Test
    void putAndGetCombined() {
        for (final float ff : FILL_FACTORS) {
            mapTestHelper(ff);
        }
    }

}