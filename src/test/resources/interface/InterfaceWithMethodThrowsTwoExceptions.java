package intellispaces.javastatements.sample;

import intellispaces.javastatements.support.TesteeType;

import java.io.IOException;

@TesteeType
public interface InterfaceWithMethodThrowsTwoExceptions {

  void methodThrowsTwoExceptions() throws IOException, ClassNotFoundException;
}