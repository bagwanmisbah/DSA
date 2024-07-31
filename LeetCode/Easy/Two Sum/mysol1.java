class Solution 
{
    public int[] twoSum(int[] nums, int target) //create a function that accepts size and target and returns an integer array
    {
        for(int i=0;i<nums.length;i++) //Iterates over each element in the nums array starting from the first element.
        {
            for(int j=i+1;j<nums.length;j++) // iterator j needs to be one place ahead of i, in order for them to be added 
            {
                if((nums[i]+nums[j])==target) // if current number plus one more than it is the same as the one we are looking for 
                {
                    //cout<<"["<<nums[i]<<","<<nums[j]<<"]";
                    return new int[] {i,j}; //then create an array having the current number(i) and the one next to it(j) that add upto our sum and return it
                }
            }

        }
      return null;  
    }
}
// TestCase:
// [2,7,11,15]
// 9
// [3,2,4]
// 6
// [3,3]
// 6
// TestResult:
// [0,1]
// [1,2]
// [0,1]

//alternate way , only difference is you create a named array in the beginnning instead of creating in the return statement
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    //cout<<"["<<nums[i]<<","<<nums[j]<<"]";
                    //return new int[] {i,j};
                    result[0]=i;
                    result[1]=j;
                    return result;

                }
            }

        }
      return null;  
    }
}

  
