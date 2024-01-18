package dev.amrw.playground.java.app.scopedvalue;

class ScopedValuePlayground {

  private final ScopedValue<String> scopedValue = ScopedValue.newInstance();

  public String method1(final String value) {
    return ScopedValue.getWhere(scopedValue, value, this::method2);
  }

  private String method2() {
    return method3();
  }

  private String method3() {
    return STR."\{scopedValue.get()} nested method";
  }
}
