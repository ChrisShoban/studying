public class MostProfitable {

	public String bestItem(int[] costs, int[] prices, int[] sales, String[] items) {
		String best = "";
		int bestProfit = 0;
		int currProfit;
		for(int i = 0; i < costs.length; i++) {
			currProfit = (prices[i] - costs[i]) * sales[i];
			if(currProfit > bestProfit) {
				bestProfit = currProfit;
				best = items[i];
			}
		}
		return best;
	}

}
