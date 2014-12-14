public class ProfitCalculator {

	public int percent(String[] items) {
		double costs = 0.0;
		double sales = 0.0;
		for(String i : items) {
			costs += Double.parseDouble(i.split(" ")[0]);
			sales += Double.parseDouble(i.split(" ")[1]);
		}
		return (int)((costs - sales)/costs * 100);
	}

}
