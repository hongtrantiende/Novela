package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: md8  reason: default package */
/* loaded from: classes.dex */
public final class md8 extends pe8 {
    public static final md8 c = new pe8(0, 2, 1);

    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        int i;
        int F;
        wy5 wy5Var = (wy5) vh1Var.d(0);
        int c2 = eqaVar.c((lv4) vh1Var.d(1));
        if (eqaVar.t >= c2) {
            ex1.a("Check failed");
        }
        sve.u(eqaVar, nyVar, c2);
        int i2 = eqaVar.t;
        int i3 = eqaVar.v;
        while (i3 >= 0 && !eqaVar.y(i3)) {
            i3 = eqaVar.G(i3, eqaVar.b);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (eqaVar.v(i2, i4)) {
                if (eqaVar.y(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                if (eqaVar.y(i4)) {
                    F = 1;
                } else {
                    F = eqaVar.F(i4);
                }
                i5 += F;
                i4 += eqaVar.u(i4);
            }
        }
        while (true) {
            i = eqaVar.t;
            if (i >= c2) {
                break;
            } else if (eqaVar.v(c2, i)) {
                int i6 = eqaVar.t;
                if (i6 < eqaVar.u && (eqaVar.b[(eqaVar.r(i6) * 5) + 1] & 1073741824) != 0) {
                    nyVar.e(eqaVar.E(eqaVar.t));
                    i5 = 0;
                }
                eqaVar.R();
            } else {
                i5 += eqaVar.N();
            }
        }
        if (i != c2) {
            ex1.a("Check failed");
        }
        wy5Var.a = i5;
    }
}
