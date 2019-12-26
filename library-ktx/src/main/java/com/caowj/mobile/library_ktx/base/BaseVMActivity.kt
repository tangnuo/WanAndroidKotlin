package com.caowj.mobile.library_ktx.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * <pre>
 *     作者：Caowj
 *     邮箱：caoweijian@kedacom.com
 *     日期：2019/12/26 15:25
 * </pre>
 */

abstract class BaseVMActivity<VM : BaseViewModel>(useBinding: Boolean = false) :
    AppCompatActivity() {
    private val _useBinding = useBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startObserve()
        if (_useBinding) setContentView(getLayoutResId())
        initView()
        initData()
    }

    open fun getLayoutResId(): Int = 0
    abstract fun initView()
    abstract fun initData()
    abstract fun startObserve()
}