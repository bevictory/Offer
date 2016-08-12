package offer;
/**
 * ��Ŀ����
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ��
 * @author daiguohui
 *
 */
public class GetNext_58 {
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		if(pNode ==null) return null;
		TreeLinkNode pNext=null;
        if(pNode.right!=null){
        	TreeLinkNode pRight = pNode.right;
        	
        	while(pRight.left!=null) pRight = pRight.left;
        	pNext = pRight;
        }
        else if(pNode.next!=null){
        	TreeLinkNode pCur = pNode;
        	TreeLinkNode pParent = pNode.next;
        	while( pParent !=null&&pParent.right == pCur ){
        		pCur = pParent;
        		pParent = pParent.next;
        		
        	}
        	pNext = pParent;
        }
        return pNext;
    }
}
