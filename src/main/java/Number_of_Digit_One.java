//给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。
//示例:
//输入: 13
//输出: 6
//解释: 数字 1 出现在以下数字中: 1, 10, 11, 12, 13 。

import java.util.ArrayList;
import java.util.List;

public class Number_of_Digit_One {
    public static void main(String[] args) {
//        System.out.println(Number_of_Digit_One.countDigitOne(824883294));
    }

//    public static int countDigitOne(int n) {
//        //校验参数
//        if(n<=0){
//            return 0;
//        }
//        int count = 0;
//        //遍历的到所有包含“1”，且小于等于整数N的数
//        for(int i=1;i<=n;i++){
//            String num = i+"";
//            if(num.contains("1")){
//                System.out.println(num);
//                for(int j=0;j<num.length();j++){
//                    //截取每一位
//                    String numStr = num.substring(j,j+1);
//                    if("1".equals(numStr)){
//                        count++;
//                    }
//                    //如果这一位数后，再也没有1存在则直接结束此次循环
//                    if(!num.substring(j+1).contains("1")){
//                        System.out.println("剩下部分："+num.substring(j+1)+"结束循环");
//                        break;
//                    }
//                    if(j+1<num.length()){
//                        //查询出下一位1的下标，直接跳过中间部分
//                        System.out.println("剩下部分："+num.substring(j+1)+"继续循环");
//                        j = num.substring(j+1).indexOf("1")+j;
//                        System.out.println("下一个1的下标："+j);
//                    }
//                }
//            }
//        }
//        return count;
//    }



//    public static int countDigitOne(int n) {
//        //校验参数
//        if (n <= 0) {
//            return 0;
//        }
//        if(n<10){
//            return 1;
//        }
//        int count = 0;
//
//        String numLine = n + "";
//        int len = numLine.length() - 1;
//
//        String zero = "1";
//        for (int i = 1; i < len; i++) {
//            zero += "0";
//        }
//
//        int zeroNum = Integer.parseInt(zero);
//
//        count += len * zeroNum;
//
//        String nine = "9";
//        for (int i = 1; i < len; i++) {
//            nine += "9";
//        }
//        int nineNum = Integer.parseInt(nine);
//
//        for (int i = nineNum + 1; i <= n; i++) {
//            String num = i + "";
//            if (num.contains("1")) {
//                System.out.println(num);
//                for (int j = 0; j < num.length(); j++) {
//                    //截取每一位
//                    String numStr = num.substring(j, j + 1);
//                    if ("1".equals(numStr)) {
//                        count++;
//                    }
//                    //如果这一位数后，再也没有1存在则直接结束此次循环
//                    if (!num.substring(j + 1).contains("1")) {
//                        System.out.println("剩下部分：" + num.substring(j + 1) + "结束循环");
//                        break;
//                    }
//                    if (j + 1 < num.length()) {
//                        //查询出下一位1的下标，直接跳过中间部分
//                        System.out.println("剩下部分：" + num.substring(j + 1) + "继续循环");
//                        j = num.substring(j + 1).indexOf("1") + j;
//                        System.out.println("下一个1的下标：" + j);
//                    }
//                }
//            }
//        }
//        return count;
//    }
}



