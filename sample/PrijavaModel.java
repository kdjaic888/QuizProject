package sample;

import java.sql.*;


public class PrijavaModel {

    Connection connection;

    public PrijavaModel(){
        connection = SqliteConnection.connection();
        if (connection == null){
            System.exit(1);
        }
    }

    public boolean isClosed() {
        try {
            return !connection.isClosed();
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLogin(String korIme, String lozinka) throws SQLException{
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String upit = "select * from Korisnik where KorisnickoIme = ? and Lozinka = ?";
        try {
            preparedStatement = connection.prepareStatement(upit);
            preparedStatement.setString(1, korIme);
            preparedStatement.setString(2, lozinka);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e){
            return false;
        } finally {
            preparedStatement.close();
            resultSet.close();
        }
    }


}
