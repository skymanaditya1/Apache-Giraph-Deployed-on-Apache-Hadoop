/**

Code implements the Djikstra's Algorithm

*/

#include<stdio.h>

#define infinity 1000
void dij(int, int, int[]);
void display();

int cost[100][100];
int order[100];
int orderVar = 0;

int main()
{
	int n;
	printf("Enter the number of nodes :");
	scanf("%d", &n);
	printf("Enter the array vertices ");
	int i, j; 
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			scanf("%d", &cost[i][j]);
			if(i==j)
			cost[i][j] = infinity;
			}
		}
	printf("Enter the source vertex ");
	int source;
	scanf("%d", &source);
	printf("Enter the destination vertex ");
	int destination;
	scanf("%d", &destination);
	int dist[100];
	dij(n, source, dist);	
	printf("The min distance is %d\n", dist[destination]);
	printf("The order of the vertices is ");
	//display();
}

void display()
{
	int i;
	for(i=0;i<orderVar;i++)
		printf("%d ", order[orderVar]);
}

void dij(int n, int v, int dist[100])
{
	int ord[100];
	int flag[100];
	int i;
	int var = 1;
	ord[0]=v;
	for(i=0;i<n;i++)
	{
		flag[i] = 0;
		dist[i] = cost[v][i];
	}
	int count = 2;
	while(count<=n)
	{
		int min = 1000;
	
		int w, u;
		for(w=0;w<n;w++){
			if(dist[w]<min && !flag[w]){
				min=dist[w];u=w;
				}
			}
		flag[u] = 1;
		//ord[var++] = u;
		count++;
		for(w=0;w<n;w++)
		{
			int temp = dist[u]+cost[u][w];
			if(temp<dist[w] && !flag[w])
				dist[w] = temp;
		}
		ord[var++]=u;				
	}
	
	int k;
	for(k=0;k<var;k++)
		printf("%d ", ord[k]);
}

