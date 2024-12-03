#include<iostream>
using namespace std;
void sieve_of_atkins(int limit){
	bool arr[limit+1] = {};
	int n = 0;
		for(int x = 1;x*x<=limit;x++){
			for(int y = 1;y*y<=limit;y++){
				if(limit>2){
					arr[2] = true;
				}if(limit>3){
					arr[3] = true;
				}
				n = (4*x*x)+(y*y);
				if(n<=limit &&  (n%12 == 1 || n%12 == 5)){
					arr[n]^=true;
				}
				n = (3*x*x)+y*y;
				if(n<=limit && n % 12 == 7){
					arr[n]^=true;
				}
				n = (3*x*x)-(y*y);
				if(x>y && n<=limit && n %12 == 11){
					arr[n]^=true;
				}
			}
		}
		
		
		
		
		
		for(int i = 5;i*i <= limit;i++)
		{
			if(arr[i]){
				for(int j = i*i;j<=limit;j+=i*i){
					arr[j] = false;
				}
			}
		}
			for(int i = 2;i<=limit;i++){
			if(arr[i]){
				cout<<i<<" ";
			}
		}
}
int main(){
	sieve_of_atkins(100);
}
