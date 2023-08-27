class Solution {
     public int[] nextsmallerelement(int[] arr, int n)
        {
            int[] ans=new int[n];
            Stack <Integer> s=new Stack<>();
            s.push(-1);
            for(int i=n-1;i>=0;i--)
            {
                int curr=arr[i];
        while (s.peek() != -1 && curr <= arr[s.peek()]) {
                
                    s.pop();
                }
                ans[i]=s.peek();
                s.push(i);
            }
                    
             
                  return ans;

     }
         public int[] prevsmallerelement(int[] arr, int n)
        {
            int[] ans1=new int[n];
            Stack <Integer> s1=new Stack<>();
            s1.push(-1);
            for(int i=0;i<n;i++)
            {
                int curr1=arr[i];
        while (s1.peek() != -1 && curr1 <= arr[s1.peek()]) {
                
                    s1.pop();
                }
                ans1[i]=s1.peek();
                s1.push(i);
            }
            
                          return ans1;

         }
    public int largestRectangleArea(int[] heights) 
    {
        int size=heights.length;
        int[] a=new int[size];
        a=nextsmallerelement(heights,size);
        
        int[] b=new int[size];
        b=prevsmallerelement(heights,size);
        
       int area=0;
        for(int i=0;i<size;i++)
        {
            int len=heights[i];
             if(a[i]==-1)
            {
                a[i]=size;
            }
            int width=a[i]-b[i]-1;
           
           int narea=len*width;
            area=Math.max(area,narea);
            
        }
        return area;
    }
       
            
    }
       
            
    