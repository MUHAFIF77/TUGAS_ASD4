import java.util.ArrayList;

public class Sorting_Algoritma_Selection_Sort {
			public static void main(String[] args) {		
				//PREPARING data input
				ArrayList<Double> input 	= new ArrayList<Double>();
				//data input: [67.57, 22.21, 10.45, 2.1, 76.23, 24.10, 8.7, 66.12, 8.10, 6.7, 4.5]
				input.add(67.57);
				input.add(22.21);
				input.add(10.45);
				input.add(2.1);
				input.add(76.23);
				input.add(24.10);
				input.add(8.7);
				input.add(66.12);
				input.add(8.10);
				input.add(6.7);
				input.add(4.5);
				//CETAK DATA INPUT
				System.out.println("Data Input   : "+input.toString());
				
				//PANGGIL METHOD sort( )
				ArrayList<Double> output	= sort(input);
				
				//CETAK HASIL SORTING 
				System.out.println("Hasil Sorting: "+output.toString());
				
			}
			
			public static ArrayList<Double>sort(ArrayList<Double> data){
				int n	= data.size();
				for(int i=0;i<n-1;i++){			
					int min	= i;
					for(int j=1+i;j<n;j++){
						if(data.get(j)<data.get(min)){
							min = j;
						}
					}
					if(min != i){
						Double tempData = data.get(i);
						data.set(i, data.get(min));
						data.set(min, tempData);
					}
					//CETAK HASIL TIAP LANGKAH dan OPERASI SWAPnya
					System.out.println("langkah ke-"+i+", min = "+min+" SWAP("+i+","+min+")"+" -> "+data.toString());
				}
				return data;		
			}
		

	}



