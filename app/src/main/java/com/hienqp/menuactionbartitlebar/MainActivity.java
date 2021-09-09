package com.hienqp.menuactionbartitlebar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_demo, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_setting:
                Toast.makeText(MainActivity.this, "Bạn chọn setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_share:
                Toast.makeText(MainActivity.this, "Bạn chọn share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_search:
                Toast.makeText(MainActivity.this, "Bạn chọn search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_contact_email:
                Toast.makeText(MainActivity.this, "Bạn chọn email", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_contact_phone_number:
                Toast.makeText(MainActivity.this, "Bạn chọn phone number", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}