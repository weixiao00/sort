package sort;

public class InsertSort {
//直接插入排序，挪动元素，然后插入。插入到有序表中（时间复杂度为n*n）
	public static void insertSort(int []array){
		int j = 0;
		for(int i=0;i<array.length-1;i++){
			if(array[i]>array[i+1]){
				int temp = array[i+1];
				for( j=i;j>=0 && array[j]>temp;j--){
					array[j+1] = array[j];
				}
					array[j+1] = temp;
					
			}
		}
	}
	public static void main(String[] args) {
		int []array = {3,4,6,1,7,0,3,2,8};
		insertSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		
	}
}
