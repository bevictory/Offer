package offer;

import javax.naming.spi.DirStateFactory.Result;
/**
 * 题目描述
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author daiguohui
 *
 */
/**
 * 传统的方法思路是从前往后解决问题，而改变顺序之后将会降低算法复杂度
 * 从后往前的替换，将会减少字符移动的次数，将算法复杂度降至O(n)
 */
public class ReplaceSpace_4 {
	public String replaceSpace(StringBuffer str) {
		//特殊输入
		if(str == null || str.length() ==0){
			return null;
		}
		int length = str.length();
		
		int blankNum =0;
		for(int i=0;i<length;i++){
			if(str.charAt(i) == ' '){
				blankNum ++;
			}
		}
		//特殊输入，没有空格的情况下直接返回原字符串
		if(blankNum ==0){
			return str.toString();
		}
    	int newLength = length + 2*blankNum;
    	length = length-1;
    	StringBuffer result =new StringBuffer(newLength);
    	
    	newLength =0;
    	//从前往后的添加，然后反转
    	while(length >=0){
    		if(str.charAt(length) == ' '){
    			result.append('0');
    			result.append('2');
    			result.append('%');
    			length--;
    		}else {
    			result.append(str.charAt(length--));
    		}
    	}
    	return result.reverse().toString();
    }
	public static void main(String []args){
		ReplaceSpace_4 replaceSpace_4 = new ReplaceSpace_4();
		replaceSpace_4.replaceSpace(new StringBuffer("hello world"));
	}
}
