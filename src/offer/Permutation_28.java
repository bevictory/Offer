package offer;

import java.util.ArrayList;
import java.util.Collections;
/**
 * ��Ŀ����
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba�� ����밴��ĸ˳������� 
 * ��������:
 * ����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��

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
