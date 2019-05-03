/*
package add_binary;

public class Main {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String s = (new Solution()).addBinary(a,b);
        System.out.println(s);
    }

}

class Solution {
    public String addBinary(String a, String b) {
       int la = a.length();
       int lb = b.length();
       boolean carry = false;
       while ((!(la <0)) && (!(lb<0))){
           int c = (a.charAt(la-1)-'0')+(b.charAt(lb-1)-'0');
           if (carry){
               c++;
           }
            if (c==2){
                carry = true;
            }else {
                carry = false;
            }
           la--;
           lb--;
        }
    }
}*/
