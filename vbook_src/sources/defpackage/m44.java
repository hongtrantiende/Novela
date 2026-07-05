package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m44  reason: default package */
/* loaded from: classes3.dex */
public final class m44 {
    public final List a = ks3.a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof m44) || !this.a.equals(((m44) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "ExtensionDevListState(isLoading=true, extensions=" + this.a + ")";
    }
}
