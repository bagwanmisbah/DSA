// import java.util.HashMap;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> hmap = new HashMap<>();
//         int[] resArr = new int[2];
//         for (int currval = 0; currval < nums.length; currval++) {
//             int needed = target - nums[currval];
//             if (hmap.containsKey(needed)) {
//                 resArr[0] = hmap.get(needed);
//                 resArr[1] = currval;
//                 return resArr;
//             }
//             hmap.put(nums[currval], currval);
//         }
//         return null;
//     }
// }
import java.util.HashMap;

class Solution
{
    public int[] twoSum(int[] nums,int target)
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int[] twoSum=new int[2];
        for(int currval=0;currval<nums.length;currval++) //starting from first index
        {
            int needed=target-nums[currval];//calculate the number needed to add to get currval
            if(hmap.containsKey(needed)) //if the map contains the needed value already
            {
                twoSum[0]=hmap.get(needed);// then add its index to twoSum array 
                twoSum[1]=currval;//the currval we have also adds up to target,store them
                return twoSum;//return the array
            }
            hmap.put(nums[currval],currval); //rest of the elements that dont add yp ,store in hashmap
        }
        return null;
        
    }
//     Optimized Version
// Initialization:

// nums = [5, 7, 9, 4]
// target = 16
// Create an empty HashMap.
// Iteration:

// First Element (i = 0, num = 5):
// Calculate complement = 16 - 5 = 11.
// Check if 11 is in the map. It's not.
// Add 5 to the map with its index: {5: 0}.
// Second Element (i = 1, num = 7):
// Calculate complement = 16 - 7 = 9.
// Check if 9 is in the map. It's not.
// Add 7 to the map with its index: {5: 0, 7: 1}.
// Third Element (i = 2, num = 9):
// Calculate complement = 16 - 9 = 7.
// Check if 7 is in the map. It is, at index 1.
// Return the indices [1, 2].
// The final output is [1, 2].
}


