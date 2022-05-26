module com.example.page1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.page1 to javafx.fxml;
    exports com.example.page1;
}