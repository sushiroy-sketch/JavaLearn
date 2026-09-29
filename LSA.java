class LinearSearch {
    public static void main(String[] args){
        int arr[]={10,8,30,4,5};
        int x=5;
        int result = search(arr,x);
        if (result==-1)
            System.out.println("Element is not present in arry");
        else
            System.out.println("Element is at index "+ result);
    }

    public static  int search(int arr[], int x){
        int n=arr.length;
        for (int i=0; i<n; i++){
            if (arr[i]==x)
                return i;
        }
        return -1;
    }
}