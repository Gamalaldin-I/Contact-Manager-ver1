import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        Contact contact =new Contact(20);//you can Edit the size of the contact as you like
        int x=-1;
        while (x!=0)
        {
            System.out.println("1.Add new user ");
            System.out.println("2.Delete user ");
            System.out.println("3.Search for user ");
            System.out.println("4.Edit user ");
            System.out.println("5.Print the users ");
            System.out.println("0.To end");
            System.out.println("Enter your choice ");
            x=in.nextInt();
            switch(x)
            {
                case 1:
                    contact.addNewUser();
                    break;
                case 2:
                    int d;
                    System.out.println("Enter the id of the user ");
                    d=in.nextInt();
                    contact.delete(d);
                    break;
                case 3:
                    String s;
                    System.out.println("Enter a first name , country ,state , or phone (number or version) ");
                    s=in.next();
                    contact.search(s);
                    break;
                case 4:
                    String se;
                    System.out.println("Enter the name of the user1");
                    se=in.next();
                    contact.edit(se);
                    break;
                case 5:
                    contact.print();
                    break;
                case 0:
                    System.out.println("Gamal says to you  :  good pye ");
                    break;
                default:

            }

        }

    }
}