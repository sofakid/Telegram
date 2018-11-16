package com.google.android.gms.vision;
import android.graphics.Bitmap;

public class Frame
{
  public static final int ROTATION_90 = 0;
  public static final int ROTATION_180 = 0;
  public static final int ROTATION_270 = 0;
  public static final int ROTATION_0 = 0;

  static public class Builder {
    public Builder() {}
    public Builder setBitmap(Bitmap b) { return this; }
    public Builder setRotation(int i) { return this; }
    public Frame build() { return new Frame(); }
  }
}
