package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mysql.dbmysql;
import viewfxml.Studintmanger;
import viewfxml.viewfictry;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delet extends absstud {
    public delet(viewfictry veiwvactory, Studintmanger studintmanger, String fxmlname) {
        super(veiwvactory, studintmanger, fxmlname);
    }
    @FXML
    private Button ok;

    @FXML
    private Button can;



    @FXML
    private TextField id;


    @FXML
    private TextField id1;
    @FXML
    private Button canl;
    Connection con=null;

    PreparedStatement pet=null;


    @FXML
    void clost(ActionEvent event) {
        Stage stage=(Stage)canl.getScene().getWindow();
        veiwvactory.closstage(stage);
    }

    @FXML
    void del(ActionEvent event) {
        try {
            String username="rootschool";
            String pass="1111";

            String idd=id.getText();
            String sq= "DELETE FROM `newpro` WHERE `newpro`.`id_stud` = ? AND `newpro`.`id_name` = ? ";
            con= dbmysql.dbmysqll(username,pass);
            pet=con.prepareStatement(sq);
            pet.setString(1,idd);
            pet.setString(2,id1.getText());
            pet.execute();
            int stat=pet.executeUpdate();
            JOptionPane.showMessageDialog(null,"تم الحذف  بانجاح تهانيا");

            Stage stage=(Stage)ok.getScene().getWindow();
            veiwvactory.closstage(stage);
        } catch (Exception e) {
            Stage stage=(Stage)ok.getScene().getWindow();
            veiwvactory.closstage(stage);

        }

    }
}
