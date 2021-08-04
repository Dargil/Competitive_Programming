#include<iostream>
using namespace std;
int problem(int n){
	int x=1;
	while(n!=1){
		if(n%2==0){
		n=n/2;	
		}else{
			n=(n*3)+1;
		}
		x++;
	}
	return x;
}
int main(){
	
	int x,y;
	while(	cin>>x>>y){
		int inicio=0,fin=0;
			if(x<y){
		inicio=x;
		fin=y;
	}else{
	inicio=y;
	fin=x;
	}
	int mayor=0;
	for(int i=inicio;i<=fin;i++){
		int b=problem(i);
		if(b>mayor){
			mayor=b;
		}
	}
	cout<<x<<" "<<y<<" "<<mayor<<endl;
	}
	return 0;
}
