package offer;

import java.util.Scanner;

/**
 * ��Ŀ����

 *��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 *����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 *��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 *NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0�� 
 * @author daiguohui
 *
 */
public class FindRotateArrayMin_8 {
	public int minNumberInRotateArray(int [] array) {
	    nums = array;
	    return min();
    }
	int []nums ;
	public int min(){
		if(nums.length == 0) return -1;
		int index1 = 0,index2 = nums.length-1 ,mid;
		mid = index1;
		while(nums[index1] >= nums[index2]){
			if(index1 - index2 == -1){
				index1=index2;
				break;
			}
			mid = (index1+index2)/2;
			if(nums[mid]== nums[index1]&&nums[index1] ==nums[index2] ){
				return minOrder(index1,index2);
			}
			if(nums[mid] >= nums[index1]){
				index1 = mid;
			}else if(nums[mid]<=nums[index2] ){
				index2=mid;
			}
		}
		return nums[index1];
	}
	public void input() {
		Scanner scanner = new Scanner(System.in);
		
			int n = scanner.nextInt();
			nums = new int[n];
			int i = 0;
			while (i < n) {
				nums[i] = scanner.nextInt();
				i++;
			
		}
			
	}
	public int minOrder(int index1,int index2){
		int min = Integer.MAX_VALUE;
		for(int i =index1;i<=index2;i++){
			if(nums[i]<min) min = nums[i];
		}
		return min;
	}
}
