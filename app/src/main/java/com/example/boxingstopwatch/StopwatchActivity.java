package com.example.boxingstopwatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Locale;

public class StopwatchActivity extends AppCompatActivity implements WorkoutListFragment.Listener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);





        WorkoutDetailFragment workoutDetailFragment = new WorkoutDetailFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.workout_detail, workoutDetailFragment, workoutDetailFragment.getTag())
                .commit();
    }

    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int)id);
            startActivity(intent);


    }
}

