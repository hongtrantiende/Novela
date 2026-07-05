package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_SecureSignalsVersionData extends SecureSignalsVersionData {
    private final int major;
    private final int micro;
    private final int minor;

    public AutoValue_SecureSignalsVersionData(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.micro = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecureSignalsVersionData) {
            SecureSignalsVersionData secureSignalsVersionData = (SecureSignalsVersionData) obj;
            if (this.major == secureSignalsVersionData.major() && this.minor == secureSignalsVersionData.minor() && this.micro == secureSignalsVersionData.micro()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.micro ^ ((((this.major ^ 1000003) * 1000003) ^ this.minor) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SecureSignalsVersionData
    public int major() {
        return this.major;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SecureSignalsVersionData
    public int micro() {
        return this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SecureSignalsVersionData
    public int minor() {
        return this.minor;
    }

    public String toString() {
        int i = this.major;
        int length = String.valueOf(i).length();
        int i2 = this.minor;
        int length2 = String.valueOf(i2).length();
        int i3 = this.micro;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 8 + String.valueOf(i3).length() + 1);
        a82.t(i, i2, "SecureSignalsVersionData{major=", ", minor=", sb);
        sb.append(", micro=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
