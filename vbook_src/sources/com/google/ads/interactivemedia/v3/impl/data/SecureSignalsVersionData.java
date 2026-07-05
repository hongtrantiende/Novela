package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class SecureSignalsVersionData {
    public static SecureSignalsVersionData create(int i, int i2, int i3) {
        return new AutoValue_SecureSignalsVersionData(i, i2, i3);
    }

    public abstract int major();

    public abstract int micro();

    public abstract int minor();

    public static SecureSignalsVersionData create(g5d g5dVar) {
        throw null;
    }
}
