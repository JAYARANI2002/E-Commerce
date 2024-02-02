import java.util.*;
class Address
{
    static Scanner sc=new Scanner(System.in);
    String doorno,streetname,city,district,state;
    private int pincode;
    Address(){}
    public Address(String doorNo,String street,String city,String district,String state,int pincode)
    {
              doorno=doorNo;
              streetname=street;
              this.city=city;
              this.district=district;
              this.state=state;
              this.pincode=pincode;
    }
    public String getDoorNo()
    {
        return doorno;
    }
    public String getStreet()
    {
        return streetname;
    }
    public String getCity()
    {
        return city;
    }
    public String getDistrict()
    {
        return district;
    }
    public String getState()
    {
        return state;
    }
    public int getPincode()
    {
        return pincode;
    }
    public Address getAddressDetails()
    {
        System.out.println("Enter the door no");
        String doorno=sc.next();
        System.out.println("Enter the street");
        String street=sc.next();
        System.out.println("Enter the city");
        String city=sc.next();
        System.out.println("Enter the district");
        String district=sc.next();
        System.out.println("Enter the State");
        String state=sc.next();
        System.out.println("Enter the pincode");
        int pincode=sc.nextInt();
        Address address=new Address(doorno,street,city,district,state,pincode);
        return address;
    }
    public String toString()
    { 
       return "DoorNo   : "+getDoorNo()+"\nstreet   : "+getStreet()+"\ncity     : "+getCity()+"\ndistrict : "+getDistrict()+"\nstate    : "+getState()+"\npincode  : "+getPincode();
    }
}
