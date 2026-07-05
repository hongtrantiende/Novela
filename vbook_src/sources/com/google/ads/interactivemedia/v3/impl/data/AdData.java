package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AutoValue_AdData;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class AdData {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract AdData build();

        public abstract Builder setAdId(String str);

        public abstract Builder setAdPodInfo(AdPodInfoData adPodInfoData);

        public abstract Builder setAdSystem(String str);

        public abstract Builder setAdWrapperCreativeIds(List<String> list);

        public abstract Builder setAdWrapperIds(List<String> list);

        public abstract Builder setAdWrapperSystems(List<String> list);

        public abstract Builder setAdvertiserName(String str);

        public abstract Builder setClickThroughUrl(String str);

        public abstract Builder setCompanions(List<CompanionAdData> list);

        public abstract Builder setContentType(String str);

        public abstract Builder setCreativeAdId(String str);

        public abstract Builder setCreativeId(String str);

        public abstract Builder setDealId(String str);

        public abstract Builder setDescription(String str);

        public abstract Builder setDisableUi(Boolean bool);

        public abstract Builder setDuration(Double d);

        public abstract Builder setHeight(Integer num);

        public abstract Builder setLinear(Boolean bool);

        public abstract Builder setSkipTimeOffset(Double d);

        public abstract Builder setSkippable(Boolean bool);

        public abstract Builder setSurveyUrl(String str);

        public abstract Builder setTitle(String str);

        public abstract Builder setTraffickingParameters(String str);

        public abstract Builder setUiElements(Set<Object> set);

        public abstract Builder setUniversalAdIds(List<UniversalAdIdData> list);

        public abstract Builder setVastMediaBitrate(Integer num);

        public abstract Builder setVastMediaHeight(Integer num);

        public abstract Builder setVastMediaWidth(Integer num);

        public abstract Builder setWidth(Integer num);
    }

    public static Builder builder() {
        return new AutoValue_AdData.Builder();
    }

    public abstract String adId();

    public abstract AdPodInfoData adPodInfo();

    public abstract String adSystem();

    public abstract List<String> adWrapperCreativeIds();

    public abstract List<String> adWrapperIds();

    public abstract List<String> adWrapperSystems();

    public abstract String advertiserName();

    public abstract String clickThroughUrl();

    public abstract List<CompanionAdData> companions();

    public abstract String contentType();

    public abstract String creativeAdId();

    public abstract String creativeId();

    public abstract String dealId();

    public abstract String description();

    public abstract Boolean disableUi();

    public abstract Double duration();

    public abstract Integer height();

    public abstract Boolean linear();

    public abstract Double skipTimeOffset();

    public abstract Boolean skippable();

    public abstract String surveyUrl();

    public abstract String title();

    public abstract String traffickingParameters();

    public abstract Set<Object> uiElements();

    public abstract List<UniversalAdIdData> universalAdIds();

    public abstract Integer vastMediaBitrate();

    public abstract Integer vastMediaHeight();

    public abstract Integer vastMediaWidth();

    public abstract Integer width();
}
