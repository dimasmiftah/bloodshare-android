package me.dimasmiftah.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* Tanggal Pengerjaan : 30 April 2021
 * NIM                 : 10118087
 * Nama                : Dimas Miftahul Huda
 * Kelas               : IF-2
 */

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void submitCode(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}