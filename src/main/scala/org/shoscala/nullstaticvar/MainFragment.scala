package org.shoscala.nullstaticvar

import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view._
import org.scaloid.common._

object MainFragment {

  Log.d("NullStaticVarFragment","initalize ImageFragment object")

  var text :String = _
}

class MainFragment extends Fragment {

  Log.d("NullStaticVarFragment","initalize ImageFragment class")

  implicit lazy val context = getActivity.getApplicationContext

  override def onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle): View = inflater.inflate(R.layout.fragment, container, false)

  override def onViewCreated(view: View, savedInstanceState: Bundle): Unit = {

    view.findViewById(R.id.initialize).onClick {
      MainFragment.text = "Hello"
      toast("Initalize MainFragment.text")
    }

    view.findViewById(R.id.check_static_number).onClick{
      toast("MainFragment.text:" + MainFragment.text)
    }
  }
}
