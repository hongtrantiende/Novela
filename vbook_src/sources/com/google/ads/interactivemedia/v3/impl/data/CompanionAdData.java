package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AutoValue_CompanionAdData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class CompanionAdData {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract CompanionAdData build();

        public abstract Builder setApiFramework(String str);

        public abstract Builder setResourceValue(String str);

        public abstract Builder setSize(SizeData sizeData);
    }

    public static Builder builder() {
        return new AutoValue_CompanionAdData.Builder();
    }

    public abstract String apiFramework();

    public abstract String resourceValue();

    public abstract SizeData size();
}
