package conn;
import java.sql.*;

public class ConexionDb {
	private Connection conexion = null;
	private static String db_url;
    private static String db_port;
    private static String db_name;
    private static String db_user;
    private static String db_password;
    
    public ConexionDb() {
    	db_url = "jdbc:mysql://localhost";
        db_port = "3306";
        db_name = "juego";
        db_user = "root";
        db_password = "12345";
    }
    public void establecerConexion() {
    	try {
    		String url = db_url + ":" + db_port + "/" + db_name;
    		conexion = DriverManager.getConnection(url, db_user, db_password);//Establece conexion	
    		} catch (SQLException e) {
    			conexion = null;
    			System.out.println("Error al conectarse a la db");
    		}
    }
    
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion con la db");
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
}

