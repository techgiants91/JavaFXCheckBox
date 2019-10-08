
import java.util.LinkedList;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXCheckBox extends Application {

    private LinkedList<Car> cars = new LinkedList<Car>();

    @Override
    public void start(Stage primaryStage) {

        // Fruits CheckBox
        CheckBox apple = new CheckBox("Apple");
        CheckBox banana = new CheckBox("Banana");
        CheckBox orange = new CheckBox("Orange");

        HBox box = new HBox();

        // add all checkbox to horizontal box 
        box.getChildren().addAll(apple, banana, orange);
        box.setSpacing(5);

        Button submit = new Button("Submit");
        submit.setOnMouseClicked((MouseEvent event) -> {
            if (apple.isSelected()) {
                System.out.println("Apple is selected");
            } else {
                System.out.println("Apple is not selected");
            }
        });

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(30);
        root.setVgap(10);

        // Adding all items to root GridPane
        root.addRow(0, box);
        root.addRow(2, submit);
        
        // Add GridPane to Scene
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX CheckBox Example");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
