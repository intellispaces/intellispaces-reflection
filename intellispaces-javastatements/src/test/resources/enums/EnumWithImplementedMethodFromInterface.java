package intellispaces.common.javastatements.samples;

import intellispaces.common.javastatements.support.TesteeType;

public interface EnumWithImplementedMethodFromInterface {

  @TesteeType
  enum TesteeEnum implements Interface1 {
    ;

    public void method1() {}

    @Override
    public void method2() {}
  }

  interface Interface1 {
    void method2();
  }
}
