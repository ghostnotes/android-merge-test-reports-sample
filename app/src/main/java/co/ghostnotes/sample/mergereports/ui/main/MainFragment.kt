package co.ghostnotes.sample.mergereports.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.ghostnotes.sample.mergereports.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment(), MainContract.View {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        test_button.setOnClickListener(OnTestButtonClickListener(this))

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun setText(@StringRes resId: Int) {
        setText(getString(resId))
    }

    override fun setText(text: String) {
        message_text.text = text
    }

    internal class OnTestButtonClickListener(private val view: MainContract.View): View.OnClickListener {
        override fun onClick(v: View) {
            view.setText(R.string.message_hello)
        }
    }

}
