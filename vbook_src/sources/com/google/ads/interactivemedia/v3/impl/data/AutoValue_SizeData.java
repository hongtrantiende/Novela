package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_SizeData extends SizeData {
    private final Integer height;
    private final Integer width;

    public AutoValue_SizeData(Integer num, Integer num2) {
        if (num != null) {
            this.width = num;
            if (num2 != null) {
                this.height = num2;
                return;
            } else {
                xk5.k("Null height");
                throw null;
            }
        }
        xk5.k("Null width");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SizeData) {
            SizeData sizeData = (SizeData) obj;
            if (this.width.equals(sizeData.width()) && this.height.equals(sizeData.height())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.height.hashCode() ^ ((this.width.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SizeData
    public Integer height() {
        return this.height;
    }

    public String toString() {
        Integer num = this.width;
        int length = String.valueOf(num).length();
        Integer num2 = this.height;
        StringBuilder sb = new StringBuilder(length + 24 + String.valueOf(num2).length() + 1);
        sb.append("SizeData{width=");
        sb.append(num);
        sb.append(", height=");
        sb.append(num2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.SizeData
    public Integer width() {
        return this.width;
    }
}
