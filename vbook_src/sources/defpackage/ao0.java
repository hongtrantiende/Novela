package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ao0  reason: default package */
/* loaded from: classes3.dex */
public final class ao0 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao0(Object obj, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                rf8 rf8Var = (rf8) obj2;
                ao0 ao0Var = new ao0(3, (m42) obj3);
                ao0Var.b = (gh5) obj;
                ao0Var.invokeSuspend(pvcVar);
                return null;
            case 1:
                m82 m82Var = (m82) obj;
                if (obj2 == null) {
                    new ao0((cz7) this.b, (m42) obj3, 1).invokeSuspend(pvcVar);
                    throw null;
                }
                throw new ClassCastException();
            case 2:
                m82 m82Var2 = (m82) obj;
                ((Number) obj2).floatValue();
                new ao0((wpa) this.b, (m42) obj3, 2).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                zc6 zc6Var = (zc6) obj;
                ((Number) obj2).intValue();
                return new ao0((dt8) this.b, (m42) obj3, 3).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        tt0 e;
        float f;
        switch (this.a) {
            case 0:
                hre.r(obj);
                if (((gh5) this.b).f.e(co0.a) != null) {
                    vm1.h();
                    return null;
                }
                return null;
            case 1:
                hre.r(obj);
                throw new gt1(7);
            case 2:
                hre.r(obj);
                ((wpa) this.b).p.invoke();
                return pvc.a;
            default:
                hre.r(obj);
                ied iedVar = ((dt8) this.b).a;
                int c = iedVar.c();
                zc6 zc6Var = (zc6) iedVar.d.getValue();
                boolean a = iedVar.c.a();
                float f2 = nae.e;
                if (a) {
                    int size = zc6Var.e.size();
                    if (size > 0) {
                        f2 = iedVar.d() / size;
                    }
                } else {
                    if (zc6Var.j()) {
                        e = zc6Var.h();
                    } else {
                        e = zc6Var.e();
                    }
                    float f3 = e.b - e.a;
                    if (f3 > nae.e) {
                        if (zc6Var.j()) {
                            f = zc6Var.g();
                        } else {
                            f = zc6Var.f();
                        }
                        f2 = dce.m((e.b - f) / f3, nae.e, 1.0f);
                    }
                }
                return new gi8(c, f2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao0(int i, m42 m42Var) {
        super(i, m42Var);
        this.a = 0;
    }
}
