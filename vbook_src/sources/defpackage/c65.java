package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c65  reason: default package */
/* loaded from: classes.dex */
public final class c65 {
    public static final c65 e = new c65(null, 15);
    public static final c65 f;
    public final float a;
    public final float b;
    public final float c;
    public final l65 d;

    static {
        l65.a.getClass();
        f = new c65(i65.c, 7);
        new c65(i65.d, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c65(defpackage.l65 r3, int r4) {
        /*
            r2 = this;
            r4 = r4 & 8
            if (r4 == 0) goto Lb
            i65 r3 = defpackage.l65.a
            r3.getClass()
            j65 r3 = defpackage.i65.b
        Lb:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = 1048576000(0x3e800000, float:0.25)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r4, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.<init>(l65, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c65) {
                c65 c65Var = (c65) obj;
                if (!rg3.b(this.a, c65Var.a) || !rg3.b(this.b, c65Var.b) || Float.compare(this.c, c65Var.c) != 0 || !c16.i(this.d, c65Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Highlight(width=", rg3.c(this.a), ", blurRadius=", rg3.c(this.b), ", alpha=");
        y.append(this.c);
        y.append(", style=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }

    public c65(float f2, float f3, float f4, l65 l65Var) {
        l65Var.getClass();
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = l65Var;
    }
}
