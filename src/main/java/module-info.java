module me.takvim.xtakvim {
    requires javafx.controls;
    requires javafx.fxml;
    requires jlayer;


    opens me.takvim.xtakvim to javafx.fxml;
    exports me.takvim.xtakvim;
}