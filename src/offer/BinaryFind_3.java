package offer;
/**
 * ��Ŀ����
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
 * ����������һ����ά�����һ���������ж��������Ƿ��и�������
 * @author daiguohui
 *
 */
public class BinaryFind_3 {
	//�������ݷֲ����Խ��в���,�����ҵĸ��Ӷȴ�O(n*n)������O(n)
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
