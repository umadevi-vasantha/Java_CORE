package ds.arrays.section3;

/*
 * Best Time to Buy and Sell Stock - LeetCode 121
You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example:

Input: prices = [7, 1, 5, 3, 6, 4] 
Output: 5 
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */
public class BestTimeBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray= {7,1,5,3,6,4};
		System.out.println(maxProfit(myarray));

	}
	
	public static int maxProfit(int[] prices) {
        // TODO
		int minprice=Integer.MAX_VALUE;
		int maxprice=0;
		for(int price :prices) {
			if(price<minprice) {
				minprice=price;
			}else if(price-minprice> maxprice) {
				maxprice= price-minprice;
			}
		}
		return maxprice;
    }

}
