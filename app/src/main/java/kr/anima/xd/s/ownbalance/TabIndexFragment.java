package kr.anima.xd.s.ownbalance;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabIndexFragment extends Fragment {

    ViewPager pager;
    TabLayout tabLayout;

    public TabIndexFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tabIndexView=inflater.inflate(R.layout.fragment_tab_index, container, false);
        tabLayout= (TabLayout) tabIndexView.findViewById(R.id.layout_tab_index);
        pager= (ViewPager) tabIndexView.findViewById(R.id.view_pager);

        tabLayout.setupWithViewPager(pager);

        return tabIndexView;
    }

}
