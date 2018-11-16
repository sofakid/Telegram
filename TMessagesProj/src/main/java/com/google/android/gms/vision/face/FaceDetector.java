package com.google.android.gms.vision.face;

import android.content.Context;

import com.google.android.gms.vision.Frame;
import android.util.SparseArray;

public class FaceDetector
{
  public static final int ALL_LANDMARKS = 0;
  public static final int ACCURATE_MODE = 0;
  
  public boolean isOperational() { return false; }
  public SparseArray<Face> detect(Frame f) { return new SparseArray<Face>(); }
  public void release() {}
  
  static public class Builder {
    public Builder(Context c) {}
    public Builder setMode(int i) { return this; }
    public Builder setLandmarkType(int i) { return this; }
    public Builder setTrackingEnabled(boolean b) { return this; }
    public FaceDetector build() { return new FaceDetector(); }

  }
}