class Solution {
         public int minCostClimbingStairs(int[] cost) {
      int[] memo = new int[cost.length];
      calculateCost(0, cost, memo);
      return Math.min(memo[0], memo[1]);
    }
  
    private int calculateCost(int index, int[] cost, int[] memo){
      if(index >= cost.length) return 0;
      if(memo[index] > 0 ) return memo[index];
      int cost1 = cost[index] + calculateCost(index + 1, cost, memo);
      int cost2 = cost[index] + calculateCost(index + 2, cost, memo);
      memo[index] =  Math.min(cost1, cost2);
      return memo[index];
    }
    }
