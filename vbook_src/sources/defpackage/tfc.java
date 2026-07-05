package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tfc  reason: default package */
/* loaded from: classes3.dex */
public final class tfc implements wfc {
    public final List a;
    public final tu1 b;

    public tfc(List list, tu1 tu1Var) {
        this.a = list;
        this.b = tu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tfc) {
            tfc tfcVar = (tfc) obj;
            if (this.a.equals(tfcVar.a) && this.b == tfcVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Custom(trackedStyles=" + this.a + ", content=" + this.b + ")";
    }
}
