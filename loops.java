class loops{
    public static void main(String str[])
    {
        /* while lopp
        short i=0;
        while(i<6)
        {
            System.out.println(i);
            i++;
        }*/

        /* do-while loop

        short i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<6);*/

        /* for loop*/
        // for(short i =1;i<=5;i++)

        // {
        //     for(short j =5;j>=i;j--)
        //     {
        //         System.out.print(" * ");
        //     }
        //     System.out.print("\n");
        // }
        for(short i =1;i<=5;i++)

        {
            for(short j =4;j>=i;j--)
            {
                System.out.print("   ");
            }
            for(short k =1;k<=i;k++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}