package TwoSum;

public class TwoSum {
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


