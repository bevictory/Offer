package offer;

public class PrintNum_12 {
	public void print1ToMaxOfNDigits(int n){
		if(n < 0 ) return ;
		char [] number = new char[n];
		for(int i =0;i< 10;i++){
			number[i] = (char) (i+'0');
			
		}
		
	}
	public void recursive(char [] number, int length, int loc){
		if(loc == length -1){
			return;
		}
		for(int i =0;i< 10;i++){
			number[loc] = (char) (i+'0');
			recursive(number, length, loc+1);
		}
		
	}
	public void print(char []number, int length){
		boolean isBegin = true;
		for(int i =0;i< length;i++){
			if(isBegin&&number[i]!='0'){
				isBegin = false;
			}
			if(!isBegin){
				System.out.print(number[i]);
			}
			
		}
		System.out.println();
		
	}

}
