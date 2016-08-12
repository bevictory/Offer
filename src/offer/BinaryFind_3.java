package offer;
/**
 * 题目描述
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author daiguohui
 *
 */
public class BinaryFind_3 {
	//根据数据分布特性进行查找,将查找的复杂度从O(n*n)缩减到O(n)
	public boolean Find(int [][] array,int target) {
		if(array ==null) return false;
		int row = array.length;
		int col = array[0].length;
		int rowLoc=0;
		int colLoc = col -1;
		while(rowLoc < row && colLoc >=0 ){
			if(array[rowLoc][colLoc] == target){
				return true;
			}
			else if(array[rowLoc][colLoc] > target){
				--colLoc;
			}else {
				++rowLoc;
			}
		}
		return false;
		
	}
}
