//思路：转换大小写-> 过滤其他字符-> 反转-> 比较
class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s1.length(); i++) {
            if((s1.charAt(i) >='a' && s1.charAt(i) <= 'z') || (s1.charAt(i) >='0' && s1.charAt(i) <= '9')){
                stringBuffer.append(String.valueOf(s1.charAt(i)));
            }
        }
        String startStr = stringBuffer.toString();

        return stringBuffer.reverse().toString().contains(startStr);
    }
}