import java.util.*;

public class ZSGS_SET6 {
    public static void main(String[] args) {
        System.out.println("-----51 to 60 Problems-----");
    }
}

// P-NO 51 Write a program to sort the elements in odd positions in descending order and elements in ascending order

class SortNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

        int evenCount = (n + 1) / 2; 
        int oddCount = n / 2;        

        int[] evenPos = new int[evenCount];
        int[] oddPos = new int[oddCount];

        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                evenPos[evenIndex++] = arr[i];
            else
                oddPos[oddIndex++] = arr[i];
        }

        for (int i = 0; i < evenCount - 1; i++) {
            for (int j = i + 1; j < evenCount; j++) {
                if (evenPos[i] < evenPos[j]) {
                    int temp = evenPos[i];
                    evenPos[i] = evenPos[j];
                    evenPos[j] = temp;
                }
            }
        }

        for (int i = 0; i < oddCount - 1; i++) {
            for (int j = i + 1; j < oddCount; j++) {
                if (oddPos[i] > oddPos[j]) {
                    int temp = oddPos[i];
                    oddPos[i] = oddPos[j];
                    oddPos[j] = temp;
                }
            }
        }

        evenIndex = 0;
        oddIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                arr[i] = evenPos[evenIndex++];
            else
                arr[i] = oddPos[oddIndex++];
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}

// P-NO 52 Write a program to print the alphabet 'C' with the stars based on the given numbers

class printC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } else if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}



// P-NO 53 Write a program to make such a pattern like a pyramid with numbers increased by 1

class PyramidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int num = 1;
        int rows = 0;

        for (int i = 1, sum = 0; sum < n; i++) {
            sum =sum+ i;
            rows = i;
        }

        int current = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i && current <= n; k++) {
                System.out.print(current + " ");
                current++;
            }

            System.out.println();
        }
    }
}

// P-NO 54 Write a program to print the following output for the given input.You can assume the string is of odd length

class StringOdd{
    public static void main(String[] args) {

        String str="12345";
        int n=str.length();
        int mid=n/2;

        for(int i=0;i<=mid;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
                if(i==mid){
                    System.out.println(str.charAt(mid));
                }
                else{
                    System.out.print(str.charAt(i));
                    for(int k=0;k<=2*(mid-i)-1;k++){
                        System.out.print(" ");
                    }
                    System.out.println(str.charAt(n-i-1));
                }
            }

        for(int i=mid-1;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
                System.out.print(str.charAt(i));
                for(int k=0;k<=2*(mid-i)-1;k++){
                    System.out.print(" ");
                }
                System.out.println(str.charAt(n-i-1));
            }
    }
}

// P-NO 55 Write a program to print the following pattern for the given input number

class GivenInputNumber{
    public static void main(String[] args) {

        int n=4;
        int size=2*n-1;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){

                int top=i;
                int bottom=size-1-i;
                int left=j;
                int right=size-1-j;

                int min=top;
                if(bottom<min) min=bottom;
                else if(left<min) min=left;
                else if(right<min) min=right;

                System.out.print(n-min);
            }
            System.out.println();
        }
    }
}

// P-NO 56 Print all substrings od given string without using strings in java

class SubStringProblem{
    public static void main(String args[]){
        String str="Rajesh";
        int n=str.length();
        char[] arr=str.toCharArray();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println(" ");
            }
        }
    }
}

// P-NO 57 Print the numbers which are mismatched from the two array

class MismatchArray{
    public static void main(String[] args) {
        String[] arr1={"a","b","c","d","e","f","g","h","i"};
        String[] arr2={"a","b","d","e","e","g","g","i","i"};

        char[] unique=new char[26];
        int uniqueIndex=0;

        for(String str1:arr1){
            char ch=str1.charAt(0);
            if(!contains(unique,uniqueIndex,ch)){
                unique[uniqueIndex++]=ch;
            }
        }

        for(String str2:arr2){
            char ch=str2.charAt(0);
            if(!contains(unique,uniqueIndex,ch)){
                unique[uniqueIndex++]=ch;
            }
        }

        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(String str1:arr1){
            freq1[str1.charAt(0)-'a']++;
        }

        for(String str2:arr2){
            freq2[str2.charAt(0)-'a']++;
        }

        for(int i=0;i<uniqueIndex;i++){
            char ch=unique[i];
            int index=ch-'a';
            if(freq1[index]!=freq2[index]){
                System.out.print(ch+" ");
            }
        }
    }

    public static boolean contains(char[] arr,int length,char ch){
        for(int i=0;i<length;i++){
            if(arr[i]==ch){
                return true;
            }
        }
        return false;
    }
}


// P-NO 58 Given 2 huge numbers as seperate digits,store them in array and process them and calculate the sum of 2 numbers and store the result in an array and print the sum

class CalculateSumAndPrint{
    public static void main(String[] args) {
        int[] num1={9,2,8,1,3,5,6,7,3,1,1,6};
        int[] num2={7,8,4,6,2,1,9,9,7};

        int len1=num1.length;
        int len2=num2.length;

        int maxLen;
        if(len1>len2){
            maxLen=len1+1;
        }
        else{
            maxLen=len2+1;
        }

        int[] result=new int[maxLen];

        int i=len1-1;
        int j=len2-1;
        int k=maxLen-1;
        int carry=0;

        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0){
                sum=sum+num1[i];
                i--;
            }
            if(j>=0){
                sum=sum+num2[j];
                j--;
            }

            result[k]=sum%10;
            carry=sum/10;
            k--;
        }

        int start=0;
        if(result[0]==0){
            start=1;
        }

        for(int index=start;index<maxLen;index++){
            System.out.print(result[index]+" ");
        }
    }
}

// P-NO 59 Write a program to print the below format

class Problem{
    public static void main(String[] args) {

        int row = 3; 
        int cols = 3; 

        for (int i= 0; i<row;i++) {
            System.out.println("+===+===+");

            for (int j=0;j<cols;j++) {
                System.out.println("|   |   |");
            }
        }
        System.out.println("+===+===+"); 

    }
}

// P-NO 60 Save the string in a two dimensional array and search the substring like "too" in the two dimensional string both from left to right and top to bottom

class SaveSubString {
    public static void searchSubstring(char[][] grid, String target) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Check horizontally (left to right)
                if (j + target.length() <= cols) {
                    boolean found = true;
                    for (int k = 0; k < target.length(); k++) {
                        if (grid[i][j + k] != target.charAt(k)) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("<" + i + "," + j + ">");
                        System.out.println("<" + i + "," + (j + target.length() - 1) + ">");
                    }
                }

                // Check vertically (top to bottom)
                if (i + target.length() <= rows) {
                    boolean found = true;
                    for (int k = 0; k < target.length(); k++) {
                        if (grid[i + k][j] != target.charAt(k)) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("<" + i + "," + j + ">");
                        System.out.println("<" + (i + target.length() - 1) + "," + j + ">");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'W','E','L','C','O','M','E','T','O','Z','O','H','O','C','O','R','P','O','R','A','T','I','O','N'},
            {'T','O','O','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U'}
        };

        String target = "TOO";
        searchSubstring(grid, target);
    }
}

