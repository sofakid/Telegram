package com.google.android.gms.vision.barcode;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.Frame;

import android.content.Context;
import android.util.SparseArray;

public class BarcodeDetector
{
  
  static public class Builder {
    public Builder(Context c) {}
    public Builder setBarcodeFormats(int i) { return this; }
    public BarcodeDetector build() { return new BarcodeDetector(); }
  }

  public SparseArray<Barcode> detect(Frame f) { return new SparseArray<Barcode>(); };
}