public class Main {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println("The average is: " +
		average(numbers));
	}

//Updated average function:
	public static double average(int[] nums) {
		
		double cur_total = 0;
		for(int i = 0; i < nums.length; i++){
			
			cur_total = cur_total + nums[i];
		}
		
		double avg = cur_total/nums.length;
		return avg;
	}
}
