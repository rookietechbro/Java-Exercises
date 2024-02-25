package Chapter5DAndD;
/*
5.19 Assume that i = 2, j = 3, k = 2 and m = 2. What does each of the following statements print?
a) System.out.println(i == 2);
b) System.out.println(j == 5);
c) System.out.println((i >= 0) && (j <= 3));
d) System.out.println((m <= 100) & (k <= m));
e) System.out.println((j >= i) || (k != m));
f) System.out.println((k + i < j) | (4 - j >= k));
g) System.out.println(!(k > j));
 */
public class Assume {
    public static void main(String[] args) {
        int i = 2, j = 3, k = 2, m = 2;
       //a)
        System.out.println(i == 2);
        //b)
        System.out.println(j == 5);
        //c)
        System.out.println((i >= 0) && (j <= 3));
        //d)
        System.out.println((m <= 100) & (k <= m));
        //e)
        System.out.println((j >= i) || (k != m));
        //f)
        System.out.println((k + i < j) | (4 - j >= k));
        //g)
        System.out.println(!(k > j));
    }
}
/*
Answer:
a) True
b) False
c) True
d) True
e) True
f) False
g) True
 */