import java.util.Scanner;

class Algebra {
    int add(int a, int b) {
        int ans = a + b;
        return ans; 

    }
}

public class methods {
    public static void main(String[] args) {
        Algebra obj1 = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 number ");
        int x = sc.nextInt();
        System.out.println("enter 2 number  ");
        int y = sc.nextInt();

        System.out.println("the sum of both number is ");

        int ans = obj1.add(x, y);
        System.out.println(ans);

        // what are methods
        // block of code which perform some actions when called

        // why are methods important
        // write once , reuse many times
        // time saving
        // duplicate code reduces

        // package = collection of similiar classs,subpackages , interfaces


        //  java has pass by value as its copies the values  
    }
}
