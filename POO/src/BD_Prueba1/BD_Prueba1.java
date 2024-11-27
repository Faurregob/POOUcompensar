package BD_Prueba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BD_Prueba1 {

       private static final String jdbcURL = "jdbc:postgresql://localhost:5432/BD_Prueba1";
       private static final String username = "postgres";
       private static final String password = "qwer1234";
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        Connection connection = null;
        Statement statement = null;

    try {connection = DriverManager.getConnection(jdbcURL, username, password);

            if (connection != null) {
                System.out.println("Conexion exitosa a la Base de Datos");
                statement = connection.createStatement();
                //Se realizaran las operaciones con la base de Datos CRUD
//                //Crear la tabla
//                statement = connection.createStatement();
//                String createTableSQL = "CREATE TABLE IF NOT EXISTS primera_tabla ("
//                        +"id SERIAL PRIMARY KEY, "
//                        +"nombre VARCHAR(255), "
//                        +"edad INT);";
//                
//                statement.execute(createTableSQL);
//                System.out.println("Tabla creada exitosamente");
//              
                System.out.println("Que desea realizar: \n"
                        + "1) Ingresar un nuevo registro: \n"
                        + "2) Actualizar o modificar un registro: \n"
                        + "3) Eliminar un registro: \n"
                        + "4) Realizar una consulta de algun registro: \n"
                        + "5) Salir");

                switch (opcion != 0) {
                    case 1:
                        //Realizar una insercion (CREATE)

                        String insertSQL = "INSERT INTO primera_tabla (nombre, edad) VALUES('Aaron Joel',4)";
                        int rowInserted = statement.executeUpdate(insertSQL);
                        if (rowInserted > 0) {
                            System.out.println("Registro insertado exitosamente.");
                        } else {
                            System.out.println("Registro no insertado en la tabla");
                        }
                        break;
                    case 2:
                        //Realizar una actualizacion (UPDATE)
                        String updateSQL = "UPDATE primera_tabla SET edad = 38 WHERE nombre = 'Freddy'";
                        int rowUpdate = statement.executeUpdate(updateSQL);
                        if (rowUpdate > 0) {
                            System.out.println("Registro actualizado exitosamente.");
                        } else {
                            System.out.println("Registro no actualizado en la tabla");
                        }break;
                    case 3:
//                        Realizar una eliminacion de registro(DELETE)
                        String deleteSQL = "DELETE FROM primera_tabla WHERE edad = '38'";
                        int rowDelete = statement.executeUpdate(deleteSQL);
                        if (rowDelete > 0) {
                            System.out.println("Registro eliminado exitosamente.");
                        } else {
                            System.out.println("Registro no eliminado en la tabla");
                        }break;
                    case 4:
                        //Realizar una consulta (SELECT)
                        String selectSQL = "SELECT id, nombre, edad FROM primera_tabla ";
                        ResultSet resultset = statement.executeQuery(selectSQL);

                        while (resultset.next()) {
                            int id = resultset.getInt("id");
                            String nombre = resultset.getString("nombre");
                            int edad = resultset.getInt("edad");

                            System.out.println("Id:" + id + "\n"
                                    + "Nombre: " + nombre + "\n"
                                    + "Edad: " + edad + "\n");

                        }break;
                    case 5:
                        
                }

                resultset.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error de Conexion" + e.getMessage());

        }

    }

}
