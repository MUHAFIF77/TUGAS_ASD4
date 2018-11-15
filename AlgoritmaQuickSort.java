import java.util.ArrayList;

public class AlgoritmaQuickSort {

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
	public static ArrayList<Double>sort(ArrayList<Double> data){
		for(int i=0;i<data.size()-1;i++) {
			double minimum = data.get(i);
			int posisiMinimum = i;
			for(int j=i+1;j<data.size();j++){
				if(data.get(j)<minimum){
					minimum = data.get(j);
					posisiMinimum = j;
				}
			}
			if(posisiMinimum != i){
				Double tempBox = data.get(i);
				data.set(i, data.get(posisiMinimum));
				data.set(posisiMinimum, tempBox);
			}
			//PROSES
			System.out.println("\nStep-"+i+": ");
			for(int k=0;k<data.size();k++) {
				System.out.print(data.get(k)+" ");
			}
		}
		    //END OF SELECTION SORT
		
			//CETAK DATA AKHIR 
			System.out.print("\nDATA HASIL SORTING: ");
			for(int k=0;k<data.size();k++) {
				System.out.print(data.get(k)+" ");
			}
		return data;
	}
}
