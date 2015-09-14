/**
Implements the Prim's algorithm

*/

#include<stdio.h>

int visit[100] = {0};
int ne = 1, cost, minCost = 0;
int a, b, u, v;

int main()
{
	int n;
	scanf("%d", &n);
	int cost[100][100];
	int i, j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			scanf("%d", &cost[i][j]);
			if(cost[i][j]==0)
				cost[i][j] = 1000;
		}
	}
	visit[1] = 1;
	while(ne<n)
	{
		int min = 1000;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(cost[i][j]<min)
				{
					if(visit[i]!=0)
					{
						min = cost[i][j];
						a = u = i;
						b = v = j;				
					}
				}
			}
		}
		if(visit[u] == 0 || visit[v] == 0)
		{
			minCost += min;
			visit[b] = 1;
			ne++;
		}
		cost[a][b] = cost[b][a] = 1000;
	}
	printf("The min cost is %d", minCost);
}
