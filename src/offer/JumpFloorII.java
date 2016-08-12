package offer;

public class JumpFloorII {
	int jump[];
	public int JumpFloorII(int target) {
		jump = new int[target+1];
		for(int i=0;i<=target;i++){
			getJump(i);
		}
		return jump[target];
    }
	public void getJump(int n){
		if(n==0) {
			jump[n] =0;
			return;
		}
		if(n==1) {
			jump[n] =1;
			return ;
		}
		for(int i = n-1;i>=0;i--){
			jump[n]+=jump[i];
		}
		jump[n]++;
	}
	
}
