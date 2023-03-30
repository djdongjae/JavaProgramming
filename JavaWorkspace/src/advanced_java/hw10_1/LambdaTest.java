package advanced_java.hw10_1;

//***************************
//파일명: LambdaTest.java
//작성자: 201914089 오동재
//작성일: 2023-03-29
//내용: hw10_1
//***************************

import javax.swing.Timer;

public class LambdaTest {

      public static void main(String[] args) {
    	  
    	  System.out.println("hw1_1: 오동재");
    	  
           Timer t = new Timer(1000,(event) -> {
        	   System.out.println("beep");
           });

           t.start();
           for (int i = 0; i < 1000; i++) {
                try {
                      Thread.sleep(1000);                             
                }
                catch (InterruptedException e) {}

           }

      }

}
