package com.google.android.gms.vision.barcode;
import android.content.Context;
import com.google.android.gms.vision.barcode.DriverLicense;

public class Barcode
{
  public static final int PDF417 = 0;
  public static final int DRIVER_LICENSE = 1;
  public static final int TEXT = 2;

  public int valueFormat;
  public int format;
  public String rawValue;
  public DriverLicense driverLicense;
  
  static public class Builder {
    public Builder(Context c) {}
    public Builder setBarcodeFormats(int i) { return this; }
    public Barcode build() { return new Barcode(); }
  }
}


