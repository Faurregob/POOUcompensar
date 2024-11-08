package BD_Prueba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BD_Prueba1 {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/BD_Prueba1";
        String username = "postgres";
        String password = "qwer1234";

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            if (connection != null) {
                System.out.println("Conexion exitosa a la Base de Datos");
                //Se realizaran las operaciones con la base de Datos CRUD
                //Crear la tabla
                statement = connection.createStatement();
                String createTableSQL = "CREATE TABLE IF NOT EXISTS primera_tabla ("
                        +"id SERIAL PRIMARY KEY, "
                        +"nombre VARCHAR(255), "
                        +"edad INT);";
                
                statement.execute(createTableSQL);
                System.out.println("Tabla creada exitosamente");
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error de Conexion" + e.getMessage());

        }

    }

}
