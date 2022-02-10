package control;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import viewfxml.Studintmanger;
import viewfxml.viewfictry;
import  viewfxml.viewfictry;

import java.io.File;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class home  extends absstud implements Initializable {
    public home(viewfictry veiwvactory, Studintmanger studintmanger, String fxmlname) {
        super(veiwvactory, studintmanger, fxmlname);
    }

    @FXML
    private Button eidit;
    @FXML
    private FontAwesomeIcon edite;
    @FXML
    private FontAwesomeIcon listrew;

    @FXML
    private MediaView midagif;
    @FXML
    private Button addd;

    @FXML
    private Button vier;
    @FXML
    private FontAwesomeIcon plusimg;

    @FXML
    void vied(MouseEvent event) {
        veiwvactory.showlogin();
        Stage stage=(Stage)addd.getScene().getWindow();
        veiwvactory.closstage(stage);
    }

    @FXML
    void viewadd(ActionEvent event) {
        veiwvactory.showlogin();
        Stage stage=(Stage)addd.getScene().getWindow();
        veiwvactory.closstage(stage);
    }





    @FXML
    void vieweidit(ActionEvent event) throws SQLException {
        veiwvactory.showestudnview();

        Stage stage=(Stage)eidit.getScene().getWindow();

        veiwvactory.closstage(stage);

    }

    @FXML
    void viewvier(ActionEvent event) {
        veiwvactory.showedit();
        Stage stage=(Stage)vier.getScene().getWindow();
        veiwvactory.closstage(stage);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

    @FXML
    void listview(MouseEvent event) throws SQLException {

        veiwvactory.showestudnview();

        Stage stage=(Stage)eidit.getScene().getWindow();

        veiwvactory.closstage(stage);
    }


    @FXML
    void viewedt(MouseEvent event) {
        veiwvactory.showedit();
        Stage stage=(Stage)vier.getScene().getWindow();
        veiwvactory.closstage(stage);
    }
}


