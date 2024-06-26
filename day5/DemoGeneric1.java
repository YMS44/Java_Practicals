package day5;

public class DemoGeneric1<K,V> {
	K obj1;
	V obj2;
	
	public DemoGeneric1(K obj1,V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public String getName(){
		return obj1.getClass().getName();
	}
	
	public String getName1() {
		return obj2.getClass().getName();
	}
	
	public static void main(String[] args) {
		DemoGeneric1<Integer,String> isobj = new DemoGeneric1<Integer,String>(100,"Kunal");
		
		System.out.println(isobj.getName());
		System.out.println(isobj.getName1());
	}

}
