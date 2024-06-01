package fr.insa.bekir.projet_dinfo.gui;

module fr.insa.bekir.projet_dinfo {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.insa.bekir.projet_dinfo to javafx.fxml;
    exports fr.insa.bekir.projet_dinfo;
}

import *;
