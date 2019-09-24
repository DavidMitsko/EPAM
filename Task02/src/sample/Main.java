package sample;

import com.mitjko.array.*;
import com.mitjko.matrix.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Random;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Task12 task12 = new Task12(scan, rand);
        task12.calculateAmount();

        Task14 task14 = new Task14(scan, rand);
        task14.find();

        Task20 task20 = new Task20(scan, rand);
        task20.delete();

        Task11 task11 = new Task11(scan, rand);
        System.out.println();
        task11.show();


        Task13 task13 = new Task13(scan, rand);
        task13.create();
        task13.show();

        Task34 task34 = new Task34(scan, rand);
        task34.show();

        Task36 task36 = new Task36(scan, rand);
        task36.smoothing();
        task36.show();

        System.exit(0);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
