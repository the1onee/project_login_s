package viewfxml;

import control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;
import java.sql.SQLException;

public class viewfictry {
    private Studintmanger studintmanger;

    public viewfictry(viewfxml.Studintmanger studintmanger) {
        this.studintmanger = studintmanger;
    }

    public void showlogin(){

        absstud conyt= new loign_sud(this,studintmanger,"/viewfxml/login_sud.fxml");
        manystage(conyt);
    }
    public void showedit(){

        absstud conyt= new eidet(this,studintmanger,"/viewfxml/eidet.fxml");
        manystage(conyt);
    }
    public void showestudnview() throws SQLException {

        absstud conyt= new studinview(this,studintmanger,"/viewfxml/studntview.fxml");
        manystage(conyt);
    }
    public void showestdelt() throws SQLException {

        absstud conyt= new delet(this,studintmanger,"/viewfxml/deilt.fxml");
        manystage(conyt);
    }
    public void showhome() throws SQLException {

        absstud conyt= new home(this,studintmanger,"/viewfxml/home.fxml");
        manystage(conyt);
    }
    public void showpdf() throws SQLException {

        absstud conyt= new pdfdon(this,studintmanger,"/viewfxml/pdfdon.fxml");
        manystage(conyt);
    }

    public void shochart() throws SQLException {

        absstud conyt= new chart(this,studintmanger,"/viewfxml/chart.fxml");
        manystage(conyt);
    }


    public void manystage( absstud abscractcontroal){

        FXMLLoader loader=new FXMLLoader(getClass().getResource(abscractcontroal.getFxmlname()));
        loader.setController(abscractcontroal);
        Parent parent;
        try {
            parent=loader.load();
        }  catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene=new Scene(parent);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();

    }
    public void closstage(Stage stagee){
        stagee.close();
    }

}
