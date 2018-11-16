package com.google.android.gms.wallet;

public class LineItem
{
  public static class Builder {
    public Builder setCurrencyCode(Object o) { return this; }
    public Builder setQuantity(Object o) { return this; }
    public Builder setDescription(Object o) { return this; }
    public Builder setTotalPrice(Object o) { return this; }
    public Builder setUnitPrice(Object o) { return this; }
    public LineItem build() { return new LineItem(); }
  }

  public static Builder newBuilder() {
    return new Builder();
  }
}