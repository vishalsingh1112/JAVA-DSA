import java.util.Scanner;

public class btod {
    public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     int binary_num = sc.nextInt();

//     int ans = 0;
//     int pw = 1;

//     while (binary_num > 0) {
//         int unit_digit = binary_num %10;
//         ans += (unit_digit *pw);
//         binary_num /=10;
//         pw *=2;

        
//     }
// System.out.println(ans);


//    decimal to binary
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();

        int ans = 0;
        int pw = 1;

        while (decimal_num >0) {
            int parity = decimal_num %2;
            ans += (parity *pw);
            pw *=10;
            decimal_num /=2;


            
        } 
        System.out.println(ans);
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   






























    }
    
}
