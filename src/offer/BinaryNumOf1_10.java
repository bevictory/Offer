package offer;
/**
 * 题目描述
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * @author daiguohui
 *
 *把一个数减去1，然后和原来的数字进行与运算，相当于将最右边的1置为0
 */
public class BinaryNumOf1_10 {
	public int  NumberOf1(int n) {
        int num = 0;
        while(n!=0){
        	num ++;
        	 n= n-1 & n;
        }
        return num;
    }
}
