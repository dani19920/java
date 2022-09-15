class Patteren{       // class Name must be first letter Upper case remaining letter lower case

public static void main(String args[]){    //main method compulsory
	int rows = 5;                           // integer data type
	System.out.println(" Printing the pattern ");   //
	for (int i = 1; i <= rows; i++)       //outter loop
            {
                    for (int j = rows; j >= i; j--)  //inner loop
		{
			System.out.print( " *");  // display printing
		}
		System.out.println();
            }}}
		