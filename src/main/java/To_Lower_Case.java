import jdk.nashorn.internal.runtime.Context;

/**
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，
    你想知道你拥有的石头中有多少是宝石。
    J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 */
public class To_Lower_Case {
    public static void main(String[] args){
        Solution709 s = new Solution709();
        System.out.println(s.toLowerCase("HeLlOworlD"));

    }
}

//65-90之间 +32
class Solution709 {
    public String toLowerCase(String str) {
        if(str==null){
            return null;
        }
        String newString = "";
        for(int i=0;i<str.length();i++){
            int chars = str.charAt(i);
            if(65<=chars&&chars<=90){
                chars+=32;
                newString+=(char)chars;
            }else{
                newString+=(char)chars;
            }
        }
        return newString;
    }
}