package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_VideoEnvironmentData extends VideoEnvironmentData {
    private final Integer downloadBandwidthKbps;
    private final boolean rendersUiNatively;

    public AutoValue_VideoEnvironmentData(Integer num, boolean z) {
        this.downloadBandwidthKbps = num;
        this.rendersUiNatively = z;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.VideoEnvironmentData
    public Integer downloadBandwidthKbps() {
        return this.downloadBandwidthKbps;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoEnvironmentData) {
            VideoEnvironmentData videoEnvironmentData = (VideoEnvironmentData) obj;
            Integer num = this.downloadBandwidthKbps;
            if (num != null ? num.equals(videoEnvironmentData.downloadBandwidthKbps()) : videoEnvironmentData.downloadBandwidthKbps() == null) {
                if (this.rendersUiNatively == videoEnvironmentData.rendersUiNatively()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        Integer num = this.downloadBandwidthKbps;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        if (true != this.rendersUiNatively) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ ((hashCode ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.VideoEnvironmentData
    public boolean rendersUiNatively() {
        return this.rendersUiNatively;
    }

    public String toString() {
        Integer num = this.downloadBandwidthKbps;
        int length = String.valueOf(num).length();
        boolean z = this.rendersUiNatively;
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(z).length() + 1);
        sb.append("VideoEnvironmentData{downloadBandwidthKbps=");
        sb.append(num);
        sb.append(", rendersUiNatively=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
