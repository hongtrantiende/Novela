package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AutoValue_UniversalAdIdData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class UniversalAdIdData {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract UniversalAdIdData build();

        public abstract Builder setAdIdRegistry(String str);

        public abstract Builder setAdIdValue(String str);
    }

    public static Builder builder() {
        return new AutoValue_UniversalAdIdData.Builder();
    }

    public abstract String adIdRegistry();

    public abstract String adIdValue();
}
