package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		Scanner scan = new Scanner(System.in);
		Task16 task16 = new Task16(scan);
		task16.separation();
		task16.mul();
		
		Task21 task21 = new Task21(scan);
		task21.change();
		
		Task22 task22 = new Task22(scan);
		task22.change();
		
		Task27 task27 = new Task27(scan);
		task27.value();
		
		Task32 task32 = new Task32(scan);
		task32.add();
		
		Task35 task35 = new Task35(scan);
		task35.div();
		
		Task37 task37 = new Task37(scan);
		task37.firstTask();
		task37.secondTask();
		task37.thirdTask();
		task37.fourthTask();
		task37.fifthTask();
		task37.sixthTask();
		task37.seventhTask();
		task37.eighthTask();
		task37.ninthTask();
		
		Task38 task38 = new Task38(scan);
		task38.firstGraph();
		task38.secondGraph();
		task38.thiordGraph();
		
		Task16_1 task16_1 = new Task16_1();
		task16_1.calculate();
		
		Task18_1 task18_1 = new Task18_1(scan);
		task18_1.add();
		
		Task21_1 task21_1 = new Task21_1(scan);
		task21_1.calculate();
		
		Task27_1 task27_1 = new Task27_1(scan);
		task27_1.div();
		
		Task30_1 task30_1 = new Task30_1(scan);
		task30_1.RometoArab();
		
		Task31_1 task31_1 = new Task31_1(scan);
		task31_1.check();
		
		Task36_1 task36_1 = new Task36_1();
		task36_1.check();
		
		Task39_1 task39_1 = new Task39_1();
		task39_1.find();
		
		Task40_1 task40_1 = new Task40_1(scan);
		task40_1.find();
		System.exit(0);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
