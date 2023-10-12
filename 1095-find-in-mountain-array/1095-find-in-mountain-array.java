/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
// class Solution {
//     public int findPeakInMountainArray(int[] arr) {
//         int start=0,end=arr.length-1;
//         while(start<end)
//         {
//             int mid=(start+(end-start))/2;
//             if(arr[mid]<arr[mid+1])
//             {
//                 start=mid+1;
//             }
//             else if(arr[mid]>arr[mid+1])
//             {
//                 end=mid;
//             }
//             else
//                 return start;
//         }
        
//     }
//     public int search(int[] arr, int target)
//     {
       
//     int peak= findPeakInMountainArray(arr);
//         int firsttry= orderagnosearch(arr,0,peak,target);
//         if( firstttry !=-1)
//             return firsttry;
//         else 
//             return orderagnosearch(arr,peak+1,end,target);
//     }
//     public int orderagnosearch(int [] arr, int s, int e, int target)
//     {
//          boolean isAsc = arr[s] < arr[e];
//     while (s <= e) {
//         int middle = s + (e - s) / 2;
 
//         if (arr[middle] == target)
//             return middle;
 
//         if (isAsc == true) {
 
//             if (arr[middle] < target)
//                 s = middle + 1;
 
//             else
//                 e = middle - 1;
//         }
 
//         else {
 
//             if (arr[middle] > target)
//                 s = middle + 1;
 
//             else
//                 e = middle - 1;
//         }
//     }
// }
// }

class Solution {
public int findInMountainArray(int target, MountainArray mountainArr) {
int peak=findPeak(mountainArr);
int search=orderAgnostic(mountainArr,target,0,peak);
if(search!=-1){
return search;
}
return orderAgnostic(mountainArr,target,peak+1,mountainArr.length()-1);
}
static int findPeak(MountainArray mountainArr) {
int start=0;
int end=mountainArr.length()-1;
while(start < end) {
int mid = start + (end - start) / 2;
if(mountainArr.get(mid)>mountainArr.get(mid+1)) end=mid;
else start=mid+1;
}
return start;
}
static int orderAgnostic(MountainArray mountainArr,int target,int start,int end) {
boolean asc=mountainArr.get(start) < mountainArr.get(end);
while(start <= end) {
int mid = start + (end - start) / 2;
if(mountainArr.get(mid)==target) return mid;

    if(asc) {
        if(mountainArr.get(mid)>target) end=mid-1;
        else start=mid+1;
    }

    else {
        if(mountainArr.get(mid)<target) end=mid-1;
        else start=mid+1;
    }
    
}
    return -1;
}
}