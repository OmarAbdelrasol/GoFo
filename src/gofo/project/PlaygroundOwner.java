package gofo.project;
import java.util.ArrayList;
/**
 @author omar
 */
/**
 * playground owner
 */
public class PlaygroundOwner {
    /** the name of Playground Owner*/
    private String name;
    /** the ID of Playground Owner*/
    private int id;
    /** the Money in wallet of Playground Owner*/
    private double ewallet;
    /** the Password of Playground Owner*/
    private String password;
    /** the Username of Playground Owner*/
    private String UserName;
    /** the phone number of Playground Owner*/
    private String phone;
    /** the List of Playgrounds*/
    private ArrayList<Playground> play = new ArrayList<Playground>();

    /** this default constructor to initialize values profile of playground owner
     *
     */
    public PlaygroundOwner() {
        name = "";
        id = 0;
        password = "";
        UserName = "";
        phone = "";
        ewallet = 0;
    }
    /** this parameterized constructor to take values and set profile of Playground owner
     *
     */
    public PlaygroundOwner(String user, String pass, String n, String ph, int i, double wallet) {
        name = n;
        id = i;
        password = pass;
        UserName = user;
        phone = ph;
        ewallet = wallet;
    }

    /** set Playground owner name
     *
     */
    public void setName(String n) {
        name = n;
    }
    /** set Playground owner ID
     *
     */
    public void setId(int i) {
        id = i;
    }
    /** set Playground owner Password
     *
     */
    public void setPassword(String p) {
        password = p;
    }
    /** set Playground owner username
     *
     */
    public void setUserName(String user) {
        UserName = user;
    }
    /** set Playground owner phone number
     *
     */
    public void setPhone(String p) {
        phone = p;
    }
    /**  function to get name of Playground Owner
     *
     */
    public String getName() {
        return name;
    }
    /** function to get ID of Playground owner
     *
     */
    public int getId() {
        return id;
    }
    /** function to get Password of Playground owner
     *
     */
    public String getPassword() {
        return password;
    }
    /** function to get UserName of Playground owner
     *
     */
    public String getUserName() {
        return UserName;
    }
    /** function to get phone number of Playground owner
     *
     */
    public String getPhone() {
        return phone;
    }
    /** function to get money of Playground owner
     *
     */
    public double getEwallet()
    {
        return ewallet;
    }
    /** function to set money of playground Owner
     *
     */
    public void setEwallet(double ewallet)
    {
        this.ewallet = ewallet;
    }
    /**
     * function is used to get Playground
     */ public Playground getPlayground(String name) {
        Playground p = new Playground();
        int temp = -1;
        for (int i = 0; i < play.size(); i++) {
            if (play.get(i).getName().equals(name)) {
                temp = i;
                break;
            }
        }
        if (temp == -1) {
            return p;
        } else {
            return play.get(temp);
        }
    }
    /**
     * function to add playground
     */
 public void addPlayground(Playground playground)
 {
     play.add(playground);
 }
    /**
     * to print the Playground owner
     */
    @Override
    public String toString() {
        return "PlaygroundOwner{" + "name=" + name + ", id=" + id + ", phone=" + phone + "," + play.toString() + '}';
    }


    public ArrayList getList() {
        return play;
    }
}

