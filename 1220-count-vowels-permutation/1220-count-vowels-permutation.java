class Solution {
    long[][] dp;

    int MOD=(int)1e9+7;
    public long solve(int n,char previous){
        if(n==0){
            return 1; 
        }

        if(dp[n][previous-'a']!=0){
            return dp[n][previous-'a'];
        }

        long value=0;

        if(previous=='a'){
            value=solve(n-1,'e');
        }else if(previous=='e'){
            value=(solve(n-1,'a')+solve(n-1,'i'));
        }else if(previous=='i'){
            value=(solve(n-1,'a')+solve(n-1,'e')+solve(n-1,'o')+solve(n-1,'u'));
        }else if(previous=='o'){
            value=(solve(n-1,'i')+solve(n-1,'u'));
        }else if(previous=='u'){
            value=solve(n-1,'a');
        }

        return dp[n][previous-'a']=value%MOD;
    }
    public int countVowelPermutation(int n) {
        dp=new long[n+1][26];
        
        long result=(solve(n-1,'a')+solve(n-1,'e')+solve(n-1,'i')+solve(n-1,'o')+solve(n-1,'u'))%MOD;

        return (int)result;
    }
}