package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * 题目描述
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。 
 * @author daiguohui
 *
 *
 *题目中使用collection.sort方法，需要实现比较接口comparator的compare方法
 */
public class PrintMinNum_33 {
	@SuppressWarnings("unchecked")
	public String PrintMinNumber(int [] numbers) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<numbers.length;i++){
			list.add(numbers[i]);
		}
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b){
				String string1,string2;
				string1 = new String(a.toString()+b.toString());
				string2 = new String(b.toString()+a.toString());
				return string1.compareTo(string2);
			}
		});
		StringBuffer result = new StringBuffer();
		for(int i=0;i<list.size();i++){
			result.append(list.get(i).toString());
		}
		return result.toString();
		
    }
}
