package com.BuiDucThuanPhat.bdtp_cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTK,editMK;
    CheckBox check;
    Button btnDN,btnThoat;

    AlertDialog.Builder alertThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTK = findViewById(R.id.editTK);
        editMK = findViewById(R.id.editMK);
        check = findViewById(R.id.checkBox);
        btnDN = findViewById(R.id.btnDN);
        btnThoat = findViewById(R.id.btnThoat);

        alertThoat = new AlertDialog.Builder(this);

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

        alertThoat.setTitle("Thông báo");
        alertThoat.setMessage("Bạn muốn thoát không?");
        alertThoat.setNegativeButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertThoat.setPositiveButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertThoat.show();
            }
        });
    }
}
