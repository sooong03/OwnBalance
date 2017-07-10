package kr.anima.xd.s.ownbalance;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    TabDateFragment tabDateFragment;
    TabIndexFragment tabIndexFragment;
    TabShareFragment tabShareFragment;
    TabSettingFragment tabSettingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabDateFragment=new TabDateFragment(this);
        tabIndexFragment=new TabIndexFragment();
        tabShareFragment=new TabShareFragment();
        tabSettingFragment=new TabSettingFragment();

        // 초기 화면 설정 필요

        tabLayout= (TabLayout) findViewById(R.id.layout_tabs);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0: // date
                        getSupportFragmentManager().beginTransaction().replace(R.id.tabContainer, tabDateFragment).commit();
                        break;
                    case 1: // index
                        getSupportFragmentManager().beginTransaction().replace(R.id.tabContainer, tabIndexFragment).commit();
                        break;
                    case 2: // blank
                        break;
                    case 3: // share
                        getSupportFragmentManager().beginTransaction().replace(R.id.tabContainer, tabShareFragment).commit();
                        break;
                    case 4: // setting
                        getSupportFragmentManager().beginTransaction().replace(R.id.tabContainer, tabSettingFragment).commit();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
