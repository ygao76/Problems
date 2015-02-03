public class Solution {
    public void nextPermutation(int[] num) {
        if(num==null ||num.length==0 ||num.length==1){
            return;
        }
        int i= num.length-2;
        for(i= num.length-2; i>=0;i--){
            if(num[i] <num[i+1]){
                break;
            }
        }
        if(i!=-1){
        int swapVal = num[i];
        int j = num.length-1;
        while(j>i){
            if(num[j]>swapVal)
                break;
            j--;
        }
        num[i] = num[j];
        num[j] = swapVal;
        }
        i++;
        reverseSort(num, i, num.length-1);
        return;
    }
    
    public void swap(int[] num, int i, int j){
    int temp=0;
    temp=num[i];
    num[i]=num[j];
    num[j]=temp;
    }

    public void reverseSort(int[] num, int start, int end){   
    if(start>end)
        return;
    for(int i=start;i<=(end+start)/2;i++)
        swap(num,i,start+end-i);
    }
}
