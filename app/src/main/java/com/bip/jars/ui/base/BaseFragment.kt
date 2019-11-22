package com.bip.jars.ui.base

import androidx.fragment.app.Fragment
import com.bip.jars.ui.callback.IFirebaseScreen
import com.bip.jars.ui.error.IDataError

abstract class BaseFragment<K> : Fragment(), IDataError, IFirebaseScreen {
    override fun onTryAgainClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onErrorShow() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onErrorHide() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}