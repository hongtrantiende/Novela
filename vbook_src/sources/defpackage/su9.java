package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: su9  reason: default package */
/* loaded from: classes.dex */
public final class su9 extends v72 {
    @Override // defpackage.v72, defpackage.m06
    public final Object b(Object obj, float f) {
        if (c16.i(obj, lre.g) || obj == null) {
            su9 su9Var = uu9.a;
            za9 za9Var = new za9(nae.e);
            obj = new v72(za9Var, za9Var, za9Var, za9Var);
        }
        if (obj instanceof su9) {
            su9 su9Var2 = (su9) obj;
            su9 su9Var3 = uu9.a;
            return new v72(new tu9(this.a, su9Var2.a, f), new tu9(this.b, su9Var2.b, f), new tu9(this.c, su9Var2.c, f), new tu9(this.d, su9Var2.d, f));
        }
        return null;
    }

    @Override // defpackage.v72
    public final v72 c(z72 z72Var, z72 z72Var2, z72 z72Var3, z72 z72Var4) {
        return new v72(z72Var, z72Var2, z72Var3, z72Var4);
    }

    @Override // defpackage.v72
    public final kwe e(long j, float f, float f2, float f3, float f4, tc6 tc6Var) {
        float f5;
        float f6;
        float f7;
        float f8;
        if (f + f2 + f3 + f4 == nae.e) {
            return new tf8(npe.n(0L, j));
        }
        rk9 n = npe.n(0L, j);
        tc6 tc6Var2 = tc6.a;
        if (tc6Var == tc6Var2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        if (tc6Var == tc6Var2) {
            f6 = f2;
        } else {
            f6 = f;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        if (tc6Var == tc6Var2) {
            f7 = f3;
        } else {
            f7 = f4;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
        if (tc6Var == tc6Var2) {
            f8 = f4;
        } else {
            f8 = f3;
        }
        return new uf8(vte.d(n, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su9)) {
            return false;
        }
        su9 su9Var = (su9) obj;
        if (c16.i(this.a, su9Var.a) && c16.i(this.b, su9Var.b) && c16.i(this.c, su9Var.c) && c16.i(this.d, su9Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
