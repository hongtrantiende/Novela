package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: to9  reason: default package */
/* loaded from: classes.dex */
public final class to9 extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to9(kj6 kj6Var, int i) {
        super(0);
        this.a = i;
        this.b = kj6Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        long i;
        int i2 = this.a;
        kj6 kj6Var = this.b;
        switch (i2) {
            case 0:
                fj6 j = kj6Var.j();
                int ordinal = j.p.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = j.i() >> 32;
                    } else {
                        xk5.o();
                        return null;
                    }
                } else {
                    i = j.i() & 4294967295L;
                }
                return Float.valueOf(((int) i) * 0.05f);
            default:
                return kj6Var.j().p;
        }
    }
}
