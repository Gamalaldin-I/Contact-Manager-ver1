import java.util.Scanner;

public class Contact {
    Scanner in=new Scanner(System.in);
    private int contactSize=10;
    User[] users =new User[contactSize];
    private int contactCount=0;
    public void addNewUser()
    {//enter the name of the new user
        String firstName;
        System.out.println("Enter your first name");
        firstName=in.next();
        System.out.println("Enter your last name");
        String lastName = in.next();

        for(int i=0;i<contactCount;i++)//check if  a user with the same name
        {
            if (users[i].getFname().compareTo(firstName)==0&&users[i].getLname().compareTo(lastName)==0) //case the name exist
            {
                System.out.println("An user is already exist by this name");
                return;
            }
        }//else if the name not exist
        User newUser=new User();//create a new user
        newUser.setFname(firstName);//set the name
        newUser.setLname(lastName);
        newUser.setId(contactCount+1);//set the id by value equal the current contact size +1
        newUser.read();
        users[contactCount]=newUser;//save the new user at the contact
        contactCount++;}
    public void delete (int id)//delete the user by search for the id
    {
        if(contactCount==0)//case the contact is empty
            return;
        //else
        boolean deleted=false;
        for(int i=0;i<contactCount;i++)
        {
            if(users[i].getId()==id)// if the user id found
            {
                for(int o=i;o<contactCount;o++)
                {
                    users[o]=users[o+1];//shift all the users in the contact
                }
                contactCount -= 1;
                // decrement the contact size by 1 as deleted element
                deleted=true;
                break;//out of the loop
            }
        }
        if(deleted)System.out.println("Deleted Successfully");
        else System.out.println("The id not found");
    }
    public void search ( String data)//search by assign a data like first name , country ,state, phone number,phone version
    {
        if(contactCount==0) //Case the contact is empty.
            return;
        boolean found=false;
        for(int i=0;i<contactCount;i++)
        {
            if (users[i].findUserWith(data))//find the typically equaled
            {
                users[i].print();
                found=true;
            }
        }
        if(!found)
            System.out.println("The user not found");

    }



    public void edit ( String name)//assign the name to edit the data
    {
        if(contactCount==0)
            return;
        boolean edited=false;
        for(int i=0;i<contactCount;i++)
        {
            if(users[i].getFname().compareTo(name)==0) {

                System.out.println("The previous data"+"\n"+"---------------------");
                users[i].print();// print the previous data to take a look at the data before editing
                System.out.println("\n"+"---------------------");
                System.out.println("\n"+"Enter the new data");
                users[i].read();//reread the data values
                edited=true;
            }

        }
        if(!edited)
            System.out.println("The user not found");}
    public void print() //view all the users in the contact
    { if(contactCount==0) System.out.println("No any user found");
        for(int i=0;i<contactCount;i++)
        {
            users[i].print();
            System.out.println("-----------------------------------");
        }
    }
    public Contact(int contactSize)
    {
        this.contactSize=contactSize;
    }//define the size of the contact
}
