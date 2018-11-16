package com.google.android.gms.vision.face;

import android.graphics.PointF;

public class Landmark
{
  public static final int LEFT_EYE = 0;
  public static final int RIGHT_EYE = 1;
  public static final int LEFT_MOUTH = 2;
  public static final int RIGHT_MOUTH = 3;

  public int getType() { return 0; }
  public PointF getPosition() { return new PointF(); }
}
