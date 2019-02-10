public class SortingMethods {


    public static void bubbleSort(int[] arr){
        SortingUtil.printArray(arr);

        int swaps = -1;
        while(swaps!= 0){
            swaps=0;
            for(int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i + 1]){
                    SortingUtil.swap(arr,i,i+1);
                    swaps++;
                }
            }
        }
        if (SortingUtil.isSorted(arr)) {
            SortingUtil.printArray(arr);
        }
        else{
            System.out.println("error");
        }
    }

    public static void bubbleSort(String[] arr){
        SortingUtil.printArray(arr);
        int swaps = -1;
        while(swaps!= 0){
            swaps=0;
            for(int i =0;i<arr.length-1;i++){
                if(arr[i].compareTo(arr[i + 1]) > 0){
                    SortingUtil.swap(arr,i,i+1);
                    swaps++;
                }
            }
        }
        if (SortingUtil.isSorted(arr)) {
            SortingUtil.printArray(arr);
        }
        else{
            System.out.println("error");
        }
    }

    public static void selectionSort(int[] arr){
        //SortingUtil.printArray(arr);

        int minPos = 0;
        //i == currentPostion;
        for(int i = 0; i < arr.length - 1;i++){
            int minValue = arr[i];
            minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(minValue>arr[j]){
                    minValue=arr[j];
                    minPos=j;
                }
            }
            SortingUtil.swap(arr,i,minPos);
        }
        /*
        if (SortingUtil.isSorted(arr)) {
            SortingUtil.printArray(arr);
        }
        else{
            System.out.println("error");
        }
        */
    }

    public static void selectionSort(double[] arr){
        SortingUtil.printArray(arr);

        int minPos = 0;
        //i == currentPostion;
        for(int i = 0; i < arr.length - 1;i++){
            double minValue = arr[i];
            minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(minValue>arr[j]){
                    minValue=arr[j];
                    minPos=j;
                }
            }
            SortingUtil.swap(arr,i,minPos);
        }

        if (SortingUtil.isSorted(arr)) {
            SortingUtil.printArray(arr);
        }
        else{
            System.out.println("error");
        }
    }

    public static void insertionSort(int[] arr){

        for (int i=1; i< arr.length; i++){
            int currentPos=i;
            while(!(currentPos==0) && arr[currentPos]< arr[currentPos-1]){
                SortingUtil.swap(arr, currentPos, currentPos-1);
                currentPos--;

            }
        }
    }

    public static void insertionSort(Comparable[] arr){

        for (int i=1; i< arr.length; i++){
            int currentPos=i;
            while(!(currentPos==0) && arr[currentPos].compareTo(arr[currentPos-1]) < 0 ){
                SortingUtil.swap(arr, currentPos, currentPos-1);
                currentPos--;

            }
        }
    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0 , n-1, temp);
    }

    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp){
        if (left < right){
            int mid = (left + right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid + 1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while ( i <= mid && j <= right){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= right){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k = left; k <= right; k++){
            arr[k] = temp[k];
        }

    }




    public static void mergeSort(String[] arr){
        int n = arr.length;
        String[] temp = new String[n];
        mergeSortHelper(arr, 0 , n-1, temp);
    }

    public static void mergeSortHelper(String[] arr, int left, int right, String[] temp){
        if (left < right){
            int mid = (left + right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid + 1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static void merge(String[] arr, int left, int mid, int right, String[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while ( i <= mid && j <= right){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= right){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k = left; k <= right; k++){
            arr[k] = temp[k];
        }

    }
}
