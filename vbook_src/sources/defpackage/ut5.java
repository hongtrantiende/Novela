package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ut5  reason: default package */
/* loaded from: classes3.dex */
public final class ut5 {
    public final List a;
    public final List b;

    public ut5(List list, List list2) {
        list.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ut5) {
                ut5 ut5Var = (ut5) obj;
                if (!c16.i(this.a, ut5Var.a) || !this.b.equals(ut5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IndentationOutlineNormalizationResult(blocks=" + this.a + ", changedBlockIndices=" + this.b + ")";
    }
}
