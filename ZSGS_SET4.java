public class ZSGS_SET4 {
    public static void main(String[] args) {
        System.out.println("-----31 to 40 problems-----");
    }
}

// P-NO 31 Program to find the sum of elements of an array present on Odd position

class OddPositionSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60}; 
        int sum = 0;

        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }

        System.out.println("Sum of elements at odd positions: " + sum);
    }
}

// P-NO 32 Java program to print the 2nd largest element in the array

class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 30};  

        if (arr.length < 2) {
            System.out.println("Array should have at least 2 elements.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second largest element is: " + second);
        }
    }
}

// P-NO 33 Java program to print the 2nd smallest element in the array

class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 8, 3}; 

        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }
}

// P-NO 34 Java program to print the number of elements present in an array

class CountElements {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int count = arr.length;

        System.out.println("Number of elements in the array: " + count);
    }
}

// P-NO 35 Java program to copy all elements of one array into another array

class CopyArray {
    public static void main(String[] args) {
    
        int[] source = {5, 10, 15, 20, 25};
        int[] destination = new int[source.length];

    
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        System.out.print("Copied array: ");
        for (int num : destination) {
            System.out.print(num + " ");
        }
    }
}

// P-NO 37 Java program to reverse the elements of an array

class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int n = arr.length;
        
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
