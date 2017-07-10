package kr.anima.xd.s.ownbalance;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by alfo6-10 on 7/7/2017.
 */

public class DatePagerAdapter extends PagerAdapter {

    Context context;

    RecyclerView view_weekly;
    ContentWeeklyAdapter weeklyAdapter;
    ListView view_eventList;
    ContentEventListAdapter eventListAdapter;


    public DatePagerAdapter(Context context) {
        this.context=context;
        weeklyAdapter=new ContentWeeklyAdapter(context);
        eventListAdapter=new ContentEventListAdapter();
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
                page=LayoutInflater.from(context).inflate(R.layout.page_date_weekly, container, false);
                view_weekly= (RecyclerView) page.findViewById(R.id.view_weeklyDate);
                view_weekly.setAdapter(weeklyAdapter);
                view_eventList= (ListView) page.findViewById(R.id.list_event);
                view_eventList.setAdapter(eventListAdapter);
                break;
            case 1:
                page=LayoutInflater.from(context).inflate(R.layout.page_date_calendar, container, false);

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
