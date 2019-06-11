#include<stdio.h>
int main()
{
  //Type your code here
  int m,n;
  scanf("%d%d",&m,&n);
  if(m>n)
  {
    printf("num1 is the greatest");
  }
  else if(m<n)
  {
    printf("num2 is the greatest");
  }
  else
  {
    printf("Both number Equal");
  }
  return 0;
}