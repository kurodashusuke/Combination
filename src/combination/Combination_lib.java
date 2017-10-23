package combination;

public class Combination_lib {

	public int getFactorial(int n) {
		int f = 1;
		for(int i =2;i<=n;i++)
			f*=i;
		return f;
		
	}

}
