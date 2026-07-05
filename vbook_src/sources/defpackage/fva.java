package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fva  reason: default package */
/* loaded from: classes.dex */
public final class fva {
    public final int a;
    public final int b;
    public final uva c;

    public fva(int i, int i2, uva uvaVar) {
        this.a = i;
        this.b = i2;
        this.c = uvaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fva) {
                fva fvaVar = (fva) obj;
                if (this.a != fvaVar.a || this.b != fvaVar.b || !this.c.equals(fvaVar.c)) {
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
        StringBuilder r = hl5.r(this.a, this.b, "RenderSpan(start=", ", end=", ", style=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
}
