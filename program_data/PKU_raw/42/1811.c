
int main()
{
 	int N, cutnum; //N?????????cutnum?????? 
 	int sum = 0, j = 0; //sum?????????? 
	
	cin >> N;
	const int n = N; //?n????? 
	
	int a[n];
	
	for ( int i = 0; i < n; i++)
	{
	 	cin >> a[i]; //???? 
	}
	
	cin >> cutnum; //???????
	
	while ( j < n - sum ) //?j???????????? 
	{
	 	if ( a[j] == cutnum ) //??a[j]?????????sum?1 
 		{	
			 sum++;	
		   	 for ( int k = j; k < n - 1; k++ )
		   	 {
   	   		  	 a[k] = a[k+1]; //???????? 
		  	 }
			 j--;
	  	}
		else
			j++;	
	}
	
	for ( int l = 0; l < n - sum - 1; l++ ) //?????? 
	{
	 	cout << a[l] << " ";	//?????????? 
	}
	cout << a[n-sum-1] << endl;	//????????? 
	
	return 0; 
}