package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ina  reason: default package */
/* loaded from: classes.dex */
public final class ina extends fb6 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ lu4 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ sna d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ina(int i, long j, lu4 lu4Var, sna snaVar) {
        super(2);
        this.d = snaVar;
        this.c = j;
        this.b = lu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                lu4 lu4Var = this.b;
                nmd.c(1, this.c, lu4Var, (rv4) obj, this.d);
                return pvcVar;
            default:
                rv4 rv4Var = (rv4) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
                    rv4Var.X();
                } else {
                    kna knaVar = kna.a;
                    rv4Var.f0(578571862);
                    rv4Var.f0(-548224868);
                    if (rv4Var.a instanceof my) {
                        rv4Var.c0();
                        if (rv4Var.S) {
                            rv4Var.k(knaVar);
                        } else {
                            rv4Var.r0();
                        }
                        jce.F(f8a.R, rv4Var, new ug3(this.c));
                        jce.F(f8a.S, rv4Var, this.d);
                        hl5.u(0, this.b, rv4Var, true, false);
                        rv4Var.q(false);
                    } else {
                        p17.h();
                        throw null;
                    }
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ina(lu4 lu4Var, long j, sna snaVar) {
        super(2);
        this.b = lu4Var;
        this.c = j;
        this.d = snaVar;
    }
}
