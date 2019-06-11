#include<stdio.h>
int main()
{
  int a = 365;
  int Q,R;
  Q = a/4;
  R = a%4;
  printf("Quotient: %d\nRemainder: %d",Q,R);
  return 0;
}