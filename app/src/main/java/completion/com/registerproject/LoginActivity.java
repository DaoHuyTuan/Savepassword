package completion.com.registerproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Win 8.1 VS8 X64 on 3/21/2017.
 */
public class LoginActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView tvView = (TextView)findViewById(R.id.tvWelcome);
    }
}
