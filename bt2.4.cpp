#include <iostream>
using namespace std;
int main(int argc, char**argv){
	int a,b,c;
	
	cout<<"Enter a: "<<endl;cin>>a;
	cout<<"Enter b: "<<endl;cin>>b;
	
	c=a;
	a=b;
	b=c;
	cout<<"a: "<<a<<endl;
	cout<<"b: "<<b<<endl;
	return 0;
}
