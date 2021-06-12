package gofo.project;
import sun.rmi.runtime.Log;
import java.util.Scanner;
/**
Main
 */
public class GoFoProject {
    public static void main(String[] args) {
        LogIn_Register test=new LogIn_Register();
        String username;
        String password;
        String search;
        PlaygroundOwner owner=new PlaygroundOwner();
        int choose = 0;
        while  (true) {
            System.out.println("choose from the following:\n1-LogIn.\n2-Register.");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            if (choose == 1) {
                while (true) {
                    System.out.println("LogIn As:\n1-Player.\n2-Play ground Owner.\n3-Back");
                    choose = scanner.nextInt();
                    if (choose == 1) {
                        System.out.print("LogIn\n=====\nEnter Your username:");
                        username = scanner.next();
                        System.out.print("Enter Your Password:");
                        password = scanner.next();
                        if (test.LogInAsPlayer(username, password)==0) {
                            System.out.println("Your UserName or Password is wrong");
                        }
                        else {
                            while (true) {
                                System.out.println("choose of the following:\n1-Book a playground\n2-logOut");
                                choose = scanner.nextInt();
                                if (choose == 1) {
                                    test.displayPlaygrounds();
                                    System.out.print("Enter Playground name:");
                                    search = scanner.next();
                                    System.out.print("Enter the begin hour to Book:");
                                    choose = scanner.nextInt();
                                    test.Book(search, choose);

                                } else if (choose == 2) {
                                    break;
                                }
                            }
                        }
                    } else if (choose == 2) {
                        System.out.print("LogIn\n=====\nEnter Your username:");
                        username = scanner.next();
                        System.out.print("Enter Your Password:");
                        password = scanner.next();

                        if (test.LogInAsOwner(username, password) == 0) {
                            System.out.println("Your UserName or Password is wrong");
                        } else {
                            owner = test.search();
                            while (true) {
                                System.out.println("choose of the following:\n1-Add a playground\n2-logOut");
                                choose = scanner.nextInt();
                                if (choose == 1) {
                                    System.out.print("Enter Playground name:");
                                    search = scanner.next();
                                    String name = search;
                                    System.out.print("Enter Playground location:");
                                    search = scanner.next();
                                    String loc = search;
                                    System.out.print("Enter Playground Size:");
                                    choose = scanner.nextInt();
                                    int size = choose;
                                    System.out.print("Enter Playground Price:");
                                    choose = scanner.nextInt();
                                    int price = choose;
                                    Playground playground = new Playground(name, loc, size, price);
                                    owner.addPlayground(playground);
                                    test.AddPlayground(playground);
                                } else if (choose == 2) {
                                    break;
                                }
                            }
                        }
                    } else if (choose == 3) {
                        break;
                    }
                }
            }
            else if(choose==2)
            {
                System.out.println("Register As:\n1-Player.\n2-Play ground Owner.\n3-Back");
                choose = scanner.nextInt();
                if(choose==1)
                {
                    test.RegisterAsPlayer();
                }
                else if(choose==2)
                {
                    test.RegisterAsOwner();
                }
            }
        }
    }
}

