package offer;
/**
 * ��Ŀ����

 *��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
 *n<=39
	
 * @author daiguohui
 *
 *�ݹ�ķ�ʽ��ִ�кܶ��ظ����㣬ʹ�õ����ķ�ʽ���ή�͸��Ӷ�
 */
public class Fibonacci_9 {
	public int Fibonacci(int n) {
		
		
		int result[]={0,1};
		if(n<2) return result[n];
		int one = 1;
		int two = 0;
		int f=0;
		for(int i = 2 ; i <= n;i++){
			f = one + two;
			
			two =one;one = f;
		}
		return f;
    }
}
