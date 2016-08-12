package offer;

import java.util.Stack;
/**
 * ��Ŀ����
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ� 
 * @author daiguohui
 *
 */
public class IsStack_22 {
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA.length != popA.length)
			return false;
		Stack<Integer> stack = new Stack<>();
		if (pushA != null && popA != null && pushA.length > 0) {
			int length = pushA.length;
			int push = 0, pop = 0;
			while (pop < length) {
				while (stack.empty() || stack.peek() != popA[pop]) {
					if (push == length)
						break;
					stack.push(pushA[push]);
					push++;

				}
				if (stack.peek() != popA[pop])
					return false;
				stack.pop();
				pop++;

			}
		}
		return true;

	}

}
