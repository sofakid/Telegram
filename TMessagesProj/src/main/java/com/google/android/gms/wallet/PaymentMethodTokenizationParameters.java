package com.google.android.gms.wallet;

public class PaymentMethodTokenizationParameters
{
  public static PaymentMethodTokenizationParameters newBuilder() {
    return new PaymentMethodTokenizationParameters();
  }

  public PaymentMethodTokenizationParameters setPaymentMethodTokenizationType(int i) { return this; }
  public PaymentMethodTokenizationParameters addParameter(String k, Object v) { return this; }
  public PaymentMethodTokenizationParameters build() { return this; };
}