package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bh8  reason: default package */
/* loaded from: classes3.dex */
public final class bh8 {
    public final String a;
    public final int b;
    public final List c;

    public bh8(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bh8) {
                bh8 bh8Var = (bh8) obj;
                if (!this.a.equals(bh8Var.a) || this.b != bh8Var.b || !this.c.equals(bh8Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rs8.n(s21.s("PDFOutline(title=", this.a, ", pageIndex=", this.b, ", children="), this.c, ")");
    }
}
