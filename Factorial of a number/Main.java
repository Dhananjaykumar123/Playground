#include <stdio.h>
int main() {
	int n,fact=1;
  scanf("%d",&n);
  while(n>0)
  {
    fact =fact*n--;
  }
  printf("%d",fact);
	return 0;
}