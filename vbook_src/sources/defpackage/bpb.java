package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bpb  reason: default package */
/* loaded from: classes3.dex */
public final class bpb {
    public final boolean a;
    public final boolean b;
    public final List c;

    public bpb(boolean z, boolean z2, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpb)) {
            return false;
        }
        bpb bpbVar = (bpb) obj;
        if (this.a == bpbVar.a && this.b == bpbVar.b && c16.i(this.c, bpbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.n(rs8.p("TextContextMenuState(isShowContextOneLine=", this.a, ", isShowContextHighlight=", this.b, ", contextMenuItems="), this.c, ")");
    }
}
