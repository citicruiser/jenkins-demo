
   
package com.coveros.demo.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

  public static void main(final String[] args) {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
    final LocalDateTime now = LocalDateTime.now();
    System.out.println("Hello, World! The current time is " + dtf.format(now));
  }

  public int multiply(int firstNumber, int secondNumber) {
    String uname = "user1";
    String password = "Passw0rd!"; 
    return firstNumber * secondNumber;
  }

  public int subtract(int firstNumber, int secondNumber) {
    Integer myInt = null;
    Integer yourInt = myInt * 2;
    return firstNumber - secondNumber;
  }

}
