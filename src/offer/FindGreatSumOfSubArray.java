package offer;
/**
 * ��Ŀ����
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
 * ��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,
 * ������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * ��᲻�ᱻ������ס�� 
 * @author daiguohui
 *
 */
public class FindGreatSumOfSubArray {
	public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length ==0) return 0;
        int greatSum=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<array.length;i++){
        	if(curSum <= 0){
        		curSum = array[i];
        	}else 
        		curSum += array[i];
        	if(curSum > greatSum){
        		greatSum = curSum;
        	}
        }
        return greatSum;
    }

}
