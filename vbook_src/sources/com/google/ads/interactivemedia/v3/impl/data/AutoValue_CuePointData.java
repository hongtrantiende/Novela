package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_CuePointData extends CuePointData {
    private final double end;
    private final boolean played;
    private final double start;

    public AutoValue_CuePointData(double d, double d2, boolean z) {
        this.start = d;
        this.end = d2;
        this.played = z;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CuePointData) {
            CuePointData cuePointData = (CuePointData) obj;
            if (Double.doubleToLongBits(this.start) == Double.doubleToLongBits(cuePointData.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(cuePointData.end()) && this.played == cuePointData.played()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        long doubleToLongBits = (Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start);
        long doubleToLongBits2 = (Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end);
        if (true != this.played) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ ((((((int) doubleToLongBits) ^ 1000003) * 1000003) ^ ((int) doubleToLongBits2)) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public boolean played() {
        return this.played;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public double start() {
        return this.start;
    }

    public String toString() {
        double d = this.start;
        int length = String.valueOf(d).length();
        double d2 = this.end;
        int length2 = String.valueOf(d2).length();
        boolean z = this.played;
        StringBuilder sb = new StringBuilder(length + 25 + length2 + 9 + String.valueOf(z).length() + 1);
        sb.append("CuePointData{start=");
        sb.append(d);
        sb.append(", end=");
        sb.append(d2);
        sb.append(", played=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
