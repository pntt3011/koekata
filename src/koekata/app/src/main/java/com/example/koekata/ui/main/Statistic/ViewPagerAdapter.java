package com.example.koekata.ui.main.Statistic;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new DailyStatistic();
            case 1:
                return new PomodoroStatistic();
            case 2:
                return new ScheduleStatistic();
            default:
                return new DailyStatistic();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
