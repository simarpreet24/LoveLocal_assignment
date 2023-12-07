// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElements {

    public List<Integer> majorityElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int element1 = 0, element2 = 0;
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == element1) {
                count1++;
            } else if (num == element2) {
                count2++;
            } else if (count1 == 0) {
                element1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                element2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == element1) {
                count1++;
            } else if (num == element2) {
                count2++;
            }
        }
        
        int n = nums.length;
        if (count1 > n / 3) {
            result.add(element1);
        }
        if (count2 > n / 3) {
            result.add(element2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        String[] inputString = sc.nextLine().split(" ");
        int[] nums = new int[inputString.length];
        for (int i = 0; i < inputString.length; i++) {
            nums[i] = Integer.parseInt(inputString[i]);
        }
        MajorityElements solution = new MajorityElements();
        List<Integer> result = solution.majorityElements(nums);
        System.out.println("Majority Elements: " + result);
    }
}
/*Explanation for the code:
We start by creating a function to find the majority elements which makes use of the boyer moore voting algorithm.
A list is created to store the result. 
We initialize two elements and the number of times they occur with the count variable to 0. 
We start by iterating through the nums array which is the input array, if the number matches our first set element then we increment count1. similarly for element2.
If the value of count1 is 0 that means there are no occurences of the number that we set as element1. we then set element1= current number.
  */
