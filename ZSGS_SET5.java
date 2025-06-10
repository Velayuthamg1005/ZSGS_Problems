import java.util.Scanner;

public class ZSGS_SET5 {
    public static void main(String[] args) {
        System.out.println("-----41 To 50 Problems-----");
    }
}

// P-NO 41 Write a Program for Pattern Printing 1

class PyramidPattern1{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Input: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ 
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
            
        }

    }
}

// P-NO 42 Write a program for Pattern Printing 2

class PatternPrinting2{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Input: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println(" ");
        }
    }
}

// P-NO 43 Write a program for Pattern Printing 3

class PatternPrinting3{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Input: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// P-NO 44 Write a program to print the following pattern based on the alphabet

class AlphabetPrint{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Alphabet: ");
        char ch= sc.next().toUpperCase().charAt(0);


        for(char i='A';i<=ch;i++){
            for(int j=1;j<=ch-i;j++){
                System.out.print(" ");
            }
            for(char j=1;j<=i-'A'+1;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

        for(char i=(char)(ch-1);i>='A';i--){
            for(int j=1;j<=ch-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i-'A'+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// P-NO 45 Program to print the following output for the given input.You can assume the string is of odd length

class PrintStringOutput{
    public static void main(String[] args) {
        
    }
}

// P-NO 46 Write a program to find the odd numbers in between the range

class FindOddInRange{
    public static void main(String[] args) {
        int start=2;
        int end=15;

        for(int i=start;i<end;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
}

// P-NO 47 Write a program to print a letters from 'A' to the user input character without using Strings.

class InputWithoutStrings{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char ch=sc.next().toUpperCase().charAt(0);

        for(char i='A';i<=ch;i++){
            System.out.print(i+" ");
        }
    }
}

// P-NO 48 Write a program to find the sum of given number and it is reverse number.

class SumAndReverse{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();

        int temp=num;
        int reverse=0;

        while(temp!=0){
            int rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }

        int result=num+reverse;

        System.out.println("Sum of the Original number and it's reverse number: "+result);
        
    }
}

// P-NO 49 Using Recursion reverse the string

class RecursionReverse{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();

        String[] splitStr=str.split(" ");

        String reversed="";

        for(int i=splitStr.length-1;i>=0;i--){
            reversed=reversed+splitStr[i]+" ";
        }

        System.out.println("Reversed String: "+reversed);
        
    }
}

// P-NO 50 Write a program to output number in words:(0-999)

class OutputNumber{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();

        String[] ones={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] onesAfter={"Eleven","twelve","thirteen","fourteen","fifteen","Sixteen","Seventeen","Eightteen","Nineteen"};
        String[] twos={"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};

        int temp=num;
        int i =1;
        while(temp!=0){
            int rem=num%10;
            // if(i==1){
            //     System.out.println(ones[rem]);
            // }
            // i++;
            // num /= 10;
        }
    }
}

class OutputNumber2{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();


        int temp=num;
        int reversed=0;
        while(temp!=0){
            int rem=temp%10;
            reversed=reversed*10+rem;
            temp=temp/10;
        }

        int findNumber=reversed;

        while(findNumber!=0){
           int numbers=findNumber%10; 
    
        switch(numbers){
            case 0:{
                System.out.print("Zero ");
                break;
            }
            case 1:{
                System.out.print("One ");
                break;
            }
            case 2:{
                System.out.print("Two ");
                break;
            }
            case 3:{
                System.out.print("Three ");
                break;
            }
            case 4:{
                System.out.print("Four ");
                break;
            }
            case 5:{
                System.out.println("Five ");
                break;
            }
            case 6:{
                System.out.print("Six ");
                break;
            }
            case 7:{
                System.out.print("Seven ");
                break;
            }
            case 8:{
                System.out.print("Eight ");
                break;
            }
            case 9:{
                System.out.print("Nine ");
                break;
            }
            default:{
                System.out.print("");
            }
        }
        findNumber=findNumber/10;
    }
    }
}

