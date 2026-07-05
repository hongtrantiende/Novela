package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fo9  reason: default package */
/* loaded from: classes.dex */
public final class fo9 extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fo9(mo9 mo9Var, int i) {
        super(0);
        this.a = i;
        this.b = mo9Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        long j;
        int i = this.a;
        float f = nae.e;
        boolean z = true;
        mo9 mo9Var = this.b;
        switch (i) {
            case 0:
                if (mo9Var.k.getValue() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return mo9Var.a.n();
            case 2:
                af6 d = mo9Var.d();
                if (d != null) {
                    long b = d.b();
                    f = (mo9Var.a.n().f() - cqe.h(oue.p((int) (b >> 32), (int) (b & 4294967295L)), mo9Var.f())) - 1.0f;
                }
                return Float.valueOf(f);
            default:
                af6 d2 = mo9Var.d();
                if (d2 != null) {
                    long b2 = d2.b();
                    float h = cqe.h(oue.p((int) (b2 >> 32), (int) (b2 & 4294967295L)), mo9Var.f());
                    long a = d2.a();
                    ff8 f2 = mo9Var.f();
                    f2.getClass();
                    int ordinal = f2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            j = a >> 32;
                        } else {
                            xk5.o();
                            return null;
                        }
                    } else {
                        j = a & 4294967295L;
                    }
                    f = (h + ((int) j)) - 1.0f;
                }
                return Float.valueOf(f);
        }
    }
}
