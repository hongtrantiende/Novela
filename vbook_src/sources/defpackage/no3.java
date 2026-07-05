package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: no3  reason: default package */
/* loaded from: classes3.dex */
public final class no3 {
    public final List a;
    public final lo3 b;

    public no3(lo3 lo3Var, List list) {
        list.getClass();
        lo3Var.getClass();
        this.a = list;
        this.b = lo3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no3)) {
            return false;
        }
        no3 no3Var = (no3) obj;
        if (c16.i(this.a, no3Var.a) && c16.i(this.b, no3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EditorCheckpoint(blocks=" + this.a + ", ui=" + this.b + ")";
    }
}
