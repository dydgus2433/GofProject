package y.h.lee.strategy.selectionsort;

public class InsertSorter implements Sorter {
	//"3", "1","2", "D", "C", "3", "8" ,"4"
	//끝에서부터 앞으로 비교
	@Override
	public void sort(Comparable[] data) {
		for(int i = 1; i < data.length   ; i++) {
			for(int j = i ; j > 0; j-- ) {
//				> 0 greaterthan
				if(data[j].compareTo(data[j-1]) < 0) {
					Comparable passingplace = data[j];
					data[j] = data[j-1];
					data[j-1] = passingplace;
				}
			}
		}
	}

}
