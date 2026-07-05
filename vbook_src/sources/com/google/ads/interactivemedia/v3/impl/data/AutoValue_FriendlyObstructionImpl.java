package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_FriendlyObstructionImpl extends FriendlyObstructionImpl {
    private final String detailedReason;
    private final st4 purpose;
    private final View view;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder implements FriendlyObstructionImpl.Builder {
        private String detailedReason;
        private st4 purpose;
        private View view;

        @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl.Builder
        public FriendlyObstructionImpl build() {
            st4 st4Var;
            View view = this.view;
            if (view != null && (st4Var = this.purpose) != null) {
                return new AutoValue_FriendlyObstructionImpl(view, st4Var, this.detailedReason, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.view == null) {
                sb.append(" view");
            }
            if (this.purpose == null) {
                sb.append(" purpose");
            }
            vs.k("Missing required properties:".concat(sb.toString()));
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl.Builder
        public FriendlyObstructionImpl.Builder detailedReason(String str) {
            this.detailedReason = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl.Builder
        public FriendlyObstructionImpl.Builder purpose(st4 st4Var) {
            if (st4Var != null) {
                this.purpose = st4Var;
                return this;
            }
            xk5.k("Null purpose");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl.Builder
        public FriendlyObstructionImpl.Builder view(View view) {
            if (view != null) {
                this.view = view;
                return this;
            }
            xk5.k("Null view");
            return null;
        }
    }

    private AutoValue_FriendlyObstructionImpl(View view, st4 st4Var, String str) {
        this.view = view;
        this.purpose = st4Var;
        this.detailedReason = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendlyObstructionImpl) {
            FriendlyObstructionImpl friendlyObstructionImpl = (FriendlyObstructionImpl) obj;
            if (this.view.equals(friendlyObstructionImpl.view()) && this.purpose.equals(friendlyObstructionImpl.purpose()) && ((str = this.detailedReason) != null ? str.equals(friendlyObstructionImpl.detailedReason()) : friendlyObstructionImpl.detailedReason() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.view.hashCode() ^ 1000003) * 1000003) ^ this.purpose.hashCode();
        String str = this.detailedReason;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ (hashCode2 * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl
    public st4 purpose() {
        return this.purpose;
    }

    public String toString() {
        st4 st4Var = this.purpose;
        String valueOf = String.valueOf(this.view);
        String valueOf2 = String.valueOf(st4Var);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = this.detailedReason;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 17 + String.valueOf(str).length() + 1);
        nk2.C(sb, "FriendlyObstructionImpl{view=", valueOf, ", purpose=", valueOf2);
        return nk2.v(sb, ", detailedReason=", str, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl
    public View view() {
        return this.view;
    }

    public /* synthetic */ AutoValue_FriendlyObstructionImpl(View view, st4 st4Var, String str, byte[] bArr) {
        this(view, st4Var, str);
    }
}
