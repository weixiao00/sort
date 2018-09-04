package sort;
//�鲢�����ȷ����룬һֱ�֣��ٺϡ��ݹ�ʵ�֣�ʱ�临�Ӷ�Ϊn*logn�������ȶ���
public class MergeSort {

	public static void merging(int []array,int low,int mid,int high){
		int []temp = new int[10];
		int i = low;
		int j = mid + 1;
		int k = 0;
		while(i<=mid && j<=high){
			if(array[i]<array[j]){
				temp[k++] = array[i++];
			}else{
				temp[k++] = array[j++];
			}
		}
		while(i<=mid){
			temp[k++] = array[i++];
		}
		while(j<=high){
			temp[k++] = array[j++];
		}
		//���¸��Ƹ�array����
		for(int m=0;m<k;m++){
			array[low+m] = temp[m];
		}
	}
	
	public static void merge_sort(int []array,int low,int high){
		if(low<high){//�ݹ�߽�
			int mid = (low+high)/2;
			merge_sort(array,low,mid);
			merge_sort(array,mid+1,high);
			merging(array,low,mid,high);
		}
	}
	public static void main(String[] args) {
		int []array = {3,4,6,1,7,0,3,2,8,0};
		merge_sort(array,0,array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		
	}
}
