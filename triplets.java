public class tiplets {
	 static void tripletsCout(int a[]) {
		 int count =0;
		 int maxElement=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]>maxElement) {
				 maxElement=a[i];
			 }
		 }
		 int index []=new int [maxElement+maxElement+1]  ;
		 for(int i=0;i<a.length;i++) {
			 index[a[i]]=1;
		 }
//		 System.out.println(Arrays.toString(index));
		 for(int i=0;i<a.length-1;i++) {
			 for(int j= i+1;j<a.length;j++) {
				 int triplet =a[i]+a[j];
				 if (index[triplet]==1) {
					 count++;
				 }
				 
			 }
		 }
		 if(count==0) {
			 System.out.println("Triplet are not present");
		 }
		 else {
			 System.out.println(count);
		 }
		 		 }
	 

	public static void main(String[] args) {
		int a[]= {1,5,3,2,6};
		tripletsCout(a);

	}

}
