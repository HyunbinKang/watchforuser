package kc.ac.kpu.wear

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.support.wearable.view.WatchViewStub
import android.view.View
import android.widget.TextView

class MainActivity : WearableActivity() {

    private var mTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stub =
            findViewById<View>(R.id.watch_view_stub) as WatchViewStub
        stub.setOnLayoutInflatedListener { stub ->
            mTextView = stub.findViewById<View>(R.id.text) as TextView
        }
    }
}