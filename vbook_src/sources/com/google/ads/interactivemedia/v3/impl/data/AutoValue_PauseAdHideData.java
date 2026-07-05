package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_PauseAdHideData extends PauseAdHideData {
    private final double fadeDuration;
    private final String pauseAdId;

    public AutoValue_PauseAdHideData(String str, double d) {
        if (str != null) {
            this.pauseAdId = str;
            this.fadeDuration = d;
            return;
        }
        xk5.k("Null pauseAdId");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PauseAdHideData) {
            PauseAdHideData pauseAdHideData = (PauseAdHideData) obj;
            if (this.pauseAdId.equals(pauseAdHideData.pauseAdId()) && Double.doubleToLongBits(this.fadeDuration) == Double.doubleToLongBits(pauseAdHideData.fadeDuration())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdHideData
    public double fadeDuration() {
        return this.fadeDuration;
    }

    public int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.fadeDuration) >>> 32) ^ Double.doubleToLongBits(this.fadeDuration))) ^ ((this.pauseAdId.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.PauseAdHideData
    public String pauseAdId() {
        return this.pauseAdId;
    }

    public String toString() {
        String str = this.pauseAdId;
        int length = String.valueOf(str).length();
        double d = this.fadeDuration;
        StringBuilder sb = new StringBuilder(length + 41 + String.valueOf(d).length() + 1);
        sb.append("PauseAdHideData{pauseAdId=");
        sb.append(str);
        sb.append(", fadeDuration=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
