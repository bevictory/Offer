package offer;

import java.util.ArrayList;
/**
 * 题目描述
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。 
 * @author daiguohui
 *
 */
public class GetLeastNumbers_30 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		if(input==null||input.length ==0||k<=0||k>input.length) return result;
        int length = input.length;
        int index =partion(input, 0, length-1);
        int begin = 0,end = length-1;
        while(index !=k-1){
        	if(index > k-1){
        		end = index-1;
        		index = partion(input, begin, end);
        	}else {
        		begin = index+1;
        		index = partion(input, begin, end);
        	}
        }
        for(int i=0;i<k;i++){
        	result.add(input[i]);
        }
        return result;
    }
	public int partion(int []input, int begin, int end){
		int tmp = input[end];
		
		while(begin < end){
			while(begin < end&& input[begin]<=tmp){
				begin++;
			}
			if(begin<end){
				input[end]= input[begin];

				end--;
			}
			while(begin < end && input[end] >tmp){
				end--;
			}
			if(begin < end){
			input[begin]=input[end];
			begin++;}
			 
		}
		input[end] = tmp;
//		while(begin < end){
//			while(begin < end&& input[begin]<=tmp){
//				begin++;
//			}
//			while(begin < end && input[end] >tmp){
//				end--;
//			}
//			int t = input[begin];
//			input[begin] = input[end];
//			input[end]= t; 
//		}
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
			
		}System.out.println();
		
		return end;
	}
	public static void main(String []args){
		int []input={4,5,1,6,2,7,3,8};
		GetLeastNumbers_30 a = new GetLeastNumbers_30();
		System.out.println(a.GetLeastNumbers_Solution(input, 4));
	}
}
