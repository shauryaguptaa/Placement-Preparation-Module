// class Solution {
//     public boolean isPathCrossing(String path) {
//         HashSet<Pair<Integer, Integer>>  set=new HashSet<>();
//         int x=0,y=0;
//         set.add(new Pair<>(x,y));
//         for(char dir:path.toCharArray())
//         {
//             if(dir=='N')
//                 x++;
//             else if(dir=='S')
//                 x--;
//             else if(dir=='E')
//                 y++;
//             else if(dir=='W')
//                 y--;
//             set.add(new Pair<>(x,y));
//         }
//         return path.length()==set.size();
//         }
//     }
class Solution {
    public boolean isPathCrossing(String path) {

        int x = 0, y = 0;

        Set<Pair<Integer, Integer>> set = new HashSet<>();

        set.add(new Pair<>(0, 0));

        for (char c : path.toCharArray()) {
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'W') x++;
            else if (c == 'E') x--;

            if (set.contains(new Pair<>(x, y))) return true;
            else set.add(new Pair<>(x, y));
        }
        return false;
    }
}