package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_AdPodInfoData extends AdPodInfoData {
    private final Integer adPosition;
    private final List<Long> adsDurationMs;
    private final Boolean isBumper;
    private final Double maxDuration;
    private final Integer podIndex;
    private final Double timeOffset;
    private final Integer totalAds;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends AdPodInfoData.Builder {
        private Integer adPosition;
        private List<Long> adsDurationMs;
        private Boolean isBumper;
        private Double maxDuration;
        private Integer podIndex;
        private Double timeOffset;
        private Integer totalAds;

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData.Builder
        public AdPodInfoData build() {
            return new AutoValue_AdPodInfoData(this.totalAds, this.adPosition, this.isBumper, this.maxDuration, this.adsDurationMs, this.podIndex, this.timeOffset, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData.Builder
        public AdPodInfoData.Builder setAdPosition(int i) {
            this.adPosition = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData.Builder
        public AdPodInfoData.Builder setAdsDurationMs(List<Long> list) {
            this.adsDurationMs = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData.Builder
        public AdPodInfoData.Builder setIsBumper(boolean z) {
            this.isBumper = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData.Builder
        public AdPodInfoData.Builder setMaxDuration(double d) {
            this.maxDuration = Double.valueOf(d);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData.Builder
        public AdPodInfoData.Builder setPodIndex(Integer num) {
            this.podIndex = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData.Builder
        public AdPodInfoData.Builder setTimeOffset(Double d) {
            this.timeOffset = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData.Builder
        public AdPodInfoData.Builder setTotalAds(int i) {
            this.totalAds = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_AdPodInfoData(Integer num, Integer num2, Boolean bool, Double d, List<Long> list, Integer num3, Double d2) {
        this.totalAds = num;
        this.adPosition = num2;
        this.isBumper = bool;
        this.maxDuration = d;
        this.adsDurationMs = list;
        this.podIndex = num3;
        this.timeOffset = d2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData
    public Integer adPosition() {
        return this.adPosition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData
    public List<Long> adsDurationMs() {
        return this.adsDurationMs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdPodInfoData) {
            AdPodInfoData adPodInfoData = (AdPodInfoData) obj;
            Integer num = this.totalAds;
            if (num != null ? num.equals(adPodInfoData.totalAds()) : adPodInfoData.totalAds() == null) {
                Integer num2 = this.adPosition;
                if (num2 != null ? num2.equals(adPodInfoData.adPosition()) : adPodInfoData.adPosition() == null) {
                    Boolean bool = this.isBumper;
                    if (bool != null ? bool.equals(adPodInfoData.isBumper()) : adPodInfoData.isBumper() == null) {
                        Double d = this.maxDuration;
                        if (d != null ? d.equals(adPodInfoData.maxDuration()) : adPodInfoData.maxDuration() == null) {
                            List<Long> list = this.adsDurationMs;
                            if (list != null ? list.equals(adPodInfoData.adsDurationMs()) : adPodInfoData.adsDurationMs() == null) {
                                Integer num3 = this.podIndex;
                                if (num3 != null ? num3.equals(adPodInfoData.podIndex()) : adPodInfoData.podIndex() == null) {
                                    Double d2 = this.timeOffset;
                                    if (d2 != null ? d2.equals(adPodInfoData.timeOffset()) : adPodInfoData.timeOffset() == null) {
                                        return true;
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
        Integer num = this.totalAds;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        Integer num2 = this.adPosition;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        Boolean bool = this.isBumper;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        Double d = this.maxDuration;
        if (d == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        List<Long> list = this.adsDurationMs;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        Integer num3 = this.podIndex;
        if (num3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num3.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        Double d2 = this.timeOffset;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return i6 ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData
    public Boolean isBumper() {
        return this.isBumper;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData
    public Double maxDuration() {
        return this.maxDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData
    public Integer podIndex() {
        return this.podIndex;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData
    public Double timeOffset() {
        return this.timeOffset;
    }

    public String toString() {
        String valueOf = String.valueOf(this.adsDurationMs);
        Integer num = this.totalAds;
        int length = String.valueOf(num).length();
        Integer num2 = this.adPosition;
        int length2 = String.valueOf(num2).length();
        Boolean bool = this.isBumper;
        int length3 = String.valueOf(bool).length();
        Double d = this.maxDuration;
        int length4 = String.valueOf(d).length();
        int length5 = valueOf.length();
        Integer num3 = this.podIndex;
        int length6 = String.valueOf(num3).length();
        Double d2 = this.timeOffset;
        StringBuilder sb = new StringBuilder(length + 36 + length2 + 11 + length3 + 14 + length4 + 16 + length5 + 11 + length6 + 13 + String.valueOf(d2).length() + 1);
        sb.append("AdPodInfoData{totalAds=");
        sb.append(num);
        sb.append(", adPosition=");
        sb.append(num2);
        sb.append(", isBumper=");
        sb.append(bool);
        sb.append(", maxDuration=");
        sb.append(d);
        sb.append(", adsDurationMs=");
        sb.append(valueOf);
        sb.append(", podIndex=");
        sb.append(num3);
        sb.append(", timeOffset=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData
    public Integer totalAds() {
        return this.totalAds;
    }

    public /* synthetic */ AutoValue_AdPodInfoData(Integer num, Integer num2, Boolean bool, Double d, List list, Integer num3, Double d2, byte[] bArr) {
        this(num, num2, bool, d, list, num3, d2);
    }
}
