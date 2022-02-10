package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import mysql.dbmysql;
import viewfxml.Studintmanger;
import viewfxml.viewfictry;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class chart extends absstud  implements Initializable {
    public chart(viewfictry veiwvactory, Studintmanger studintmanger, String fxmlname) {
        super(veiwvactory, studintmanger, fxmlname);
    }   @FXML
    private PieChart pechart;


    ArrayList< String > p = new ArrayList < String > ();
    ArrayList < Double > c = new ArrayList < > ();


    XYChart.Series<String,String> temperature = new XYChart.Series<>();

    public void pichrt(){
        String query = "SELECT `count1`,`count3` FROM `newpro`";
        ObservableList < PieChart.Data > piechartdata;
        piechartdata = FXCollections.observableArrayList();
        try {
            String username="rootschool";
            String pass="1111";
            Connection conn= dbmysql.dbmysqll(username,pass);
            ResultSet rs = conn.createStatement().executeQuery(query);
            while (rs.next()) {
                System.out.println("nfo");

                piechartdata.add(new PieChart.Data(rs.getString("count1"),7));
                p.add(rs.getString("count1"));

                pechart.setData(piechartdata);
                System.out.println("nob");

            }
        } catch (Exception e) {
            System.out.println("no");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

pichrt();
        //pst.setString(1, editUsername.getText());


    }

}


