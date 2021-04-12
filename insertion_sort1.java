package insertion_sort;

/**
 *
 * @author Arzan-PC
 */
import java.util.Arrays;
        
public class insertion_sort1 {
    void insertion_sort1(int[] nums){
        for(int a = 1; a < nums.length; a++){
        int value = nums[a];
        int b = a - 1;
        while(b >= 0 && nums[b] > value){
            nums[b + 1] = nums[b];
            b = b -1;
            
        }
        nums [b + 1] = value;
    }
    }
    public static void main(String args[])
    {
       insertion_sort1 ob = new insertion_sort1();
       int nums[] = {8,-5,4,2,0,47};
       System.out.println("Original Array:");
       System.out.println(Arrays.toString(nums));
       ob.insertion_sort1(nums);
       System.out.println("sorted Array");
       System.out.println(Arrays.toString(nums));
    }
}
