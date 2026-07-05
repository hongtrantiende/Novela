package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vp8  reason: default package */
/* loaded from: classes3.dex */
public final class vp8 {
    public final int a;
    public final List b;

    public vp8(int i, List list) {
        list.getClass();
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp8)) {
            return false;
        }
        vp8 vp8Var = (vp8) obj;
        if (this.a == vp8Var.a && c16.i(this.b, vp8Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PdfHighlight(pageIndex=" + this.a + ", rects=" + this.b + ")";
    }
}
