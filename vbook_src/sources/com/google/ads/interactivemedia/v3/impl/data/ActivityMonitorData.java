package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AutoValue_ActivityMonitorData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class ActivityMonitorData {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public interface Builder {
        Builder appState(String str);

        ActivityMonitorData build();

        Builder eventId(String str);

        Builder nativeTime(long j);

        Builder nativeViewBounds(BoundingRectData boundingRectData);

        Builder nativeViewHidden(boolean z);

        Builder nativeViewVisibleBounds(BoundingRectData boundingRectData);

        Builder nativeVolume(double d);

        Builder queryId(String str);
    }

    public static Builder builder() {
        return new AutoValue_ActivityMonitorData.Builder();
    }

    public abstract String appState();

    public abstract String eventId();

    public abstract long nativeTime();

    public abstract BoundingRectData nativeViewBounds();

    public abstract boolean nativeViewHidden();

    public abstract BoundingRectData nativeViewVisibleBounds();

    public abstract double nativeVolume();

    public abstract String queryId();
}
