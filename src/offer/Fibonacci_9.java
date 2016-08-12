package offer;
/**
 * 题目描述

 *大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 *n<=39
	
 * @author daiguohui
 *
 *递归的方式会执行很多重复计算，使用迭代的方式将会降低复杂度
 */
public class Fibonacci_9 {
	public int Fibonacci(int n) {
		
		
		int result[]={0,1};
		if(n<2) return result[n];
		int one = 1;
		int two = 0;
		int f=0;
		for(int i = 2 ; i <= n;i++){
			f = one + two;
			
			two =one;one = f;
		}
		return f;
    }
}
