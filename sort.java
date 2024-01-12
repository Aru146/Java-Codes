public class sort {
    public static void mergeSort(int arr[],int si,int ei){//TC=O(nlogn),sc=O(n)
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[arr.length];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[j++];
            }
            else{
                temp[k++]=arr[i++];
            }
        }
        while(i<=mid){
            arr[k++]=arr[i++];
        }
        while(j<=ei){
            arr[k++]=arr[j++];
        }
        for(int i=0;i<temp.length();i++){
            System.out.println(temp(i));
        }
    }
    public static void quicSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        quickSort(arr,si,pidx-1);
        quickSort(arr,pidx+1,ei);

    }
    public static int partititon(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<=ei;j++){
            if(arr[i]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    
    public static void main(String[] args){
        int arr[]=new int[2,3,4,5,6,2,1,3,2,2,3,4];
        mergeSort(arr,0,arr.length);
    }
}
