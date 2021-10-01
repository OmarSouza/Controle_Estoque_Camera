/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class Connect {
    public static void connect(){
        Connection conexao = null;
        
        try {
            String url = "jdbc:sqlite:C:\\Users\\TME\\Documents\\Omar\\Codes"
                    + "\\Controle_Estoque_Camera\\src\\Persistencia\\estoque_Camera.db";
            
            conexao = DriverManager.getConnection(url);
            
            System.out.println("Conexão com o Banco de Dados estabelecida");
            
            String kit_dataChegada = "20/04/2021";
            String kit_condicao = "Kit Completo";
            String kit_dataSaida = "28/07/2021";
            String kit_pessoa = "Divino";
            String kit_placa = "PUN-7589";
            
            Statement statement = conexao.createStatement();
            
            statement.execute("INSERT INTO estoque(dataChegada, condicaoKit, dataSaida, pessoa, placa)");
            
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM estoque");
            ResultSet resultSet = stmt.executeQuery();
            
            while(resultSet.next()){
                System.out.println(resultSet);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(conexao != null){
                    conexao.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
       
    }
}
