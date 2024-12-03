#include<iostream>
#include<algorithm>
using namespace std;
int main(){
	int arr[] = {1,4,10,2,5,9,7,2};
	int n = (sizeof(arr)/sizeof(arr[0]));
	sort(arr,arr+n);
	int l = 0,r = n-1,tar = 12;
	bool flag  = 0;
	int sum = 0;
	while(l<r){
		sum = arr[l]+arr[r];
		if(sum == tar){
			cout<<"True"<<endl;
			flag = true;
			break;
		}
		else if(sum>tar){
			r--;
			
		}else{
			l++;
		}	
	}
	if(!flag){
		cout<<"False"<<endl;
	}
}
