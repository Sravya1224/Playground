#include<iostream>
int main()
{
  int a,b,sum=0,diff=0,pro=0,div=0,rem=0;
  std::cin>>a;
  std::cin>>b;
  sum=a+b;
  diff=a-b;
  pro=a*b;
  div=a/b;
  rem=a%b;
  std::cout<<"a+b="<<sum<<"\na-b="<<diff<<"\na*b="<<pro<<"\na/b="<<div<<"\na%b="<<rem;
 return 0;
}