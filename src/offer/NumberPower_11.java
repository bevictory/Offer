package offer;
/**
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author daiguohui
 *
 */
public class NumberPower_11 {
	 public double Power(double base, int exponent) {
		 int absExponent=exponent;
			if(exponent<0){
				absExponent = -exponent;
			}
			double result = unsignPower(base, absExponent);
			if(exponent < 0){
				result = 1.0 /result;
			}return result;
	  }
	 public double unsignPower(double base, int exponent){
			if(exponent == 0 ) return 1;
			if(exponent == 1) return base;
			double result =unsignPower(base, exponent>>1);
			result*= result;
			if((exponent&1)==1){
				result = result*base;
			}
			
			return result;
		}
}
