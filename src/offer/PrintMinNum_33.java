package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * ��Ŀ����
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323�� 
 * @author daiguohui
 *
 *
 *��Ŀ��ʹ��collection.sort��������Ҫʵ�ֱȽϽӿ�comparator��compare����
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
