package First;

public class Solution {
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    int replaceBlank(char string[], int length) {
        if(0==length) return 0;
        int num = 0;
        for(int i=0;i<length;i++){
            if(string[i] == ' ') num++;
        }

        int newLen = length + num*2;
        int j = 1;
        for(int i=length-1;i>=0;i--){
            if(string[i] != ' '){
                string[newLen - j] = string[i];
                j++;
            }
            else{
                string[newLen - j] = '0';
                j++;
                string[newLen - j] = '2';
                j++;
                string[newLen - j] = '%';
                j++;
            }
        }
        return newLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String str1 = "hello world! I love you";
//        int len1 = solution.replaceBlank(str1, str1.length());
        String str2 = "Mr John Smith";
        int len2 = solution.replaceBlank(str2.toCharArray(), str2.length());
        System.out.println(str2);

    }
}