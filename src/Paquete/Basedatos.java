/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class Basedatos {
     private Connection conexion=null;
    private String login="root";
    private String pass="";
    private String ruta="jdbc:mysql://";
   
public Basedatos(){

    this.login="root";
  this.pass="";
  this.ruta="jdbc:mysql://127.0.0.1/mercancia";

}

public Connection ConectarBaseDatos()

{try  { Class.forName("com.mysql.jdbc.Driver").newInstance();
         conexion=DriverManager.getConnection(ruta,login,pass);

        if(conexion!=null) 
        {return conexion; }}
catch (ClassNotFoundException e) 
      { e.printStackTrace();
       JOptionPane.showMessageDialog(null, "No se encuetra la Clase para conectar con MySQL");}
catch(SQLException e)
     {e.printStackTrace();
      JOptionPane.showMessageDialog(null,  "Error al querer conectar con MySQL");}
finally {return conexion;}}

public void cerrarConexionBaseDatos()

{try{conexion.close();}
     
 catch(SQLException e)
       {e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Error al cerrar la Conexion a la Base de Datos");
        }}



//metodo para registrar


        
        
        
public void registrarMerca(String nombre,String plantel, String talla, int cantidad, int precio) 
throws FileNotFoundException
       
{ConectarBaseDatos();
try{
    PreparedStatement r= conexion.prepareStatement("insert into mercancia(nombre, plantel, talla, cantidad, precio) values('"+nombre+"','"+plantel+"','"+talla+"','"+cantidad+"','"+precio+"');");
    r.execute();}
    catch (SQLException sqlException )
   {   
    JOptionPane.showMessageDialog(null, "ERROR al querer insertar los datos.");
    sqlException.printStackTrace();
   }  
cerrarConexionBaseDatos();
}

public void registrarEncargo(String nom, int id,int cel,String pro,String plan,String ta,int can,int pre,int abo,int sal) 
throws FileNotFoundException
       
{ConectarBaseDatos();
try{
    PreparedStatement r= conexion.prepareStatement("insert into encargos( nombre, identificacion, celular, producto, plantel, talla, cantidad, precio, Abono, Saldo) values('"+nom+"','"+id+"','"+cel+"','"+pro+"','"+plan+"','"+ta+"','"+can+"','"+pre+"','"+abo+"','"+sal+"');");
    r.execute();}
    catch (SQLException sqlException )
   {   
    JOptionPane.showMessageDialog(null, "ERROR al querer insertar los datos.");
    sqlException.printStackTrace();
   }  
cerrarConexionBaseDatos();
}

public void registrarVenta(int canti, String pro,String pla,String ta,int valo,int gast ) 
throws FileNotFoundException
       
{ConectarBaseDatos();
try{
    PreparedStatement r= conexion.prepareStatement("insert into ventas( Cantidad, Producto, Plantel, Talla, Valor,Gastos) values('"+canti+"','"+pro+"','"+pla+"','"+ta+"','"+valo+"','"+gast+"');");
    r.execute();}
    catch (SQLException sqlException )
   {   
    JOptionPane.showMessageDialog(null, "ERROR al querer insertar los datos.");
    sqlException.printStackTrace();
   }  
cerrarConexionBaseDatos();
}







String consultarBase(String pass)
{
ConectarBaseDatos();
String todos="";

String nombre="";

Statement statement = null;
try{
    statement = conexion.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from usuario where Identificacion='"+pass+"'");

while(resultSet.next())
{ 
      nombre=resultSet.getString(8);
     
todos +=nombre;}
}
catch (SQLException sqlException)
{
    JOptionPane.showMessageDialog(null, "Fue en SQLException");
    sqlException.printStackTrace();
    System.exit(1);
} 

cerrarConexionBaseDatos();
return todos;
  
}

   
    


}
