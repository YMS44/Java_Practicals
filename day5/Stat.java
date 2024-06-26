package day5;

public class Stat<T extends Number> {
	T[] arr;
	public Stat (T[] arr) {
		this.arr = arr;
	}
	
	public double getAverage() {
		double sum=0.0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i].doubleValue();
		}
		return sum/arr.length;
	}
	
	public boolean isAvgEqual(Stat<?> obj) {
		if(this.getAverage()==obj.getAverage()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Integer[] irr = {1,2,3,4,5,6};
		Double[] drr = {1.0,2.0,3.0,4.0,5.0,6.0};
		
		Stat<Integer> si = new Stat<Integer>(irr);
		Stat<Double> sd = new Stat<Double>(drr);
		
		System.out.println(si.getAverage());
		System.out.println(sd.getAverage());
		
		System.out.println(si.isAvgEqual(sd));
		
		
		
		
	}

}
