package activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jacquesmartinvaso.yora.R;

public class LoginActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedState){
        super.onCreate(savedState);

        setContentView(R.layout.activity_login);
    }

    public void doLogin(View view) {
        application.getAuth().getUser().setLoggedIn(true);
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
