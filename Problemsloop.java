import java.util.*;;
public class Problemsloop {
    public static void main(String[] args) {

        // count the numbers in series 
     
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // int numOfDigits =0;
        // int original_n = n; // to store the original value of n 


        // while(n>0){
        //     n= n/10;
        //     numOfDigits++; // numofdigits = numofdigits+1
        // }
        // System.out.println("numbe of digits in "+original_n+ "=" + numOfDigits);





        //  FIND THE SUM OF DIGITS IN A GIVEN NUMBERS N 


    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
    //    int sumOfDigits=0;
    //    int original_n =n;
       
    //    while (n>0){
    //     sumOfDigits+= n%10;

    //     n=n/10;

    //    }
    //    System.out.println("the sum of number  " + original_n+ "is =" +sumOfDigits);

        



    //  TO REVERSE THE DIGITS OF A NUMBER

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int ans  = 0;
    // int original_n=n;
      
    // while (n>0){
    //     ans = (ans *10+n%10)  ;
    //     n = n/10;



    // }
    // System.out.println("the reverse order " +original_n+"is "+ans);



    //  SUM OF GIVEN SERIES  
 

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int ans = 0;
    
    //   for(int i = 0; i<=n; i++ ){
    //     if (i%2==0) {
    //         ans -=i;
            
    //     }
    //     else{
    //         ans+=i;
    //     }
    //     System.out.println(ans );
    //   }




    //  PRINT THE FIRST  N FACTORIAL NUMBERS 
//        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();
//        int fact=1 ; 

//        for (int i = 1; i <=n ; i++) {
//         fact = fact *i;
// System.out.println( "factorial of   "+i+"is ;" +fact);
        
//        }
    

//     A raised to b 


    //  Scanner sc = new Scanner(System.in);
    //  System.out.println("enter your number a");

    //  int a = sc.nextInt();

    //   System.out.println("enter your number b");

    //  int b = sc.nextInt();
    //  int ans = 1;

    //  for (int i = 1; i <=b ; i++) {
    //     ans = ans * a;
        
    //  }
    //  System.out.println("your answer is "+ans);

    

    
//     FIND THE LARGEST NUMBER 
   
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

int max=0;
if (a>b){
    max=a;
}
if (b>max) {
    max=b;
}
if (c>max) {
    max=c;
    
}
System.out.println( "the maximum value "+max);



     
    

































































































































    }
}
