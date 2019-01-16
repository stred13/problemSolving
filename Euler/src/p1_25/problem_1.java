package p1_25;

public class problem_1 {
	public static void multiples3_5(int num) {
		int sum = 0;
		for(int i=3;i<num;i++) {
			if(i%3==0||i%5==0)
				sum+=i;
		}
		System.out.println(sum);
	}
}
