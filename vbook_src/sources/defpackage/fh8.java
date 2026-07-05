package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fh8  reason: default package */
/* loaded from: classes3.dex */
public final class fh8 {
    public final int a;
    public final int b;
    public final List c;

    public fh8(int i, List list, int i2) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh8)) {
            return false;
        }
        fh8 fh8Var = (fh8) obj;
        if (this.a == fh8Var.a && this.b == fh8Var.b && c16.i(this.c, fh8Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return rs8.n(hl5.r(this.a, this.b, "PDFTextBlock(charStart=", ", charEnd=", ", lines="), this.c, ")");
    }
}
