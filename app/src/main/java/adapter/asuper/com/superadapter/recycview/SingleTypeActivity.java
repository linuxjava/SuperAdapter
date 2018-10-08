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
import xiao.free.superadapter.recycview.CommonAdapter;
import xiao.free.superadapter.recycview.MultiItemTypeAdapter;
import xiao.free.superadapter.recycview.base.ViewHolder;
import xiao.free.superadapter.recycview.wrapper.HeaderAndFooterWrapper;

public class SingleTypeActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private CommonAdapter mCommonAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycview_single_type);

        mRecyclerView = findViewById(R.id.recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mCommonAdapter = new CommonAdapter<String>(this, R.layout.item_single_text) {
            @Override
            protected void convert(ViewHolder holder, String o, int position) {
                holder.setText(R.id.text_content, o);
            }
        };

        List<String> data = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            data.add("position " + i);
        }

        mCommonAdapter.setDatas(data);

        mCommonAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                Toast.makeText(SingleTypeActivity.this, "position=" + position, Toast.LENGTH_SHORT).show();
            }
        });

        //快捷的添加header和footer
        HeaderAndFooterWrapper<String> headerAndFooterWrapper = new HeaderAndFooterWrapper<>(mCommonAdapter);
        headerAndFooterWrapper.addHeaderView(R.layout.item_header);
        headerAndFooterWrapper.addFootView(R.layout.item_footer);

        mRecyclerView.setAdapter(headerAndFooterWrapper);


    }
}
