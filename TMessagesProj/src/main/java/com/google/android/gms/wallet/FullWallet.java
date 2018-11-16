package com.google.android.gms.wallet;

public class FullWallet
{
  String[] descriptions = { "" };
  public static class Thing {
    public String getToken() { return ""; }
  }
  public Thing getPaymentMethodToken() { return new Thing(); }
  public String getGoogleTransactionId() { return ""; }
  public String[] getPaymentDescriptions() {
    return descriptions;
  }
}