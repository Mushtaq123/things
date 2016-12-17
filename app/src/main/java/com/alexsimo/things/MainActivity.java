package com.alexsimo.things;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class MainActivity extends Activity {

  private static final String TAG = MainActivity.class.getSimpleName();

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d(TAG, "Hello Android Things!");
  }
}
