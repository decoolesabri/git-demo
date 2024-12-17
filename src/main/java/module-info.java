module com.adsabri.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.adsabri.gitdemo to javafx.fxml;
    exports com.adsabri.gitdemo;
}