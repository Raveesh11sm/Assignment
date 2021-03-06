//Java Program for Merge Sorting
public class MergeSort {
	public static void display(int[] arr, int size)   //this function display the array
               {
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)   // main function of the program
       {
		int[] a = {11, 9, 6, 19, 33, 64, 15, 75, 67, 88};
		int i;

		int size = (int)a.length;
		display(a, size);

		mergeSort(a, 0, size - 1);
		display(a, size);
	}

	 static void mergeSort(int[] a, int strt, int end) //this function apply merging and sorting in the array
       {
		int mid;
		if(strt < end) 
               {
			mid = (strt + end) / 2;

			mergeSort(a, strt, mid);
			mergeSort(a, mid + 1, end);
			merge(a, strt, mid, end);
		}
	}

	static void merge(int[] a, int strt, int mid, int end)  //after sorting this function merge the array
      {
		int i = strt, j = mid + 1, p, index = strt;
		int[] temp = new int[10];

		while(i <= mid && j <= end) {
			if(a[i] < a[j]) { temp[index] = a[i]; i = i + 1; } else { temp[index] = a[j]; j = j + 1; } index++; } if(i > mid) {
			while(j <= end) {
				temp[index] = a[j];
				index++;
				j++;
			}
		} else {
			while(i <= mid) {
				temp[index] = a[i];
				index++;
				i++;
			}
		}
		p = strt;
		while(p < index) {
			a[p] = temp[p];
			p++;
		}
	}
}