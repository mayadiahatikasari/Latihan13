package id.ac.poliban.mi.maya.latihan13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvResult = findViewById(R.id.tvResult);
        String file = "Maya";
        SharedPreferences sp = getSharedPreferences(file, Context.MODE_PRIVATE);
        String Iname = sp.getString("Iname", "na");
        String fname = sp.getString("Iname", "na");

        tvResult.setText(String.format("%s %s", Iname, fname));
    }
}
