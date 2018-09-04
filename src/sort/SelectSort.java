package sort;
//选择排序，先找出最小的索引位置，最后交换，以此类推（时间复杂度为n*n，比冒泡排序交换次数少）
public class SelectSort {

	public static void selectSort(int[] array){
		for(int i=0;i<array.length-1;i++){
			int min = i;
			for(int j=i+1;j<array.length;j++){
				if(array[min]>array[j]){
					min = j;
				}
			}
			if(min != i){
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int []array = {3,4,6,1,7,0,3,2,8};
		selectSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		
	}
}
