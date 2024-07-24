package convert;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Binary_FX extends Application {
	Font titleFont = new Font("Stencil",25);
	Font txtFont = new Font("Lucida Bright",17);

	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage mainStage) throws Exception {
		// TODO Auto-generated method stub
		Pane p1 = new Pane();
		Scene t = new Scene(p1,350,150);
		t.setRoot(openPage(t));
		mainStage.setScene(t);
		mainStage.show();
		mainStage.setTitle("Binary Translator");
	}
	
	public Pane openPage(Scene t) {
		Label optionLbl = new Label("Please choose an option");
		optionLbl.setFont(titleFont);
		optionLbl.setTranslateX(3);
		
		Line line = new Line();
		line.setStartX(0); 
		line.setEndX(400); 
		line.setStartY(30);
		line.setEndY(30);
		line.setSmooth(true);
		line.setStroke(Color.RED);
		line.setStrokeWidth(5);
		
		Label opt1Lbl = new Label("1)Decimal");
		opt1Lbl.setFont(txtFont);
		opt1Lbl.setTranslateX(3);
		opt1Lbl.setTranslateY(35);
		
		Label opt2 = new Label("2)Binary");
		opt2.setFont(txtFont);
		opt2.setTranslateX(3);
		opt2.setTranslateY(56);
		
		ChoiceBox<String> cb1 = new ChoiceBox<String>();
		cb1.getItems().add("1");
		cb1.getItems().add("2");
		cb1.setTranslateX(3);
		cb1.setTranslateY(82);
		
		Text errorMsg = new Text("Please choose a valid option");
		errorMsg.setTranslateX(3);
		errorMsg.setTranslateY(120);
		errorMsg.setVisible(false);
		
		Button nxtBtn = new Button("Next");
		nxtBtn.setTranslateX(305);
		nxtBtn.setTranslateY(120);
		
		try {
		nxtBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				if(cb1.getValue().matches("1")) {
					t.setRoot(deciPage(t));
				}else if(cb1.getValue().matches("2")) {
					t.setRoot(binPage(t));
				}else if(cb1.getValue() == null){
					errorMsg.setVisible(true);
				}
			}
		});
		}catch (Exception e) {
			errorMsg.setVisible(true);
		}
		
		Pane openPage = new Pane();
		openPage.getChildren().addAll(optionLbl,opt1Lbl,opt2,line,cb1,nxtBtn,errorMsg);
		return openPage;
	}
	
	
	public Pane deciPage(Scene t) {
		t.getWindow().setHeight(280);
		
		Label optionLbl = new Label("Please choose an option");
		optionLbl.setFont(titleFont);
		optionLbl.setTranslateX(3);
		
		Line line = new Line();
		line.setStartX(0); 
		line.setEndX(400); 
		line.setStartY(30);
		line.setEndY(30);
		line.setSmooth(true);
		line.setStroke(Color.RED);
		line.setStrokeWidth(5);
		
		Label deciopt1Lbl = new Label("1)Decimal to Binary");
		deciopt1Lbl.setFont(txtFont);
		deciopt1Lbl.setTranslateX(3);
		deciopt1Lbl.setTranslateY(35);
		
		Label deciopt2Lbl = new Label("2)Decimal to Hexadecimal");
		deciopt2Lbl.setFont(txtFont);
		deciopt2Lbl.setTranslateX(3);
		deciopt2Lbl.setTranslateY(56);
		
		Label deciopt3Lbl = new Label("3)Decimal to Octal");
		deciopt3Lbl.setFont(txtFont);
		deciopt3Lbl.setTranslateX(3);
		deciopt3Lbl.setTranslateY(77);
		
		ChoiceBox<String> deciCB = new ChoiceBox<String>();
		deciCB.getItems().add("1");
		deciCB.getItems().add("2");
		deciCB.getItems().add("3");
		deciCB.setTranslateX(3);
		deciCB.setTranslateY(98);
		
		Button backBtn = new Button("Back");
		backBtn.setTranslateX(3);
		backBtn.setTranslateY(213);
		
		backBtn.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				t.setRoot(openPage(t));
			}
		});
		
		Button nxtBtn = new Button("Next");
		nxtBtn.setTranslateX(305);
		nxtBtn.setTranslateY(213);
		
		Pane deciPane = new Pane();
		deciPane.getChildren().addAll(optionLbl,line,deciopt1Lbl,deciopt2Lbl,deciopt3Lbl,deciCB,backBtn,nxtBtn);
		return deciPane;
	}
	
	public Pane binPage(Scene t) {
		Label optionLbl = new Label("Please choose an option");
		optionLbl.setFont(titleFont);
		optionLbl.setTranslateX(3);
		
		Line line = new Line();
		line.setStartX(0); 
		line.setEndX(400); 
		line.setStartY(30);
		line.setEndY(30);
		line.setSmooth(true);
		line.setStroke(Color.RED);
		line.setStrokeWidth(5);
		
		Pane binPane = new Pane();
		binPane.getChildren().addAll(optionLbl,line);
		return binPane;
	}

}
