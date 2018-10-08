package co.ghostnotes.sample.mergereports.ui.main

import android.support.annotation.StringRes

internal interface MainContract {

    interface View {

        fun setText(@StringRes resId: Int)

        fun setText(text: String)

    }

}