package tech.intellispaces.commons.reflection.samples;

import tech.intellispaces.commons.reflection.support.TesteeType;

@TesteeType
public enum EnumWithRecordGetter {
  ;

  public TestRecord recordGetter() {
    return null;
  }
}