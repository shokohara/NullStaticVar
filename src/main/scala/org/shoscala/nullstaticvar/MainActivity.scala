package org.shoscala.nullstaticvar

import android.os.Bundle
import android.app.Activity

class MainActivity extends Activity {

  override def onCreate(bundle: Bundle): Unit = {
    super.onCreate(bundle)
    setContentView(R.layout.main)
    getFragmentManager.beginTransaction.replace(R.id.main_container, new MainFragment).commit
  }

}
