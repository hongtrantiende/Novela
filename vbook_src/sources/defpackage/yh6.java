package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yh6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yh6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj8 b;

    public /* synthetic */ yh6(rj8 rj8Var, int i) {
        this.a = i;
        this.b = rj8Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int n;
        int k;
        int k2;
        int i = this.a;
        rj8 rj8Var = this.b;
        switch (i) {
            case 0:
                n = rj8Var.n();
                break;
            case 1:
                n = rj8Var.n();
                break;
            case 2:
                if (rj8Var.k.a()) {
                    k = rj8Var.r.h();
                } else {
                    k = rj8Var.k();
                }
                return Integer.valueOf(k);
            case 3:
                boolean a = rj8Var.k.a();
                em8 em8Var = rj8Var.q;
                if (!a) {
                    k2 = rj8Var.k();
                } else if (em8Var.h() != -1) {
                    k2 = em8Var.h();
                } else {
                    float abs = Math.abs(rj8Var.l());
                    r13 r13Var = rj8Var.n;
                    tj8 tj8Var = uj8.a;
                    if (abs >= Math.abs(Math.min(r13Var.L0(56.0f), rj8Var.o() / 2.0f) / rj8Var.o())) {
                        boolean booleanValue = ((Boolean) rj8Var.E.getValue()).booleanValue();
                        int i2 = rj8Var.e;
                        if (booleanValue) {
                            k2 = i2 + 1;
                        } else {
                            k2 = i2;
                        }
                    } else {
                        k2 = rj8Var.k();
                    }
                }
                n = rj8Var.j(k2);
                break;
            default:
                n = rj8Var.n();
                break;
        }
        return Integer.valueOf(n);
    }
}
