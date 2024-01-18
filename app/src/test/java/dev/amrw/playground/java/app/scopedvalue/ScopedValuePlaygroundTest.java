package dev.amrw.playground.java.app.scopedvalue;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ScopedValuePlaygroundTest {

  private ScopedValuePlayground scopedValuePlayground;

  @BeforeEach
  void beforeEach() {
    scopedValuePlayground = new ScopedValuePlayground();
  }

  @Test
  @DisplayName("Has access to scoped value")
  void hasAccessToScopedValue() {
    final var result = scopedValuePlayground.method1("Hello from");
    assertThat(result).isEqualTo("Hello from nested method");
  }
}
