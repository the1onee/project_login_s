package mysql;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbmysql {


    Connection cnn = null;



    public static   Connection  dbmysqll(String name_db, String pass){
      try {
          Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost/student", name_db,pass);
          System.out.println("تم الاتصال ب نجا ");
          return cnn;
      } catch (Exception e) {
          System.out.println("عاود المحاولة الاتصال لم ينجح ");
          return null;
      }
    }

    public  static ObservableList<users>  getDatausere(){
        String username="rootschool";
        String pass="1111";
        Connection conn=dbmysql.dbmysqll(username,pass);
        ObservableList<users> eidet= FXCollections.observableArrayList();
        try {
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM `newpro`");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                eidet.add(new users(Integer.parseInt(rs.getString("id_stud")),rs.getString("frstname")+" "+rs.getString("scndname")+" "+rs.getString("thirdname")+" "+rs.getString("fourname") ,rs.getString("sex"),rs.getString("email"),rs.getString("long"),rs.getString("count")));
            }

        } catch (Exception e) {


        }
        return eidet;


    }

}