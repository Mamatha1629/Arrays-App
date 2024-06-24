
public class SumOfElements {
	public static void main(String[] args) {
		// Initializer List of Elements
		float prices[]= {563.24f,953.25f,789.25f,685.24f,110.00f};
		// size -> ArryMain.length
		// the max value of int data type it is the size of the array .array size is confidentive 
		System.out.println(prices.length);
		//arrayname.length -> InstanceConstant
		float sum = 0.0f;
		System.out.println("Original Array of Elements :");
		for(int index =0;index < prices.length;index++) {
			System.out.println(prices[index]);
		}
		for(int index =0;index < prices.length;index++) {
			sum += prices[index];
		}
		System.out.println("Sum of all the Elements:"+sum);
		/*for(int index =0;index < prices.length;sum+=prices[index-1],index++) {
			//System.out.println(sum);
			//sum += prices[index];
		}*/
		for(float price : prices) {
			System.out.println(price);
		}
		/*for(;;){
			System.out.println("Hi.....!");
		}*/
		// without a condition is true will not gng to body of the loop
		
	}
}
