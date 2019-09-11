package com.BuiDucThuanPhat.bdtp_cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTK,editMK;
    CheckBox check;
    Button btnDN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTK = findViewById(R.id.editTK);
        editMK = findViewById(R.id.editMK);
        check = findViewById(R.id.checkBox);
        btnDN = findViewById(R.id.btnDN);

        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check.isChecked())
                {
                    Toast.makeText(getApplicationContext(),
                            "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),
                            "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
