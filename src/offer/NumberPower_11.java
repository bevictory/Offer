package offer;
/**
 * ��Ŀ����
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
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
