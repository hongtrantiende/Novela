package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.VolumeUpdateData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_VolumeUpdateData extends VolumeUpdateData {
    private final float volume;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends VolumeUpdateData.Builder {
        private byte set$0;
        private float volume;

        @Override // com.google.ads.interactivemedia.v3.impl.data.VolumeUpdateData.Builder
        public VolumeUpdateData build() {
            if (this.set$0 == 1) {
                return new AutoValue_VolumeUpdateData(this.volume, null);
            }
            vs.k("Missing required properties: volume");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.VolumeUpdateData.Builder
        public VolumeUpdateData.Builder volume(float f) {
            this.volume = f;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }
    }

    private AutoValue_VolumeUpdateData(float f) {
        this.volume = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof VolumeUpdateData) && Float.floatToIntBits(this.volume) == Float.floatToIntBits(((VolumeUpdateData) obj).volume())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        float f = this.volume;
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 25);
        sb.append("VolumeUpdateData{volume=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.VolumeUpdateData
    public float volume() {
        return this.volume;
    }

    public /* synthetic */ AutoValue_VolumeUpdateData(float f, byte[] bArr) {
        this(f);
    }
}
