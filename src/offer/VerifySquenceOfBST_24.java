package offer;
/**
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。 
 * @author daiguohui
 *
 */
public class VerifySquenceOfBST_24 {
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence == null || sequence.length ==0){
        	return false;
        }
		return verify(sequence, 0, sequence.length);
    }
	//判断是否为后序遍历的函数
	public boolean verify(int []sequence, int begin,int end){
		if(sequence == null ){
        	return false;
        }
        int length  = sequence.length;
        //查找到根节点
        int root = sequence[end -1 ];
        int loc=0;
        for(int i=end-1;i>=begin;i--){
        	if(root > sequence[i]){
        		loc = i;
        		break;
        	}
        }
        for(int i=begin;i<loc;i++){
        	if(sequence[i]>root ){
        		return false;
        	}
        }
        boolean left=true,right = true;
        if(loc > begin) left = verify(sequence,begin,loc);
        if(loc+1 < end -1) right = verify(sequence, loc+1, end-1);
        return left&&right;
        
	}
}
