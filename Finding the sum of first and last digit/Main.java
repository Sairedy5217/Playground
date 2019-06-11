#include <stdio.h>
int main() {
	//Type your code
  	int num, FristDigit, LastDigit, sum = 0;
    scanf("%d",&num);
  	LastDigit = num%10;
  	while(num >= 10)
    {
      num = num/10 ;
    }
  	FristDigit = num%10;
  	sum = sum + FristDigit + LastDigit;
  	printf("%d",sum);
	return 0;
}