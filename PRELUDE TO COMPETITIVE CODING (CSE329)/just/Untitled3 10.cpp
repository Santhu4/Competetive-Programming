 #include<iostream>
 using namespace std;
 int main(){
 	int arr[4] = {1,2,3,4};
 	int prefix[4],suffix[4];
 	int n = sizeof(arr)/sizeof(arr[0]);
 	int pro = 1;
 	int res[4];
 	for(int i = 0;i<n;i++){
 		prefix[i] = arr[i]*pro;
	 }
	 pro = 0;
	for(int i = n-1;i>=0;i--){
 		suffix[i] = arr[i]*pro;
	 }
	for(int i = 0;i<n;i++){
 		res[i] = prefix[i]*suffix[i];
	 }
	for(int i = 0;i<n;i++){
// 		cout<<res[i]<<" ";
	 }
 }
