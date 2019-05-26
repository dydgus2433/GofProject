package y.h.lee.bridge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileDisplayImpl extends DisplayImpl{
	private String filename;
	private BufferedReader reader;
	private final int MAX_READAHEAD_LIMIT = 4096;
	
	public FileDisplayImpl(String filename) {
		this.filename = filename;
	}

	@Override
	public void rawOpen() {
		try {
			reader  = new BufferedReader(new FileReader(filename));
			reader.mark(MAX_READAHEAD_LIMIT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("--------"+filename+"----------");
	}

	@Override
	public void rawPrint() {
		//³» Ç®ÀÌ 9-2
//		try {
//			while(reader.ready()) {
//				try {
//					System.out.println(reader.readLine());;
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			String line;
			reader.reset();
			while((line = reader.readLine()) != null) {
				System.out.println(">" +line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rawClose() {
		System.out.println("----------end---------");
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
