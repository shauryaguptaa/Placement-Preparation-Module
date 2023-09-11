// class Solution {
//     public int[] plusOne(int[] arr) {
//         int n=arr.length;
//         int last=arr[n-1];
       
//         if(last<9)
//             arr[n-1]++;
//         else
//         {
//             arr[n-1]=0;
//         arr[n-2]-=1;
        
//     }
//         return arr;
// }
// }

class Solution
{
    public int[] plusOne(int[] digits) {
for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
}
}