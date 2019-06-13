#include <stdio.h>
int main() {
	int n=87643;
  scanf("%d",&n);
  int count=1,sum=0;
  while(count<=n)
  {
    int r=n%10;
  sum=sum+r;
  n=n/10;
    count++;
  }
    printf("%d",sum);
  
	return 0;
}