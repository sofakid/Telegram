package com.google.android.gms.wallet;

public class Cart
{
  public static class Builder {
    public void addLineItem(Object o) {}
    public Cart build() { return new Cart(); }

    public Builder setCurrencyCode(Object o) { return this; }
    public Builder setTotalPrice(Object o) { return this; };
  }

  public static Builder newBuilder() {
    return new Builder();
  }
}