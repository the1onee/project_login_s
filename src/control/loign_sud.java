package control;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mysql.dbmysql;
import viewfxml.Studintmanger;
import viewfxml.viewfictry;
import java.sql.DriverManager;
import java.sql.*;

public class loign_sud extends absstud {


    public loign_sud(viewfictry viewfictry,Studintmanger emailmangaer, String fxmlname) {
      super(viewfictry,emailmangaer,fxmlname);
    }

    @FXML
    private TextField name1;

    @FXML
    private Button ADD;

    @FXML
    private TextField name4;

    @FXML
    private TextField name3;

    @FXML
    private TextField name2;

    @FXML
    private TextField birth;

    @FXML
    private TextField longg;

    @FXML
    private TextField weat;

    @FXML
    private TextField sex;

    @FXML
    private TextField count;

    @FXML
    private TextField count3;

    @FXML
    private TextField count2;

    @FXML
    private TextField count1;

    @FXML
    private TextField email;

    @FXML
    private TextField repot;

    @FXML
    private TextField acount;

    @FXML
    private TextField phon;

    @FXML
    private TextField unver;

    @FXML
    private TextField moring;

    @FXML
    private TextField chaptr;
    @FXML
    private TextField id;
    @FXML
    private TextField collage;

    @FXML
    private TextField avrg;
    @FXML
    private FontAwesomeIcon imgbut;

    @FXML
    private TextField rsobyear;

    @FXML
    private TextField tkhrgyear;

    @FXML
    private TextField mixx;

    @FXML
    private TextField treye;

    @FXML
    private TextField healthloc;

    @FXML
    private TextField mrghname;

    @FXML
    private TextField boaldzmr;

    @FXML
    private TextField levenghlish;

    @FXML
    private TextField hoieat;

    @FXML
    private TextField sportshad;

    @FXML
    private TextField shadat;

    @FXML
    private Button view;
    @FXML
    private Button backk;

    @FXML
    private ImageView addimg;
    @FXML
    private Button bbf;
    @FXML
    private TextField idtsl;

    @FXML
    private TextField idyear;

    @FXML
    private Button ADD2;
    Connection con=null;
    ResultSet rs =null;
    PreparedStatement pst=null;

    @FXML
    void addname(MouseEvent event) throws SQLException {
        String username="rootschool";
        String pass="1111";

        con=dbmysql.dbmysqll(username,pass);
        if (name1.getText()!=""){


        try {
            pst=con.prepareStatement("INSERT INTO `newpro` (`frstname`, `scndname`, `thirdname`, `fourname`, `birtday`, `sex`, `weat`, `long`, `count`, `count1`, `count2`, `count3`, `email`, `phon`, `acount`, `repot`, `unver`, `collage`, `chaptr`, `moring`, `avrg`, `mixx`, `tkhrgyear`, `rsobyear`, `treye`, `boaldzmr`, `mrghname`, `healthloc`, `levenghlish`, `shadat`, `sportshad`, `hoieat`,`id_stud`,`id_name`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,name1.getText());
            pst.setString(2,name2.getText());
            pst.setString(3,name3.getText());
            pst.setString(4,name4.getText());

            pst.setString(5,birth.getText());
            pst.setString(6,sex.getText());
            pst.setString(7,weat.getText());
            pst.setString(8,longg.getText());

            pst.setString(9,count.getText());
            pst.setString(10,count1.getText());
            pst.setString(11,count2.getText());
            pst.setString(12,count3.getText());

            pst.setString(13,email.getText());
            pst.setString(14,phon.getText());
            pst.setString(15,acount.getText());
            pst.setString(16,repot.getText());

            pst.setString(17,unver.getText());
            pst.setString(18,collage.getText());
            pst.setString(19,chaptr.getText());
            pst.setString(20,moring.getText());

            pst.setString(21,avrg.getText());
            pst.setString(22,mixx.getText());
            pst.setString(23,tkhrgyear.getText());
            pst.setString(24,rsobyear.getText());

            pst.setString(25,treye.getText());
            pst.setString(26,boaldzmr.getText());
            pst.setString(27,mrghname.getText());
            pst.setString(28,healthloc.getText());

            pst.setString(29,levenghlish.getText());
            pst.setString(30,shadat.getText());
            pst.setString(31,sportshad.getText());
            pst.setString(32,hoieat.getText());

            pst.setString(33,idtsl.getText());
            pst.setString(34,idyear.getText());
            pst.execute();
            System.out.println("ok add");
        } catch (SQLException throwables) {

            throwables.printStackTrace();
        }
    }}

    @FXML
    void viewname(ActionEvent event) {
        veiwvactory.showedit();
        Stage stage=(Stage)view.getScene().getWindow();
        veiwvactory.closstage(stage);
    }

    @FXML
    void backe(ActionEvent event) {

    }
    @FXML
    void Imgmous(MouseEvent event) throws SQLException {
        veiwvactory.showhome();
        Stage stage=(Stage)bbf.getScene().getWindow();
        veiwvactory.closstage(stage);
    }


}
