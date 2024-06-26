package day8;

public class Table1 extends Thread {
	int n,m;
	static Thread inc;
	static Thread tab;
	public Table1(int n,int m) {
		this.n=n;
		this.m =m;
	}
	public void run() {
		if(Thread.currentThread().getName()=="Increment") {
			for(int i=0; i<=10; i++) {
				System.out.println(Thread.currentThread().getName()+" "+n+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			}
		}
		if(Thread.currentThread().getName()=="Table") {
			for(int i=1; i<=10; i++) {
				System.out.println(Thread.currentThread().getName()+" "+m*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			}
		}
	}
}
