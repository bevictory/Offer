package offer;
/**
 * ��Ŀ����
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
 * ����һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
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
