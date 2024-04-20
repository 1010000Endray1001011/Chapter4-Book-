module kitis_gang.website.slovaigra {
    requires javafx.controls;
    requires javafx.fxml;


    opens kitis_gang.website.slovaigra to javafx.fxml;
    exports kitis_gang.website.slovaigra;
}