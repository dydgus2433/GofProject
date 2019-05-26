package y.h.lee.builder;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}

		if (args[0].equals("plain")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			String result = textBuilder.getResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			String filename = htmlBuilder.getResult();
			System.out.println(filename + "가 작성되었습니다.");
		} else if (args[0].equals("method")) {
			MethodBuilder xxBuilder = new MethodBuilder();
			Director director = new Director(xxBuilder);
			director.construct();
			String result = xxBuilder.getResult();
			System.out.println(result);
		} else {
			usage();
			System.exit(0);
		}
	}

	public static void usage() {
		System.out.println("Usage : java Main plain 일반 텍스트로 문서작성");
		System.out.println("Usage : java Main html HTML 파일로 문서작성");
		System.out.println("Usage : java Main method 메서드로 문서작성");
	}

}
