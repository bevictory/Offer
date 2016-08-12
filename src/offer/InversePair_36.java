package offer;


public class InversePair_36 {
	 public int InversePairs(int [] array) {
	        if(array ==null || array.length ==0) return 0;
	        int copy[] = new int[array.length];
	        for(int i=0;i<array.length;i++){
	        	copy[i]= array[i] ;
	        }
	        return (int)(inverse(array, copy, 0, array.length-1)%1000000007);
	 }
	 public long inverse(int []array,int []copy, int start, int end){
		 if(start == end ){
			 copy[start] = array[start];
			 return 0;
		 }
		 int length = (end-start)/2;
		 long left = inverse(copy,array , start, start+length);
		 long right = inverse(copy, array, start+length+1, end);
		 int pre= start +length;
		 int post = end ;
		 int indexCopy = end;
		 long count=0;
		 while(pre >=start &&post>=start+length+1){
			 if(array[pre]>array[post] ){
				 count+= post-start-length;
				 copy[indexCopy--] =array[pre--];
			 }else{
				 copy[indexCopy--] =array[post--];
			 }
			 
		 }
		 while(pre>=start){
			 copy[indexCopy--] =array[pre--];
		 }
		 while(post>=start+length+1){
			 copy[indexCopy--] =array[post--];
		 }
		 return left+right+count;
	 }
}
