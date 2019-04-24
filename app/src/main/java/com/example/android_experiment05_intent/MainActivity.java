package com.example.android_experiment05_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.net.URL;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private WebView webview;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = findViewById(R.id.bu_load_web);
        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                editText=findViewById(R.id.edit_url);
                intent.setAction("android.intent.action.VIEW");
                String url=editText.getText().toString();
                Uri uri=Uri.parse(url);
                //intent.putExtra("address",url);
                intent.setData(uri);
                Intent choose = Intent.createChooser(intent,"a");
                startActivity(choose);
                //startActivity(intent);

            }
        });
    }

}
