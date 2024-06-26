package day9;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class StrReadWrite {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		Executor service = Executors.newFixedThreadPool(4);
		for (int i=0; i<4;i++) {
			service.execute(new StringRead(str));
			service.execute(new StringWrite(str));
		}
	}
}
