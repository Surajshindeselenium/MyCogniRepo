package javaProgrammes;

public class SortArrayInAscending {

	public static void main(String[] args) {
		
		int ar[] = {10,45,5,30,4};
		
		for(int i=0; i<ar.length;i++) {
			for(int j=i+1; j<ar.length;j++) {
				if(ar[j]<ar[i] ){
					
					int temp;
					temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
					
				}
			}
			
		}
		for(int i = 0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		
	}

}
