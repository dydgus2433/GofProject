package y.h.lee.builder;
/*
 * 예제 진행중
 * 
 */

public abstract class Builder {
	
	boolean isFirst = true;
	
	public  void makeTitle(String title) {
		if(isFirst) {
			buildTitle(title);
			isFirst = false;
		}
	};
	public  void makeString(String str){
		if(!isFirst) {
			buildString(str);
		}
	};
	public  void makeItems(String[] items){
		if(!isFirst) {
			buildItems(items);
		}
	};
	public  void close(){
		if(!isFirst) {
			buildClose();
		}
	};
	
	protected abstract void buildTitle(String title);
	protected abstract void buildString(String str);
	protected abstract void buildItems(String[] items);
	protected abstract void buildClose();
	
}
