package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.GestureSignalData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_GestureSignalData extends GestureSignalData {
    private final String gestureSignal;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder implements GestureSignalData.Builder {
        private String gestureSignal;

        @Override // com.google.ads.interactivemedia.v3.impl.data.GestureSignalData.Builder
        public GestureSignalData build() {
            String str = this.gestureSignal;
            if (str != null) {
                return new AutoValue_GestureSignalData(str, null);
            }
            vs.k("Missing required properties: gestureSignal");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GestureSignalData.Builder
        public GestureSignalData.Builder gestureSignal(String str) {
            if (str != null) {
                this.gestureSignal = str;
                return this;
            }
            xk5.k("Null gestureSignal");
            return null;
        }
    }

    private AutoValue_GestureSignalData(String str) {
        this.gestureSignal = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GestureSignalData) {
            return this.gestureSignal.equals(((GestureSignalData) obj).gestureSignal());
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GestureSignalData
    public String gestureSignal() {
        return this.gestureSignal;
    }

    public int hashCode() {
        return this.gestureSignal.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.gestureSignal;
        return nk2.v(new StringBuilder(String.valueOf(str).length() + 33), "GestureSignalData{gestureSignal=", str, "}");
    }

    public /* synthetic */ AutoValue_GestureSignalData(String str, byte[] bArr) {
        this(str);
    }
}
