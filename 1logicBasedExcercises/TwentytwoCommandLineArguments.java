import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TwentytwoCommandLineArguments {

	public static void main(Collection<? extends String> args) {
		// TODO Auto-generated method stub
        ArrayList<String> playerNames = new ArrayList<String>();
        playerNames.addAll(args);
        Collections.sort(playerNames);
        System.out.println(playerNames);
	}
}