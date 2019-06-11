#include <stdio.h>
int main() {
	//Type your code
  	int a,factors;
    scanf("%d",&a);
  	for(int i = 1;i <= a/2; i++)
    {
      if(a % i == 0)
      {
        printf("%d\n",i);
      }
    }
  	printf("%d",a);
	return 0;
}