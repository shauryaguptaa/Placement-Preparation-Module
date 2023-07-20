// class Solution {
//     public int findDuplicate(int[] nums) {
//         int low=0, high=nums.length-1, count;
//         while(low<=high)
//         {
//             int mid=low+(high-low)/2;
//             count=0;
//             for(int i:nums)
//             {
//                 if(i<=mid)
//                     count++;
//             }
        
//         if(count<=mid)
//             low=mid+1;
//         else
//             low=mid-1;
//     }
//         return low;
// }
// }
class Solution {
     public int findDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return num;
            }
        }
    return nums.length;
}
}