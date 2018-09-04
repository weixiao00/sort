package sort;

public class QuickSort {

	public static void quick_sort(int []array,int low,int high){
		if(low<high){
			int pos = partition(array,low,high);
			quick_sort(array,low,pos-1);
			quick_sort(array,pos+1,high);
		}
	}

	private static int partition (int[] array, int low, int high) {
		int key = array[low];
		while(low<high){
			while(low<high && array[high]>=key){
				high--;
			}
			if(low<high){
				array[low++] = array[high];
			}
			while(low<high && array[low]<=key){
				low++;
			}
			if(low<high){
				array[high--] = array[low];
			}
		}
		array[low] = key;
		return low;
	}
	public static void main(String[] args) {
		int []array = {3,4,6,1,7,0,3,2,8,0};
		quick_sort(array,0,array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		
	}
}
