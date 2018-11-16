package com.google.android.gms.wallet.fragment;

public class WalletFragmentStyle
{
  public static class Dimension {
    public static final int MATCH_PARENT = 0;
    public static final int WRAP_CONTENT = 1;
  }

  public static class BuyButtonText {
    public static final String BUY_WITH = "";
    public static final String BUY_LOGO = "";
    public static final String LOGO_ONLY = "";
  }

  public static class BuyButtonAppearance {
    public static final int ANDROID_PAY_LIGHT_WITH_BORDER = 0;
    public static final int ANDROID_PAY_DARK = 1;
  }

  public WalletFragmentStyle setBuyButtonText(String s) { return this; }
  public WalletFragmentStyle setBuyButtonAppearance(Object o) { return this; }
  public WalletFragmentStyle setPaymentMethodTokenizationType(Object o) { return this; }
  public WalletFragmentStyle setBuyButtonWidth(int i) { return this; }
}