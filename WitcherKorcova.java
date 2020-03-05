package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene a = new Scene(root,720, 405);
       a.setFill(Color.BLACK);
        primaryStage.setTitle("Cvičenie 1");
        primaryStage.setScene(a);
        primaryStage.show();

        Polyline c= new Polyline(130,190,144,175,100,175,144,225,100,225,113,210);
        c.setStroke(Color.PURPLE);
        c.setStrokeWidth(4);

        Polyline b = new Polyline(245,190,265,190,270,175,215,175,245,225,254,207);
        b.setStroke(Color.YELLOW);
        b.setStrokeWidth(4);

        Polyline e = new Polyline(365,175,335,225,395,225,375,195);
        e.setStroke(Color.RED);
        e.setStrokeWidth(4);

        Polyline f = new Polyline(510,175,460,175,485,225,505,190);
        f.setStroke(Color.LIMEGREEN);
        f.setStrokeWidth(4);

        Polyline g = new Polyline(598,190,608,175,640,225,580,225,590,205,610,205);
        g.setStroke(Color.TURQUOISE);
        g.setStrokeWidth(4);


    root.getChildren().addAll(b,c,e,f,g);
    }



    public static void main(String[] args) {
        launch(args);
    }
}
