package offer;
/**
 * ��Ŀ����
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ
 * @author daiguohui
 *
 *��һ������ȥ1��Ȼ���ԭ�������ֽ��������㣬�൱�ڽ����ұߵ�1��Ϊ0
 */
public class BinaryNumOf1_10 {
	public int  NumberOf1(int n) {
        int num = 0;
        while(n!=0){
        	num ++;
        	 n= n-1 & n;
        }
        return num;
    }
}
