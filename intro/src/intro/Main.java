package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Hi Guys.
		//camelCase
		//Do not Repeat Yourself
		String onlineBranchButton="Internet Branch";
		
		double dollarToday=8.15;
		double dollarYesterday=8.18;
		int expiry =36;
		boolean isRateDecreased=false;
		
		System.out.println(onlineBranchButton);
		
		if (dollarToday<dollarYesterday) {
			System.out.println("Show dollar decreased image");
		}else if(dollarToday>dollarYesterday) {
			System.out.println("Show dollar increased image");
		}else {
			System.out.println("Show dollar equality image");
		}
		
		String[] credits=new String[] {
				"Fast credit",
				"Happy retired credit",
				"Mortgage credit",
				"Farmer credit",
				"Msb credit",
				"Map credit"
				};
	//	System.out.println(credits[0]);
		
		for (String credit : credits) {
			System.out.println(credit);
		}
		
		int i=1;
		i=+i;
		System.out.println(i);
		i+=i;
		System.out.println(i);
		
		int[] numbers1= {1,2,3,4,5};
		int[] numbers2= {10,20,30,40,50};
		
		numbers1=numbers2;
		numbers2[0]=100;
		
		String x="a";
		String y="b";
		x=y;
		
		y="15";
		System.out.println(x);
		
	}

}
