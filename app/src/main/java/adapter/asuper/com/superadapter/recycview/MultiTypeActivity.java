package adapter.asuper.com.superadapter.recycview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adapter.asuper.com.superadapter.R;
import adapter.asuper.com.superadapter.recycview.adapter.MultiAdapter;
import adapter.asuper.com.superadapter.recycview.bean.ChatMessage;
import xiao.free.superadapter.recycview.MultiItemTypeAdapter;

public class MultiTypeActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MultiAdapter mMultiAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycview_multi_type);

        mRecyclerView = findViewById(R.id.recyclerview);

        mMultiAdapter = new MultiAdapter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mMultiAdapter);

        mMultiAdapter.setDatas(ChatMessage.MOCK_DATAS);

        mMultiAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                Toast.makeText(MultiTypeActivity.this, "position=" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
