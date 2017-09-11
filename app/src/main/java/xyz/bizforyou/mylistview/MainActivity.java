package xyz.bizforyou.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mData;
    private ArrayAdapter<String> mAdapter; // Adapter 준비
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 데이터 준비
        initData();

        // 2. Adapter 준비
        initAdapter();

        // 3. ListView 에 Adapter 장착
        initListView();

    }
    // ListView 에 adapter 설정
    private void initListView() {
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);
    }

    private void initAdapter() {
        mAdapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                mData);
    }

    private void initData() {
        mData = new ArrayList<String>();
        // 임의의 데이터 100개 추가
        for(int i = 1; i <= 100; i++) {
            mData.add("Item " + i);
        }
    }



}
