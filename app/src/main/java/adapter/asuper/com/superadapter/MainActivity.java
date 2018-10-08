package adapter.asuper.com.superadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import adapter.asuper.com.superadapter.recycview.MultiTypeActivity;
import adapter.asuper.com.superadapter.recycview.SingleTypeActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_recyclerview_multi).setOnClickListener(this);
        findViewById(R.id.btn_recyclerview_single).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_recyclerview_multi:
                startActivity(new Intent(this, MultiTypeActivity.class));
                break;
            case R.id.btn_recyclerview_single:
                startActivity(new Intent(this, SingleTypeActivity.class));
                break;
        }
    }
}
