package com.google.ads.interactivemedia.v3.impl.data;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class AutoValue_SecureSignalsData extends SecureSignalsData {
    private final SecureSignalsVersionData adapterVersion;
    private final Boolean isPublisherCreated;
    private final String name;
    private final SecureSignalsVersionData sdkVersion;
    private final String signals;

    public AutoValue_SecureSignalsData(SecureSignalsVersionData secureSignalsVersionData, SecureSignalsVersionData secureSignalsVersionData2, String str, String str2, Boolean bool) {
        this.adapterVersion = secureSignalsVersionData;
        this.sdkVersion = secureSignalsVersionData2;
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.signals = str2;
                if (bool != null) {
                    this.isPublisherCreated = bool;
                    return;
                } else {
                    xk5.k("Null isPublisherCreated");
                    throw null;
                }
            }
            xk5.k("Null signals");
            throw null;
        }
        xk5.k("Null name");
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SecureSignalsData
    public SecureSignalsVersionData adapterVersion() {
        return this.adapterVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecureSignalsData) {
            SecureSignalsData secureSignalsData = (SecureSignalsData) obj;
            SecureSignalsVersionData secureSignalsVersionData = this.adapterVersion;
            if (secureSignalsVersionData != null ? secureSignalsVersionData.equals(secureSignalsData.adapterVersion()) : secureSignalsData.adapterVersion() == null) {
                SecureSignalsVersionData secureSignalsVersionData2 = this.sdkVersion;
                if (secureSignalsVersionData2 != null ? secureSignalsVersionData2.equals(secureSignalsData.sdkVersion()) : secureSignalsData.sdkVersion() == null) {
                    if (this.name.equals(secureSignalsData.name()) && this.signals.equals(secureSignalsData.signals()) && this.isPublisherCreated.equals(secureSignalsData.isPublisherCreated())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        SecureSignalsVersionData secureSignalsVersionData = this.adapterVersion;
        int i = 0;
        if (secureSignalsVersionData == null) {
            hashCode = 0;
        } else {
            hashCode = secureSignalsVersionData.hashCode();
        }
        SecureSignalsVersionData secureSignalsVersionData2 = this.sdkVersion;
        if (secureSignalsVersionData2 != null) {
            i = secureSignalsVersionData2.hashCode();
        }
        return this.isPublisherCreated.hashCode() ^ ((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.signals.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SecureSignalsData
    public Boolean isPublisherCreated() {
        return this.isPublisherCreated;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SecureSignalsData
    public String name() {
        return this.name;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SecureSignalsData
    public SecureSignalsVersionData sdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SecureSignalsData
    public String signals() {
        return this.signals;
    }

    public String toString() {
        SecureSignalsVersionData secureSignalsVersionData = this.sdkVersion;
        String valueOf = String.valueOf(this.adapterVersion);
        String valueOf2 = String.valueOf(secureSignalsVersionData);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = this.name;
        int length3 = String.valueOf(str).length();
        String str2 = this.signals;
        int length4 = String.valueOf(str2).length();
        Boolean bool = this.isPublisherCreated;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 7 + length3 + 10 + length4 + 21 + String.valueOf(bool).length() + 1);
        nk2.C(sb, "SecureSignalsData{adapterVersion=", valueOf, ", sdkVersion=", valueOf2);
        nk2.C(sb, ", name=", str, ", signals=", str2);
        sb.append(", isPublisherCreated=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }
}
