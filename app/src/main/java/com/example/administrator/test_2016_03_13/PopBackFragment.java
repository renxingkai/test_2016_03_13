package com.example.administrator.test_2016_03_13;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PopBackFragment extends Fragment {

//    private String title;

    /**
     * 默认构造方法
     */
    public PopBackFragment(){

    }

    /**
     * 传参会存在风险
     * @param title
     */
//    public PopBackFragment(String title) {
//        this.title = title;
//    }

    /**
     * Fragment标准正确的传参方法
     * @return
     */
    public static PopBackFragment getInstance(String title){

        PopBackFragment popBackFragment=new PopBackFragment();
        Bundle bundle=new Bundle();
        bundle.putString("title",title);
        popBackFragment.setArguments(bundle);
        return popBackFragment;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_pop_back,container,false);
        TextView textView= (TextView) view.findViewById(R.id.textView_text);
        textView.setText(getArguments().getString("title"));
        return view;
    }


}
