package offer;

import java.util.Stack;
/**
 * 题目描述
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的） 
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
