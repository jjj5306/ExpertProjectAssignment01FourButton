package assignment.fourbutton;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
            startActivity(intent);
        });
        button1.setBackgroundColor(Color.WHITE);
        button1.setTextColor(Color.BLACK);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
            startActivity(intent2);
        });
        button2.setBackgroundColor(Color.RED);
        button2.setTextColor(Color.BLACK);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
            startActivity(intent3);
        });
        button3.setBackgroundColor(Color.YELLOW);
        button3.setTextColor(Color.BLACK);

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view -> finish());
        button4.setBackgroundColor(Color.BLUE);
        button4.setTextColor(Color.BLACK);
    }
}