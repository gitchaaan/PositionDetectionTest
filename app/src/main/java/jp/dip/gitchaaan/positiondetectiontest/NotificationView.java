package jp.dip.gitchaaan.positiondetectiontest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Owner on 2014/10/27.
 */
public class NotificationView extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        TextView tv = (TextView) findViewById(R.id.tv_notification);
        Bundle data = getIntent().getExtras();
        tv.setText(data.getString("content"));
    }
}
