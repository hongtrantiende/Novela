package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r65  reason: default package */
/* loaded from: classes3.dex */
public final class r65 {
    public final long a;
    public final List b;

    public r65(long j, List list) {
        list.getClass();
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r65)) {
            return false;
        }
        r65 r65Var = (r65) obj;
        if (this.a == r65Var.a && c16.i(this.b, r65Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HistorySection(time=" + this.a + ", books=" + this.b + ")";
    }
}
