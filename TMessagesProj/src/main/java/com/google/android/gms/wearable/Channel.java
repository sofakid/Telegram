package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Channel
{
  public String getPath() { return "/floop"; }

  public Thing getOutputStream(GoogleApiClient api) { return new Thing(); }
  public Thing getInputStream(GoogleApiClient api) { return new Thing(); }
  public Thing close(GoogleApiClient api) { return new Thing(); }

  public static class Thing {
    byte[] bytes = {0};

    public Thing await() { return this; }
    public ByteArrayOutputStream getOutputStream() { return new ByteArrayOutputStream(); }
    public ByteArrayInputStream getInputStream() { return new ByteArrayInputStream(bytes); }
  }

}