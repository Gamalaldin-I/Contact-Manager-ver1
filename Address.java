public class Address {
    private String country;//
    private String state;//
    private String address;//
    // assign the values to the constructor when create an object to the set methods
    Address(String con,String stat,String address)
    {
        set_country(con);
        set_state(stat);
        set_address(address);
    }
    public void set_country(String country)
    {
        this.country=country;
    }
    public void set_state(String state)
    {
        this.state=state;
    }
    public void set_address(String address)
    {
        this.address=address;
    }
    public String get_country()
    {
        return country;
    }
    public String get_state()
    {
        return state ;
    }
    public String get_address()
    {
        return address ;
    }
    public void print()//view the address
    {
        System.out.println("Address : "+get_address()+" , "+get_state()+" , "+get_country() );
    }
    public boolean  isFound(String data)//return true if the address typical to the data
    { boolean found=false;
        if(country.compareTo(data)==0)
            found=true;
        else if(state.compareTo(data)==0)
            found=true;
        return found;
    }
}

