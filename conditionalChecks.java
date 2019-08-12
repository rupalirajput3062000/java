class conditionalChecks{
    public static void main(String args[])
    {
        int n=6;

        /* first method of condition checking -->if else
        if (n%2==0)
        {
            System.out.println(n +" is even");
        }
        else
            System.out.println(n + " is odd");

            */
            /* by ternary operator
            System.out.println(n%2==0?"even":"odd");*


            /* 3rd ---> Using switch case*/
            switch(n)
            {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            default:
                System.out.println("no match");
            }

    }
}