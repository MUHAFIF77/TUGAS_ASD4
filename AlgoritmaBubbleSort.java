import java.util.ArrayList;

public class AlgoritmaBubbleSort {

public static void main(String[] args) {	
		
		//PREPARING data input
		ArrayList<Double> data = new ArrayList<Double>();
		data.add(16.17);
		data.add(10.11);
		data.add(18.19);
		data.add(3.4);
		data.add(12.13);
		data.add(20.0);
		data.add(9.9);
		data.add(14.15);
		data.add(7.8);
		data.add(5.6);
		data.add(1.2);
		
		//CETAK DATA INPUT
		System.out.println("Data Input : "+data.toString());
		ArrayList<Double> output = sort(data);	
	}
	public static ArrayList<Double> sort(ArrayList<Double> data){
		int swapped = 1;
		for (int i = data.size()-1; i >= 0 && data.size()-1 >= swapped; i--) {
			swapped = 0;
			for (int j = 0; j <= i-1; j++) {
				if (data.get(j) > data.get(j + 1)) {
					double temp = data.get(j);
					data.set(j, data.get(j+1));
					data.set(j+1, temp);
					swapped = 1;
				}
			}
			System.out.print("\nstep-"+i+": ");
			for(int k=0; k<data.size();k++) {
				System.out.print(data.get(k)+" ");
			}
		}
		// END OF BEGIN BUBBLE SORT
		
		// CETAK DATA AKHIR
		System.out.print("\nDATA HASIL SORTING : ");
		for(int k=0;k<data.size();k++) {
			System.out.print(data.get(k)+" ");
		}
		return data;
	}		
}
