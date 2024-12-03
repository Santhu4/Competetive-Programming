#include<iostream>
#include<cmath>
using namespace std;
void sieve_of_eratosthenes(int n){
	int arr[n+1] = {0};
	for(int i = 2;i<=sqrt(n);i++){
		if(arr[i]==0){
			for(int j = i*i;j<=n;j+=i){
				arr[j] = 1;
			}
		}
	}
	for(int i = 2;i<=n;i++){
		if(!arr[i])
		cout<<i<<" ";
	}
}
int main(){
	int n;
	cout<<"Enter a Number : ";
	cin>>n;
	sieve_of_eratosthenes(n);
}
