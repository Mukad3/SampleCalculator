package com.sample.foo.samplecalculator

import android.app.Activity
import android.os.Bundle

/**
 * Created by darcy on 4/4/17.
 */
class OtherActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
  }

  override def onRestart(): Unit = super.onRestart()

  override def onContentChanged(): Unit = super.onContentChanged()
}
