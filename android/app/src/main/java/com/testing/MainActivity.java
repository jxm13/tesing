package com.testing;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {
Intent service = new Intent(getApplicationContext(), HeadlessTaskService.class);

getApplicationContext().startService(service);
  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "testing";
  }
}
