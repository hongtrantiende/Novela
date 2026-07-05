package com.google.ads.interactivemedia.v3.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class AdsRequestImpl$MutePlayState {
    private static final /* synthetic */ AdsRequestImpl$MutePlayState[] $VALUES;
    public static final AdsRequestImpl$MutePlayState MUTED;
    public static final AdsRequestImpl$MutePlayState UNKNOWN;
    public static final AdsRequestImpl$MutePlayState UNMUTED;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$MutePlayState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$MutePlayState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$MutePlayState, java.lang.Enum] */
    static {
        ?? r0 = new Enum("MUTED", 0);
        MUTED = r0;
        ?? r1 = new Enum("UNKNOWN", 1);
        UNKNOWN = r1;
        ?? r2 = new Enum("UNMUTED", 2);
        UNMUTED = r2;
        $VALUES = new AdsRequestImpl$MutePlayState[]{r0, r1, r2};
    }

    public static AdsRequestImpl$MutePlayState[] values() {
        return (AdsRequestImpl$MutePlayState[]) $VALUES.clone();
    }
}
