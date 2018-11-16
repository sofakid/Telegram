package com.google.android.gms.wearable;

import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.CapabilityClient;

public class Wearable
{
  public static final int API = 0;

  public static MessageClient getMessageClient(Object o) { return new MessageClient(); }
  public static CapabilityClient getCapabilityClient(Object o) { return new CapabilityClient(); }
  
}