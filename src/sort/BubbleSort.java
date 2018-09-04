package sort;

public class BubbleSort {
	
	//先得到元素最小的，然后得到第二小的，以此类推(这不是冒泡排序)
	public static void bubbleSort(int [] array){
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	//冒泡排序算法，相邻的元素比较，冒出最大的泡，以此类推（时间复杂度为n*n）
	public static void reBubbleSort(int [] array){
		for(int i=0;i<array.length-1;i++){
			for(int j=array.length-1;j>i;j--){
				if(array[j-1]>array[j]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int []array = {3,4,6,1,7,0,3,2,8};
		reBubbleSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		
	}
}
