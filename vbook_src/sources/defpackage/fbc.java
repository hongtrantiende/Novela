package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fbc  reason: default package */
/* loaded from: classes3.dex */
public final class fbc {
    public final boolean a;
    public final List b;

    public fbc(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbc)) {
            return false;
        }
        fbc fbcVar = (fbc) obj;
        if (this.a == fbcVar.a && c16.i(this.b, fbcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TocRuleState(isLoading=" + this.a + ", tocRules=" + this.b + ")";
    }
}
