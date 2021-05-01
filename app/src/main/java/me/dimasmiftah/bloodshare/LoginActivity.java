package me.dimasmiftah.bloodshare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* Tanggal Pengerjaan : 30 April 2021
 * NIM                 : 10118087
 * Nama                : Dimas Miftahul Huda
 * Kelas               : IF-2
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView regTextView = (TextView) findViewById(R.id.registerText);
        String regText = getString(R.string.register_text).toString();

        SpannableString spannableString = new SpannableString(regText);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Log.d("LoginAct", "Clicked");
                startIntent(RegisterActivity.class);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                ds.setUnderlineText(false);
                ds.setColor(getColor(R.color.white));
                ds.setTypeface(Typeface.DEFAULT_BOLD);
            }
        };

        final int startRegPos = 22;
        final int endRegPos = 30;

        spannableString.setSpan(clickableSpan,startRegPos, endRegPos, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        regTextView.setText(spannableString);
        regTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void startIntent(Class<?> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}