package com.geektech.homework31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private EditText userName, password;
    private Button btnGo;
    private ImageView imageCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initListener();
        Glide.with(this).load("https://i.pinimg.com/474x/23/ab/a6/23aba60b66ef08174bb7455c4a8a2d2f.jpg").into(imageCar);


    }

    private void initListener() {
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userName.getText().toString().isEmpty()){
                    userName.setError("Это поле не должно быть пустым");
                }else if (password.toString().isEmpty()){
                    password.setError("Это поле не должно быть пустым");
                }else{
                    Toast.makeText(MainActivity.this, "Успешно", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void init(){
        userName = findViewById(R.id.et_user_name);
        password = findViewById(R.id.et_password);
        btnGo = findViewById(R.id.btn_go);
        imageCar = findViewById(R.id.image_car);
    }
}