package offer;

public class StrToInt_49 {
	public int StrToInt(String str) {
        if(str == null || str.length() ==0) return 0;
        long  num =0;
        boolean minus = false;
        int begin=0;
        if(str.charAt(0)=='+'){
        	minus =false;
        	begin ++;
        }else if(str.charAt(0)=='-'){
        	minus =true;
        	begin ++;
        }
        if(str.length()>begin){
        	num = toInt(str, begin, minus);
        }
        return (int)num;
    }
	public long toInt(String str,int begin,boolean minus){
		long result=0;
		for(int i=begin;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				int flag = minus?1:-1;
				result = result*10 + flag*(str.charAt(i)-'0');
				if(!minus && result>Integer.MAX_VALUE ||
						minus && result < Integer.MIN_VALUE){
					result =0;
					break;
				}
			}
			else {
				result =0;
				break;
			}
		}
		return result;
	}

}
