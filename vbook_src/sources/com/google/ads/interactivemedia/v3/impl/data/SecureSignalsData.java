package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class SecureSignalsData {
    public static SecureSignalsData createBy1stPartyData(k4a k4aVar) {
        throw null;
    }

    public static SecureSignalsData createBy3rdPartyData(g5d g5dVar, g5d g5dVar2, String str, String str2) {
        return createBy3rdPartyData(SecureSignalsVersionData.create(g5dVar), SecureSignalsVersionData.create(g5dVar2), str, str2);
    }

    public abstract SecureSignalsVersionData adapterVersion();

    public abstract Boolean isPublisherCreated();

    public abstract String name();

    public abstract SecureSignalsVersionData sdkVersion();

    public abstract String signals();

    public static SecureSignalsData createBy3rdPartyData(SecureSignalsVersionData secureSignalsVersionData, SecureSignalsVersionData secureSignalsVersionData2, String str, String str2) {
        return new AutoValue_SecureSignalsData(secureSignalsVersionData, secureSignalsVersionData2, str, str2, Boolean.FALSE);
    }
}
