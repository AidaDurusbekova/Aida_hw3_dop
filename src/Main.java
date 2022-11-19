import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] nums = {4.4, -7.8, 2.2, 8.0, 78.4, 2.5};

        sort(nums);
    }

    public static void sort(double[] nums) {
        int ch = nums.length;
        for (int i = 0; i <ch -1; i++) {
            int miniindex = i;
            for (int j = i+1; j < ch; j++) {
                if ((nums[j] < nums[miniindex])
                ) miniindex = j;
                double chislo = nums[miniindex];
                nums[miniindex] = nums[i];
                nums[i] = chislo;
            }


        }
        System.out.println(Arrays.toString(nums));

    }
}
