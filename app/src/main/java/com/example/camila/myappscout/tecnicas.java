package com.example.camila.myappscout;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class tecnicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_nueva);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tecnicas");
        actionBar.setDisplayHomeAsUpEnabled(true);

        /**MODO TABS EN ACTIONBAR**/
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        /**CREAR TABS**/
        ActionBar.Tab tab = actionBar.newTab()
                .setText("Nudos")
                .setTabListener(new TabsListener(
                        this, "nudos", nudos.class));
        actionBar.addTab(tab);
        tab = actionBar.newTab()
                .setText("Claves")
                .setTabListener(new TabsListener(
                        this, "claves",claves.class));
        actionBar.addTab(tab);

    }
    public class TabsListener  implements ActionBar.TabListener {

        private Fragment fragment;
        private final String tag;

        public TabsListener(Activity activity, String tag, Class cls) {
            this.tag = tag;
            fragment = Fragment.instantiate(activity, cls.getName());
        }

        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.replace(android.R.id.content, fragment, tag);
        }

        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.remove(fragment);
        }

        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nueva, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
