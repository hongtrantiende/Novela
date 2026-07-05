package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g58  reason: default package */
/* loaded from: classes3.dex */
public final class g58 {
    public final nt6 a;
    public final List b;

    public g58(nt6 nt6Var, List list) {
        nt6Var.getClass();
        list.getClass();
        this.a = nt6Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g58)) {
            return false;
        }
        g58 g58Var = (g58) obj;
        if (c16.i(this.a, g58Var.a) && c16.i(this.b, g58Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationSection(date=" + this.a + ", notifications=" + this.b + ")";
    }
}
