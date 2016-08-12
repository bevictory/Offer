package offer;
/**
 * 题目描述
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * @author daiguohui
 *
 */
public class LeftRoateString_42 {
	public String LeftRotateString(String str,int n) {
        if(str ==null ||str.length() ==0) return null;
        char[] strs = str.toCharArray();
        int length = str.length();
        
        n = n%length;
        if( n >0){
        	inverse(strs, 0, n-1);
        	inverse(strs, n, length-1);
        	inverse(strs, 0, length-1);
        }
        return new String(strs);
    }
	public void inverse(char[] strs,int begin, int end){
		for(int i=begin,j=end;i<=j;i++,j--){
			char tmp = strs[i];
			strs[i]= strs[j];
			strs[j]= tmp; 
		}
	}
}
