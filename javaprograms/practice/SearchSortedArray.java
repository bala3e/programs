package javaprograms.practice;

public class SearchSortedArray {
    public int getIndex(int array[],int num){
        int start=0;int end=array.length-1;
        while (start<=array.length){
            int mid = (start+end)/2;
            if(array[mid]==num){
                return mid;
            }else if (array[mid]<num){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SearchSortedArray searchSortedArray = new SearchSortedArray();
        int array[] ={1,2,3,4,5,6,7};
        int nu=3;
        int place = searchSortedArray.getIndex(array,nu);
        System.out.println(place);

    }
}
