package com.example.smarterme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class SignUpActivity extends AppCompatActivity {
    Button b;
    EditText etName;
    EditText etEmail;
    EditText etPass;
    RadioButton r1;
    RadioButton r2;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        b = (Button) findViewById(R.id.btn_signup);
        etName = (EditText) findViewById(R.id.input_name);
        etEmail = (EditText) findViewById(R.id.input_email);
        etPass = (EditText) findViewById(R.id.input_pass);
        r1 = (RadioButton) findViewById(R.id.female);
        r2 = (RadioButton) findViewById(R.id.male);
        rg = (RadioGroup) findViewById(R.id.radioGroup);

        final String name = etName.getText().toString();
        final String email = etEmail.getText().toString();
        final String pass = etPass.getText().toString();

        // Using inner class
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*String salute = "";
                if(r1.isChecked())
                {
                    salute = "Ms";
                }else{
                    salute = "Mr";
                }*/
                int i = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) rg.findViewById(i);

                final String name = etName.getText().toString();
                final String email = etEmail.getText().toString();
                final String pass = etPass.getText().toString();

                Toast.makeText(SignUpActivity.this, "Name: " + name + "\nEmail: " + email + "\n password: " + "\nGender: " + rb.getText().toString(), Toast.LENGTH_LONG).show();
                //System.out.println("Name: " + salute + ". " + name + "\nEmail: " + email + "\n password: " + pass);

            }
        });
    }
}
