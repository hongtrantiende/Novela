package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.BoundingRectData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_BoundingRectData extends BoundingRectData {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends BoundingRectData.Builder {
        private int height;
        private int left;
        private byte set$0;
        private int top;
        private int width;

        @Override // com.google.ads.interactivemedia.v3.impl.data.BoundingRectData.Builder
        public BoundingRectData build() {
            if (this.set$0 != 15) {
                StringBuilder sb = new StringBuilder();
                if ((this.set$0 & 1) == 0) {
                    sb.append(" left");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" top");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" height");
                }
                if ((this.set$0 & 8) == 0) {
                    sb.append(" width");
                }
                vs.k("Missing required properties:".concat(sb.toString()));
                return null;
            }
            return new AutoValue_BoundingRectData(this.left, this.top, this.height, this.width, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.BoundingRectData.Builder
        public BoundingRectData.Builder height(int i) {
            this.height = i;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.BoundingRectData.Builder
        public BoundingRectData.Builder left(int i) {
            this.left = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.BoundingRectData.Builder
        public BoundingRectData.Builder top(int i) {
            this.top = i;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.BoundingRectData.Builder
        public BoundingRectData.Builder width(int i) {
            this.width = i;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }
    }

    private AutoValue_BoundingRectData(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.height = i3;
        this.width = i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BoundingRectData) {
            BoundingRectData boundingRectData = (BoundingRectData) obj;
            if (this.left == boundingRectData.left() && this.top == boundingRectData.top() && this.height == boundingRectData.height() && this.width == boundingRectData.width()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.width ^ ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BoundingRectData
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BoundingRectData
    public int left() {
        return this.left;
    }

    public String toString() {
        int i = this.left;
        int length = String.valueOf(i).length();
        int i2 = this.top;
        int length2 = String.valueOf(i2).length();
        int i3 = this.height;
        int length3 = String.valueOf(i3).length();
        int i4 = this.width;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 9 + length3 + 8 + String.valueOf(i4).length() + 1);
        a82.t(i, i2, "BoundingRectData{left=", ", top=", sb);
        a82.t(i3, i4, ", height=", ", width=", sb);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BoundingRectData
    public int top() {
        return this.top;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BoundingRectData
    public int width() {
        return this.width;
    }

    public /* synthetic */ AutoValue_BoundingRectData(int i, int i2, int i3, int i4, byte[] bArr) {
        this(i, i2, i3, i4);
    }
}
