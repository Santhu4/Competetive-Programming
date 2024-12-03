#include<iostream>
using namespace std;
int main(){
	int arr[5][5] = {{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25}};
	int d = 1,col = 0,row = 0,m = 5,n = 5,i = 0;
	while(i<(m*n)){
	cout<<arr[row][col]<<" ";
	i++;
	if(d == 0){
		if(col == n-1){
			row++;
			d = 1;
		}else if(row == 0){
			col++;
			d = 1;
		}else{
			col++;
			row--;
		}
	}else if(d == 1){
		if(row == m-1){
			col++;
			d = 0;
		}else if(col == 0){
			row++;
			d = 0;
		}else{
			row++;
			col--;
		}
	}
}
}
