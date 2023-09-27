public class Solution {
    public String decodeAtIndex(String s, int k) {
        long length = 0;
        int i = 0;

        while (length < k) {
            if (Character.isDigit(s.charAt(i))) {
                length *= s.charAt(i) - '0';
            } else {
                length++;
            }
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            if (Character.isDigit(s.charAt(j))) {
                length /= s.charAt(j) - '0';
                k %= length;
            } else {
                if (k == 0 || k == length) {
                    return Character.toString(s.charAt(j));
                }
                length--;
            }
        }

        return "";
    }
}

// class Solution {
//     public String decodeAtIndex(String s, int k) {
//         StringBuilder str=new StringBuilder();
//         int c=0;
//         for(char ch : s.toCharArray())
//         {
//             if( (ch  >='a' && ch<= 'z') || (ch  >='A' && ch<= 'Z'))
//                str.append(ch);
//            if(Character.isDigit(ch))
//            {
//                int a=ch-'0';
//                int b=a-1;
//              while (b > 0) {
//             str.append(ch);
//                  b--;
//         }
//            }
//         }
//                return Character.toString(str.charAt(k)) ;
//     }
// }