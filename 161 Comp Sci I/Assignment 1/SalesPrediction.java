/*

5. Sales Prediction
The East Coast sales division of a company generates 62 percent of total sales. Based on
that percentage, write a program that will predict how much the East Coast division will
generate if the company has $4.6 million in sales this year. 

Hint: Use the value 0.62 to represent 62 percent.

*/
public class SalesPrediction{
	public static void main(String[] args){
		double totalYearSale = 4600000; //total sale this year
		System.out.println("The east coast sales division prediction: $"+ totalYearSale * 0.62); //output the prediction

	}
}