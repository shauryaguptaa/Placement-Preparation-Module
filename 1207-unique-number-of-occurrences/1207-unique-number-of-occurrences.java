class Solution

{
    public boolean uniqueOccurrences(int[] arr) {

    HashMap<Integer,Integer> map=new HashMap<>();
    HashSet<Integer> set=new HashSet<>(map.values());
    
    for(int num: arr)
    {
        map.put(num,map.getOrDefault(num,0)+1);
    }
    for(Map.Entry<Integer,Integer> e: map.entrySet())
    {
        int v=e.getValue();
        if(set.contains(v)){
            return false;
        }
        set.add(v);
    }
    return true;
}
}