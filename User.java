import java.util.Scanner;

public class User {
    Scanner in =new Scanner(System.in);
    private String fName;//First name
    private String lName;//Last name
    private int y_o_p=7777;//year of birth
    private int gender=-1;
    private int id;
    private int phone_count=0;
    private int email_count=0;
    private int address_count=0;



    Phone [] phones =new Phone[5];
    Address [] addresses  =new Address[5];
    Email [] emails=new Email[5];
    public void read()
    {
        while(y_o_p >= 2023)
        {System.out.println("Enter the year of Birth");y_o_p=in.nextInt();}
        while(gender!=1&&gender!=0)
        {System.out.println("Enter the gender 0|Male   1|Female");gender=in.nextInt();}
        int n;

        System.out.println("How many Phones");
        n=in.nextByte();
        for(int i=0;i<n;i++)
        {   String data,type,desc;
            System.out.println("The phone number :");
            data=in.next();
            System.out.println("The type of operating system :");
            type=in.next();
            System.out.println("The version :");
            desc=in.next();
            Phone new_phone= new Phone(data,type,desc);
            phones[phone_count]=new_phone;
            phone_count++;
        }
        System.out.println("How many emails ");
        n=in.nextByte();
        for(int i=0;i<n;i++)
        {   String data,type;
            System.out.println("the email  :");
            data=in.next();
            System.out.println("the type:");
            type=in.next();
            Email new_email= new Email(data,type);
            emails[email_count]=new_email;
            email_count++;
        }
        System.out.println("How many Addresses do you have");
        n=in.nextByte();
        for(int i=0;i<n;i++)
        {   String data,type,desc;
            System.out.println("The country  :");
            data=in.next();
            System.out.println("The state :");
            type=in.next();
            System.out.println("The address in detail:");
            System.out.println("City or village : "); String city; city=in.next();
            System.out.println("Street : "); String st; st=in.next();
            System.out.println("NO of home : "); String hm; hm=in.next();
            desc=hm+" "+st+" "+city;
            Address new_address= new Address(data,type,desc);
            addresses[address_count]=new_address;
            address_count++;
        }

    }
    public void setFname(String name)
    {
        this.fName=name;
    }
    public void setLname(String name)
    {
        this.lName=name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getFname()
    {
        return fName;
    }
    public String getLname()
    {
        return lName;
    }

    public int getId()
    {
        return id;
    }
    public void print()
    {   System.out.println("-------------------------------------------------");
        System.out.println("Id : "+getId());
        System.out.println("Name:  "+getFname().concat(" "+getLname()));
        int age =2023-y_o_p;
        System.out.println("The age : "+age);
        String gen;
        if(gender==0) gen="Male";
        else gen="Female";
        System.out.println("Gender : "+gen);
        if(phone_count>0){
            System.out.println("Phones: ");
            for(int i=0;i<phone_count;i++)
            {
                phones[i].print();
            }}
        if(email_count>0){
            System.out.println("Emails : ");

            for(int i=0;i<email_count;i++)
            {
                emails[i].print();
            }}
        if(address_count>0)
        {
            System.out.println("Addresses: ");

            for(int i=0;i<address_count;i++)
            {
                addresses[i].print();
            }

        }
    }
    public boolean findUserWith(String data)  {
        boolean found = false;
        if (getFname().compareTo(data) == 0) //case the data equal to the name
        {
            found = true;
        } else //(case the data equal to the phone data)
        {
            for (int i = 0; i < phone_count; i++) {
                if (phones[i].isFound(data)) {
                    found = true;
                    break;
                }
            }
        }
        if (!found) //case the data equal to the address data
        {
            for (int i = 0; i < address_count; i++) {
                if (addresses[i].isFound(data)) {
                    found = true;
                    break;
                }
            }
        }

        return found;
    }

}