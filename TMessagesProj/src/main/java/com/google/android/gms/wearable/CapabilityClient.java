package com.google.android.gms.wearable;

import com.google.android.gms.tasks.OnCompleteListener;

public class CapabilityClient
{
  public static final int FILTER_REACHABLE = 0;

  public static class Thing {
    public void addOnCompleteListener( OnCompleteListener<CapabilityInfo> f) {}
  }
  public Thing getCapability(String s, int i) { return new Thing(); }
}