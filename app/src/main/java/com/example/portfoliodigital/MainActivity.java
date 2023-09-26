package com.example.portfoliodigital;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.theme_splash);
        setContentView(R.layout.activity_main);

        ImageButton botaoGit = (ImageButton) findViewById(R.id.id_git);
        botaoGit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/Gerleidson")));
            }
        });

        ImageButton botaoWhatsapp = (ImageButton) findViewById(R.id.id_whatsapp);
        botaoWhatsapp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send/?phone=7192777540&text&type=phone_number&app_absent=0")));
            }
        });

        ImageButton botaoLinkedin = (ImageButton) findViewById(R.id.id_linkedin);
        botaoLinkedin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/gerleidson-bomfim/")));
            }
        });

        ImageButton botaoGmail = (ImageButton) findViewById(R.id.id_gmail);
        botaoGmail.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:gerleidson.bomfim@gmail.com")));
            }
        });

    }

    public void sobreMim(View view) {
        Intent intent1 = new Intent(getApplicationContext(), sobreMim.class);
        startActivity(intent1);
    }

    public void projetos(View view) {
        Intent intent1 = new Intent(getApplicationContext(), Projetos.class);
        startActivity(intent1);
    }

    public void Cursos(View view) {
        Intent intent1 = new Intent(getApplicationContext(), Cursos.class);
        startActivity(intent1);
    }

    public void Experiencias(View view) {
        Intent intent1 = new Intent(getApplicationContext(), Experiencias.class);
        startActivity(intent1);
    }
}