package Chapter5DAndD;
/*
5.4 Find the error in each of the following code segments, and explain how to correct it:
a)  i = 1;
    while (i <= 10);
    ++i;
     }

 Correction:
   int i = 1;
    while (i <= 10){

    ++i;
     }

b) for (k = 0.1; k != 1.0; k += 0.1) {
   System.out.println(k);
   }

Correction:
    double k;
        for (k = 0.1; k <= 1.0; k += 0.1) {
            System.out.println(k);
        }

c) switch (n) {
   case 1:
   System.out.println("The number is 1");
   case 2:
   System.out.println("The number is 2");
   break;
   default:
   System.out.println("The number is not 1 or 2");

Correction:

   switch (n){
   case 1:
   System.out.println("The number is 1");
   break;
   case 2:
   System.out.println("The number is 2");
   break;
   default:
   System.out.println("The number is not 1 or 2");
   break;


d) The following code should print the values 1 to 10
  n = 1;
  while (n < 10) {
  System.out.println(n++);
  }

Correction:

  n = 1;
  while (n <= 10) {
  System.out.println(n++);
  }

 */
public class PreliminaryExercises4 {
    public static void main(String[] args) {

    }
}
