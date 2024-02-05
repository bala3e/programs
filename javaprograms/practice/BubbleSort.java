package javaprograms.practice;

public class BubbleSort {
    public int[] getSortedArray(int array[]){
        int n=array.length;
        int temp=0;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                    if(array[j]>array[j+1]){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int array[] ={8,9,10,6,7};

        BubbleSort bs = new BubbleSort();
        int x[]= bs.getSortedArray(array);
        for(int i:x){
            System.out.println(i);
        }

    }
}
