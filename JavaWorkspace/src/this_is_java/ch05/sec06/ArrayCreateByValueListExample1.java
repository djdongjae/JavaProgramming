package this_is_java.ch05.sec06;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();
		
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);

	}

}
