package ua.labs.lab_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    TextView  textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        EditText et = findViewById(R.id.et);

        Button button = findViewById(R.id.btnChange2);
        button.setOnClickListener(v -> {
            String text = et.getText().toString();

            Intent intent = new Intent();

            intent.putExtra("result",text);

            setResult(RESULT_OK,intent);

            finish();
        });

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();

        setResult(RESULT_CANCELED);

    }


}
