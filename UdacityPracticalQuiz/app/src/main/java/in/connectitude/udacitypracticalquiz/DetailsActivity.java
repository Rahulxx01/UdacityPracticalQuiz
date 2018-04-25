package in.connectitude.udacitypracticalquiz;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView Name, Email, description;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Name = findViewById(R.id.tv_name);
        Email = findViewById(R.id.tv_email);
        description = findViewById(R.id.tv_description);

        getDataFromSharedPreference();


    }


    private void getDataFromSharedPreference() {
        preferences = PreferenceManager.getDefaultSharedPreferences(DetailsActivity.this);
        String name = preferences.getString("name", "Rahul");
        String email = preferences.getString("email", "rahul@gmail.com");
        String des = preferences.getString("about", "Description");

        Name.setText(name);
        Email.setText(email);
        description.setText(des);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return false;
    }

}
