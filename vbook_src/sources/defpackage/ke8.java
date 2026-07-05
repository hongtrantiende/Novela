package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ke8  reason: default package */
/* loaded from: classes.dex */
public final class ke8 extends pe8 {
    public static final ke8 c = new pe8(1, 0, 2);

    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        int c2 = vh1Var.c(0);
        int i = eqaVar.v;
        int P = eqaVar.P(eqaVar.r(i), eqaVar.b);
        int g = eqaVar.g(eqaVar.r(i + 1), eqaVar.b);
        for (int max = Math.max(P, g - c2); max < g; max++) {
            Object obj = eqaVar.c[eqaVar.h(max)];
            if (obj instanceof wv4) {
                zm9Var.f((wv4) obj);
            } else if (obj instanceof ek9) {
                ((ek9) obj).c();
            }
        }
        if (c2 <= 0) {
            ex1.a("Check failed");
        }
        int i2 = eqaVar.v;
        int P2 = eqaVar.P(eqaVar.r(i2), eqaVar.b);
        int g2 = eqaVar.g(eqaVar.r(i2 + 1), eqaVar.b) - c2;
        if (g2 < P2) {
            ex1.a("Check failed");
        }
        eqaVar.L(g2, c2, i2);
        int i3 = eqaVar.i;
        if (i3 >= P2) {
            eqaVar.i = i3 - c2;
        }
    }
}
