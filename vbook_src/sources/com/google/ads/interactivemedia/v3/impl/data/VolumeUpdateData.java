package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AutoValue_VolumeUpdateData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class VolumeUpdateData {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract VolumeUpdateData build();

        public abstract Builder volume(float f);

        public Builder volumePercentage(int i) {
            return volume(Math.min(Math.max(i, 0), 100) / 100.0f);
        }
    }

    public static Builder builder() {
        return new AutoValue_VolumeUpdateData.Builder();
    }

    public abstract float volume();
}
