/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica.dal;

import java.sql.*;

/*
-Driver
-Caminho
-Nome
-Autenticação
 */
public class ModuloConexao {

    //Metodo responsavel por estabeler a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //A linha abaixo chama o driver 
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3306/clinica?characterEncoding=utf-8";
        String user = "dba";
        String password = "123";
        //Estabelecendo a conecxão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            
            
           //System.out.println(e);
            return null;
        }
    }
}
