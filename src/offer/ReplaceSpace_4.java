package offer;

import javax.naming.spi.DirStateFactory.Result;
/**
 * ��Ŀ����
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * @author daiguohui
 *
 */
/**
 * ��ͳ�ķ���˼·�Ǵ�ǰ���������⣬���ı�˳��֮�󽫻ή���㷨���Ӷ�
 * �Ӻ���ǰ���滻����������ַ��ƶ��Ĵ��������㷨���ӶȽ���O(n)
 */
public class ReplaceSpace_4 {
	public String replaceSpace(StringBuffer str) {
		//��������
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
		//�������룬û�пո�������ֱ�ӷ���ԭ�ַ���
		if(blankNum ==0){
			return str.toString();
		}
    	int newLength = length + 2*blankNum;
    	length = length-1;
    	StringBuffer result =new StringBuffer(newLength);
    	
    	newLength =0;
    	//��ǰ�������ӣ�Ȼ��ת
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
