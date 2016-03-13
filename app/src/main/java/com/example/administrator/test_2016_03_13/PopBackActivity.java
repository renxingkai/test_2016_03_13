package com.example.administrator.test_2016_03_13;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

public class PopBackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_back);
    }

    public void oneClick(View view){
        PopBackFragment popBackFragment=PopBackFragment.getInstance("one");
        //开启事务
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.content,popBackFragment);
        //把当前Fragment添加到当前Activity栈
        ft.addToBackStack(null);//标记参数一般是null
        ft.commit();
    }

    public void twoClick(View view){
        PopBackFragment popBackFragment=PopBackFragment.getInstance("two");
        //开启事务
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.content,popBackFragment);
        //把当前Fragment添加到当前Activity栈
        ft.addToBackStack(null);//标记参数一般是null
        ft.commit();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            //判断栈里面是否还有Fragment
            if (getFragmentManager().getBackStackEntryCount()==0){
                finish();
            }else {
                getFragmentManager().popBackStack();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
