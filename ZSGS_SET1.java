// P.NO -1 Write a program to print the binary,octal,hexadecimal value of an integer

import java.util.Scanner;

public class ZSGS_SET1{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.err.print("Enter an Integer: ");
        int number=sc.nextInt();

        if(number<0){
            System.out.println("It can't be Negative");
            return;
        }

        int temp=number;

        String binary="";

        while(temp>0){
        int rem=temp%2;
        binary=binary+rem;
        temp=temp/2;
        }

        System.out.println("Binary of the Given Integer: "+binary);

        temp=number;

        String octal="";

        while(temp>0){
            int rem=temp%8;
            octal=octal+rem;
            temp=temp/8;
        }

        System.out.println("Octal of the Given Integer: "+octal);

        temp=number;

        String hex="";
        char[] hexVal="0123456789ABCDEF".toCharArray();

        while(temp>0){
            int rem=temp%16;
            hex=hexVal[rem]+hex;
            temp=temp/16;
        }

        System.out.println("Hexadecimal of the Given Integer: "+hex);

        sc.close();
    }
}

// Using Built-in Types

class binOctHex{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number=sc.nextInt();

        String binary="";
        String octal="";
        String hexDecimal="";

        binary=Integer.toBinaryString(number);
        octal=Integer.toOctalString(number);
        hexDecimal=Integer.toHexString(number);

        System.out.println("Binary Value: "+binary);
        System.out.println("Octal Value: "+octal);
        System.out.println("Hexadecimal Value: "+hexDecimal);
    }
}

// P.NO -2 Write a program to find the Circumference of the square.

class CircumSquare{

    public static int findSquare(int number){
        int circumfOfSquare=4*number;
        return circumfOfSquare;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number=sc.nextInt();

        System.out.println("Circumference of the Square: "+findSquare(number));
    }
}

// P.NO -3 Write a program to find the Circumference of the Rectangle

class CirucumRect{

    public static int findRectangle(int l,int b){
        int circumOfRect=2*(l+b);
        return circumOfRect;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length=sc.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth=sc.nextInt();

        System.out.println("Circumference of a Rectangle: "+findRectangle(length, breadth));
    }
}

// P.NO -4 Write a program to find Circumference of a Cylinder

class CircumCylinder{

    public static double findCylinder(int r){
        double circumOfCylinder=2*3.14*r;
        return circumOfCylinder;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Radius: ");
        int radius=sc.nextInt();

        System.out.println("Circumference of the Cylinder: "+findCylinder(radius));
    }
}

// P.NO -5 Write a Single Program to generate a division and addition table for a given number

class GenerateDivAdd{

    public static void printAdd(int number){
        System.out.println("Addition Table");
        for(int i=1;i<number;i++){
            System.out.println(i+"+"+number+"="+(i+number));
        }
    }

    public static void printMul(int number){
        System.out.println("Division Table");
        for(int i=1;i<number;i++){
            System.out.println(number+"/"+i+"="+(number/i));
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number=sc.nextInt();

        printAdd(number);
        printMul(number);
    }
}

