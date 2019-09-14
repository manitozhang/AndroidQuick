package com.androidwind.androidquick.demo.features.function.sharedpreferences;

import android.os.Bundle;
import android.view.View;

import com.androidwind.androidquick.demo.R;
import com.androidwind.androidquick.demo.base.BaseFragment;
import com.androidwind.androidquick.util.SpUtil;
import com.androidwind.androidquick.util.ToastUtil;
import com.androidwind.annotation.annotation.BindTag;
import com.androidwind.annotation.annotation.TagInfo;

import butterknife.OnClick;


/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@BindTag(type = TagInfo.Type.FRAGMENT, tags = {"sf", "SharedPreferences"}, description = "SharedPreferences实例")
public class SPFragment extends BaseFragment {

    private String testJsonString;

    @Override
    protected void initViewsAndEvents(Bundle savedInstanceState) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_sp;
    }

    @OnClick({R.id.btn_tools_sp_put, R.id.btn_tools_sp_get})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_tools_sp_put:
                SpUtil.setParam("test", "this is a test");
                ToastUtil.showToast("写入成功");
                break;
            case R.id.btn_tools_sp_get:
                ToastUtil.showToast((String)SpUtil.getParam("test", "default"));
                break;
        }
    }
}