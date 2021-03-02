package com.hualong.meituan.ui;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.BarUtils;
import com.hualong.meituan.R;
import com.hualong.meituan.base.BaseActivity;
import com.hualong.meituan.databinding.ActivityWelcomeBinding;
import com.hualong.meituan.util.LogUtil;

public class WelcomeActivity extends BaseActivity {
    private ActivityWelcomeBinding binding;

    public class Presenter{

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BarUtils.setStatusBarVisibility(this,false);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome);

        binding.setPresenter(this);
    }

    public void login(View view){
        LogUtil.d("登录");
        ActivityUtils.startActivity(LoginAcitity.class);
    }

    public void register(View view){
        LogUtil.d("注册");
    }

}
