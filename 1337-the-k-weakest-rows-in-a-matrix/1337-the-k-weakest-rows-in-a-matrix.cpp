
class Solution {
public:
    static int cmpr(pair<int,int> a, pair<int,int> b)
    {   if(a.first < b.first){return true ;}
        else if(a.first == b.first){return a.second<b.second ;}
        return false ;
    }
    vector<int> kWeakestRows(vector<vector<int>>& grid, int k) 
    {
        int m = grid.size(); int n = grid[0].size();
        int lo, hi, cnt = 0, pos ; vector<pair<int, int>> ones ;
        
        for(int i = 0; i<m; i++)
        {
            lo = 0 ; hi = n - 1 ; pos = -1;
            while(lo<=hi)
            {
                int mid = lo + (hi-lo)/2 ;

                if(grid[i][mid]==0){ hi = mid-1 ; }
                else{ pos = mid ; lo = mid + 1 ; }
            }
            ones.push_back(make_pair(pos+1, i)) ;   
        }
        sort(ones.begin(), ones.end(), cmpr);
        vector<int> res ;
        
        for(int i=0; i<k; i++)
        {   cout<<ones[i].first<<" -->"<<ones[i].second<<endl ;
            res.push_back(ones[i].second) ;
        }
        return res;
    }
};
