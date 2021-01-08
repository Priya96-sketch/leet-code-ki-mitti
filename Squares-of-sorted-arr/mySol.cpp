//Done using bubble sort//
#include<bits/stdc++.h>
using namespace std;

int main()
{

    int arr[100];
    for(int i=0;i<100;i++)
    {
        cin>>arr[i];
    }
    int size = sizeof(arr)/sizeof(arr[0]);
    //Traversing the whole array
    for(int i=0;i<size;i++)
    {
        arr[i] *= arr[i];
    }
    
    //Sorting the array by bubble sort//
    int counter=1; //for the iterations
    while(counter<size-1)
    {
        for(int i=0;i<size-counter;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        counter++; //so that it moves to the next iteration//
    }

    
   //Printing the array//
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<",";
    }

    return 0;
}
