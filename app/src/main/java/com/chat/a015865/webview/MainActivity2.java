package com.chat.a015865.webview;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class MainActivity2 extends Activity {

    // Declaring our tabs and the corresponding fragments.
    ActionBar.Tab bmwTab, fordTab, toyotaTab;
    Fragment bmwFragmentTab = new Fragment();
    Fragment toyotaFragmentTab = new Fragment();
    Fragment fordFragmentTab = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asking for the default ActionBar element that our platform supports.
        ActionBar actionBar = getActionBar();

        // Screen handling while hiding ActionBar icon.
        actionBar.setDisplayShowHomeEnabled(false);

        // Screen handling while hiding Actionbar title.
        actionBar.setDisplayShowTitleEnabled(false);

        // Creating ActionBar tabs.
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Setting custom tab icons.


        // Setting tab listeners.
        bmwTab.setTabListener((ActionBar.TabListener) new Fragment1());
        toyotaTab.setTabListener((ActionBar.TabListener) new Fragment2());
        fordTab.setTabListener((ActionBar.TabListener) new Fragment3());

        // Adding tabs to the ActionBar.
        actionBar.addTab(bmwTab);
        actionBar.addTab(toyotaTab);
        actionBar.addTab(fordTab);
    }
}