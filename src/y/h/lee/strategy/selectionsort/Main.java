package y.h.lee.strategy.selectionsort;

public class Main {

	public static void main(String[] args) {
		String[] data = {
//				"5", "3", "1", "7", "3", "8" ,"4"
				"9", "AB","7", "D", "C", "3", "8" ,"4"
		};
		SortAndPrint sap = new SortAndPrint(data, new InsertSorter());
		sap.execute();
	}

}
