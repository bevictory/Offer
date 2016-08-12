package offer;
/**
 * ��Ŀ����
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�����
 * @author daiguohui
 *
 *
 *
 */
public class NumberOf1Btw1ToN_32 {
	public int NumberOf1Between1AndN_Solution(int n) {
	    if(n<=0) return 0;
	    String string=Integer.toString(n);
	    int length = string.length();
	    int []digits = new int[length];
	    for(int i=0;i<length;i++){
	    	digits[i]= string.charAt(i)-'0'; 
	    }
	    return numberOf1(digits, 0);
    }
	public int numberOf1(int []digits,int loc){
		if(loc == digits.length ) 
			return 0;
		int numFirst=0,numOther=0,numLeft=0;
		if(digits[loc] >1){
			numFirst = power(digits.length - loc -1);
		}else if(digits[loc] ==1){
			numFirst=getNum(digits, loc+1, digits.length-1)+1;
		}
		
		numOther = digits[loc]* (digits.length-1-loc)* power(digits.length-1-loc-1);
		return numFirst+numOther+numberOf1(digits, loc+1);
	}
	public int power(int n){
		int result =1;
		for(int i=0;i<n;i++){
			result*=10;
		}
		return result;
	}
	public int getNum(int[] digits ,int begin, int end){
		if(begin >end) return 0;
		int result =0;
		result += digits[begin];
		for(int i=begin+1;i<=end;i++){
			result*=10;
			result+=digits[i];
		}
		return result;
	}
}
