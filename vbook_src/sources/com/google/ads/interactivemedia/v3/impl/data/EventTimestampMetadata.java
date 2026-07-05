package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AutoValue_EventTimestampMetadata;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class EventTimestampMetadata {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public interface Builder {
        Builder androidVersion(String str);

        EventTimestampMetadata build();

        Builder manufacturer(String str);

        Builder model(String str);

        Builder requestCounter(int i);

        Builder sdkVersion(String str);
    }

    public static Builder builder() {
        return new AutoValue_EventTimestampMetadata.Builder();
    }

    public abstract String androidVersion();

    public abstract String manufacturer();

    public abstract String model();

    public abstract int requestCounter();

    public abstract String sdkVersion();
}
