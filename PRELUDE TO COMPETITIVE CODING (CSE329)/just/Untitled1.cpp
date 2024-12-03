#include<iostream>
#include<vector>
#include<cmath>
using namespace std;
void sieve_of_eratothenes(int n){
	vector<int> arr(n+1,0);
	for(int i = 2;i<sqrt(n);i++){
		if(arr[i]==0){
			for(int j = i*i	;j<=n;j+=i){
				arr[j] = 1;
			}
		}
	}
	int count = 0;
	for(int i = 2;i<=n;i++){
		if(arr[i]==0){
			cout<<i<<" ";
			count++;
		}
	}
	cout<<endl<<"count of the prime numbers : "<<count<<endl;
}
int main(){
	int n;
	cout<<"Enter a Number : ";
	cin>>n;
	sieve_of_eratothenes(n);
}
