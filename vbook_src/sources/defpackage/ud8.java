package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ud8  reason: default package */
/* loaded from: classes.dex */
public final class ud8 extends pe8 {
    public static final ud8 d = new ud8(1, 2, 0);
    public static final ud8 e = new ud8(1, 1, 1);
    public static final ud8 f = new ud8(1, 2, 2);
    public static final ud8 g = new ud8(1, 1, 3);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud8(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        switch (this.c) {
            case 0:
                Object invoke = ((vt4) vh1Var.d(0)).invoke();
                lv4 lv4Var = (lv4) vh1Var.d(1);
                int c = vh1Var.c(0);
                lv4Var.getClass();
                eqaVar.X(eqaVar.c(lv4Var), invoke);
                nyVar.p(c, invoke);
                nyVar.e(invoke);
                return;
            case 1:
                lv4 lv4Var2 = (lv4) vh1Var.d(0);
                int c2 = vh1Var.c(0);
                nyVar.n();
                lv4Var2.getClass();
                nyVar.c(c2, eqaVar.E(eqaVar.c(lv4Var2)));
                return;
            case 2:
                Object d2 = vh1Var.d(0);
                lv4 lv4Var3 = (lv4) vh1Var.d(1);
                int c3 = vh1Var.c(0);
                if (d2 instanceof wv4) {
                    wv4 wv4Var = (wv4) d2;
                    ((gw7) zm9Var.d).b(wv4Var);
                    ((uv7) zm9Var.g).a(wv4Var);
                }
                Object M = eqaVar.M(eqaVar.c(lv4Var3), d2, c3);
                if (M instanceof wv4) {
                    zm9Var.f((wv4) M);
                    return;
                } else if (M instanceof ek9) {
                    ((ek9) M).c();
                    return;
                } else {
                    return;
                }
            default:
                Object d3 = vh1Var.d(0);
                int c4 = vh1Var.c(0);
                if (d3 instanceof wv4) {
                    wv4 wv4Var2 = (wv4) d3;
                    ((gw7) zm9Var.d).b(wv4Var2);
                    ((uv7) zm9Var.g).a(wv4Var2);
                }
                Object M2 = eqaVar.M(eqaVar.t, d3, c4);
                if (M2 instanceof wv4) {
                    zm9Var.f((wv4) M2);
                    return;
                } else if (M2 instanceof ek9) {
                    ((ek9) M2).c();
                    return;
                } else {
                    return;
                }
        }
    }

    @Override // defpackage.pe8
    public lv4 b(vh1 vh1Var) {
        switch (this.c) {
            case 0:
                return (lv4) vh1Var.d(1);
            case 1:
                return (lv4) vh1Var.d(0);
            default:
                return super.b(vh1Var);
        }
    }
}
