public class Email {

    private String email;
    private String type;

    Email(String em,String ty)//Assign the data to the constructor to the set methods
    {
        set_email(em);
        set_type(ty);
    }
    public void set_email(String email)
    {
        this.email=email;
    }
    public void set_type(String type)
    {
        this.type=type;
    }
    public String get_phone()
    {
        return email;
    }
    public String get_type(){
        return type;
    }
    public void print()//view the email data
    {
        System.out.println("Email :  "+get_phone()+"  Email type :  "+get_type());
    }
    public boolean  isFound(String data)
    //return true if the email  is typical to the data
    { boolean found =false;
        if(email.compareTo(data)==0)
            found=true;
        else if(type.compareTo(data)==0)
            found=true;
        return true;
    }

}
