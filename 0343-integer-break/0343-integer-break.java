class Solution {
    public int integerBreak(int n) {
        int data[] = new int[n+1];
        data[1] = 1;
        for(int i=1;i<=n;i++)
            for(int j=1;j<i;j++)
                data[i] = Math.max(data[i], Math.max(j*(i-j),Math.max(data[j]*data[i-j],j*data[i-j])));
        return data[n];
    }
}