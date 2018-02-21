package ru.startandroid.lessonpref;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.widget.RadioGroup;

public class Colors extends PreferenceActivity {
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.layout.Colors);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (i){
                    case R.id.radioButton1Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                        break;
                    case R.id.radioButton2Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
                        break;
                    case R.id.radioButton3Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
                        break;
                    case R.id.radioButton4Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
                        break;
                    case R.id.radioButton5Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#A9A9A9"));
                        break;
                }
            }
        });

    }

}
