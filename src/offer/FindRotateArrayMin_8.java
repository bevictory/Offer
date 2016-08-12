package offer;

import java.util.Scanner;

/**
 * 题目描述

 *把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。 
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
