package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_IdentifierInfo extends IdentifierInfo {
    private final String adsIdentityToken;
    private final String appSetId;
    private final int appSetIdScope;
    private final String deviceId;
    private final String idType;
    private final boolean isLimitedAdTracking;

    public AutoValue_IdentifierInfo(String str, String str2, boolean z, String str3, int i, String str4) {
        this.deviceId = str;
        if (str2 != null) {
            this.idType = str2;
            this.isLimitedAdTracking = z;
            if (str3 != null) {
                this.appSetId = str3;
                this.appSetIdScope = i;
                if (str4 != null) {
                    this.adsIdentityToken = str4;
                    return;
                } else {
                    xk5.k("Null adsIdentityToken");
                    throw null;
                }
            }
            xk5.k("Null appSetId");
            throw null;
        }
        xk5.k("Null idType");
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public String adsIdentityToken() {
        return this.adsIdentityToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public String appSetId() {
        return this.appSetId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public int appSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public String deviceId() {
        return this.deviceId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IdentifierInfo) {
            IdentifierInfo identifierInfo = (IdentifierInfo) obj;
            String str = this.deviceId;
            if (str != null ? str.equals(identifierInfo.deviceId()) : identifierInfo.deviceId() == null) {
                if (this.idType.equals(identifierInfo.idType()) && this.isLimitedAdTracking == identifierInfo.isLimitedAdTracking() && this.appSetId.equals(identifierInfo.appSetId()) && this.appSetIdScope == identifierInfo.appSetIdScope() && this.adsIdentityToken.equals(identifierInfo.adsIdentityToken())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        String str = this.deviceId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode ^ 1000003) * 1000003) ^ this.idType.hashCode();
        if (true != this.isLimitedAdTracking) {
            i = 1237;
        } else {
            i = 1231;
        }
        return this.adsIdentityToken.hashCode() ^ (((((((hashCode2 * 1000003) ^ i) * 1000003) ^ this.appSetId.hashCode()) * 1000003) ^ this.appSetIdScope) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public String idType() {
        return this.idType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public boolean isLimitedAdTracking() {
        return this.isLimitedAdTracking;
    }

    public String toString() {
        String str = this.deviceId;
        int length = String.valueOf(str).length();
        String str2 = this.idType;
        int length2 = String.valueOf(str2).length();
        boolean z = this.isLimitedAdTracking;
        int length3 = String.valueOf(z).length();
        String str3 = this.appSetId;
        int length4 = String.valueOf(str3).length();
        int i = this.appSetIdScope;
        int length5 = String.valueOf(i).length();
        String str4 = this.adsIdentityToken;
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 22 + length3 + 11 + length4 + 16 + length5 + 19 + String.valueOf(str4).length() + 1);
        nk2.C(sb, "IdentifierInfo{deviceId=", str, ", idType=", str2);
        sb.append(", isLimitedAdTracking=");
        sb.append(z);
        sb.append(", appSetId=");
        sb.append(str3);
        sb.append(", appSetIdScope=");
        sb.append(i);
        sb.append(", adsIdentityToken=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
