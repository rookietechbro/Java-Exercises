package Chapter4DAndD;

/*
// Exercise 4.25: Mystery2.java
public class Mystery2 {
public static void main(String[] args) {
int count = 1;

while (count <= 20) {
System.out.println(count % 3 == 1 ? "########" : "++++++++");
++count;
} // end while
} // end main
} // end class Mystery2

Answer:
########
++++++++
++++++++
########
++++++++
++++++++
########
++++++++
++++++++
########
++++++++
++++++++
########
++++++++
++++++++
########
++++++++
++++++++
########
++++++++


 */

public class WhatDoesTheFollowingProgramPrintMystery2 {
    public static void main(String[] args) {
            int count = 1;

            while (count <= 20) {
                System.out.println(count % 3 == 1 ? "########" : "++++++++");
                ++count;
            } // end while
    }
}