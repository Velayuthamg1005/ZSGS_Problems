import java.util.Arrays;
import java.util.Scanner;


public class ZSGS_SET3 {
    public static void main(String[] args) {
        System.out.println("------21 To 30 Problems-----");
    }
}

// P-NO 21 Evaluate the Expression and understand the difference

class EvaluateSums3{
    public static void main(String[] args) {
        int x=5;
        x=++x*2+3*-x;
        System.out.println("Answer is: "+x);
    }
}

// P-NO 22 Evaluate the Expression and understand the difference

class EvaluateSums4{
    public static void main(String[] args) {
        int y=10;
        int z=(++y*(y++ +5));
        System.out.println("Answer is: "+z);
    }
}

// P-NO 24 What is the Value of x1 if x=5 

class EvaluateSums5{
    public static void main(String[] args) {
        int x=7;
        int x1=++x - x++ + -x;
        System.out.println("Answer is: "+x1);
    }
}

// P-NO 25 Write a program to demonstrate the functionalities of 'final' keyword

final class FinalClass {
    void display() {
        System.out.println("Inside final class");
    }
}

class Demo {
    final int number = 10;

    final void show() {
        System.out.println("Final Method Number = " + number);
    }
}

class FinalKeywordShortDemo {
    public static void main(String[] args) {
        FinalClass obj1 = new FinalClass();
        obj1.display();

        Demo obj2 = new Demo();
        obj2.show();
    }
}


// P-NO 26 Given Two Sorted Arrays,merge them such that the elements are not repeated and print the repeated elements


class MergeAndRepeatArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};

        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, index = 0;

        System.out.print("Repeated elements: ");
        boolean first = true;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (index == 0 || merged[index - 1] != arr1[i]) {
                    merged[index++] = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (index == 0 || merged[index - 1] != arr2[j]) {
                    merged[index++] = arr2[j];
                }
                j++;
            } else {
                if (!first) System.out.print(", ");
                System.out.print(arr1[i]);
                first = false;

                if (index == 0 || merged[index - 1] != arr1[i]) {
                    merged[index++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (index == 0 || merged[index - 1] != arr1[i]) {
                merged[index++] = arr1[i];
            }
            i++;
        }

        while (j < arr2.length) {
            if (index == 0 || merged[index - 1] != arr2[j]) {
                merged[index++] = arr2[j];
            }
            j++;
        }

        int[] newArray = Arrays.copyOf(merged, index);
        System.out.println("\n Merged Array: " + Arrays.toString(newArray));
    }
}


// P-NO 27 Write a program to right rotate the elements of multidimensional array

class RotateArray{
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=temp;
            }
        }

        for(int[] rotateArr:arr){
            System.out.println(Arrays.toString(rotateArr));
        }
    }
}

// P-NO 28 Alternate Sorting - Rearrange First Element is the First Minimum and Second Element is the First Maximum

class AlternateSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 7, 5, 6, 4};

        Arrays.sort(arr);

        int n = arr.length;
        int[] result = new int[n];

        int start = 0, end = n - 1;
        int i = 0;

        while (start <= end) {
            if (i < n) {
                result[i++] = arr[start++];
            }
            if (i < n) {
                result[i++] = arr[end--];
            }
        }

        System.out.println("Alternate Sorted Array: " + Arrays.toString(result));
    }
}

// P-NO 29 Program to find Factorial of a Number and factorial's number reverse number

class FactorialAndReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);

        long reverse = 0;
        long temp = fact;

        while (temp > 0) {
            long digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reverse of factorial is: " + reverse);
    }
}

// P-NO 30 Program to find the sum of elements of an array present on even position

class EvenPositionSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60}; 
        int sum = 0;

        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }

        System.out.println("Sum of elements at even positions: " + sum);
    }
}


