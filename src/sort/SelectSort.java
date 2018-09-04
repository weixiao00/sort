package sort;
//ѡ���������ҳ���С������λ�ã���󽻻����Դ����ƣ�ʱ�临�Ӷ�Ϊn*n����ð�����򽻻������٣�
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
