#include<stdio.h>
int main()
{
int n,j;
scanf("%d",&n);
while(n>0)
{
int t;
  scanf("%d",&t);
  for(j=0;j<t;j++)
  { int k;
      k=j+200;
  printf("%d ",k);
  }
  n--;
  printf("\n");
}
 
return 0;
} 