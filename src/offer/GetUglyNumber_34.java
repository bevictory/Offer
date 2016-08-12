package offer;
/**
 * 题目描述
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 *  习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
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
