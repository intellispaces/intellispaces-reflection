package tech.intellispaces.commons.reflection.samples;

import tech.intellispaces.commons.reflection.support.TesteeType;

@TesteeType
public record RecordWithCharGetter() {

  public char charGetter() {
    return 'a';
  }
}