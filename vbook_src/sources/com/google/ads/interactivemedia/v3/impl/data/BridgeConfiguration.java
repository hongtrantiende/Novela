package com.google.ads.interactivemedia.v3.impl.data;

import android.net.Uri;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class BridgeConfiguration {
    public static BridgeConfiguration create(Uri uri, String str, String str2, m6f m6fVar, long j) {
        return new AutoValue_BridgeConfiguration(uri, str, str2, m6fVar, j);
    }

    public abstract Uri baseUri();

    public abstract String language();

    public abstract String packageName();

    public abstract long pageCorrelator();

    public abstract m6f testingConfiguration();
}
