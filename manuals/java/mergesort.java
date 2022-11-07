public class MergeSortTest {

  public static void main(String[] args) {
    int A[] = { 11, 45, 14, 19, 19, 8, 10 };
    System.out.println("Original:");
    for (int a : A) {
      System.out.print(a + " ");
    }
    System.out.println();
    mergeSort(A);
    System.out.println("Sorted:");
    for (int a : A) {
      System.out.print(a + " ");
    }
    System.out.println();
  }

  public static void mergeSort(int[] A) {
    sort(A, 0, A.length - 1);
  }

  public static void sort(int[] A, int start, int end) {
    if (start >= end) return;
    int mid = (start + end) / 2;
    sort(A, start, mid);
    sort(A, mid + 1, end);
    merge(A, start, mid, end);
  }

  public static void merge(int[] A, int start, int mid, int end) {
    int[] temp = new int[A.length];
    int k = 0;
    int i = start;
    int j = mid + 1;
    while (i <= mid && j <= end) {
      if (A[i] <= A[j]) {
        temp[k++] = A[i++];
      } else {
        temp[k++] = A[j++];
      }
    }
    while (i <= mid) {
      temp[k++] = A[i++];
    }
    while (j <= end) {
      temp[k++] = A[j++];
    }
    for (int m = 0; m < k; m++) {
      A[m + start] = temp[m];
    }
  }
}
