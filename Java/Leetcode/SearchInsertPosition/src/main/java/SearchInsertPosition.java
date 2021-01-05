
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SearchInsertPosition {
    public static void main(String[] args){
        System.out.println(searchInsert(new int[]{1},0));
    }
    public static int searchInsert(int[] nums, int target) {
        if(Arrays.stream(nums).anyMatch(i -> i==target)){
            return IntStream.range(0, nums.length)
                    .filter(i -> target == nums[i])
                    .findFirst()
                    .orElse(-1);
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
