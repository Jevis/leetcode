
//思路 ：先排序 之后挨个比较
class Solution {
    public boolean isAnagram(String s, String t) {
             char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        if (sChars.length != tChars.length) {
            return false;
        }
        for (int i = 0; i <sChars.length; i++) {
            
            if(sChars[i] - tChars[i] != 0){
                return false;
            }
        }

        return true;
    }
}