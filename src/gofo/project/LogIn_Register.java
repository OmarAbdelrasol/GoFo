package gofo.project;
import java.util.ArrayList;
import java.util.Scanner;
/**
@author yousef
 */
/**
 * LogIn/Register
 */
public class LogIn_Register {
    /**save index of owner*/
    int idowner;
    /**save index of player*/
    int idplayer;
    /**list hold all players*/
    private ArrayList<Player> players = new ArrayList<Player>();
    /**list hold all owners*/
    private ArrayList<PlaygroundOwner> owners = new ArrayList<PlaygroundOwner>();
    /**list hold all grounds*/
    private ArrayList<Playground>grounds=new ArrayList<Playground>();
    /**object from ground*/
    Playground ground = new Playground();
    /**object from owner*/
    PlaygroundOwner owner=new PlaygroundOwner();
    Scanner scanner = new Scanner(System.in);
    /**Function to login as player*/
    public int LogInAsPlayer(String username, String password) {
        int check=0;
        for (int i=0;i<players.size();i++)
        {
            if (players.get(i).getUsername().equals(username))
            {

                if (players.get(i).getPassword().equals(password))
                {
                    check=1;
                    idplayer=i;
                    break;
                }
            }
        }
        return check;
    }
    /**Function to login as owner*/
    public int LogInAsOwner(String username, String password) {
        int check = 0;
        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i).getUserName().equals(username)  && owners.get(i).getPassword().equals(password)) {
                check = owners.get(i).getId();
                idowner=i;
            }
        }
        return check;
    }
    public PlaygroundOwner search()
    {
       owner=owners.get(idowner);
        return owner;
    }
    /**Function to Add playground*/
    public void AddPlayground (Playground playground)
    {
        grounds.add(playground);
    }
    /**Function to Register As player*/
    public void RegisterAsPlayer()
    {
        String user;
        String Pass;
        String name;
        String Phone;
        int id;
        double ewallet;
        System.out.println("Enter the following (Space separated)\nUserName||Password||Name||phone||id||money");
        user = scanner.next();
        Pass = scanner.next();
        name = scanner.next();
        Phone = scanner.next();
        id = scanner.nextInt();
        ewallet=scanner.nextDouble();
        Player player = new Player(user, Pass, name, Phone, id,ewallet);
        players.add(player);
    }
    /**Function to Register As owner*/
    public void RegisterAsOwner()
    {
        String user;
        String Pass;
        String name;
        String Phone;
        int id;
        double wallet;
        System.out.println("Enter the following (Space separated)\nUserName||Password||Name||phone||id||Money");
        user = scanner.next();
        Pass = scanner.next();
        name = scanner.next();
        Phone = scanner.next();
        id = scanner.nextInt();
        wallet=scanner.nextDouble();
        PlaygroundOwner owner1 = new PlaygroundOwner(user, Pass, name, Phone, id,wallet);
        owners.add(owner1);
    }
    /**Function to display all playground*/
public void displayPlaygrounds()
{
    for (int i=0;i<grounds.size();i++)
    {
        System.out.println(grounds.get(i));
        grounds.get(i).getAvahours();
    }
}

    /**Function to book playground*/
    public void Book(String name, int time) {
        int temp=0;
        double price=0;
        for (int i = 0; i < owners.size(); i++) {
            ground = owners.get(i).getPlayground(name);
            if (ground.getName().equals(name)) {
                price=ground.getPrice();
                temp=i;
                break;
            }
            else
            {

            }
        }
        if (ground.getName().equals("")) {
            System.out.println("No playground with this name.");
        } else {
            if (ground.setHours(time)==1) {
                if (players.get(idplayer).getEwallet() >= price) {
                    players.get(idplayer).setEwallet(players.get(idplayer).getEwallet() - price);
                    System.out.println(players.get(idplayer).getEwallet());
                    owners.get(temp).setEwallet(owners.get(temp).getEwallet() + price);
                    System.out.println(owners.get(temp).getEwallet());
                }
            }
        }
    }
}

