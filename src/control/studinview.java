package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import mysql.dbmysql;
import mysql.users;
import viewfxml.Studintmanger;
import viewfxml.viewfictry;
import control.eidet.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 ;import static control.eidet.id_delt;

public class studinview<i> extends absstud {

    public studinview(viewfictry veiwvactory, Studintmanger studintmanger, String fxmlname) throws SQLException {
        super(veiwvactory, studintmanger, fxmlname);
    }
    @FXML
    private TextField name1;

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
    private TextField collage;

    @FXML
    private TextField avrg;

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
    private Button ubdute;
    @FXML
    private TextField idde;

    @FXML
    private TextField idd;

    @FXML
    private ImageView imgbut;
    @FXML
    void extviwe(MouseEvent event) {

    } @FXML
    private Button vir;


    @FXML
    void imgmous(MouseEvent event) {

    }
    @FXML
    private TextField name;

    @FXML
    private Button ubd;
    @FXML
    private Button rjrba;
    @FXML
    private Button with;


    void  eidet()throws SQLException {
        notrue();
    String username="rootschool";


    String pass="1111";
    Connection conn= dbmysql.dbmysqll(username,pass);
    PreparedStatement ps=conn.prepareStatement("SELECT * FROM `newpro`  WHERE `newpro`.`id_stud` = "+idd.getText()+"  AND `newpro`.`id_name` = " +idde.getText() );
    ResultSet rs=ps.executeQuery();
    while (rs.next())  {
        {
            name.setText(rs.getString("frstname"));
            name2.setText(rs.getString("scndname"));
            name3.setText(rs.getString("thirdname"));
            name4.setText(rs.getString("fourname"));

            birth.setText(rs.getString("birtday"));
            sex.setText(rs.getString("sex"));
            weat.setText(rs.getString("weat"));
            longg.setText(rs.getString("long"));

            count.setText(rs.getString("count"));
            count1.setText(rs.getString("count1"));
            count2.setText(rs.getString("count2"));
            count3.setText(rs.getString("count3"));

            email.setText(rs.getString("email"));
            phon.setText(rs.getString("phon"));
            acount.setText(rs.getString("acount"));
            repot.setText(rs.getString("repot"));

            unver.setText(rs.getString("unver"));
            collage.setText(rs.getString("collage"));
            chaptr.setText(rs.getString("chaptr"));
            moring.setText(rs.getString("moring"));

            avrg.setText(rs.getString("avrg"));
            mixx.setText(rs.getString("mixx"));
            tkhrgyear.setText(rs.getString("tkhrgyear"));
            rsobyear.setText(rs.getString("rsobyear"));

            treye.setText(rs.getString("treye"));
            boaldzmr.setText(rs.getString("boaldzmr"));
            mrghname.setText(rs.getString("mrghname"));
            healthloc.setText(rs.getString("healthloc"));

            levenghlish.setText(rs.getString("levenghlish"));
            shadat.setText(rs.getString("shadat"));
            sportshad.setText(rs.getString("sportshad"));
            hoieat.setText(rs.getString("hoieat"));
        }


    }
}
@FXML
    void backet(MouseEvent event) {

            veiwvactory.showedit();
            Stage stage=(Stage)imgbut.getScene().getWindow();
            veiwvactory.closstage(stage);

    }
    void  notrue(){
        name.setDisable(false);
        name2.setDisable(false);
        name3.setDisable(false);
        name4.setDisable(false);
        birth.setDisable(false);
        sex.setDisable(false);
        weat.setDisable(false);
        longg.setDisable(false);
        count.setDisable(false);
        count1.setDisable(false);
        count2.setDisable(false);
        count3.setDisable(false);

        email.setDisable(false);
        phon.setDisable(false);
        acount.setDisable(false);
        repot.setDisable(false);

        unver.setDisable(false);
        collage.setDisable(false);
        chaptr.setDisable(false);
        moring.setDisable(false);

        avrg.setDisable(false);
        mixx.setDisable(false);
        tkhrgyear.setDisable(false);
        rsobyear.setDisable(false);

        treye.setDisable(false);
        boaldzmr.setDisable(false);
        mrghname.setDisable(false);
        healthloc.setDisable(false);

        levenghlish.setDisable(false);
        shadat.setDisable(false);
        sportshad.setDisable(false);
        hoieat.setDisable(false);
    }
    @FXML
    void wire(ActionEvent event) throws SQLException {
eidet();
        name.setDisable(true);
        name2.setDisable(true);
        name3.setDisable(true);
        name4.setDisable(true);
        birth.setDisable(true);
        sex.setDisable(true);
        weat.setDisable(true);
        longg.setDisable(true);
        count.setDisable(true);
        count1.setDisable(true);
        count2.setDisable(true);
        count3.setDisable(true);

        email.setDisable(true);
        phon.setDisable(true);
        acount.setDisable(true);
        repot.setDisable(true);

        unver.setDisable(true);
        collage.setDisable(true);
        chaptr.setDisable(true);
        moring.setDisable(true);

        avrg.setDisable(true);
        mixx.setDisable(true);
        tkhrgyear.setDisable(true);
        rsobyear.setDisable(true);

        treye.setDisable(true);
        boaldzmr.setDisable(true);
        mrghname.setDisable(true);
        healthloc.setDisable(true);

        levenghlish.setDisable(true);
        shadat.setDisable(true);
        sportshad.setDisable(true);
        hoieat.setDisable(true);
    }

    @FXML
    void ubdate(ActionEvent event) throws SQLException {
        String username="rootschool";

        String pass="1111";
        Connection conn= dbmysql.dbmysqll(username,pass);
        PreparedStatement pst=conn.prepareStatement("UPDATE `newpro` SET  `frstname` = ?, `scndname` = ?,`thirdname` = ?, `fourname` = ?," +
                " `birtday` =?, `sex` = ?, `weat` =?, `long` = ?," +
                " `count` = ?, `count1` =?, `count2` =?, `count3` = ?, `email` = ?, `phon` = ?, `acount` = ?, `repot` = ? , " +
                " `unver` =? ,`collage` =?, `chaptr` =?, `moring` =? ,`avrg` = ?, `mixx` =?, `tkhrgyear` = ?, `rsobyear` = ?," +
                " `treye` =?, `boaldzmr` =?, `mrghname` = ?, `healthloc` = ?, `levenghlish` =?, `shadat` = ?, `sportshad` = ?, `hoieat` = ?" +

                " WHERE `newpro`.`id_stud` = "+idd.getText()+"  AND `newpro`.`id_name` = " +idde.getText());

        pst.setString(1,name.getText());
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

        pst.executeUpdate();
        System.out.println("ok add");


    }  @FXML
    void with(ActionEvent event) throws SQLException {
        eidet();
    }

    @FXML
    void backhome(MouseEvent event) throws SQLException {
        veiwvactory.showhome();
        Stage stage=(Stage)rjrba.getScene().getWindow();
        veiwvactory.closstage(stage);
    }

}
