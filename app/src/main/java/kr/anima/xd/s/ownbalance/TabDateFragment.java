package kr.anima.xd.s.ownbalance;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabDateFragment extends Fragment {

    Context context;

    ViewPager pager;
    FloatingActionButton fab;
    DatePagerAdapter adapter;
//
//    public TabDateFragment(Context context) {
//        this.context=context;
//        adapter=new DatePagerAdapter();
//    }

    public TabDateFragment() {
    }

    public TabDateFragment(Context context) {
        this.context=context;
        adapter=new DatePagerAdapter(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tabDateView=inflater.inflate(R.layout.fragment_tab_date, container, false);


        fab= (FloatingActionButton) tabDateView.findViewById(R.id.fab);
        pager= (ViewPager) tabDateView.findViewById(R.id.view_pager);
        pager.setAdapter(adapter);

        return tabDateView;
    }



}
