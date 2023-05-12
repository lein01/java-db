package configuracion;

import java.sql.*;


//Primer paso Connecion al db
public class MysqlConfig {


    String host = "localhost:3306";
    String user = "root";
    String password = "";
    String bd = "develop";


    //segundo paso Drivers
    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://"+host+"/"+bd+"?user="+user+"&password="+password;
        return DriverManager.getConnection(url);
    }

    public ResultSet getResulSet (CallableStatement callableStatement) throws SQLException{
        return callableStatement.executeQuery();
    }
}



































