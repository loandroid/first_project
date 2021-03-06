package com.example.kevin_tian.kevin_ondraw1;

import android.graphics.drawable.AnimationDrawable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.kevin_tian.View.CircleIndicator;
import com.example.kevin_tian.View.CircleProgress;
import com.example.kevin_tian.View.IndicatorItem;
import com.example.kevin_tian.View.SimpleCircle;
import com.example.kevin_tian.View.TextScrollView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextScrollView recyclerView;
    CircleIndicator progress;
    TabLayout tableLayout;
    ImageView animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation = (ImageView) findViewById(R.id.bb);
        AnimationDrawable drawable = (AnimationDrawable) animation.getDrawable();
        drawable.start();

        tableLayout= (TabLayout) findViewById(R.id.recyclerview);
        tableLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tableLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tableLayout.addTab(tableLayout.newTab().setText("keming"));
        tableLayout.addTab(tableLayout.newTab().setText("tian"));
        tableLayout.addTab(tableLayout.newTab().setText("zhujia"));
        tableLayout.addTab(tableLayout.newTab().setText("tengteng"));
        tableLayout.addTab(tableLayout.newTab().setText("zhu"));
        tableLayout.addTab(tableLayout.newTab().setText("tengteng"));
//        for (int i=0;i<9;i++){
//            recyclerView.addItem("克明"+i);
//        }
              //  recyclerView.setPercent(100);
        //progress = (CircleIndicator) findViewById(R.id.ci_1);

       // testProgress();
    }

    /*private void testProgress() {

        int mCircleYellow = getResources().getColor(R.color.circle_yellow);
        int mCircleGreen = getResources().getColor(R.color.circle_green);
        int mCircleRed = getResources().getColor(R.color.circle_red);

        List<IndicatorItem> dividerIndicator = new ArrayList<>();
        IndicatorItem item1 = new IndicatorItem();
        item1.start = 5;
        item1.end = 13;
        item1.value = "过低";
        item1.color = mCircleYellow;
        dividerIndicator.add(item1);

        IndicatorItem item2 = new IndicatorItem();
        item2.start = 13;
        item2.end = 20;
        item2.value = "正常";
        item2.color = mCircleGreen;
        dividerIndicator.add(item2);

        IndicatorItem item3 = new IndicatorItem();
        item3.start = 20;
        item3.end = 35;
        item3.value = "过高";
        item3.color = mCircleYellow;
        dividerIndicator.add(item3);

        IndicatorItem item4 = new IndicatorItem();
        item4.start = 35;
        item4.end = 60;
        item4.value = "超级高";
        item4.color = mCircleRed;
        dividerIndicator.add(item4);

        String title = "体脂率";
        String unit = "％";
        float indicator = 19;
        progress.setIndicatorValue(dividerIndicator, indicator);
        progress.setContentColor(mCircleRed, mCircleRed);
        String alert = null;
        for (IndicatorItem item : dividerIndicator){
            if (indicator>item.start&&indicator<item.end){
                alert = item.value;
            }

        }
        progress.setContent(title, indicator+"", unit, alert);
    }*/
}
