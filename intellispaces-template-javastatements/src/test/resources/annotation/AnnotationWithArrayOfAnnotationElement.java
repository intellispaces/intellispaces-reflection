package tech.intellispacesframework.javastatements.sample;

import tech.intellispacesframework.javastatements.sample.TestAnnotation;
import tech.intellispacesframework.javastatements.support.TesteeType;

@TesteeType
public @interface AnnotationWithArrayOfAnnotationElement {

  TestAnnotation[] arrayOfAnnotationElement();
}