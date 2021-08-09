import java.util.Arrays; 
public class mergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {2,5,8,9}; 
		int[] array2 = {15,3,7,12};  
		int array1Length = array1.length; 
		int array2Length = array2.length;
		int[] result = new int[array1Length + array2Length];
		System.arraycopy(array1, 0, result, 0, array1Length);  
		System.arraycopy(array2, 0, result, array1Length, array2Length);  
		System.out.println(Arrays.toString(result));
	}

}
