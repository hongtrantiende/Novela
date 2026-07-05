package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hd8  reason: default package */
/* loaded from: classes.dex */
public final class hd8 extends pe8 {
    public static final hd8 c = new pe8(0, 2, 1);

    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        lv4 lv4Var = (lv4) vh1Var.d(0);
        Object d = vh1Var.d(1);
        if (d instanceof wv4) {
            wv4 wv4Var = (wv4) d;
            ((gw7) zm9Var.d).b(wv4Var);
            ((uv7) zm9Var.g).a(wv4Var);
        }
        if (eqaVar.n != 0) {
            ex1.a("Can only append a slot if not current inserting");
        }
        int i = eqaVar.i;
        int i2 = eqaVar.j;
        int c2 = eqaVar.c(lv4Var);
        int g = eqaVar.g(eqaVar.r(c2 + 1), eqaVar.b);
        eqaVar.i = g;
        eqaVar.j = g;
        eqaVar.x(1, c2);
        if (i >= g) {
            i++;
            i2++;
        }
        eqaVar.c[g] = d;
        eqaVar.i = i;
        eqaVar.j = i2;
    }
}
