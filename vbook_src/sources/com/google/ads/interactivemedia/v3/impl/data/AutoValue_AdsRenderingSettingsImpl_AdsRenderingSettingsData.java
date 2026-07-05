package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData extends AdsRenderingSettingsImpl.AdsRenderingSettingsData {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;
    private final a8f mimeTypes;
    private final double playAdsAfterTime;
    private final m8f uiElements;

    private AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData(int i, a8f a8fVar, m8f m8fVar, boolean z, boolean z2, double d, boolean z3, int i2) {
        this.bitrate = i;
        this.mimeTypes = a8fVar;
        this.uiElements = m8fVar;
        this.enablePreloading = z;
        this.enableFocusSkipButton = z2;
        this.playAdsAfterTime = d;
        this.disableUi = z3;
        this.loadVideoTimeout = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public int bitrate() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    public boolean equals(Object obj) {
        a8f a8fVar;
        m8f m8fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdsRenderingSettingsImpl.AdsRenderingSettingsData) {
            AdsRenderingSettingsImpl.AdsRenderingSettingsData adsRenderingSettingsData = (AdsRenderingSettingsImpl.AdsRenderingSettingsData) obj;
            if (this.bitrate == adsRenderingSettingsData.bitrate() && ((a8fVar = this.mimeTypes) != null ? a8fVar.equals(adsRenderingSettingsData.mimeTypes()) : adsRenderingSettingsData.mimeTypes() == null) && ((m8fVar = this.uiElements) != null ? m8fVar.equals(adsRenderingSettingsData.uiElements()) : adsRenderingSettingsData.uiElements() == null) && this.enablePreloading == adsRenderingSettingsData.enablePreloading() && this.enableFocusSkipButton == adsRenderingSettingsData.enableFocusSkipButton() && Double.doubleToLongBits(this.playAdsAfterTime) == Double.doubleToLongBits(adsRenderingSettingsData.playAdsAfterTime()) && this.disableUi == adsRenderingSettingsData.disableUi() && this.loadVideoTimeout == adsRenderingSettingsData.loadVideoTimeout()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int i2;
        a8f a8fVar = this.mimeTypes;
        int i3 = 0;
        if (a8fVar == null) {
            hashCode = 0;
        } else {
            hashCode = a8fVar.hashCode();
        }
        int i4 = this.bitrate;
        m8f m8fVar = this.uiElements;
        if (m8fVar != null) {
            i3 = m8fVar.hashCode();
        }
        int i5 = hashCode ^ ((i4 ^ 1000003) * 1000003);
        int i6 = 1231;
        if (true != this.enablePreloading) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i7 = ((((i5 * 1000003) ^ i3) * 1000003) ^ i) * 1000003;
        if (true != this.enableFocusSkipButton) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int doubleToLongBits = (((i7 ^ i2) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003;
        if (true != this.disableUi) {
            i6 = 1237;
        }
        return this.loadVideoTimeout ^ ((doubleToLongBits ^ i6) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public a8f mimeTypes() {
        return this.mimeTypes;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        m8f m8fVar = this.uiElements;
        String valueOf = String.valueOf(this.mimeTypes);
        String valueOf2 = String.valueOf(m8fVar);
        int i = this.bitrate;
        int length = String.valueOf(i).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        boolean z = this.enablePreloading;
        int length4 = String.valueOf(z).length();
        boolean z2 = this.enableFocusSkipButton;
        int length5 = String.valueOf(z2).length();
        double d = this.playAdsAfterTime;
        int length6 = String.valueOf(d).length();
        boolean z3 = this.disableUi;
        int length7 = String.valueOf(z3).length();
        int i2 = this.loadVideoTimeout;
        StringBuilder sb = new StringBuilder(length + 45 + length2 + 13 + length3 + 19 + length4 + 24 + length5 + 19 + length6 + 12 + length7 + 19 + String.valueOf(i2).length() + 1);
        sb.append("AdsRenderingSettingsData{bitrate=");
        sb.append(i);
        sb.append(", mimeTypes=");
        sb.append(valueOf);
        sb.append(", uiElements=");
        sb.append(valueOf2);
        sb.append(", enablePreloading=");
        sb.append(z);
        sb.append(", enableFocusSkipButton=");
        sb.append(z2);
        sb.append(", playAdsAfterTime=");
        sb.append(d);
        sb.append(", disableUi=");
        sb.append(z3);
        sb.append(", loadVideoTimeout=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData
    public m8f uiElements() {
        return this.uiElements;
    }

    public /* synthetic */ AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData(int i, a8f a8fVar, m8f m8fVar, boolean z, boolean z2, double d, boolean z3, int i2, byte[] bArr) {
        this(i, a8fVar, m8fVar, z, z2, d, z3, i2);
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder {
        private int bitrate;
        private boolean disableUi;
        private boolean enableFocusSkipButton;
        private boolean enablePreloading;
        private int loadVideoTimeout;
        private a8f mimeTypes;
        private double playAdsAfterTime;
        private byte set$0;
        private m8f uiElements;

        public Builder(AdsRenderingSettingsImpl.AdsRenderingSettingsData adsRenderingSettingsData) {
            this.bitrate = adsRenderingSettingsData.bitrate();
            this.mimeTypes = adsRenderingSettingsData.mimeTypes();
            this.uiElements = adsRenderingSettingsData.uiElements();
            this.enablePreloading = adsRenderingSettingsData.enablePreloading();
            this.enableFocusSkipButton = adsRenderingSettingsData.enableFocusSkipButton();
            this.playAdsAfterTime = adsRenderingSettingsData.playAdsAfterTime();
            this.disableUi = adsRenderingSettingsData.disableUi();
            this.loadVideoTimeout = adsRenderingSettingsData.loadVideoTimeout();
            this.set$0 = (byte) 63;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData build() {
            if (this.set$0 != 63) {
                StringBuilder sb = new StringBuilder();
                if ((this.set$0 & 1) == 0) {
                    sb.append(" bitrate");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" enablePreloading");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" enableFocusSkipButton");
                }
                if ((this.set$0 & 8) == 0) {
                    sb.append(" playAdsAfterTime");
                }
                if ((this.set$0 & 16) == 0) {
                    sb.append(" disableUi");
                }
                if ((this.set$0 & 32) == 0) {
                    sb.append(" loadVideoTimeout");
                }
                vs.k("Missing required properties:".concat(sb.toString()));
                return null;
            }
            return new AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData(this.bitrate, this.mimeTypes, this.uiElements, this.enablePreloading, this.enableFocusSkipButton, this.playAdsAfterTime, this.disableUi, this.loadVideoTimeout, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setBitrate(int i) {
            this.bitrate = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setDisableUi(boolean z) {
            this.disableUi = z;
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setEnableFocusSkipButton(boolean z) {
            this.enableFocusSkipButton = z;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setEnablePreloading(boolean z) {
            this.enablePreloading = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setLoadVideoTimeout(int i) {
            this.loadVideoTimeout = i;
            this.set$0 = (byte) (this.set$0 | 32);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setMimeTypes(List<String> list) {
            a8f i;
            if (list == null) {
                i = null;
            } else {
                i = a8f.i(list);
            }
            this.mimeTypes = i;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setPlayAdsAfterTime(double d) {
            this.playAdsAfterTime = d;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder
        public AdsRenderingSettingsImpl.AdsRenderingSettingsData.Builder setUiElements(Set<Object> set) {
            m8f h;
            if (set == null) {
                h = null;
            } else {
                int i = m8f.c;
                if ((set instanceof m8f) && !(set instanceof SortedSet)) {
                    m8f m8fVar = (m8f) set;
                    if (!m8fVar.f()) {
                        h = m8fVar;
                    }
                }
                Object[] array = set.toArray();
                h = m8f.h(array.length, array);
            }
            this.uiElements = h;
            return this;
        }

        public Builder() {
        }
    }
}
