package chanh.androidlab2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.bt_1);
        intent = new Intent(this, NextActivity.class);
        intent.putExtra("name", "kookmin");
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create intent instance
                startActivity(intent);
            }
        });

        bt2 = (Button) findViewById(R.id.bt_2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                Uri u = Uri.parse("http://www.naver.com/");
                i.setData(u);
                startActivity(i);
            }
        });
    }
}
