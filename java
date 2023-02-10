package com.example.a416_intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class SecondActivityjava extends AppCompatActivity {
TextView myName;
String nameFromFirstActivity="";
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_second_activityjava);
 myName = findViewById(R.id.myText);
 nameFromFirstActivity = getIntent().getStringExtra("name");
 myName.setText(nameFromFirstActivity);
 }
}
