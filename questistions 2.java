import java.util.*;

/* 
public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      /* int a[]=new int[7];
        System.out.println("enter values in array");
       for (int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
       for (int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }


        System.out.println("enter size of array");
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter elements");
        for (int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        int s=0;
        for (int i=0;i<a.length;i++){
            s=s+a[i];
        }
        System.out.println(s);

    }
}


    //. Q4 Write a program to find the factorial value of any number entered through the keyboard.

public class Main{
    public static int factorial(int n){
        int f=1;
        int i=1;
        while (i<=n){
            f=f*i;
            i++;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.");
        int num= sc.nextInt();
        System.out.println(factorial(num));
    }
}


//Q5. Two numbers are entered through the keyboard. Write a program to find the value of one
//     number raised to the power of another.

public class Main
{
    public static int power(int a , int b){
        int r=1;
        for (int i=1;i<=b;i++){
            r=r*a;
        }
        return r;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no.");
        int a= sc.nextInt();;
        System.out.println("enter power");
        int b= sc.nextInt();
        System.out.println(power(a,b));
    }
}


//Q6. Write a program that prompts the user to input an integer and then outputs the number with
//    the digits reversed. For example, if the input is 12345, the output should be 54321.
public class Main {
    public static int rev(int n){
        int r=0;
        while(n!=0){
            int d=n%10;
            r=r*10+d;
            n=n/10;

        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. to be rev");
        int a= sc.nextInt();
        System.out.println(rev(a));

    }
}

//Q10. Write a program to calculate HCF of Two given numbers.

public class Main {
    public static int HCF(int a, int b){
        int hcf=0;
        int rem;
        do{
            rem=b%a;
            if (rem==0){
                hcf=a;
            }else {
                b=a;
                a=rem;
            }
        }while(rem!=0);
        return hcf;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter div");
        int a= sc.nextInt();
        System.out.println("enter divident");
        int b= sc.nextInt();

        System.out.println(HCF(a,b));

    }

}

public class Main {
    public static int[] array(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int s = sc.nextInt();
        int a[]=new int[s];
        System.out.println("enter elements");
        for (int i=0;i<s;i++){
            a[i]= sc.nextInt();
        }
        for (int i=0;i<s;i++){
            System.out.println(a[i]);
        }
        return a;
    }
    public static int Sum(int[] b){
        int sum=0;
        for (int i=0;i<b.length;i++){
            sum=sum+b[i];
        }
        return sum;
    }
    public static void testcase(){
        System.out.println("enter no. of tests");
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=1;i<=t;i++){
            int a = Sum(array());
            System.out.println(a);
        }

    }
    public static void main(String[] args){
     testcase();

    }
}

////////////////////////////////////////////////////////////     Array questions      /////////////////////////////////////////

 */
/*
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int s= sc.nextInt();
        System.out.println("enter elements");
        int a[]=new int[s];
        for (int i=0;i<s;i++){
            a[i]= sc.nextInt();
        }

        ///ascending order///


        /*for (int i=0;i<s;i++){
            for (int j=0; j<s-i-1;j++){
                if (a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

         */
              /////// descending order //////
        /*
        for (int i=0;i<s;i++) {
            for (int j = 0; j < s - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

         ////// output of array //////

        for (int i=0;i<=s;i++){
            System.out.println(a[i]);
        }



        ///// searching an element///////

        System.out.println("enter elemement to be searched");
        int e= sc.nextInt();
        int f=0;
        for (int i=0;i<s;i++){
            if(a[i]==e){
                f=f+1;
            }

            }
        if(f>0){
            System.out.println("element found a" );
        }
        else {
            System.out.println("not found");
        }



        /////// duplication//////



        int f=0;
        for (int i=0;i<s;i++){
            for (int j=i+1;j<s;j++){
                if (a[i]==a[j]){
                    System.out.println(a[j]);
                }

            }
        }




        ////// intersection ///////

        int b[]={2,7,9,3};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if(a[i]==b[j]) {
                    System.out.println(a[i]);
                }


            }
        }


        ///////////// PAIR SUM ///////////////
        System.out.println("enter the no. req");
        int n= sc.nextInt();
        int a[]={1,2,3,4,5,6};
        for (int i=0;i<a.length;i++){
            for (int j=i;j<a.length;j++){
                if(a[i]+a[j]==n){
                    System.out.print(a[i]);
                    System.out.println(a[j]);
                }
            }
        }



        //////// Sort 0 and 1 ///////

        int a[]={1,1,0,0,0,1,1,1,1,1,0,0,0};
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[j]>a[j+1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            System.out.print(a[i]);
      }

    }


}

         */



