package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_MarketAppInfo extends MarketAppInfo {
    private final int appVersion;
    private final String packageName;

    public AutoValue_MarketAppInfo(int i, String str) {
        this.appVersion = i;
        if (str != null) {
            this.packageName = str;
        } else {
            xk5.k("Null packageName");
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.MarketAppInfo
    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MarketAppInfo) {
            MarketAppInfo marketAppInfo = (MarketAppInfo) obj;
            if (this.appVersion == marketAppInfo.appVersion() && this.packageName.equals(marketAppInfo.packageName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.appVersion;
        return this.packageName.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.MarketAppInfo
    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        int i = this.appVersion;
        int length = String.valueOf(i).length();
        String str = this.packageName;
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(str).length() + 1);
        sb.append("MarketAppInfo{appVersion=");
        sb.append(i);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
