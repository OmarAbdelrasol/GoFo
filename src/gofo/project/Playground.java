package gofo.project;
public class Playground {
    /** the name of Playground*/
    private String name;
    /** the Location of Playground */
    private String location ;
    /** the size of Playground */
    private int size;
     /** the avaliable hours of Playground */
    private int[] avahours=new int[24];
   /** the price of Playground */
    private double price;
    /** this default constructor to initialize values playground
     *
     */
    public Playground(){
        name="";
        location="" ;
        size=0;
        price=0;
    }
    /** this parameterized constructor to take values  of playground 
     *
     */
    public Playground(String n , String loc , int s , double p){
        name=n;
        location=loc;
        size=s;
        price=p;
    }
    /** set Playground  name
     * 
     */
    public void setName(String name) {
        this.name = name;
    }
    /** set Playground location
     * 
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /** set Playground size
     * 
     */
    public void setSize(int size) {
        this.size = size;
    }
    /** set price of avaliable hours of playground
     * 
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /** get Playground avaliable hours
     * 
     */
    public void getAvahours()
    {
        System.out.println("Available Times are:");
    for (int i=0;i<23;i++)
    {
        if (avahours[i]==0)
        {
            System.out.print("[");
            System.out.print(i+1);
            System.out.print("to");
            System.out.print(i+2);
            System.out.print("] ");
        }
    }
        System.out.println();
    }
    /** set Playground avaliable hours 
     * 
     */
    public void setHours(int hours)
    {
        if (avahours[hours]==0)
        {
            avahours[hours-1]=1;
            System.out.println("Booked Successfully");
            System.out.println();
        }
        else
        {
            System.out.println("Not Available Hour.");
        }

    }
    /** get Playground name
     * 
     */
    public String getName() {
        return name;
    }
    /** get Playground location
     * 
     */
    public String getLocation() {
        return location;
    }
    /** get Playground size
     * 
     */
    public int getSize() {
        return size;
    }
    /** get available hours price
     * 
     */
    public double getPrice() {
        return price;
    }
    /** print Playground info
     * 
     */
    @Override
    public String toString() {
        return "Playground{" + "name=" + name + ", price per hour=" + price + '}';
    }




}
