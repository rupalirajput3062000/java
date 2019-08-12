class assignment{
    public static void main(String str[])
    {
        for(short i =1;i<=5;i++)
        {
           for(short j =1; j<=i;j++)
           {
               System.out.print(j+ " ");
           } 
           System.out.print("\n");
        }
System.out.print("\n");
System.out.print("\n");
        for(char i ='A';i<='C';i++)
        {
           for(char j ='A'; j<=i;j++)
           {
               System.out.print(j + " ");
           } 
           System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("\n");
        int n=10;
        for(short i =1;i<=n;i++)
        {
           for(short j =1; j<=n;j++)
           {
                if(i>1 && i<n && j>1 && j<n)
                {
                    System.out.print("  ");
                }
                else
                {
                System.out.print("$ ");
                }
            } 
           System.out.print("\n");
        }
    }
}