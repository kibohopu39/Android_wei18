package com.example.android_wei18;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class F1 extends Fragment {
    private TextView lottery;
    private View view;
    private MainActivity mainActivity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view == null){
        view=inflater.inflate(R.layout.fragment_f1, container, false);
        //當進來這個F1的時候，會建出一個View，如果想要在訪問別的fragment後回頭來看，依然畫面不變的話，只要加入判斷就可
        lottery=view.findViewById(R.id.page1_lottery);

        Button test1=view.findViewById(R.id.page1_test1);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showlottery();
            }
        });

        view.findViewById(R.id.page1_test2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changtitle();
            }
        });
        }
        return view;
    }
    public void showlottery(){
        lottery.setText(""+(int)(Math.random()*49+1));
    }

    public void changtitle(){
        mainActivity.changeTitle("Brad Big Company");
    }

    @Override
    public void onAttach(@NonNull Context context) {//context==>MainActivity
        super.onAttach(context);
        mainActivity=(MainActivity)context;

    }
}
