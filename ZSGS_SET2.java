import java.util.Scanner;

public class ZSGS_SET2 {
    public static void main(String[] args) {
        System.out.println("-----11 To 20 Problems");
    }  
}

// P-NO 11 Program to check whether a Character is Vowel or Consonant

class VowelOrConsonant{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Any Character: ");
        char ch=sc.next().toLowerCase().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch+" is a Vowel");
        }
        else{
            System.out.println(ch+" is a Consonant");
        }
    }
}

// Using ASCII values

class VowelOrConsonant2{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Any Character: ");
        char ch=sc.next().toLowerCase().charAt(0);

        int charValue=(int)ch;

        if(charValue==97 || charValue==101 || charValue==105 || charValue==111 || charValue==117){
            System.out.println((char)charValue+" is a Vowel");
        }
        else{
            System.out.println((char)charValue+" is a Consonant");
        }
        
    }
}

// P-NO 12 Program to Find the Largest Number amoung four numbers

class LargestNumber{

    static void findMax(int n1,int n2,int n3,int n4){

        int maxFirst2=0;
        int maxLast2=0;

        if(n1>n2) maxFirst2=n1;
        else maxFirst2=n2;

        if(n3>n4) maxLast2=n3;
        else maxLast2=n4;

        if(maxFirst2>maxLast2) System.out.println(maxFirst2+" is the Largest Number");
        else System.out.println(maxLast2+" is the Largest Number");

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int n1=sc.nextInt();

        System.out.print("Enter Number 2: ");
        int n2=sc.nextInt();

        System.out.print("Enter Number 3: ");
        int n3=sc.nextInt();

        System.out.print("Enter Number 4: ");
        int n4=sc.nextInt();
        
        findMax(n1, n2, n3, n4);
        
    }
}

// Using Math.max Function

class LargestNumber2{

    static void findMax(int n1,int n2,int n3,int n4){
        int maxFirst2=Math.max(n1, n2);
        int maxLast2=Math.max(n3,n4);
        int largestNum=Math.max(maxFirst2, maxLast2);

        System.out.println("Largest Number is: "+largestNum);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int n1=sc.nextInt();

        System.out.print("Enter Number 2: ");
        int n2=sc.nextInt();

        System.out.print("Enter Number 3: ");
        int n3=sc.nextInt();

        System.out.print("Enter Number 4: ");
        int n4=sc.nextInt();

        findMax(n1, n2, n3, n4);
    }
}

// P-NO 13 Program to find the Roots of a Quadratic Equation


class QuadraticEquation {

    static void findRoots(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        System.out.println("Discriminant = " + d);

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } 
        
        else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        }
        
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex and imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        findRoots(a, b, c);

    }
}


// P-NO 14 Program to check whether a number is positive or negative

class PosOrNeg{

    static void checkPosNeg(int number){
        if(number==0) System.out.println(number+" is neither Positive nor Negative");
        if(number>0) System.out.println(number+" is a Positive Number");
        else System.out.println(number+" is a Negative Number");
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number=sc.nextInt();

        checkPosNeg(number);
    }
}

// P-NO 15 Program to check whether a character is alphabet or not

class AlphaOrNot{

    static void checkChar(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch+" is an Alphabet");
        }
        else{
            System.out.println(ch+" is not an Alphabet");
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any Character: ");
        char ch=sc.next().toLowerCase().charAt(0);

        checkChar(ch);
    }
}

// P-NO 16 Program to Calculate the sum of the natural numbers and find the smallest digit of the sum

class SumOfNatural{

    static int findSumOfNat(int number){
        int sum=(number*(number+1))/2;
        return sum;
    }

    static int findSmallest(int n){
        int smallest=9;
        while(n>0){
            int digit=n%10;
            if(digit<smallest) smallest=digit;
            n=n/10;
        }
        return smallest;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number=sc.nextInt();

        int sum=findSumOfNat(number);
        System.out.println("Sum of the Natural Numbers: "+sum);

        System.out.println("Smallest digit of Sum: "+findSmallest(sum));

    }
}

// P-NO 17 Write a program to define the functionality of a conditional operators

class conditionalOp{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int n1=sc.nextInt();

        System.out.print("Enter Number 2: ");
        int n2=sc.nextInt();

        if(n1==n2) System.out.println(n1+" is equal to "+n2);
        else if(n1>n2) System.out.println(n1+" is greater than "+n2);
        else if(n1<n2) System.out.println(n2+" is greater than "+n1);

        System.out.print("Enter the Age: ");
        int age=sc.nextInt();
        if(age>=18) System.out.println("You are allowed to drive");
        else System.out.println("Not allowed to drive");

        System.out.print("Is it Raining? ");
        boolean isRaining=sc.nextBoolean();
        if(isRaining) System.out.println("Take an Umbrella");
        else System.out.println("No need for Umbrella");
    }
}

// P-NO 18 Given the radius of two concentric circle,find the area of the space between the circles


class AreaBetweenCircles {

    static void findAreaBetweenCircles(double R, double r) {
        if (R <= r) {
            System.out.println("Outer radius must be greater than inner radius.");
            return;
        }

        double area = Math.PI * (R * R - r * r);
        System.out.printf("Area between the circles: %.2f", area);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the outer radius (R): ");
        double R = sc.nextDouble();

        System.out.print("Enter the inner radius (r): ");
        double r = sc.nextDouble();

        findAreaBetweenCircles(R, r);
    }
}


// P-NO 19 Evaluate the program and understand the difference

class EvaluateSums{

    public static void main(String[] args) {

        int a=5;
        int b=8;

        int result1= ++a - --b;
        int result2= a-- % b++;
        int result3= a*=b+=5;
        int result4=69>>>2;

        System.out.println("Value of a :"+a);
        System.out.println("Value of b :"+b);
        System.out.println("Result is: "+result1);
        System.out.println("Result is: "+result2);
        System.out.println("Result is: "+result3);
        System.out.println("Result is: "+result4);

    }
}

// P-NO 20 Evaluate the program and understand the difference 

class EvaluateSums2{
    public static void main(String[] args) {
        int a=28;
        a+=++a + ++a + -a + a--;
        System.out.println("Answer is: "+a);
    }
}