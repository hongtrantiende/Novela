package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AdViewData;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_PauseAdData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class PauseAdData {
    private String pauseAdId = "";

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        private String pauseAdId = "";

        public abstract PauseAdData autoBuild();

        public PauseAdData build() {
            PauseAdData autoBuild = autoBuild();
            autoBuild.zza(this.pauseAdId);
            return autoBuild;
        }

        public abstract Builder setClickThroughUrl(String str);

        public abstract Builder setFadeDuration(double d);

        public abstract Builder setHeight(int i);

        public Builder setPauseAdId(String str) {
            this.pauseAdId = str;
            return this;
        }

        public abstract Builder setScaleTolerance(double d);

        public abstract Builder setSrc(String str);

        public abstract Builder setType(AdViewData.Type type);

        public abstract Builder setUseMask(boolean z);

        public abstract Builder setWidth(int i);
    }

    public static Builder builder() {
        return new AutoValue_PauseAdData.Builder();
    }

    public abstract String clickThroughUrl();

    public abstract double fadeDuration();

    public abstract int height();

    public String pauseAdId() {
        return this.pauseAdId;
    }

    public abstract double scaleTolerance();

    public abstract String src();

    public abstract AdViewData.Type type();

    public abstract boolean useMask();

    public abstract int width();

    public final /* synthetic */ void zza(String str) {
        this.pauseAdId = str;
    }
}
