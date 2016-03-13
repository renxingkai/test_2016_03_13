package com.example.administrator.test_2016_03_13;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    ContentFragment contentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addContentLayout();
    }

    /**
     * 通过代码添加Fragment
     */
    private void addContentLayout() {
        FragmentManager fragmentManager = getFragmentManager();
        //开起一个事务
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //添加Fragment
        contentFragment = new ContentFragment();
        fragmentTransaction.add(R.layout.content, contentFragment);
//        fragmentTransaction.remove();//删除
//        fragmentTransaction.replace();//替换
        //提交事务
        fragmentTransaction.commit();
    }


}
