package com.google.android.gms.wearable;

import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.MessageEvent;

public class WearableListenerService
{
	public void onCreate() {}
	public void onDestroy() {}
	public void onChannelOpened(final Channel ch) {}
	public void onMessageReceived(final MessageEvent messageEvent) {}
	public void onCapabilityChanged(CapabilityInfo capabilityInfo) {}
}