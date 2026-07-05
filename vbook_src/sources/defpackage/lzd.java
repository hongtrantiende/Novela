package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lzd  reason: default package */
/* loaded from: classes.dex */
public final class lzd {
    public int a;
    public long b;
    public Object c;
    public int d;

    public lzd(ml4 ml4Var, long j, int i, int i2) {
        this.c = ml4Var;
        this.b = j;
        this.a = i;
        this.d = i2;
    }

    public static /* synthetic */ String c(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public l0e a(qm8 qm8Var, boolean z, int i, int i2, int i3, int i4) {
        if (qm8Var.b) {
            ((ml4) this.c).getClass();
            return null;
        }
        return null;
    }

    public qm8 b(boolean z, int i, long j, jy5 jy5Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = this.a;
        int i6 = this.d;
        long j2 = this.b;
        ml4 ml4Var = (ml4) this.c;
        int i7 = i3 + i4;
        if (jy5Var == null) {
            return new qm8(true, true);
        }
        long j3 = jy5Var.a;
        ml4Var.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0) {
            return new qm8(true, true);
        }
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j3 >> 32)) < 0)) {
            if (z2) {
                return new qm8(true, true);
            }
            return new qm8(true, b(z, 0, jy5.a(x02.i(j2), (((int) (j & 4294967295L)) - i6) - i4), new jy5(jy5.a(((int) (j3 >> 32)) - i5, (int) (j3 & 4294967295L))), i2 + 1, i7, 0, true, false).b);
        }
        Math.max(i4, (int) (j3 & 4294967295L));
        return new qm8(false, false);
    }

    public lzd(h0e h0eVar) {
        h0eVar.getClass();
    }
}
