package offer;
/**
 * ��Ŀ����
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ�� 
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
	//�ж��Ƿ�Ϊ��������ĺ���
	public boolean verify(int []sequence, int begin,int end){
		if(sequence == null ){
        	return false;
        }
        int length  = sequence.length;
        //���ҵ����ڵ�
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
