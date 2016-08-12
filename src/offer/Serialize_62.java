package offer;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 题目描述
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * @author daiguohui
 *
 *
 *这个题目最蛋疼的莫过于java中的参数是传值方式，所以要将父节点传给子树的构建
 */
public class Serialize_62 {
	class updateTree{
		TreeNode treeNode;
		void setTreeNode(){
			this.treeNode= null;
		}
		public updateTree(TreeNode tree){
			treeNode = tree;
		}
	}
	StringBuffer result = new StringBuffer();
	int loc=0;
	 String Serialize(TreeNode root) {
		 if(root == null){
			 result.append("$,");
			 return "";
		 }
		 result.append(root.val+",");
		 Serialize(root.left);
		 Serialize(root.right);
		 return result.toString();
	 }
	 TreeNode Deserialize(String str) {
	       TreeNode rooTreeNode =new TreeNode(0);
	       StringTokenizer strs = new StringTokenizer(str,",");
	       ArrayList<String> list = new ArrayList<>();
	       while(strs.hasMoreTokens()){
	    	   list.add(strs.nextToken());
	       }
	       
	       if(list.size() ==0) return null;
	       des(rooTreeNode, list,0);
	      

	       return rooTreeNode;
	    	
	 }
	 public void des(TreeNode root,ArrayList<String> list,int flag){
		 
		 if(loc <list.size()&&!list.get(loc).equals("$")){
			 
			 if(flag ==0){
				 root.val = Integer.valueOf(list.get(loc));
				 loc++;
				 des(root,list ,1);
				 loc++;
				 des(root, list,2);
			 }else if(flag==1){
				 root.left = new TreeNode(0);
				 root.left.val = Integer.valueOf(list.get(loc));
				 loc++;
				 des(root.left,list ,1);
				 loc++;
				 des(root.left, list,2);
			 }else{
				 root.right = new TreeNode(0);
				 root.right.val = Integer.valueOf(list.get(loc));
				 loc++;
				 des(root.right,list ,1);
				 loc++;
				 des(root.right, list,2);
			 }
			
			
			
		 }else{
			if(flag ==1){
				root.left =null;
			}else root.right = null;
			
		 }
		 
	 }
	 public static void main(String []args){
		 Serialize_62 s = new Serialize_62();
		 System.out.println(s.Serialize(s.Deserialize("1,2,4,$,$,$,3,5,$,$,6,$,$")));
	 }
}
