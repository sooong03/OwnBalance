package kr.anima.xd.s.ownbalance;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    TabDateFragment tabDateFragment;
    TabIndexFragment tabIndexFragment;
    TabShareFragment tabShareFragment;
    TabSettingFragment tabSettingFragment;


    HashMap<String, HashMap<String, PersonalWheel.Project>> lifeWheel=new HashMap<>();
    String[] category={"Spirituality", "Finances", "Business",
            "Health", "Environment", "Relationships",
            "Education", "Appearance","Emotional"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLifeWheel();

        tabDateFragment=new TabDateFragment(this);
        tabIndexFragment=new TabIndexFragment(this);
        tabShareFragment=new TabShareFragment(this);
        tabSettingFragment=new TabSettingFragment(this);

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
    } // onCreate


    void setLifeWheel(){
        // set Category
        for(String t : category){
            lifeWheel.put(t, new HashMap<String, PersonalWheel.Project>());
        }

    } //set LifeWheel



} // class Main
