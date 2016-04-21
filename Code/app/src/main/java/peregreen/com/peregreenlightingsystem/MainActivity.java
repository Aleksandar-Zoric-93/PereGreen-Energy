package peregreen.com.peregreenlightingsystem;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    ViewPager pager;
    PagerTabStrip tab_strp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adapter to support swiping tabs back and forth
        SwipeTabAdapter manager = new SwipeTabAdapter(getSupportFragmentManager());
        pager = (ViewPager) findViewById(R.id.pager);

        pager.setAdapter(manager);
        tab_strp = (PagerTabStrip) findViewById(R.id.tab_strip);
        tab_strp.setTextColor(Color.WHITE);



    }




 /* This method that is called when the user clicks on the 'Add Device' option, seen on option_tab.xml
    It just opens a new activity and changes the layout to match it*/
    public void changeLayoutForAddDeviceOption(View view){
        Button button = (Button) findViewById(R.id.addNewDeviceBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Choose the layout where the buttons is located
                setContentView(R.layout.options_tab);
                Intent intent = new Intent(MainActivity.this, AddDeviceActivity.class);
                startActivity(intent);

            }
        });
    }






   /*Again this method is called when the user clicks on the 'Add Room' option, seen on option_tab.xml
     It again, opens a new activity and changes the layout to match it*/
    public void changeLayoutForAddRoomOption(View view)
    {
        Button button = (Button) findViewById(R.id.addNewRoomBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Choose the layout where the buttons is located
                setContentView(R.layout.options_tab);
                Intent intent = new Intent(MainActivity.this, AddRoomActivity.class);
                startActivity(intent);

            }
        });

    }



  /*And finally for the last option in the option_tab.xml, this method is called when the 'Help' option is clicked.
    It calls that activity and perform any function contained in the HelpActivity.java, as the other two methods above do too,
    Except they call the relevant activity.*/
    public void changeLayoutForHelpOption(View view)
    {
        Button button = (Button) findViewById(R.id.helpBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Choose the layout where the buttons is located
                setContentView(R.layout.options_tab);
                Intent intent = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intent);

            }
        });

    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.share) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }









}