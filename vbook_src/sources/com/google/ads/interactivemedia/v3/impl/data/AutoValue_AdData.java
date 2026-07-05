package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AdData;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_AdData extends AdData {
    private final String adId;
    private final AdPodInfoData adPodInfo;
    private final String adSystem;
    private final List<String> adWrapperCreativeIds;
    private final List<String> adWrapperIds;
    private final List<String> adWrapperSystems;
    private final String advertiserName;
    private final String clickThroughUrl;
    private final List<CompanionAdData> companions;
    private final String contentType;
    private final String creativeAdId;
    private final String creativeId;
    private final String dealId;
    private final String description;
    private final Boolean disableUi;
    private final Double duration;
    private final Integer height;
    private final Boolean linear;
    private final Double skipTimeOffset;
    private final Boolean skippable;
    private final String surveyUrl;
    private final String title;
    private final String traffickingParameters;
    private final Set<Object> uiElements;
    private final List<UniversalAdIdData> universalAdIds;
    private final Integer vastMediaBitrate;
    private final Integer vastMediaHeight;
    private final Integer vastMediaWidth;
    private final Integer width;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends AdData.Builder {
        private String adId;
        private AdPodInfoData adPodInfo;
        private String adSystem;
        private List<String> adWrapperCreativeIds;
        private List<String> adWrapperIds;
        private List<String> adWrapperSystems;
        private String advertiserName;
        private String clickThroughUrl;
        private List<CompanionAdData> companions;
        private String contentType;
        private String creativeAdId;
        private String creativeId;
        private String dealId;
        private String description;
        private Boolean disableUi;
        private Double duration;
        private Integer height;
        private Boolean linear;
        private Double skipTimeOffset;
        private Boolean skippable;
        private String surveyUrl;
        private String title;
        private String traffickingParameters;
        private Set<Object> uiElements;
        private List<UniversalAdIdData> universalAdIds;
        private Integer vastMediaBitrate;
        private Integer vastMediaHeight;
        private Integer vastMediaWidth;
        private Integer width;

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData build() {
            return new AutoValue_AdData(this.adId, this.creativeId, this.creativeAdId, this.adSystem, this.linear, this.skippable, this.skipTimeOffset, this.disableUi, this.title, this.description, this.contentType, this.advertiserName, this.surveyUrl, this.dealId, this.width, this.height, this.vastMediaBitrate, this.vastMediaHeight, this.vastMediaWidth, this.traffickingParameters, this.clickThroughUrl, this.duration, this.adPodInfo, this.uiElements, this.companions, this.adWrapperIds, this.adWrapperSystems, this.adWrapperCreativeIds, this.universalAdIds, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdId(String str) {
            this.adId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdPodInfo(AdPodInfoData adPodInfoData) {
            this.adPodInfo = adPodInfoData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdSystem(String str) {
            this.adSystem = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdWrapperCreativeIds(List<String> list) {
            this.adWrapperCreativeIds = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdWrapperIds(List<String> list) {
            this.adWrapperIds = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdWrapperSystems(List<String> list) {
            this.adWrapperSystems = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdvertiserName(String str) {
            this.advertiserName = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setClickThroughUrl(String str) {
            this.clickThroughUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setCompanions(List<CompanionAdData> list) {
            this.companions = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setContentType(String str) {
            this.contentType = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setCreativeAdId(String str) {
            this.creativeAdId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setCreativeId(String str) {
            this.creativeId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setDealId(String str) {
            this.dealId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setDisableUi(Boolean bool) {
            this.disableUi = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setDuration(Double d) {
            this.duration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setHeight(Integer num) {
            this.height = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setLinear(Boolean bool) {
            this.linear = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setSkipTimeOffset(Double d) {
            this.skipTimeOffset = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setSkippable(Boolean bool) {
            this.skippable = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setSurveyUrl(String str) {
            this.surveyUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setTraffickingParameters(String str) {
            this.traffickingParameters = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setUiElements(Set<Object> set) {
            this.uiElements = set;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setUniversalAdIds(List<UniversalAdIdData> list) {
            this.universalAdIds = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setVastMediaBitrate(Integer num) {
            this.vastMediaBitrate = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setVastMediaHeight(Integer num) {
            this.vastMediaHeight = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setVastMediaWidth(Integer num) {
            this.vastMediaWidth = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setWidth(Integer num) {
            this.width = num;
            return this;
        }
    }

    private AutoValue_AdData(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Double d, Boolean bool3, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str11, String str12, Double d2, AdPodInfoData adPodInfoData, Set<Object> set, List<CompanionAdData> list, List<String> list2, List<String> list3, List<String> list4, List<UniversalAdIdData> list5) {
        this.adId = str;
        this.creativeId = str2;
        this.creativeAdId = str3;
        this.adSystem = str4;
        this.linear = bool;
        this.skippable = bool2;
        this.skipTimeOffset = d;
        this.disableUi = bool3;
        this.title = str5;
        this.description = str6;
        this.contentType = str7;
        this.advertiserName = str8;
        this.surveyUrl = str9;
        this.dealId = str10;
        this.width = num;
        this.height = num2;
        this.vastMediaBitrate = num3;
        this.vastMediaHeight = num4;
        this.vastMediaWidth = num5;
        this.traffickingParameters = str11;
        this.clickThroughUrl = str12;
        this.duration = d2;
        this.adPodInfo = adPodInfoData;
        this.uiElements = set;
        this.companions = list;
        this.adWrapperIds = list2;
        this.adWrapperSystems = list3;
        this.adWrapperCreativeIds = list4;
        this.universalAdIds = list5;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String adId() {
        return this.adId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public AdPodInfoData adPodInfo() {
        return this.adPodInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String adSystem() {
        return this.adSystem;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public List<String> adWrapperCreativeIds() {
        return this.adWrapperCreativeIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public List<String> adWrapperIds() {
        return this.adWrapperIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public List<String> adWrapperSystems() {
        return this.adWrapperSystems;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String advertiserName() {
        return this.advertiserName;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public List<CompanionAdData> companions() {
        return this.companions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String contentType() {
        return this.contentType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String creativeAdId() {
        return this.creativeAdId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String creativeId() {
        return this.creativeId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String dealId() {
        return this.dealId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String description() {
        return this.description;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Double duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdData) {
            AdData adData = (AdData) obj;
            String str = this.adId;
            if (str != null ? str.equals(adData.adId()) : adData.adId() == null) {
                String str2 = this.creativeId;
                if (str2 != null ? str2.equals(adData.creativeId()) : adData.creativeId() == null) {
                    String str3 = this.creativeAdId;
                    if (str3 != null ? str3.equals(adData.creativeAdId()) : adData.creativeAdId() == null) {
                        String str4 = this.adSystem;
                        if (str4 != null ? str4.equals(adData.adSystem()) : adData.adSystem() == null) {
                            Boolean bool = this.linear;
                            if (bool != null ? bool.equals(adData.linear()) : adData.linear() == null) {
                                Boolean bool2 = this.skippable;
                                if (bool2 != null ? bool2.equals(adData.skippable()) : adData.skippable() == null) {
                                    Double d = this.skipTimeOffset;
                                    if (d != null ? d.equals(adData.skipTimeOffset()) : adData.skipTimeOffset() == null) {
                                        Boolean bool3 = this.disableUi;
                                        if (bool3 != null ? bool3.equals(adData.disableUi()) : adData.disableUi() == null) {
                                            String str5 = this.title;
                                            if (str5 != null ? str5.equals(adData.title()) : adData.title() == null) {
                                                String str6 = this.description;
                                                if (str6 != null ? str6.equals(adData.description()) : adData.description() == null) {
                                                    String str7 = this.contentType;
                                                    if (str7 != null ? str7.equals(adData.contentType()) : adData.contentType() == null) {
                                                        String str8 = this.advertiserName;
                                                        if (str8 != null ? str8.equals(adData.advertiserName()) : adData.advertiserName() == null) {
                                                            String str9 = this.surveyUrl;
                                                            if (str9 != null ? str9.equals(adData.surveyUrl()) : adData.surveyUrl() == null) {
                                                                String str10 = this.dealId;
                                                                if (str10 != null ? str10.equals(adData.dealId()) : adData.dealId() == null) {
                                                                    Integer num = this.width;
                                                                    if (num != null ? num.equals(adData.width()) : adData.width() == null) {
                                                                        Integer num2 = this.height;
                                                                        if (num2 != null ? num2.equals(adData.height()) : adData.height() == null) {
                                                                            Integer num3 = this.vastMediaBitrate;
                                                                            if (num3 != null ? num3.equals(adData.vastMediaBitrate()) : adData.vastMediaBitrate() == null) {
                                                                                Integer num4 = this.vastMediaHeight;
                                                                                if (num4 != null ? num4.equals(adData.vastMediaHeight()) : adData.vastMediaHeight() == null) {
                                                                                    Integer num5 = this.vastMediaWidth;
                                                                                    if (num5 != null ? num5.equals(adData.vastMediaWidth()) : adData.vastMediaWidth() == null) {
                                                                                        String str11 = this.traffickingParameters;
                                                                                        if (str11 != null ? str11.equals(adData.traffickingParameters()) : adData.traffickingParameters() == null) {
                                                                                            String str12 = this.clickThroughUrl;
                                                                                            if (str12 != null ? str12.equals(adData.clickThroughUrl()) : adData.clickThroughUrl() == null) {
                                                                                                Double d2 = this.duration;
                                                                                                if (d2 != null ? d2.equals(adData.duration()) : adData.duration() == null) {
                                                                                                    AdPodInfoData adPodInfoData = this.adPodInfo;
                                                                                                    if (adPodInfoData != null ? adPodInfoData.equals(adData.adPodInfo()) : adData.adPodInfo() == null) {
                                                                                                        Set<Object> set = this.uiElements;
                                                                                                        if (set != null ? set.equals(adData.uiElements()) : adData.uiElements() == null) {
                                                                                                            List<CompanionAdData> list = this.companions;
                                                                                                            if (list != null ? list.equals(adData.companions()) : adData.companions() == null) {
                                                                                                                List<String> list2 = this.adWrapperIds;
                                                                                                                if (list2 != null ? list2.equals(adData.adWrapperIds()) : adData.adWrapperIds() == null) {
                                                                                                                    List<String> list3 = this.adWrapperSystems;
                                                                                                                    if (list3 != null ? list3.equals(adData.adWrapperSystems()) : adData.adWrapperSystems() == null) {
                                                                                                                        List<String> list4 = this.adWrapperCreativeIds;
                                                                                                                        if (list4 != null ? list4.equals(adData.adWrapperCreativeIds()) : adData.adWrapperCreativeIds() == null) {
                                                                                                                            List<UniversalAdIdData> list5 = this.universalAdIds;
                                                                                                                            if (list5 != null ? list5.equals(adData.universalAdIds()) : adData.universalAdIds() == null) {
                                                                                                                                return true;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        String str = this.adId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.creativeId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str3 = this.creativeAdId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str4 = this.adSystem;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        Boolean bool = this.linear;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        Boolean bool2 = this.skippable;
        if (bool2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool2.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        Double d = this.skipTimeOffset;
        if (d == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = d.hashCode();
        }
        int i7 = (i6 ^ hashCode7) * 1000003;
        Boolean bool3 = this.disableUi;
        if (bool3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool3.hashCode();
        }
        int i8 = (i7 ^ hashCode8) * 1000003;
        String str5 = this.title;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i9 = (i8 ^ hashCode9) * 1000003;
        String str6 = this.description;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i10 = (i9 ^ hashCode10) * 1000003;
        String str7 = this.contentType;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int i11 = (i10 ^ hashCode11) * 1000003;
        String str8 = this.advertiserName;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i12 = (i11 ^ hashCode12) * 1000003;
        String str9 = this.surveyUrl;
        if (str9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str9.hashCode();
        }
        int i13 = (i12 ^ hashCode13) * 1000003;
        String str10 = this.dealId;
        if (str10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str10.hashCode();
        }
        int i14 = (i13 ^ hashCode14) * 1000003;
        Integer num = this.width;
        if (num == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num.hashCode();
        }
        int i15 = (i14 ^ hashCode15) * 1000003;
        Integer num2 = this.height;
        if (num2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num2.hashCode();
        }
        int i16 = (i15 ^ hashCode16) * 1000003;
        Integer num3 = this.vastMediaBitrate;
        if (num3 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = num3.hashCode();
        }
        int i17 = (i16 ^ hashCode17) * 1000003;
        Integer num4 = this.vastMediaHeight;
        if (num4 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = num4.hashCode();
        }
        int i18 = (i17 ^ hashCode18) * 1000003;
        Integer num5 = this.vastMediaWidth;
        if (num5 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = num5.hashCode();
        }
        int i19 = (i18 ^ hashCode19) * 1000003;
        String str11 = this.traffickingParameters;
        if (str11 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str11.hashCode();
        }
        int i20 = (i19 ^ hashCode20) * 1000003;
        String str12 = this.clickThroughUrl;
        if (str12 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str12.hashCode();
        }
        int i21 = (i20 ^ hashCode21) * 1000003;
        Double d2 = this.duration;
        if (d2 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = d2.hashCode();
        }
        int i22 = (i21 ^ hashCode22) * 1000003;
        AdPodInfoData adPodInfoData = this.adPodInfo;
        if (adPodInfoData == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = adPodInfoData.hashCode();
        }
        int i23 = (i22 ^ hashCode23) * 1000003;
        Set<Object> set = this.uiElements;
        if (set == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = set.hashCode();
        }
        int i24 = (i23 ^ hashCode24) * 1000003;
        List<CompanionAdData> list = this.companions;
        if (list == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = list.hashCode();
        }
        int i25 = (i24 ^ hashCode25) * 1000003;
        List<String> list2 = this.adWrapperIds;
        if (list2 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = list2.hashCode();
        }
        int i26 = (i25 ^ hashCode26) * 1000003;
        List<String> list3 = this.adWrapperSystems;
        if (list3 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = list3.hashCode();
        }
        int i27 = (i26 ^ hashCode27) * 1000003;
        List<String> list4 = this.adWrapperCreativeIds;
        if (list4 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = list4.hashCode();
        }
        int i28 = (i27 ^ hashCode28) * 1000003;
        List<UniversalAdIdData> list5 = this.universalAdIds;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return i28 ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Integer height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Boolean linear() {
        return this.linear;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Double skipTimeOffset() {
        return this.skipTimeOffset;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Boolean skippable() {
        return this.skippable;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String surveyUrl() {
        return this.surveyUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String title() {
        return this.title;
    }

    public String toString() {
        List<UniversalAdIdData> list = this.universalAdIds;
        List<String> list2 = this.adWrapperCreativeIds;
        List<String> list3 = this.adWrapperSystems;
        List<String> list4 = this.adWrapperIds;
        List<CompanionAdData> list5 = this.companions;
        Set<Object> set = this.uiElements;
        String valueOf = String.valueOf(this.adPodInfo);
        String valueOf2 = String.valueOf(set);
        String valueOf3 = String.valueOf(list5);
        String valueOf4 = String.valueOf(list4);
        String valueOf5 = String.valueOf(list3);
        String valueOf6 = String.valueOf(list2);
        String valueOf7 = String.valueOf(list);
        String str = this.adId;
        int length = String.valueOf(str).length();
        String str2 = this.creativeId;
        int length2 = String.valueOf(str2).length();
        String str3 = this.creativeAdId;
        int length3 = String.valueOf(str3).length();
        String str4 = this.adSystem;
        int length4 = String.valueOf(str4).length();
        Boolean bool = this.linear;
        int length5 = String.valueOf(bool).length();
        Boolean bool2 = this.skippable;
        int length6 = String.valueOf(bool2).length();
        Double d = this.skipTimeOffset;
        int length7 = String.valueOf(d).length();
        Boolean bool3 = this.disableUi;
        int length8 = String.valueOf(bool3).length();
        String str5 = this.title;
        int length9 = String.valueOf(str5).length();
        String str6 = this.description;
        int length10 = String.valueOf(str6).length();
        String str7 = this.contentType;
        int length11 = String.valueOf(str7).length();
        String str8 = this.advertiserName;
        int length12 = String.valueOf(str8).length();
        String str9 = this.surveyUrl;
        int length13 = String.valueOf(str9).length();
        String str10 = this.dealId;
        String valueOf8 = String.valueOf(str10);
        String str11 = this.traffickingParameters;
        Integer num = this.vastMediaWidth;
        Integer num2 = this.vastMediaHeight;
        Integer num3 = this.vastMediaBitrate;
        Integer num4 = this.height;
        Integer num5 = this.width;
        Double d2 = this.duration;
        String str12 = this.clickThroughUrl;
        int length14 = valueOf8.length();
        int length15 = String.valueOf(num5).length();
        int length16 = String.valueOf(num3).length();
        int length17 = length16 + String.valueOf(num4).length() + length + 25 + length2 + 15 + length3 + 11 + length4 + 9 + length5 + 12 + length6 + 17 + length7 + 12 + length8 + 8 + length9 + 14 + length10 + 14 + length11 + 17 + length12 + 12 + length13 + 9 + length14 + 8 + length15 + 9 + 19;
        int length18 = String.valueOf(num2).length();
        int length19 = String.valueOf(num).length() + length17 + 18 + length18 + 17;
        int length20 = String.valueOf(str11).length();
        StringBuilder sb = new StringBuilder(valueOf7.length() + s21.a(s21.a(s21.a(s21.a(s21.a(s21.a(s21.a(length19 + 24 + length20 + 18 + String.valueOf(str12).length() + 11, 12, String.valueOf(d2)), 13, valueOf), 13, valueOf2), 15, valueOf3), 19, valueOf4), 23, valueOf5), 17, valueOf6) + 1);
        nk2.C(sb, "AdData{adId=", str, ", creativeId=", str2);
        nk2.C(sb, ", creativeAdId=", str3, ", adSystem=", str4);
        sb.append(", linear=");
        sb.append(bool);
        sb.append(", skippable=");
        sb.append(bool2);
        sb.append(", skipTimeOffset=");
        sb.append(d);
        sb.append(", disableUi=");
        sb.append(bool3);
        nk2.C(sb, ", title=", str5, ", description=", str6);
        nk2.C(sb, ", contentType=", str7, ", advertiserName=", str8);
        nk2.C(sb, ", surveyUrl=", str9, ", dealId=", str10);
        sb.append(", width=");
        sb.append(num5);
        sb.append(", height=");
        sb.append(num4);
        sb.append(", vastMediaBitrate=");
        sb.append(num3);
        sb.append(", vastMediaHeight=");
        sb.append(num2);
        sb.append(", vastMediaWidth=");
        sb.append(num);
        sb.append(", traffickingParameters=");
        sb.append(str11);
        sb.append(", clickThroughUrl=");
        sb.append(str12);
        sb.append(", duration=");
        sb.append(d2);
        nk2.C(sb, ", adPodInfo=", valueOf, ", uiElements=", valueOf2);
        nk2.C(sb, ", companions=", valueOf3, ", adWrapperIds=", valueOf4);
        nk2.C(sb, ", adWrapperSystems=", valueOf5, ", adWrapperCreativeIds=", valueOf6);
        return nk2.v(sb, ", universalAdIds=", valueOf7, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public String traffickingParameters() {
        return this.traffickingParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Set<Object> uiElements() {
        return this.uiElements;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public List<UniversalAdIdData> universalAdIds() {
        return this.universalAdIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Integer vastMediaBitrate() {
        return this.vastMediaBitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Integer vastMediaHeight() {
        return this.vastMediaHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Integer vastMediaWidth() {
        return this.vastMediaWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    public Integer width() {
        return this.width;
    }

    public /* synthetic */ AutoValue_AdData(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Double d, Boolean bool3, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str11, String str12, Double d2, AdPodInfoData adPodInfoData, Set set, List list, List list2, List list3, List list4, List list5, byte[] bArr) {
        this(str, str2, str3, str4, bool, bool2, d, bool3, str5, str6, str7, str8, str9, str10, num, num2, num3, num4, num5, str11, str12, d2, adPodInfoData, set, list, list2, list3, list4, list5);
    }
}
