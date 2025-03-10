import java.util.*;

public class Arraysproblem2 {

 static int lastOccurrence(int[] arr  , int x){
   int lastIndex = -1;
   for (int i = 0; i < arr.length; i++) {
    if (arr[i] == x) {
      lastIndex = i;        
    }
    
   }
   return lastIndex; 
 }
 

 static int pairSum(int[] arr , int target){
      
     int n = arr.length;
     int ans =0;

     for (int i = 0; i <n; i++) {
      for (int j = i+1; j < n; j++) {
        if (arr[i] +arr[j] == target) {
          ans++;
          
        }
        
      }
      
     }
     return ans ;
 }


    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
    //   System.out.println("enter the size of array");
    //   int n = sc.nextInt();

     
    //  int arr[] = new int[n];
    //  System.out.println("enter" +n + "elements");
    //  for (int i = 0; i < arr.length; i++) {
    //     arr[i] = sc.nextInt();
        
    //  }
     
      
      // System.out.println("enter x ");
      // int x = sc.nextInt();
      //  int count = 0;

      //  for (int i = 0; i < arr.length; i++) {
        
      //   if (arr[i] >x) {
      //       count++;
             
      //   }
        
      //  }
       
      //  System.out.println(" the  elements greater than x is " + count);
    //    System.out.println("last occurrence " + lastOccurrence(arr, x));


      // System.out.println("enter target sum");
      // int target = sc.nextInt();

      // System.out.println(pairSum(arr, target));



  //   count the number of triplet whose sum is equal to given value x 

// System.out.println("Enter the array size");
// int n = sc.nextInt();
// int arr [] = new int [n];
// int ans =0;

// System.out.println("Enter " +n + "elements ");
// for (int i = 0; i < arr.length; i++) {
//   arr[i] = sc.nextInt();  
// }

// System.out.println("Enter target sum ");
// int target = sc.nextInt();

// for (int i = 0; i < n ; i++) {
//   for (int j = i+1; j < n; j++) {
//     for (int k = j+1; k < n; k++) {
//       if (arr[i] + arr[j] + arr[k]== target) {
//         ans++;

        
//       }
      
//     }
    
//   }
  
// }

// System.out.println("The target sum is " + ans );



//  unique value in the arrays 


// System.out.println("Enter the array size");
// int n = sc.nextInt();
// int arr [] = new int [n];
// int ans =0;

// System.out.println("Enter " +n + "elements ");
// for (int i = 0; i < arr.length; i++) {
//   arr[i] = sc.nextInt();  
// }

// for (int i = 0; i < n; i++) {
//   for (int j = i+1; j < n; j++) {
//     if (arr[i] == arr[j])  {
//       arr[i] = -1;
//       arr[j] = -1;
      
//     }
    
//   }
  
    
// }

// for (int i = 0; i < n; i++) {
//   if (arr[i] >0) {
//     ans = arr[i];
    
//   }
  
// }
// System.out.println("The unique value is " +ans);


//  program to find the  largest number in array 

// System.out.println("Enter the array size");
// int n = sc.nextInt();
// int arr[] = new int[n];

// System.out.println("Enter " + n + "elements ");
// for (int i = 0; i < n; i++) {
//   arr[i] =  sc.nextInt();

// }
// int max = Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
//   if (arr[i] > max) {
//     max = arr[i];
//   }
  
// }
// System.out.println( " The maximum value is " +max);


//  program to find the second  largest number in the array 


// System.out.println("Enter the size of array ");
// int n = sc.nextInt();
// int arr[] = new int [n];

// System.out.println("Enter the "+ n + " elements ") ;
// for (int i = 0; i < arr.length; i++) {
//   arr[i] = sc.nextInt();

// }

// int max = Integer.MIN_VALUE;
// int secondmax=0;
// for (int i = 0; i < n; i++) {
//   if (arr[i] > max) {
//     secondmax=max;
//     max = arr[i];
//   }
// }





// System.out.println( "the maximum value is "+secondmax);

//  second approach 

// for (int i = 0; i < n; i++) {
//   if (arr[i] == max) {
//     arr[i] = Integer.MIN_VALUE;
    
//   }
// }
// int second=Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
//   if (arr[i] > second) {
//     // secondmax=max;
//     second = arr[i];
//   }
// }
// System.out.println( " maximum is " +second);


//  find the first repeted number in the array 

System.out.println("Enter the array size");
int n = sc.nextInt();
int arr [] = new int[n];

System.out.println("Enter " +n + "elements ");
for (int i = 0; i < n; i++) {
  arr[i] =  sc.nextInt();
int ans = 0;

  
}

for (int i = 0; i < n; i++) {
  for (int j = i+1; j < n; j++) {
  if (arr[i] == arr[j]) {
  System.out.println(arr[i]);
    
  }   
  }
  
}


















































}


    private static int findMax(int[] arr) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'findMax'");
    }
    
}
