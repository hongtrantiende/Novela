package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class RequestLoadedAssetData {
    public static RequestLoadedAssetData create(String str, String str2, String str3, Boolean bool) {
        return new AutoValue_RequestLoadedAssetData(str, str2, str3, bool);
    }

    public abstract String context();

    public abstract String requestData();

    public abstract String responseData();

    public abstract Boolean waitOnMonitoringWebview();
}
