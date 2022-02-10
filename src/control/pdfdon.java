package control;

import java.io.FileOutputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.itextpdf.text.*;

import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mysql.dbmysql;
import viewfxml.Studintmanger;
import viewfxml.viewfictry;


public class pdfdon  extends absstud implements Initializable {


    public pdfdon(viewfictry veiwvactory, Studintmanger studintmanger, String fxmlname) {
        super(veiwvactory, studintmanger, fxmlname);
    }
    public static Font font= FontFactory.getFont("C:/Windows/Fonts/arial.ttf",BaseFont.IDENTITY_H,12,Font.BOLD);
    @FXML
    private Button ok;

    @FXML
    private TextField namepdf;

    @FXML
    private ChoiceBox<String> loc;

    @FXML
    private TextField id;

    @FXML
    private TextField idd;

    String lor[]={"C","D"};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loc.getItems().addAll(lor);
    }
    @FXML
    void cretpdf(ActionEvent event) throws SQLException {
 creatpdf();
    }
    @FXML
    private Button can;
    @FXML
    void canall(ActionEvent event) throws SQLException {
        veiwvactory.showedit();
        Stage stage=(Stage)can.getScene().getWindow();
        veiwvactory.closstage(stage);
    }

     public void creatpdf() throws SQLException {
            String username="rootschool";
            String pass="1111";
            Connection con=null;

            PreparedStatement pet=null;




            Connection conn= dbmysql.dbmysqll(username,pass);
            PreparedStatement ps=conn.prepareStatement("SELECT* FROM `newpro` WHERE `id_stud`= "+id.getText()+"  AND `id_name` = "+idd.getText()+" ;" );
            ResultSet rs=ps.executeQuery();
            while (rs.next())  {
                {


                    String  name=(rs.getString("frstname"));
                    String  name2=rs.getString("scndname");
                    String  name3=(rs.getString("thirdname"));
                    String name4=(rs.getString("fourname"));

                    String  birth=(rs.getString("birtday"));
                    String  sex=(rs.getString("sex"));
                    String  weat=(rs.getString("weat"));
                    String  longg=(rs.getString("long"));

                    String  count=(rs.getString("count"));
                    String  count1=(rs.getString("count1"));
                    String  count2=(rs.getString("count2"));
                    String  count3=(rs.getString("count3"));

                    String  email=(rs.getString("email"));
                    String  phon=(rs.getString("phon"));
                    String  acount=(rs.getString("acount"));
                    String  repot=(rs.getString("repot"));

                    String  unver=(rs.getString("unver"));
                    String  collage=(rs.getString("collage"));
                    String  chaptr=(rs.getString("chaptr"));
                    String  moring=(rs.getString("moring"));

                    String   avrg=(rs.getString("avrg"));
                    String   mixx=(rs.getString("mixx"));
                    String   tkhrgyear=(rs.getString("tkhrgyear"));
                    String  rsobyear=(rs.getString("rsobyear"));

                    String  treye=(rs.getString("treye"));
                    String  boaldzmr=(rs.getString("boaldzmr"));
                    String  mrghname=(rs.getString("mrghname"));
                    String  healthloc=(rs.getString("healthloc"));

                    String  levenghlish=(rs.getString("levenghlish"));
                    String  shadat=(rs.getString("shadat"));
                    String  sportshad=(rs.getString("sportshad"));
                    String   hoieat=(rs.getString("hoieat"));



                    Document document = new Document();


                    try
                    {
                        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(loc.getValue()+":\\"+namepdf.getText()+".pdf"));

                        document.open();


                        float [] pointColumnWidths = {150F, 150F, 150F};
                        PdfPTable table = new PdfPTable(pointColumnWidths); // 3 columns.
                        table.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                        PdfPCell cell1 = new PdfPCell(new Paragraph(name,font));
                        PdfPCell cell2 = new PdfPCell(new Paragraph(name2,font));
                        PdfPCell cell3 = new PdfPCell(new Paragraph(name3,font));
                        PdfPCell cell4 = new PdfPCell(new Paragraph(name4,font));

                        PdfPCell cell5 = new PdfPCell(new Paragraph(birth));
                        PdfPCell cell6 = new PdfPCell(new Paragraph(sex));
                        PdfPCell cell7 = new PdfPCell(new Paragraph(weat));
                        PdfPCell cell8 = new PdfPCell(new Paragraph(longg));

                        PdfPCell cell9 = new PdfPCell(new Paragraph( count));
                        PdfPCell cell10 = new PdfPCell(new Paragraph(count1 ));
                        PdfPCell cell11 = new PdfPCell(new Paragraph(count2));
                        PdfPCell cell12= new PdfPCell(new Paragraph(count3));

                        PdfPCell cell13= new PdfPCell(new Paragraph( email));
                        PdfPCell cell14 = new PdfPCell(new Paragraph( phon));
                        PdfPCell cell15 = new PdfPCell(new Paragraph( acount));
                        PdfPCell cell16= new PdfPCell(new Paragraph( repot));

                        PdfPCell cell17 = new PdfPCell(new Paragraph(unver));
                        PdfPCell cell18 = new PdfPCell(new Paragraph(collage));
                        PdfPCell cell19= new PdfPCell(new Paragraph(chaptr));
                        PdfPCell cell20= new PdfPCell(new Paragraph(moring));

                        PdfPCell cell21= new PdfPCell(new Paragraph(avrg));
                        PdfPCell cell22 = new PdfPCell(new Paragraph(mixx));
                        PdfPCell cell23= new PdfPCell(new Paragraph(tkhrgyear));
                        PdfPCell cell24= new PdfPCell(new Paragraph(rsobyear));

                        PdfPCell cell25 = new PdfPCell(new Paragraph(treye));
                        PdfPCell cell26 = new PdfPCell(new Paragraph(boaldzmr));
                        PdfPCell cell27= new PdfPCell(new Paragraph(mrghname));
                        PdfPCell cell28= new PdfPCell(new Paragraph(healthloc));

                        PdfPCell cell29 = new PdfPCell(new Paragraph(levenghlish));
                        PdfPCell cell30 = new PdfPCell(new Paragraph(shadat));
                        PdfPCell cell31= new PdfPCell(new Paragraph(sportshad));
                        PdfPCell cell32= new PdfPCell(new Paragraph(hoieat));


                        table.addCell(cell1);
                        table.addCell(cell2);
                        table.addCell(cell3);
                        table.addCell(cell4);
                        table.addCell(cell5);
                        table.addCell(cell6);
                        table.addCell(cell7);
                        table.addCell(cell8);
                        table.addCell(cell9);

                        table.addCell(cell10);
                        table.addCell(cell11);
                        table.addCell(cell12);
                        table.addCell(cell13);
                        table.addCell(cell14);
                        table.addCell(cell15);
                        table.addCell(cell16);
                        table.addCell(cell17);
                        table.addCell(cell18);
                        table.addCell(cell19);
                        table.addCell(cell20);
                        table.addCell(cell21);
                        table.addCell(cell22);
                        table.addCell(cell23);
                        table.addCell(cell24);
                        table.addCell(cell25);
                        table.addCell(cell26);
                        table.addCell(cell27);
                        table.addCell(cell28);
                        table.addCell(cell29);

                        table.addCell(cell30);
                        table.addCell(cell32);
                        table.addCell(cell32);


                        document.add(table);
                        document.close();
                        writer.close();
                        System.out.print("fg");
                    } catch (Exception e)
                    {
                        e.printStackTrace();
                    }

                }




            }


}


}
