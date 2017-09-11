package xyz.bizforyou.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 데이터 준비
        initData();

        // 2. Adapter 준비


        // 3. ListView 에 Adapter 장착


    }

    private void initData() {
        mData = new ArrayList<>();
    }

}
