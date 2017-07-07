package kr.anima.xd.s.ownbalance;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by alfo6-10 on 7/7/2017.
 */

public class DatePagerAdapter extends PagerAdapter {

    LayoutInflater inflater;

    public DatePagerAdapter(LayoutInflater inflater) {
        this.inflater=inflater;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View page=null;
        switch (position){
            case 0:
                page=inflater.inflate(R.layout.page_date_weekly, container, false);
                break;
            case 1:
                page=inflater.inflate(R.layout.page_date_calendar, container, false);
                break;
        }
        container.addView(page);

        return page;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }


}
