package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.CompanionAdData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_CompanionAdData extends CompanionAdData {
    private final String apiFramework;
    private final String resourceValue;
    private final SizeData size;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends CompanionAdData.Builder {
        private String apiFramework;
        private String resourceValue;
        private SizeData size;

        @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData.Builder
        public CompanionAdData build() {
            return new AutoValue_CompanionAdData(this.apiFramework, this.resourceValue, this.size, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData.Builder
        public CompanionAdData.Builder setApiFramework(String str) {
            this.apiFramework = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData.Builder
        public CompanionAdData.Builder setResourceValue(String str) {
            this.resourceValue = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData.Builder
        public CompanionAdData.Builder setSize(SizeData sizeData) {
            this.size = sizeData;
            return this;
        }
    }

    private AutoValue_CompanionAdData(String str, String str2, SizeData sizeData) {
        this.apiFramework = str;
        this.resourceValue = str2;
        this.size = sizeData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData
    public String apiFramework() {
        return this.apiFramework;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompanionAdData) {
            CompanionAdData companionAdData = (CompanionAdData) obj;
            String str = this.apiFramework;
            if (str != null ? str.equals(companionAdData.apiFramework()) : companionAdData.apiFramework() == null) {
                String str2 = this.resourceValue;
                if (str2 != null ? str2.equals(companionAdData.resourceValue()) : companionAdData.resourceValue() == null) {
                    SizeData sizeData = this.size;
                    if (sizeData != null ? sizeData.equals(companionAdData.size()) : companionAdData.size() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.apiFramework;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.resourceValue;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        SizeData sizeData = this.size;
        if (sizeData != null) {
            i = sizeData.hashCode();
        }
        return (((i2 * 1000003) ^ hashCode2) * 1000003) ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData
    public String resourceValue() {
        return this.resourceValue;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionAdData
    public SizeData size() {
        return this.size;
    }

    public String toString() {
        String valueOf = String.valueOf(this.size);
        String str = this.apiFramework;
        int length = String.valueOf(str).length();
        String str2 = this.resourceValue;
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(str2).length() + 7 + valueOf.length() + 1);
        nk2.C(sb, "CompanionAdData{apiFramework=", str, ", resourceValue=", str2);
        return nk2.v(sb, ", size=", valueOf, "}");
    }

    public /* synthetic */ AutoValue_CompanionAdData(String str, String str2, SizeData sizeData, byte[] bArr) {
        this(str, str2, sizeData);
    }
}
