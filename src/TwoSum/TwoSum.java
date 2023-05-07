package TwoSum;

public class TwoSum {
    /*1.Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
     static int[] sum = {2,4,8,9,21};
        public  int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[] {};

        }

    public static void main(String[] args) {
       TwoSum tsum = new TwoSum();
        //System.out.println(tsum.twoSum(sum,4));




    }
}


