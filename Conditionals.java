import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        
        // IF AND ELSE  EVEN AND ODD 
        
        
        
//         Scanner sc = new Scanner(System.in);
//        // System.out.println("enter your number ");
//         int num = sc.nextInt();

// if (num %2==0){
//     System.out.println("even ");

// }
//  else {
//     System.out.println("odd");
// }  


//    TERNARY OPERATIONS 
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// String ans;
// ans = (num %2==0) ? "even " :"odd";
// System.out.println(ans);


        // IF - ELSE IF
   
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if (age ==12){
        //     System.out.println("child ");
        // }
        // else if (age >=12  && age <=18) {
        //     System.out.println("teenager");
            
        // }

        // else{
        //     System.out.println("adult");
        // }

           
        //  NESTED IF - ELSE 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your number ");
        // int value = sc.nextInt();

        // if (value %2==0 && value %3==0) {
        //     System.out.println("found ans " +value );

            
        // }
           
        //  Scanner sc = new Scanner(System.in);
        //  int num= sc.nextInt();
           
        //  if (num % 3 == 0  || num % 5 ==0) {
        //     System.out.println("found ans");
            
        //  }


        //  SWITCH CASE 

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your day number ");
        int day = sc.nextInt();


        switch (day) {
            case 1:
            System.out.println("monday");
                
                break;
                case 2:
                System.out.println("tuesday");
                break;

                case 3 :
                System.out.println("wednesday");
                break;

                case 4 :
                System.out.println("thursday ");
                break;

                case 5 :
                System.out.println("friday ");
                break;

                case 6 :
                System.out.println("saturday");
                break;

                case  7 :
                System.out.println("sunday");
                break;
        
            default:
            System.out.println("invalid day");
                break;
        }
       




























































































    }
    
}
