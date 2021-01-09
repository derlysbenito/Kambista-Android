package com.example.der.kambista.View;

import android.os.Bundle;
import android.widget.TextView;

import com.example.der.kambista.Model.User;
import com.example.der.kambista.R;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView emailTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);

        initViews();

        Bundle bundle = getIntent().getExtras();
        User user = (User) bundle.getSerializable("user");

        this.emailTxt.setText(user.getEmail());
    }

    private void initViews(){
        emailTxt = (TextView)this.findViewById(R.id.emailTxt);
    }
}
