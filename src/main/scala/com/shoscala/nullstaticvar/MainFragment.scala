package com.shoscala.nullstaticvar

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view._
import org.scaloid.common._

object MainFragment {

  Log.d("NullStaticVarFragment","initalize ImageFragment object")

  var int :Int = _
}

class MainFragment extends Fragment {

  Log.d("NullStaticVarFragment","initalize ImageFragment class")

  implicit lazy val context = getActivity.getApplicationContext

  override def onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle): View = inflater.inflate(R.layout.fragment, container, false)

  override def onViewCreated(view: View, savedInstanceState: Bundle): Unit = {

    view.findViewById(R.id.initialize).onClick {
      MainFragment.int = Int.MaxValue
      toast("Initalize MainFragment.int")
    }

    view.findViewById(R.id.check_static_number).onClick{
      toast("MainFragment.int:" + MainFragment.int)
    }

    view.findViewById(R.id.launch_another_activity).onClick {
      startActivity(new Intent().setType("image/*"))
    }
  }
}
