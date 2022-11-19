#include<iostream.h>
#include<conio.h>
const int max=100;
class Details{
   private:
   int salary;
   int roll;
  clrscr();
  public:
  void getname(){
    cout<<"Enter the Employee Salary:";
    cin>>salary;
    cout<<"Enter the Employee Roll no. :";
    cin>>roll;
  }
  void putname(){
    cout<<"\nEmployee salary is:"<<salary;
    cout<<"\nEmployee Roll no. is:"<<roll;
  }
};

void main(){
  Details det[max];
  int n=0;
  char ans;
  clrscr();
  do{
    cout<<"\nEnter the Employee Number:"<<n+1;
    det[n++].getname();
    
    cout<<"\nEnter Another Details:(y/n)";
    cin>>ans;
  }while(ans!='n');
  for(int j=0;j<n;j++){
    cout<<"\nEmployee name is:"<<j+1;
    det[j].putname();
  }
  getch();
}
