import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // WebView (browser area)
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();

        engine.load("https://example.com");

        // URL bar
        TextField urlField = new TextField();
        urlField.setPrefWidth(600);
        urlField.setText("https://example.com");

        // Buttons
        Button backBtn = new Button("⬅");
        Button forwardBtn = new Button("➡");
        Button reloadBtn = new Button("🔄");

        // Load when Enter is pressed
        urlField.setOnAction(e -> {
            String url = urlField.getText();

            if (!url.startsWith("http")) {
                url = "https://" + url;
            }

            engine.load(url);
        });

        // Update URL bar when page changes
        engine.locationProperty().addListener((obs, oldVal, newVal) -> {
            urlField.setText(newVal);
        });

        // History
        WebHistory history = engine.getHistory();

        backBtn.setOnAction(e -> {
            if (history.getCurrentIndex() > 0) {
                history.go(-1);
            }
        });

        forwardBtn.setOnAction(e -> {
            if (history.getCurrentIndex() < history.getEntries().size() - 1) {
                history.go(1);
            }
        });

        reloadBtn.setOnAction(e -> engine.reload());

        // Top bar layout
        HBox topBar = new HBox(5, backBtn, forwardBtn, reloadBtn, urlField);

        // Main layout
        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setCenter(webView);

        Scene scene = new Scene(root, 1200, 800);

        stage.setTitle("Januja Browser 🌐");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
