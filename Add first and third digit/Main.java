#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int fd,ld,k;
  fd = a/100;
  ld = a%10;
  k = fd+ld;
  printf("%d",k);
  return 0;
}