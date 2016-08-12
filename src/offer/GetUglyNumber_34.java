package offer;
/**
 * ��Ŀ����
 * ��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7��
 *  ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 * @author daiguohui
 *
 */
public class GetUglyNumber_34 {
	public int GetUglyNumber_Solution(int index) {
		int n = index;
		if(index <=0) return 0;
		int [] ugly = new int [n];
        ugly[0] =1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for(int i = 1; i < n; i++){
        	int min = Math.min(factor2, Math.min(factor3, factor5));
        	if(factor2 == min){
        		
        		ugly[i]= factor2;
        		factor2 = 2 * ugly[++index2];
        	}
        	if(factor3 == min){
        		
        		ugly[i]= factor3;
        		factor3 = 3 * ugly[++index3];
        		
        	}
        	if(factor5 == min){
        		
        		ugly[i]= factor5;
        		factor5 = 5 * ugly[++index5];
        	}
        }
        return ugly[n-1];
    }
}
