import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("launch.fxml"));
        primaryStage.setTitle("ПИЗДААААА");
        primaryStage.setScene(new Scene(root, 1200, 768));
        primaryStage.show();
    }

    @FXML
    public void click(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("launch.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}