package edu.tjrac.swant.baselib.common.base

import android.annotation.SuppressLint
import android.os.Bundle

/**
 * Created by wpc on 2018-09-03.
 */

abstract class BaseH5Activity< T : H5InterfaceBean> : BaseWebViewActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("JavascriptInterface")
    override fun initView() {
        super.initView()
        webView.addJavascriptInterface(getH5Interface(), getH5Interface().toString())
    }

    abstract fun getH5Interface(): T
}