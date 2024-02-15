import java.util.*;
public class basics {
     ///////////////////////////////////////////////    SUM CALCULATION    //////////////////////////////////////////
     /* 
     public static int calsum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER nos.");
        int a=sc.nextInt();
        int b=sc.nextInt();


        int sum=calsum(a,b);
        System.out.println(sum);
     }}*/
    /////////////////////////////////////////////     PRODUCT CALCULATION   ///////////////////////////////////////////
 /*     public static int calpro(int a,int b){
       int pro=a*b;
       return pro;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER nos.");
        int a=sc.nextInt();
        int b=sc.nextInt();


        int product=calpro(a,b);
        System.out.println(product);
    }}*/
    /////////////////////////////////////////////////     GETTING FACTORIAL ////////////////////////////////////////////

    /*public static void factorial(int n){
        int fact=1;
        for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);

    }
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no.");
        int n=sc.nextInt();

        factorial(n);
    }}*/

    ////////////////////////////////////////////////////////    AVERAGE FUNCTION   ////////////////////////////////////////
  /*  public static int AVG(int a,int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println(average);
        return average;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("3 no. are");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        AVG(a,b,c);

    }}*/

    //////////////////////////////////////////////////////////     SUM OFF ODD no.   //////////////////////////////////////////////
   /* public static void  sunofodd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i%2)!=0) {
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.");
        int n= sc.nextInt();

        sunofodd(n);
    }

    ///////////////////////////////////////////////////    ((((.... 1D ARRAY....)))    ///////////////////////////////////////////////
        public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of rows and cols");
        int row= sc.nextInt();
        int col=sc.nextInt();

        int[][]araay=new int[row][col];
        System.out.println("enter elements in 2D array");
        for (int i=0;i<row;i++){
            for (int k=0;k<col;k++){
                araay[i][k]=sc.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            for (int k=0;k<col;k++){
                System.out.println(araay[i][k] + " ");

            }
        }
    } */

    ////////////////////////////////////////////////////////           (even odd program)   ////////////////////////////////////////////
    /* 
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int a= sc.nextInt();
        if (a%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
    */

    ///////////////////////////////////////////////////////////       calculator usiNg switch case   ////////////////////////////////////////
    /* 
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. a");
        int a= sc.nextInt();
        System.out.println("enter no. b");
        int b= sc.nextInt();
        System.out.println("enter command");
        System.out.println("1=ADD, 2=SUB, 3=PROD, 4=DIV");
        int command= sc.nextInt();
        switch (command){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("wrong command");
        }
    }
     */

    
