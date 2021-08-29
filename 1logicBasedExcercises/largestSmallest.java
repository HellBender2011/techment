import java.util.Arrays;
public class largestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        
        Arrays.sort(arr);
        System.out.println("Maximum" + arr[arr.length-1]);
        System.out.println("Second Maximum" + arr[arr.length-2]);
        System.out.println("Minimum" + arr[0]);
        System.out.println("Second Minimum" + arr[1]);
	}

}
