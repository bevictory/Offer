package offer;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 结果请按字母顺序输出。 
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。

 * @author daiguohui
 *
 */
public class Permutation_28 {
	ArrayList<String> result = new ArrayList<>();
	public ArrayList<String> Permutation(String str) {
	      char[] strs = str.toCharArray();
        	if(str==null||str.length() ==0) return result;
	      Permutation(strs,0);
	       Collections.sort(result);
        return result;
    }
	public void Permutation(char[] str,int begin){
		if(begin == str.length){
			result.add(new String(str));
		}
		else{
			for(int i = begin ; i < str.length;i++){
				if(str[begin]== str[i]&&i!=begin) continue;
                char tmp = str[begin];
				str[begin] = str[i];
				str[i] = tmp;
				
				Permutation(str,begin+1);
				
				tmp = str[i];
				str[i] = str[begin];
				str[begin] = tmp;
			}
		}
		
	}
}
