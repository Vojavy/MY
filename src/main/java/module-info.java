module com.example.mydosje {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.vojavy.mydosje to javafx.fxml;
    exports com.vojavy.mydosje;
    exports com.vojavy.mydosje.Form;
    opens com.vojavy.mydosje.Form to javafx.fxml;
}