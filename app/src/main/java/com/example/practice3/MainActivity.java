 package com.example.practice3;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button signbtn = findViewById(R.id.signbtn);
         signbtn.setOnClickListener(v ->
             showCustomDialog()
         );
    }
    private void showCustomDialog(){
        Dialog dialog = new Dialog(this);

        View dialogview = LayoutInflater.from(this).inflate(R.layout.activity_custom_dialog,null);
        dialog.setContentView(dialogview);

        TextView dialogTittle = dialog.findViewById(R.id.dialogTittle);
        EditText dialogInput  = dialog.findViewById(R.id.dialogInput);
        Button dialogButton = dialog.findViewById(R.id.dialogButton);

        dialogButton.setOnClickListener(v -> {
            String intputText = dialogInput.getText().toString();
            dialogTittle.setText("hello," + intputText);
            dialog.dismiss();
        });
    }
}

