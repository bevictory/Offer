package offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ��Ŀ����
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
 * ���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 * û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
 * ���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck! 
 * 
 * �������
 * ������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��

 * @author daiguohui
 *
 */
public class PrintContinuousSequence_41 {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	    if(sum <3) return result;  
	    if(sum == 3) {
	    	ArrayList<Integer> list = new ArrayList<>();
	    	list.add(1);
	    	list.add(2);
	    	result.add(list);
	    	return result;
	    }
		find(sum);
	    return result;   
    }
	public void find(int sum){
		
		int small = 1;
		int big = 2;
		int mid = sum/2+1;
		int curSum = small +big;
		while(small< mid){
			if(curSum == sum){
				ArrayList<Integer> list = new ArrayList<>();
				for(int i=small; i<= big; i++){
					list.add(i);
				}
				big++;
				curSum+=big;
				result.add(list);
			}else if(curSum < sum){
				big++;
				curSum+=big;
			}else{
				
				curSum-=small;
				small ++;
			}
		}
	}
	
	public static void main(String []args){
	 PrintContinuousSequence_41 p= new PrintContinuousSequence_41();
	 p.FindContinuousSequence(100);
	 
	}
}
