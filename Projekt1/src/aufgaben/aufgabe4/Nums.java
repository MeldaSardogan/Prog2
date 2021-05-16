package aufgaben.aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Nums {

	public static int singleNumber(int[] nums)
	{

		List<Integer> list = new ArrayList<>();
		System.out.println(list);
		final int NOT_FOUND = -1;

		for (int i : nums) {
			System.out.println(list);
			if(!list.contains(i)) {
				list.add(i);
			}
			else {
				list.remove(new Integer (i));
			}
		}

		if(list.size() == 0) {
			System.out.println("keine einzelne Zahl enthalten!");
			return NOT_FOUND;
		}
		else {
			for(int i =0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			return list.get(0);
		}

	}



	public static void main(String[] args) 
	{
		int[] input = {4,2,3,4,2};
		singleNumber(input);
	}

}
