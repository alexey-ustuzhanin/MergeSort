public class MergeSort {
    private static int[] a;

    public static int[] getA() {
        return a;
    }

    public static int getAi(int i) {
        return a[i];
    }

    public static void setA(int[] a) {
        MergeSort.a = a;
    }


    public static void sort(int[] a){ //Метод сортировки
       System.out.println("Кол-во элементов: " + a.length);
        System.out.println("Первый элемент: " + a[0]);
        int []tempArray = new int[a.length];
        mergeSort(tempArray, 0, a.length - 1);

    }

    public static void mergeSort(int []tempArray,int lowerIndex,int upperIndex){ //Подметод для сортировки
        if(lowerIndex == upperIndex){
            return;
        }else{
            int mid = (lowerIndex+upperIndex)/2;
            mergeSort(tempArray, lowerIndex, mid);
            mergeSort(tempArray, mid+1, upperIndex);
            merge(tempArray,lowerIndex,mid+1,upperIndex);
        }
    }

    public static void merge(int []tempArray,int lowerIndexCursor,int higerIndex,int upperIndex){ //
        int tempIndex=0;
        int lowerIndex = lowerIndexCursor;
        int midIndex = higerIndex-1;
        int totalItems = upperIndex-lowerIndex+1;
        while(lowerIndex <= midIndex && higerIndex <= upperIndex){
            if(a[lowerIndex] < a[higerIndex]){
                tempArray[tempIndex++] = a[lowerIndex++];
            }else{
                tempArray[tempIndex++] = a[higerIndex++];
            }
        }

        while(lowerIndex <= midIndex){
            tempArray[tempIndex++] = a[lowerIndex++];
        }

        while(higerIndex <= upperIndex){
            tempArray[tempIndex++] = a[higerIndex++];
        }

        for(int i=0;i<totalItems;i++){
            a[lowerIndexCursor+i] = tempArray[i];
        }
    }

    public static void printArray(int []array){// Вывод массива на экран
        for(int i : array){
            System.out.print(i+" ");
        }
    }

//    public static int[] getArray(){
//        int size=10;
//        int []array = new int[size];
//        int item = 0;
//        for(int i=0;i<size;i++){
//            item = (int)(Math.random()*100);
//            array[i] = item;
//        }
//        return array;
//    }

}
