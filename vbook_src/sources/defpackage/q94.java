package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q94  reason: default package */
/* loaded from: classes.dex */
public final class q94 {
    public final xy4 a;
    public final xy4 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ q94(defpackage.xy4 r2, int r3) {
        /*
            r1 = this;
            r3 = r3 & 2
            vy4 r0 = defpackage.vy4.a
            if (r3 == 0) goto L7
            r2 = r0
        L7:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q94.<init>(xy4, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q94)) {
            return false;
        }
        q94 q94Var = (q94) obj;
        if (c16.i(this.a, q94Var.a) && c16.i(this.b, q94Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.a + ", nonSizeModifiers=" + this.b + ')';
    }

    public q94(xy4 xy4Var, xy4 xy4Var2) {
        this.a = xy4Var;
        this.b = xy4Var2;
    }
}
