package com.hualong.meituan.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.hualong.meituan.R;
import com.hualong.meituan.base.BaseActivity;
import com.hualong.meituan.databinding.ActivityLoginBinding;

public class LoginAcitity extends BaseActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
    }


}
