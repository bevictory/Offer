package offer;

import java.util.ArrayList;

/**
 *题目描述
 *输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果
 *输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 *则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10. 
 * @author daiguohui
 *
 *
 */
public class PrintMatrix_20 {
	ArrayList<Integer> result = new ArrayList<Integer>();
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       if(matrix == null) return null;
	       int rows = matrix.length;
	       int cols = rows>0?matrix[0].length:0;
	       int start = 0;
	       while(start*2<rows&& start*2 < cols){
	    	   print(matrix, rows, cols, start);
	    	   start ++;
	       }
	       return result;
    }
	public void print(int [][]matrix, int rows, int cols, int start ){
		int endRow = rows - start -1;
		int endCol = cols - start -1;
		for(int i=start;i<=endCol;i++){
			result.add(matrix[start][i]);
		}
		if(start < endRow){
			for(int i = start+1 ;i<= endRow;i++){
				result.add(matrix[i][endCol]);
			}
		}
		if(endCol> start && start <endRow){
			for(int i = endCol-1 ;i>=start;i--){
				result.add(matrix[endRow][i]);
			}
			
		}
		if(start < endCol && start < endRow-1){
			for(int i = endRow-1 ;i>=start+1;i--){
				result.add(matrix[i][start]);
			}
		}
	}
}
