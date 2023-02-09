package com.app.problems.basic;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestClass {
  public static void main(String[] args) {
    new Function<Object,Object>() {
      @Override
      public Object apply(Object o) {
        return null;
      }
    };

    Consumer consumer = new Consumer<Integer>() {

      @Override
      public void accept(Integer integer) {
        System.out.println(integer);
      }
    };

    System.out.println("Consumer:");
    consumer.accept(12);

    int no = 26;
    char c = (char)26;
    System.out.println(c);

  }

}
