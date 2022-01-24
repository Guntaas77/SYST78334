
/**
 *This class +++ Insert class description here +++
 * 
 * @author Guntaas Kaur
 */
class Address
{
   int streetNum;
   String city;
   String state;
   String country;
   Address(int street, String c, String st, String coun)
   {
       this.streetNum=street;
       this.city =c;
       this.state = st;
       this.country = coun;
   }


   public static void main(String args[]){
       Address ad = new Address(27, "brampton", "Onatrio", "Canada");
    
    
       System.out.println(ad.streetNum);
       System.out.println(ad.city);
       System.out.println(ad.state);
       System.out.println(ad.country);
   }
}