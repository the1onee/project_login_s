import javafx.application.Application;
import javafx.stage.Stage;
import viewfxml.Studintmanger;
import viewfxml.viewfictry;

import java.sql.SQLException;




public class Main extends Application {

    @Override
    public void start(Stage  stage) throws Exception{

       viewfictry view=new viewfictry(new Studintmanger());
    view.showhome();

    }


    public static void main(String[] args) throws SQLException {
        launch(args);

}
}
