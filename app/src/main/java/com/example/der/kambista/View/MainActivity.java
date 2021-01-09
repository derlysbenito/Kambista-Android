package com.example.der.kambista.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.der.kambista.Model.User;
import com.example.der.kambista.R;

import java.io.Serializable;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText emailTxt;
    EditText passwordTxt;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initViews();

        loginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginButton:
                if (validateTextFields()){
                    Intent intent = new Intent(v.getContext(), WelcomeActivity.class);


                    User user = new User();
                    user.setEmail(emailTxt.getText().toString());
                    user.setName("Derlys Benito");

                    intent.putExtra("user",  user);

                    startActivity(intent);
                } else {
                    Toast.makeText(this,"Por favor completar todos los campos",
                            Toast.LENGTH_SHORT).show();
                }

                break;

        }
    }

    private void initViews() {

        loginButton = (Button) this.findViewById(R.id.loginButton);
        emailTxt = (EditText) this.findViewById(R.id.emailTxt);
        passwordTxt = (EditText) this.findViewById(R.id.passwordTxt);

    }

    private Boolean validateTextFields(){
        if (!emailTxt.getText().toString().equals("")){
            if (!passwordTxt.getText().toString().equals("")){
                return true;
            }
        }

        return false;
    }
}
