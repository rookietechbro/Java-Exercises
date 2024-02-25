package Chapter5DAndD;
/*
c) Print the integers from 1 to 20, using a while loop and the counter variable i. Assume
that the variable 'i' has been declared, but not initialized. Print only five integers per line.
[Hint: Use the calculation i % 5. When the value of this expression is 0, print a newline
character; otherwise, print a tab character. Assume that this code is an application. Use
the System.out.println() method to output the newline character,
and use the System.out.print('\t') method to output the tab character.]

d) Repeat part (c), using a for statement.
 */
public class PreliminaryExercises3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20){
            System.out.println(i);
            if(i % 5 == 0){
                System.out.println();
            }
            else {
                System.out.println('\t');
            }
            i++;
        }



        for(i = 1 ; i <= 20; i++){
            System.out.print(i);

            if(i % 5 == 0){
                System.out.println();
            }
            else {
                System.out.println('\t');
            }
        }
   }
}
