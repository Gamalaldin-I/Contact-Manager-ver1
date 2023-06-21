public class Phone {
    private String number;
    private String type;
    private String version;
    Phone(String number,String ty,String ver)//Assign the values to the constructor
    {
        set_number(number);
        set_type(ty);
        set_version(ver);
    }
    public void set_number(String number)
    {
        this.number=number;
    }
    public void set_type(String type)
    {
        this.type=type;
    }
    public void set_version(String version)
    {
        this.version=version;
    }
    public String get_number()
    {
        return number;
    }
    public String get_type()
    {
        return type;
    }
    public String get_version()
    {
        return version;
    }
    public void print()//view the phone data
    {
        System.out.println("Phone number :  "+get_number()+"  Phone OS type :  "+get_type()+"  Phone version :  "+get_version());
    }
    public boolean  isFound(String data)//return true if the phone is typical to the data
    { boolean found=false;
        if(number.compareTo(data)==0)
            found =true;
        else if (type.compareTo(data)==0)
            found=true;
        else if(version.compareTo(data)==0)
            found=true;
        return found;

    }

}