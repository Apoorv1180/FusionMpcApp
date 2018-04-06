package com.example.era.fusionmdcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class WorkAreaActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_area);

    }



    public void north_pavallion_btn(View view){
        Intent intent = new Intent(WorkAreaActivity.this,NorthPavallionActivity.class);
        startActivity(intent);
    }
    public void south_pavallion_btn(View view){
        Intent intent = new Intent(WorkAreaActivity.this,SouthPavallionActivity.class);
        startActivity(intent);
    }
    public void east_gallery_btn(View view){
        Intent intent = new Intent(WorkAreaActivity.this,EastGalleryActivity.class);
        startActivity(intent);
    }
    public void west_gallery_btn(View view){
        Intent intent = new Intent(WorkAreaActivity.this,WestGalleryActivity.class);
        startActivity(intent);
    }
    public void admin_block_btn(View view){
        Intent intent = new Intent(WorkAreaActivity.this,AdminBlockActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_home_btn) {
            Intent i = new Intent(WorkAreaActivity.this,ProfileActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
