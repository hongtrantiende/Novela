package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w13  reason: default package */
/* loaded from: classes.dex */
public final class w13 implements r13 {
    public final float a;
    public final float b;
    public final np4 c;

    public w13(float f, float f2, np4 np4Var) {
        this.a = f;
        this.b = f2;
        this.c = np4Var;
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.b;
    }

    @Override // defpackage.r13
    public final long P(float f) {
        return zr1.x(this.c.a(f), 4294967296L);
    }

    @Override // defpackage.r13
    public final float c0(long j) {
        if (f4c.a(e4c.b(j), 4294967296L)) {
            return this.c.b(e4c.c(j));
        }
        vs.k("Only Sp can convert to Px");
        return nae.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w13) {
                w13 w13Var = (w13) obj;
                if (Float.compare(this.a, w13Var.a) != 0 || Float.compare(this.b, w13Var.b) != 0 || !this.c.equals(w13Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.r13
    public final float f() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + nk2.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("DensityWithConverter(density=", this.a, ", fontScale=", this.b, ", converter=");
        x.append(this.c);
        x.append(")");
        return x.toString();
    }
}
