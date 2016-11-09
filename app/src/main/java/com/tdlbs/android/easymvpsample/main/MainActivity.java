package com.tdlbs.android.easymvpsample.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tdlbs.android.easymvpsample.R;
import easymvp.annotation.ActivityView;
import easymvp.annotation.Presenter;

@ActivityView(presenter = MainPresent.class, layout = R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements MainView{

    @Presenter MainPresent mainPresent;
    @BindView(R.id.activity_main) RelativeLayout activityMain;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        if(activityMain!=null){
            Log.e("TAG","activityMain!=null");
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        if(mainPresent!=null){
            Log.e("TAG","mainPresent!=null");
            if(mainPresent.isOnViewAttachedCalled()){
                Log.e("TAG","isOnViewAttachedCalled");
            }
        }
    }

    @Override protected void onStop() {
        super.onStop();
        if(mainPresent!=null){
            Log.e("TAG","mainPresent!=null");
            if(mainPresent.isOnViewDetachedCalled()){
                Log.e("TAG","isOnViewDetachedCalled");
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(activityMain==null){
            Log.e("TAG","activityMain==null");
        }
    }
    @Override public void showErrorDialog() {

    }

    @Override public void showInformationDialog() {

    }

    @Override public void showProgressDialog() {

    }
}
