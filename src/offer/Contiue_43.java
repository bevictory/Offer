package offer;

import java.util.Arrays;
/**
 * ��Ŀ����
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 * ��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 * ������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,������\С �����Կ����κ�����,
 * ����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����
 * LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Ρ�Ϊ�˷������,�������Ϊ��С����0�� 
 * @author daiguohui
 *
 */
public class Contiue_43 {
	public boolean isContinuous(int [] numbers) {
		if(numbers==null || numbers.length ==0) return false;
		Arrays.sort(numbers);
		int len = numbers.length;
		int zeroCount=0;
		int gapCount=0;
		for(int i=0;i< len-1; i++){
			if(numbers[i] == 0) {
				zeroCount++;
				continue;
			}
			if(numbers[i+1]==0){
				continue;
			}
			int dis = numbers[i+1] -numbers[i];
			if(dis ==0) return false;
			gapCount += dis-1;
		}
		if(zeroCount >= gapCount){
			return true;
		}else return false;
    }
}
