package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nr8  reason: default package */
/* loaded from: classes3.dex */
public final class nr8 {
    public final int a;
    public final int b;
    public final ArrayList c;

    public nr8(ArrayList arrayList, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nr8) {
                nr8 nr8Var = (nr8) obj;
                if (this.a != nr8Var.a || this.b != nr8Var.b || !this.c.equals(nr8Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "PdfTextBlock(charStart=", ", charEnd=", ", lines=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
}
