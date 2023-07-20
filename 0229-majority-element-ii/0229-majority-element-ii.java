class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1,num2=-1,C1=0,C2=0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==num1) C1++;
            else if(nums[i]==num2) C2++;
            else if(C1==0){
            num1 = nums[i];
            C1=1;}
            else if(C2==0){
            num2 = nums[i];
            C2=1;}
            else{
            C1--;
            C2--;}
        }
        
        List<Integer> ans = new ArrayList<>();
        int count1=0;
        int count2=0;
        for(int i=0;i<len;i++){
            if(nums[i]==num1)
            count1++;
            else if(nums[i]==num2)
            count2++;
        }
        if(count1>len/3)
        ans.add(num1);
        if(count2>len/3)
        ans.add(num2);
        return ans;
    }
}