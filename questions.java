import java.util.Scanner;

public class questions {
     public static void main(String[] arg) {
//Q.1  Write a program to print characters from a to z.
       /*  char a='a';
        char z='z';
        for ( char i=a;i<=z;i++){
            System.out.println(i);
        }}*/

//Q2. Write a program to calculate the sum of the first 10 natural numbers.
/* 
        int sum=0;
        for (int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println( sum)}
*/
//Q3. Write a program that prompts the user to input a positive integer. It should then print the
        //       multiplication table of that number.
/* 
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. for table");
        int n= sc.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }}
*/


//Q4. Write a program to find the factorial value of any number entered through the keyboard.
/* 
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no");
        int n= sc.nextInt();
        int f=1;
        for (int i=n;i>0;i--){
            f=f*i;
        }
        System.out.print(f);
    }
*/

//Q5. Two numbers are entered through the keyboard. Write a program to find the value of one
//       number raised to the power of another. (Do not use Java built-in method).

/* 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n= sc.nextInt();
        System.out.println("enter power");
        int p= sc.nextInt();
        int r =1;
        for (int i=1;i<=p;i++) {
            r = r * n;
        }
        System.out.println(r);
    }
*/

 //Q6. Write a program that prompts the user to input an integer and then outputs the number with
 //       the digits reversed. For example, if the input is 12345, the output should be 54321.
/* 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer digits");
        int n=sc.nextInt();
        int r=0;
        while (n!=0){
            int d= n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println(r);
    }
*/
 // Q7. Write a program that reads a set of integers, and then prints the sum of the even and odd
 // integer.
/* 
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  integer");
        int n= sc.nextInt();
        int esum=0;
        int osum=0;
        while (n!=0){
            int d=n%10;
            if (d%2==0){
                esum=esum+d;
            }
            else {
                osum=osum+d;
            }
            n=n/10;
        }
        System.out.println("sum of even"+esum);
        System.out.println("sum of odd"+osum);
    }
*/

 //Q8. Write a program that prompts the user to input a positive integer. It should then output a
//       message indicating whether the number is a prime number.
/* 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter +ve integer");
        int n= sc.nextInt();
        int l=0;
        for (int i=2;i<n;i++){
            if(n%i==0){
                l++;
            }
        }
        if (l>0)
            System.out.println("not");
        else if (n==0 || n == 1) {
            System.out.println("not valid");
        } else
            System.out.println("prime");
        }
*/

//Q9. Write a do-while loop that asks the user to enter two numbers. The numbers should be added
 //       and the sum displayed. The loop should ask the user whether he or she wishes to perform the
 //       operation again. If so, the loop should repeat; otherwise it should terminate.
/* 
        Scanner sc= new Scanner(System.in);
        int a, b;
        char ch;
        do {
            System.out.println("enter no.a");
             a = sc.nextInt();
            System.out.println("enter no. b ");
             b = sc.nextInt();
            System.out.println(a + b);
            System.out.println("press y or Y to continue");

            ch = sc.next().charAt(0);

        }while(ch == 'Y' || ch == 'y');
    }
*/


//Q12. If a five digit number is entered through the keyboard, write a program to calculate the sum of its digits.
/* 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 5 digit no.");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 0; i <= 5; i++) {
            int d = n % 10;
            s = s + d;
            n = n / 10;

        }
        System.out.println(s);}}

*/

//Q13. If a five digit number is entered through the keyboard, write a program to print a new number by adding
 // one to each of its digits. For example, if the number that is input is 12391, then the output should be displayed as 23502.

/* 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 digit no.");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i < 5; i++) {
            int d = n % 10;
            if (d == 9) {
                d = 0;
                c++;
                System.out.print(d);
            }
            if (c > 0) {
                d = d + 2;
                System.out.print(d);
            } else {
                d++;
                System.out.print(d);
            }
            n=n/10;


        }}}
*/


//Q14. If the cost price and selling price of an item is input through the keyboard, write a program to
// determine whether the seller has made profit or incurred loss.
// Also determine how much profit he made or loss he incurred.

/* 
        Scanner sc= new Scanner(System.in);
        System.out.println("enter CP");
        int CP= sc.nextInt();
        System.out.println("enter SP");
        int SP= sc.nextInt();
         if (SP>CP){
             System.out.println("PROFIT");
             int profit=SP-CP;
             System.out.println(profit);
         }
         else if(SP==CP){
             System.out.println("NO profit NO loss");
         }
         else{
             System.out.println("LOSS");
             int loss=CP-SP;
             System.out.println(loss);
         }}}
*/


 //Q15. If the ages of Ram, Shyam and Ajay are input through the keyboard,
 // write a program to determine the youngest of the three.
/* 
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER AGE OF RAM, SHYAM, AJAY");
        System.out.println("age of R");
        int R= sc.nextInt();
        System.out.println("age of S");
        int S= sc.nextInt();
        System.out.println("age of A");
        int A= sc.nextInt();
        if (R<S && S<A){
            System.out.println("RAM is youngest");
        } else if (S<R && R<A ) {
            System.out.println("SHYAM is youngest");

        }
        else {
            System.out.println("AYAJ is youngest");
        }

*/
// Q16. Write a program to check whether a triangle is valid or not when the angles
// are entered through the keyboard.
/* 
        Scanner sc= new Scanner(System.in);
        System.out.println("enter angles of triangle");
        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("ente b");
        int b= sc.nextInt();
        System.out.println("enter c");
        int c= sc.nextInt();
        if (a+b+c==180) {
            System.out.println("VALID triangle");
        }
        else {
            System.out.println("INVALID triangle");
        }}}
*/

//Q11. Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of
//         each digit of the number is equal to the number itself, then the number is called an
//         Armstrong number.
//         For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
/* 
        Scanner sc = new Scanner(System.in);
        for (int k=1;k<=500;k++){
            int s=0;
            int temp=k;
            while(temp!=0){
                int d=temp%10;
                s=s+(d*d*d);
                temp=temp/10;
            }
            if(k==s){
                System.out.println(k);
            }
        }}}
*/
 //////////////////////////////////////                  ********************ENDING OF LOOPS***********************             /////////////////////////////////////


//Q17. Guess a number game. Users will enter a number between 1 - 100. If the number entered is high
// it will say the guess is too high. And if the guess will be less than it will show the guess is low.

/* 
        Scanner s=new Scanner(System.in);
        int random =(int)(Math.random()*101);
        System.out.println("guess the no.");
        int guess= s.nextInt();
        if(random == guess) {
            System.out.println("You won");
        } else if(guess < random) {
            System.out.println("Guess is low\n"+random);
        } else if(guess > random) {
            System.out.println("Guess is high\n"+random);
        }


    
}}

*/
