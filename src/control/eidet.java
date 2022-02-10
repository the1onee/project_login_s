package control;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import viewfxml.Studintmanger;
import viewfxml.viewfictry;
import mysql.users;
import mysql.dbmysql;

import javax.swing.*;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class eidet extends absstud implements Initializable {
    public eidet(viewfictry viewfictry,Studintmanger emailmangaer, String fxmlname) {
        super(viewfictry,emailmangaer,fxmlname);
    }
    @FXML
    private TableView<users> table;

    @FXML
    private TableColumn<users, Integer> iddd;

    @FXML
    private TableColumn<users, String> names;

    @FXML
    private TableColumn<users, String> barthday;

    @FXML
    private TableColumn<users, String> avrg;

    @FXML
    private TableColumn<users, String> rsob;

    @FXML
    private TableColumn<users, String> evry;
    ObservableList<users> listm;
    @FXML
    private Menu viewe;
    @FXML
    private Button eidtyi;

    @FXML
    private FontAwesomeIcon edite;

    @FXML
    private Button viewwe;

    @FXML
    private Button delet;

    @FXML
    private Button back;
    @FXML
    private Button backk;
    @FXML
    private MenuItem login;
    @FXML
    private Button ubd;
    @FXML
    private FontAwesomeIcon homee;

    @FXML
    void upd(ActionEvent event) throws SQLException {
        veiwvactory.showpdf();
        Stage stage=(Stage)ubd.getScene().getWindow();
        veiwvactory.closstage(stage);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       iddd.setCellValueFactory(new PropertyValueFactory<users,Integer>("ide"));
       names.setCellValueFactory(new PropertyValueFactory<users,String>("name"));
       barthday.setCellValueFactory(new PropertyValueFactory<users,String>("brth"));
      avrg.setCellValueFactory(new PropertyValueFactory<users,String>("avrrg"));
       rsob.setCellValueFactory(new PropertyValueFactory<users,String>("rsob"));
        evry.setCellValueFactory(new PropertyValueFactory<users,String>("mj"));
        listm =dbmysql.getDatausere();
        table.setItems(listm);

    }   @FXML
   public static Button id_delt;





    @FXML
    void delet(ActionEvent event)throws SQLException {
        veiwvactory.showestdelt();
        Stage stage=(Stage)delet.getScene().getWindow();



    }

    @FXML
    void eidtre(ActionEvent event) throws SQLException {
        Connection con=null;

        PreparedStatement pet=null;

        String username="rootschool";
        String pass="1111";


        String sq= "SELECT * FROM `newpro`";
        con= dbmysql.dbmysqll(username,pass);
        pet=con.prepareStatement(sq);

        pet.execute();
    }


    @FXML
   public   void viewre(ActionEvent event) throws SQLException {

                veiwvactory.showestudnview();

                Stage stage=(Stage)viewwe.getScene().getWindow();

                veiwvactory.closstage(stage);




    }

    @FXML
    void loginn(ActionEvent event) {
        veiwvactory.showlogin();
        Stage stage=(Stage)back.getScene().getWindow();
        veiwvactory.closstage(stage);
    }

    @FXML
    void viewhome(MouseEvent event) throws SQLException {
        veiwvactory.showhome();
        Stage stage=(Stage)backk.getScene().getWindow();
        veiwvactory.closstage(stage);
    }

}
