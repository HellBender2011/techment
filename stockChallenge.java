
public class stockChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stocks[] = {1, 2, 3, 4, 5 };
		int maxQuantity = stocks[0];
		for(int i = 0; i<5; i++) {
			if(maxQuantity <= stocks[i] ) {
				maxQuantity = stocks[i];
			}
		}System.out.println(maxQuantity);
	}

}
