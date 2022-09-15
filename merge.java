class Mergesort{
	
	public static int[] merge(int left[],int right[]){
		m = left.length + right.length;
		int newarray[] = new newarray[m]; 
		int i = 1;
		int j = 1;
		int tem = infinity;
		left[left.length+1] = tem;
		right[right.length+1] = tem;
		for (int k=0; k<m; k++; { 
			if(left[i] <= right[j]) { 
				newarray[k] = left[i]; 
				i = i + 1;
			}else if (left[i] > right[j]) { 
				newarray[k] = right[j]; 
				j = j + 1; 
			}
		}
		return newarray;
	}
	
	public static int[] mergesort(int array[]){
		int n = array.length;
		if(n <= 1){
			return array;
		}else{
			int L[] = new int[(n/2)];
			int R[] = new int[(n - n/2)];
			for(int i=0; i<(n/2); i++){
				L[i] = array[i];
			}
			for(int i=0; i<(n - n/2); i++){
				R[i] = array[n/2+i];
			}
			L = mergesort(L);
			R = mergesort(R);
			return merge(L,R);
	}
	
	public static void main(Stirng [] args){
		
		int A[] = {3,6,7,2,1,23,16,4,15,8};
		System.out.println("Mergesorting array: "+mergesort(A));
	}
}