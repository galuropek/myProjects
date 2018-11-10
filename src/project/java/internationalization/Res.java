package project.java.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public enum Res {

    INSTANCE;

    private ResourceBundle rb;

    Res() {
        setLocale(Locale.getDefault());
    }

    private void setLocale(Locale locale) {
        rb = ResourceBundle.getBundle("project.webapp.res.lang", locale);
    }

    String get(String key) {
        return rb.getString(key);
    }
}
