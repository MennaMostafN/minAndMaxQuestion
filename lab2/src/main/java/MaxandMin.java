public class MaxandMin {
    private int[] arr;
    public MaxandMin(){
        this.arr=arr;
    }
    public int findmin(int arr[]){
        int min = arr[0];
        for(int i=1;i < arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public int findmax( int arr[]){
        int max = arr[0];
        for(int i=1;i < arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
