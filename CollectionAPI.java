
// <> concept called generic

import java.util.ArrayList;
import java.util.Collection;
public class CollectionAPI {
    public static void main(String[] args)
    {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        System.out.println(nums);
        for (int n: nums){
            System.out.println(n);
        }
    }
}
