package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fq1  reason: default package */
/* loaded from: classes3.dex */
public final class fq1 extends fdd {
    public final String C;
    public final zq1 D;
    public final cza E;
    public final s02 F;
    public final oc5 G;
    public final int c;
    public final int d;
    public final long e;
    public final long f;

    public fq1(int i, int i2, long j, long j2, String str, zq1 zq1Var) {
        boolean z;
        Object value;
        str.getClass();
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.C = str;
        this.D = zq1Var;
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        cza a = dza.a(new eq1(null, false, z, false));
        this.E = a;
        this.F = new s02();
        this.G = axe.i();
        if (i3 >= 0 && ((eq1) a.getValue()).d == null) {
            do {
                value = a.getValue();
            } while (!a.l(value, eq1.a((eq1) value, false, true, null, 11)));
            hk1 a2 = jdd.a(this);
            sw2 sw2Var = ab3.a;
            f(a2, ru2.c, new db(this, null, 8));
        }
    }
}
