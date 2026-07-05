package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_UniversalAdIdData extends UniversalAdIdData {
    private final String adIdRegistry;
    private final String adIdValue;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends UniversalAdIdData.Builder {
        private String adIdRegistry;
        private String adIdValue;

        @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData.Builder
        public UniversalAdIdData build() {
            return new AutoValue_UniversalAdIdData(this.adIdValue, this.adIdRegistry, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData.Builder
        public UniversalAdIdData.Builder setAdIdRegistry(String str) {
            this.adIdRegistry = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData.Builder
        public UniversalAdIdData.Builder setAdIdValue(String str) {
            this.adIdValue = str;
            return this;
        }
    }

    private AutoValue_UniversalAdIdData(String str, String str2) {
        this.adIdValue = str;
        this.adIdRegistry = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData
    public String adIdRegistry() {
        return this.adIdRegistry;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.UniversalAdIdData
    public String adIdValue() {
        return this.adIdValue;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UniversalAdIdData) {
            UniversalAdIdData universalAdIdData = (UniversalAdIdData) obj;
            String str = this.adIdValue;
            if (str != null ? str.equals(universalAdIdData.adIdValue()) : universalAdIdData.adIdValue() == null) {
                String str2 = this.adIdRegistry;
                if (str2 != null ? str2.equals(universalAdIdData.adIdRegistry()) : universalAdIdData.adIdRegistry() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.adIdValue;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.adIdRegistry;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public String toString() {
        String str = this.adIdValue;
        int length = String.valueOf(str).length();
        String str2 = this.adIdRegistry;
        StringBuilder sb = new StringBuilder(length + 43 + String.valueOf(str2).length() + 1);
        nk2.C(sb, "UniversalAdIdData{adIdValue=", str, ", adIdRegistry=", str2);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ AutoValue_UniversalAdIdData(String str, String str2, byte[] bArr) {
        this(str, str2);
    }
}
