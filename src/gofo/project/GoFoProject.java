/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gofo.project;

/**
 *
 * @author kcsstore.com
 */
public class GoFoProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Playground k = new Playground("OldTrafford","hgifhg",30,2,501.50);
        PlaygroundOwner pp = new PlaygroundOwner("Omar" , 204903652,"6565","656565@",231654,"helwan",k);
        pp.addPlayground(k);
        System.out.println(pp.toString());
        

        
    }
    
    
}
