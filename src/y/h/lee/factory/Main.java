package y.h.lee.factory;

import y.h.lee.factory.abstractfactory.*;

public class Main {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage : java Main class.name.of.ConcreteFactory");
			System.out.println("Example : java Main listfactory.ListFactory");
			System.out.println("Example : java Main tablefactory.TableFactory");
			System.exit(0);
		}
		System.out.println(args[0]);
		Factory factory = Factory.getFactory(args[0]);
		//예제
//		Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
//		Link chosun = factory.createLink("조선일보", "http://www.chosun.com");
//		
//		Link us_yahoo = factory.createLink("Yahoo!", "http://www.chosun.com");
//		Link kr_yahoo = factory.createLink("Yahoo!Korea!", "http://www.chosun.com");
//		Link excite = factory.createLink("Excite", "http://www.chosun.com");
//		Link google = factory.createLink("google", "http://www.google.com");
//		
//		Tray traynews = factory.createTray("신문");
//		traynews.add(joins);
//		traynews.add(chosun);
//		
//		Tray trayyahoo = factory.createTray("Yahoo!");
//		trayyahoo.add(us_yahoo);
//		trayyahoo.add(kr_yahoo);
//		
//		
//		Tray traysearch = factory.createTray("검색엔진");
//		traysearch.add(trayyahoo);
//		traysearch.add(excite);
//		traysearch.add(google);
		
		
//		Page page = factory.createPage("LinkPage", "영진닷컴");
//		page.add(traynews);
//		page.add(traysearch);
		//문제 
		Page page = factory.createYahooPage();
		
		page.output();
	}

}
