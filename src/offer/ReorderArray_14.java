package offer;

import java.util.ArrayList;
import java.util.List;

public class ReorderArray_14 {
//	public void reOrderArray(int [] array) {
//        if(array == null ) return ;
//		int length = array.length;
//		int begin = 0,end = length -1;
//		while(begin < end){
//			while(begin < end &&!isEven(array[begin]) ){
//				begin++;
//			}
//			while(begin < end &&isEven(array[end]) ){
//				end --;
//			}
//			if(begin < end ){
//				int tmp = array[begin];
//				array[begin] = array[end];
//				array[end]= tmp; 
//			}
//		}
//    }
	public void reOrderArray(int [] array) {
        if(array == null ) return ;
		int length = array.length;
		int begin = 0,end = length -1;
		List<Integer> list = new ArrayList<Integer>();
		int  count=0;
		for(int i =0;i< length;i++){
			if(isEven(array[i])){
				list.add(array[i]);
			}else{
				array[count] = array[i];
				count++;
			}
			
		}
		for(int i= count;i<length;i++){
			array[i]= list.get(i-count); 
		}
    }
	public boolean isEven(int n){
		if((n &1) ==1){
			return false;
		}
		else return true;
	}
}
