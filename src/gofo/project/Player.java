package gofo.project;
/**
 @author yousef
 */

/**
 * Player
 */
public class Player {
        private
     /**
     *player username
     */
        String username;
    /**
     * player password
     * */
        String password;
    /**player name*/
        String name;
    /**player phone*/
        String phone;
    /**player id*/
        int id;
    /**player ewallet*/
        double ewallet;
    /**default constructor*/
        public Player()
        {
            username="";
            password="";
            name="";
            phone="";
            id=0;
            ewallet=0;
        }
    /**player parametrized constructor*/
        public Player(String user,String Pass,String name,String Phone,int i,double wallet)
        {
        id=i;
        username=user;
        password=Pass;
        this.name=name;
        this.phone=Phone;
        ewallet=wallet;
        }
    /**to set player name*/
        public void setName(String Name)
        {
            name = Name;
        }
    /**to get player Name*/
        String getName() {
            return name;
        }
    /**to set UserName of player*/
        void setUsername(String user) {
            username = user;
        }
    /**to get player Username*/
        String getUsername() {
            return username;
        }
    /**to set player password*/
        void setPassword(String pass) {
            password = pass;
        }
    /**to get player password*/
        String getPassword() {
            return password;
        }
    /**to set player phone*/
        void setPhone(String phone1) {
            phone = phone1;
        }
    /**to get player phone*/
        String getPhone() {
            return phone;
        }
    /**to get player id*/
        public int getId() {
            return id;
        }
    /**to set player id*/
        public void setId(int id) {
            this.id = id;
        }
    /**to get player ewallet*/
        public double getEwallet() {
            return ewallet;
        }
    /**to set player ewallet*/
        public void setEwallet(double ewallet) {
            this.ewallet = ewallet;
        }
    /**to print player info*/
        public String toString() {
            return "Player{" + "name=" + name + ", id=" + id  + ", phone=" + phone +'}';
        }

    }


