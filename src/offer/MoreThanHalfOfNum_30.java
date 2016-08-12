package offer;

public class MoreThanHalfOfNum_30 {
	 public int MoreThanHalfNum_Solution(int [] array) {
		 if(array==null ||array.length ==0)return 0;
		 int length = array.length;
		 int num=0;
		 int preNum =array[0];
		 for(int i =1;i<length;i++){
			 if(num ==0){
				 preNum = array[i];
				 num++;
				 continue;
			 }
			 if(array[i]== preNum ){
				 num++;
			 }else{
				 num--;
				 
			 }
		 }
		 int count=0;
		 for(int i=0;i< length;i++){
			 if(array[i] == preNum){
				 count++;
			 }
		 }
		 if(count*2 >length)
			 return preNum;
		 else return 0;
		 
	 }
	
}
