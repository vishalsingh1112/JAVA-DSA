import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

//  ******
//  ******
//  ******
        
   Scanner sc = new Scanner(System.in);
   int r = sc.nextInt();
   int c = sc.nextInt();

   for (int i = 1 ; i<=r ; i++){
    for(int j =1; j<=c; j++){
        System.out.print("*");
    }
    System.out.println();
   }
    

//  *******
//  *     * 
//  *     *
//  *     *
//  *******

// Scanner sc = new Scanner(System.in);
// int r = sc.nextInt();
// int c = sc.nextInt();

// for (int i =1; i<=r; i++){
//     for (int j =1 ; j<=c; j++){
//         if (i == 1 || i ==r || j ==1 || j ==c) 
//             System.out.print("*");
            
        
//         else
//             System.out.print(" ");
        

//     }
//     System.out.println();

// }


//  *
//  **
//  ***
//  ****
//  *****


// Scanner sc = new Scanner(System.in);
// int r = sc.nextInt();
 
// for (int i = 1; i <=r; i++){
//     for( int j = 1; j<=i; j++){
//         System.out.print("*");

//     }
//     System.out.println();

// }

  
//  ******
//  *****
//  ****
//  ***
//  **
//  *

//  Scanner sc = new Scanner(System.in);
//  int r = sc.nextInt();

//  for ( int i = 1 ; i <=r; i++){
//     for (int j = 1 ; j <=(r+1-i); j++){
//         System.out.print("*");
//     }
//     System.out.println();
//  }

//   way 2 

// Scanner sc = new Scanner(System.in );
// int r = sc.nextInt();
 
// for( int i = r ; i>=1; i--){
//     for ( int j =1; j<=i; j++){
//         System.out.print("*");

//     }
//     System.out.println();
// }
   

//    *
//   ***
//  *****
// *******

// Scanner sc = new Scanner(System.in);
// int r = sc.nextInt();
// for( int i =1 ; i<=r; i++){
//     // print r-i spaces 
//     for(int j = 1; j<=r-i; j++){
//         System.out.print(" ");
//     }

//         //  print 2*i-1
//         for(int k =1; k<=2*i-1; k++){
//             System.out.print("*");

//         }
//         System.out.println();
    
// }
 

//    1234567
//    2345671
//    3456712
//    4567123
//    5671234
//    6712345
//    7123456

// Scanner sc = new Scanner(System.in);
// int r = sc.nextInt();
 
// for( int i =1; i<=r; i++){
//     for(int j =i; j<=r; j++){
//         System.out.print(j);

//     }
//     for (int k =1; k<=i-1;k++){
//         System.out.print(k);
//     }
//     System.out.println();
// }
    



//  123456
//  123456
//  123456
//  123456

// Scanner sc = new Scanner(System.in);
// int r = sc.nextInt();
// int c = sc.nextInt();

// for (int i =1; i<=r; i++){
//     for (int j =1; j<=c; j++){
//         System.out.print(j);

//     }
//     System.out.println();
// }





// 121212
// 212121
// 121212
// 212121 
// 121212
// 212121


// Scanner sc = new Scanner(System.in);
// int r = sc.nextInt(); 
// int c = sc.nextInt(); 
  
// for (int i =1; i<=r; i++){
//     for (int j = 1; j<=c; j++){
//     if ((i+j )%2  == 0) {
//         System.out.print(1);
        
//     }
//     else{
//         System.out.print(2);
//     }
//     }
//     System.out.println();
// }


//  1
//  12
//  123
//  1234
//  12345

// Scanner sc = new Scanner(System.in);
// int r = sc.nextInt();


// for(int i = 1; i<=r; i++){
//     for (int j=1; j<=i ;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }


//    1
//   121
//  12321
// 1234321
// 123454321

  
// Scanner sc = new Scanner(System.in);
// int r = sc.nextInt();

// for (int i =1; i <=r; i++){
//     //  print r-i spaces 
//   for ( int j =1; j<= r-i; j++){
//     System.out.print(" ");
//   }
// //    print 1to i
//   for(int k =1;k<= i;k++){
//     System.out.print(k);

//   }
// //   print i-1 to1 
//   for(int l =i-1;  l>=1; l-- ){
//     System.out.print(l);

//   }
//   System.out.println();


// } 


    







 


































































































































    }
}
