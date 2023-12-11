class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length/4;
        HashMap <Integer,Integer> m= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i], m.getOrDefault(arr[i],0)+1);
            if(m.get(arr[i])>n)
            {
                return arr[i];
            }
}
        return -1;
    }
}