#include <stdio.h>
int main() {
	//Type your code
  	int a, result = 1;
  	scanf("%d",&a);
  	if(a == 0)
    {
      printf("1");
    }
  else
  {
  	for(int i = 1; i<=a;i++)
    {
      result = result*i;
    }
    printf("%d",result);
  }
	return 0;
}