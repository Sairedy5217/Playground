#include<stdio.h>
int main()
{
  //Type your code here
  int a, fd,sd,sum;
  scanf("%d",&a);
  fd=a/10;
  sd=a%10;
  sum = fd+sd;
  printf("%d",sum);
  return 0;
}