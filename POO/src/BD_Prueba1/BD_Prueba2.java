package BD_Prueba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class BD_Prueba2 {

    // Datos de conexión a la base de datos
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/BD_Prueba1";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "qwer1234";

    public static void main(String[] args) {
        // Establecer conexión utilizando try-with-resources para asegurar el cierre
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            if (connection != null) {
                JOptionPane.showMessageDialog(null, "¡Conexión exitosa a la Base de Datos!", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                // Crear la tabla si no existe
                crearTabla(connection);

                int opcion = 0;
                do {
                    opcion = mostrarMenu();
                    switch (opcion) {
                        case 1:
                            insertarRegistro(connection);
                            break;
                        case 2:
                            actualizarRegistro(connection);
                            break;
                        case 3:
                            eliminarRegistro(connection);
                            break;
                        case 4:
                            consultarRegistros(connection);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Saliendo del programa.", "Salir", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } while (opcion != 5);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Muestra el menú de opciones al usuario y retorna la opción seleccionada.
     *
     * @return La opción seleccionada por el usuario.
     */
    private static int mostrarMenu() {
        String menu = "¿Qué desea realizar?\n"
                + "1) Ingresar un nuevo registro\n"
                + "2) Actualizar o modificar un registro\n"
                + "3) Eliminar un registro\n"
                + "4) Realizar una consulta de algún registro\n"
                + "5) Salir";

        String input = JOptionPane.showInputDialog(null, menu, "Menú de Opciones", JOptionPane.QUESTION_MESSAGE);
        if (input == null) { // El usuario presionó cancelar o cerró el diálogo
            return 5; // Salir del programa
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1; // Opción inválida
        }
    }

    /**
     * Crea la tabla 'primera_tabla' si no existe.
     *
     * @param connection La conexión a la base de datos.
     * @throws SQLException Si ocurre un error al ejecutar la consulta.
     */
    private static void crearTabla(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS primera_tabla ("
                + "id SERIAL PRIMARY KEY, "
                + "nombre VARCHAR(255) NOT NULL, "
                + "edad INT NOT NULL"
                + ");";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
            // No es necesario mostrar mensaje cada vez que se crea la tabla
            // Puedes descomentar la línea siguiente si lo deseas
            // JOptionPane.showMessageDialog(null, "Tabla 'primera_tabla' creada o ya existe.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Inserta un nuevo registro en la tabla.
     *
     * @param connection La conexión a la base de datos.
     */
    private static void insertarRegistro(Connection connection) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:", "Insertar Registro", JOptionPane.QUESTION_MESSAGE);
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String edadStr = JOptionPane.showInputDialog(null, "Ingrese la edad:", "Insertar Registro", JOptionPane.QUESTION_MESSAGE);
        if (edadStr == null) {
            return; // El usuario canceló la operación
        }

        int edad;
        try {
            edad = Integer.parseInt(edadStr);
            if (edad < 0) {
                throw new NumberFormatException("La edad no puede ser negativa.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Edad inválida. Debe ser un número entero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String insertSQL = "INSERT INTO primera_tabla (nombre, edad) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setString(1, nombre);
            pstmt.setInt(2, edad);
            int filasInsertadas = pstmt.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "Registro insertado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo insertar el registro.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Actualiza un registro existente en la tabla.
     *
     * @param connection La conexión a la base de datos.
     */
    private static void actualizarRegistro(Connection connection) {
        String idStr = JOptionPane.showInputDialog(null, "Ingrese el ID del registro a actualizar:", "Actualizar Registro", JOptionPane.QUESTION_MESSAGE);
        if (idStr == null) {
            return; // El usuario canceló la operación
        }

        int id;
        try {
            id = Integer.parseInt(idStr);
            if (id <= 0) {
                throw new NumberFormatException("El ID debe ser un número positivo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido. Debe ser un número entero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre:", "Actualizar Registro", JOptionPane.QUESTION_MESSAGE);
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String edadStr = JOptionPane.showInputDialog(null, "Ingrese la nueva edad:", "Actualizar Registro", JOptionPane.QUESTION_MESSAGE);
        if (edadStr == null) {
            return; // El usuario canceló la operación
        }

        int edad;
        try {
            edad = Integer.parseInt(edadStr);
            if (edad < 0) {
                throw new NumberFormatException("La edad no puede ser negativa.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Edad inválida. Debe ser un número entero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String updateSQL = "UPDATE primera_tabla SET nombre = ?, edad = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(updateSQL)) {
            pstmt.setString(1, nombre);
            pstmt.setInt(2, edad);
            pstmt.setInt(3, id);
            int filasActualizadas = pstmt.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un registro con el ID proporcionado.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Elimina un registro de la tabla.
     *
     * @param connection La conexión a la base de datos.
     */
    private static void eliminarRegistro(Connection connection) {
        String idStr = JOptionPane.showInputDialog(null, "Ingrese el ID del registro a eliminar:", "Eliminar Registro", JOptionPane.QUESTION_MESSAGE);
        if (idStr == null) {
            return; // El usuario canceló la operación
        }

        int id;
        try {
            id = Integer.parseInt(idStr);
            if (id <= 0) {
                throw new NumberFormatException("El ID debe ser un número positivo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido. Debe ser un número entero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String deleteSQL = "DELETE FROM primera_tabla WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, id);
            int filasEliminadas = pstmt.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un registro con el ID proporcionado.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Consulta y muestra todos los registros de la tabla.
     *
     * @param connection La conexión a la base de datos.
     */
    private static void consultarRegistros(Connection connection) {
        String selectSQL = "SELECT id, nombre, edad FROM primera_tabla ORDER BY id";
        StringBuilder resultado = new StringBuilder();

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");

                resultado.append("ID: ").append(id)
                         .append("\nNombre: ").append(nombre)
                         .append("\nEdad: ").append(edad)
                         .append("\n---------------------------\n");
            }

            if (resultado.length() > 0) {
                JOptionPane.showMessageDialog(null, resultado.toString(), "Registros", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros para mostrar.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar registros: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
