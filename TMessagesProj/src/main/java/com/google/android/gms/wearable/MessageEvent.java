package com.google.android.gms.wearable;

public class MessageEvent
{
  byte[] bytes = { ':', ')' };

  public String getPath() { return "/bloop"; }
  public byte[] getData() { return bytes; }
}