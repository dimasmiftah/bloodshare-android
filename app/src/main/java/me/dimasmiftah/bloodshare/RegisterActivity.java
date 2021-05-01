package me.dimasmiftah.bloodshare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/* Tanggal Pengerjaan : 30 April 2021
 * NIM                 : 10118087
 * Nama                : Dimas Miftahul Huda
 * Kelas               : IF-2
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackground(ContextCompat.getDrawable(this, R.drawable.ic_header));

        setSupportActionBar(toolbar);

        setSpinner((Spinner) findViewById(R.id.fieldBloodType), R.array.blood_type);
        setSpinner((Spinner) findViewById(R.id.fieldReshus), R.array.reshus);
        setSpinner((Spinner) findViewById(R.id.fieldJob), R.array.jobs);
    }

    public void register(View view) {
        Intent intent = new Intent(this, AlmostActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void setSpinner(Spinner spinner, int resource) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                resource, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}