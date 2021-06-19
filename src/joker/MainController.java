package joker;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
public class MainController {

    @FXML
    private Rectangle no2;

    @FXML
    private Rectangle no1;

    @FXML
    private Rectangle no4;

    @FXML
    private Rectangle no3;

    @FXML
    private Rectangle no6;

    @FXML
    private Rectangle no5;

    @FXML
    private Rectangle no8;

    @FXML
    private Rectangle no7;

    @FXML
    private Rectangle no9;
    @FXML
    private Rectangle no10;
    @FXML
    private Rectangle no11;
    @FXML
    private Rectangle no12;
    @FXML
    private Rectangle no13;
    @FXML
    private Rectangle no14;
    @FXML
    private Rectangle no15;
    @FXML
    private Button ButtonBegin;

    @FXML
    private Label la2;

    @FXML
    private Label la1;

    @FXML
    private Label la4;

    @FXML
    private Label la3;

    @FXML
    private Label la6;

    @FXML
    private Label la5;

    @FXML
    private Label la8;

    @FXML
    private Label la7;

    @FXML
    private Label la12;

    @FXML
    private Label la9;

    @FXML
    private Label la13;

    @FXML
    private Label la10;

    @FXML
    private Label la11;

    @FXML
    private Label la14;

    @FXML
    private Label la15;
    @FXML
    private Button ButtonInput;
    @FXML
    private TextField text1;
    @FXML
    public void onButtonBegin(){
        fun.deal();
        int i=1;
        int j=1;
        no1.setFill(Paint.valueOf("red"));
        if (fun.theWay[j]==i)
        {
            no2.setFill(Paint.valueOf("red"));
            j++;
        }i++;
        if (fun.theWay[j]==i)
        {
            no3.setFill(Paint.valueOf("red"));
            j++;
        }i++;
        if (fun.theWay[j]==i)
        {
            no4.setFill(Paint.valueOf("red"));
            j++;
        }i++;
        if (fun.theWay[j]==i)
        {
            no5.setFill(Paint.valueOf("red"));
            j++;
        }i++;
        if (fun.theWay[j]==i)
        {
            no6.setFill(Paint.valueOf("red"));
            j++;
        }i++;
        if (fun.theWay[j]==i)
        {
            no7.setFill(Paint.valueOf("red"));
            j++;
        }i++;
        if (fun.theWay[j]==i)
        {
            no8.setFill(Paint.valueOf("red"));
            j++;
        }i++;
        if (fun.theWay[j]==i)
        {
            no9.setFill(Paint.valueOf("red"));
            j++;
        }i++;
        if (fun.theWay[j]==i)
        {
            no10.setFill(Paint.valueOf("red"));
            j++;
        }i++;
        if (fun.theWay[j]==i)
        {
            no11.setFill(Paint.valueOf("red"));
        }i++;
        if (fun.theWay[j]==i)
        {
            no12.setFill(Paint.valueOf("red"));
        }i++;
        if (fun.theWay[j]==i)
        {
            no13.setFill(Paint.valueOf("red"));
        }i++;
        if (fun.theWay[j]==i)
        {
            no14.setFill(Paint.valueOf("red"));
        }i++;
        if (fun.theWay[j]==i)
        {
            no15.setFill(Paint.valueOf("red"));
        }i++;
    }
    @FXML
    public void onButtonInput(){
        String list=new String(text1.getText());
        fun.create(list);
        int i=0;
        no1.setFill(Paint.valueOf("#1e90ff"));
        no2.setFill(Paint.valueOf("#1e90ff"));
        no3.setFill(Paint.valueOf("#1e90ff"));
        no4.setFill(Paint.valueOf("#1e90ff"));
        no5.setFill(Paint.valueOf("#1e90ff"));
        no6.setFill(Paint.valueOf("#1e90ff"));
        no7.setFill(Paint.valueOf("#1e90ff"));
        no8.setFill(Paint.valueOf("#1e90ff"));
        no9.setFill(Paint.valueOf("#1e90ff"));
        no10.setFill(Paint.valueOf("#1e90ff"));
        no11.setFill(Paint.valueOf("#1e90ff"));
        no12.setFill(Paint.valueOf("#1e90ff"));
        no13.setFill(Paint.valueOf("#1e90ff"));
        no14.setFill(Paint.valueOf("#1e90ff"));
        no15.setFill(Paint.valueOf("#1e90ff"));
        la1.setText(String.valueOf(fun.input[i++]));
        la2.setText(String.valueOf(fun.input[i++]));
        la3.setText(String.valueOf(fun.input[i++]));
        la4.setText(String.valueOf(fun.input[i++]));
        la5.setText(String.valueOf(fun.input[i++]));
        la6.setText(String.valueOf(fun.input[i++]));
        la7.setText(String.valueOf(fun.input[i++]));
        la8.setText(String.valueOf(fun.input[i++]));
        la9.setText(String.valueOf(fun.input[i++]));
        la10.setText(String.valueOf(fun.input[i++]));
        la11.setText(String.valueOf(fun.input[i++]));
        la12.setText(String.valueOf(fun.input[i++]));
        la13.setText(String.valueOf(fun.input[i++]));
        la14.setText(String.valueOf(fun.input[i++]));
        la15.setText(String.valueOf(fun.input[i++]));
    }
}

