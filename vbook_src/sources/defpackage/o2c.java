package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o2c  reason: default package */
/* loaded from: classes3.dex */
public final class o2c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ t2c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2c(float f, t2c t2cVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = f;
        this.c = t2cVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new o2c(this.c, this.b, m42Var, 0);
            case 1:
                return new o2c(this.b, this.c, m42Var, 1);
            case 2:
                return new o2c(this.b, this.c, m42Var, 2);
            default:
                return new o2c(this.c, this.b, m42Var, 3);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((o2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((o2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((o2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((o2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.b;
        t2c t2cVar = this.c;
        switch (i) {
            case 0:
                hre.r(obj);
                ((i2c) t2cVar.C).a.g.e(y1c.o[6], Float.valueOf(f));
                cza czaVar = t2cVar.H;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, ozb.a((ozb) value, nae.e, nae.e, 0L, false, false, this.b, null, 0, 447)));
                    t2cVar.d.getClass();
                    mfb mfbVar = ix3.a;
                    ix3.a(yyb.a);
                    return pvcVar;
                }
                t2cVar.d.getClass();
                mfb mfbVar2 = ix3.a;
                ix3.a(yyb.a);
                return pvcVar;
            case 1:
                hre.r(obj);
                float m = dce.m(f, 0.5f, 3.0f);
                cza czaVar2 = t2cVar.H;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, ozb.a((ozb) value2, nae.e, m, 0L, false, false, nae.e, null, 0, 509)));
                    ((i2c) t2cVar.C).y(m);
                    return pvcVar;
                }
                ((i2c) t2cVar.C).y(m);
                return pvcVar;
            case 2:
                hre.r(obj);
                float m2 = dce.m(f, 0.5f, 6.0f);
                cza czaVar3 = t2cVar.H;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, ozb.a((ozb) value3, m2, nae.e, 0L, false, false, nae.e, null, 0, 510)));
                    ((i2c) t2cVar.C).z(m2);
                    return pvcVar;
                }
                ((i2c) t2cVar.C).z(m2);
                return pvcVar;
            default:
                hre.r(obj);
                t2cVar.d.getClass();
                ix3.a(new gzb(f));
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2c(t2c t2cVar, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = t2cVar;
        this.b = f;
    }
}
