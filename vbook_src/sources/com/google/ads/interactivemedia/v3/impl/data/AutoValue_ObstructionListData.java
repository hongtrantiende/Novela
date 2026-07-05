package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.ObstructionListData;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_ObstructionListData extends ObstructionListData {
    private final a8f obstructions;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends ObstructionListData.Builder {
        private a8f obstructions;

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.Builder
        public ObstructionListData build() {
            a8f a8fVar = this.obstructions;
            if (a8fVar != null) {
                return new AutoValue_ObstructionListData(a8fVar, null);
            }
            vs.k("Missing required properties: obstructions");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.Builder
        public ObstructionListData.Builder obstructions(List<ObstructionListData.ObstructionData> list) {
            this.obstructions = a8f.i(list);
            return this;
        }
    }

    private AutoValue_ObstructionListData(a8f a8fVar) {
        this.obstructions = a8fVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ObstructionListData) {
            return this.obstructions.equals(((ObstructionListData) obj).obstructions());
        }
        return false;
    }

    public int hashCode() {
        return this.obstructions.hashCode() ^ 1000003;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData
    public a8f obstructions() {
        return this.obstructions;
    }

    public String toString() {
        String valueOf = String.valueOf(this.obstructions);
        return nk2.v(new StringBuilder(valueOf.length() + 34), "ObstructionListData{obstructions=", valueOf, "}");
    }

    public /* synthetic */ AutoValue_ObstructionListData(a8f a8fVar, byte[] bArr) {
        this(a8fVar);
    }
}
