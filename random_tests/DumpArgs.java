public class DumpArgs
{
    public static void main(String[] args)
    {
        System.out.println("Here are your \"added\" arguments: ");
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}
