package hr.foi.air1802.sharedmodule;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;

/**
 * Interface unutar kojeg se nalaze metode potrebne za upravljanje robotom
 * koje su zatim implementirane u klasi Controls.
 * Omogućuje pozivanje metoda iz Fancy i Basic načina rada i iz modula fancymodule i app
 */
public interface IControls {

    void move(int lijeviMotor, int desniMotor);

    boolean moveForward(MotionEvent event);

    boolean moveLeft(MotionEvent event);

    boolean moveRight(MotionEvent event);

    boolean moveBackwards(MotionEvent event);

    void changeSpeed(int desniMotor, int lijeviMotor);

    String getTemperature();

    void disconnect(Activity activity);

    void insertTemperatueToDB(Context context);
}
