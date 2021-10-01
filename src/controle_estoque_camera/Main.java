/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle_estoque_camera;

import Persistencia.Connect;

/**
 *
 * @author TME
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connect connect = new Connect();
        
        connect.connect();
    }
    
}
