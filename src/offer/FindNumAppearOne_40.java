package offer;
/**
 * ��Ŀ����
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 * @author daiguohui
 *
 */
public class FindNumAppearOne_40 {
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        if(array==null||array.length==0) {
	        	num1[0]=0;
	        	num2[0]=0;
	        }
	        int length = array.length;
	        int result =0;
	        for(int i=0;i<length;i++){
	        	result ^= array[i];
	        }
	        int index = getFirst1(result);
	        num1[0]=num2[0]=0;
	        for(int i=0;i<length;i++){
	        	if(isBit1(array[i], index)){
	        		num1[0]^=array[i];
	        	}else num2[0]^=array[i];
	        }
	    }
	 public int getFirst1(int result){
		 int index =0;
		 while((result&1) ==0){
			 result = result >>1;
	        ++index;
		 }
		 return index;
	 }
	 public boolean isBit1(int num, int index){
		 num = num >> index;
		 return (num&1)==1?true:false;
	 }
}
