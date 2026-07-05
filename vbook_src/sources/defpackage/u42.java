package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u42  reason: default package */
/* loaded from: classes.dex */
public final class u42 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u42(a52 a52Var, float f, y78 y78Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.c = a52Var;
        this.b = f;
        this.d = y78Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        float f = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new u42((a52) this.c, f, (y78) obj2, m42Var);
            case 1:
                u42 u42Var = new u42((ef2) obj2, f, m42Var, 1);
                u42Var.c = obj;
                return u42Var;
            default:
                u42 u42Var2 = new u42((wl9) obj2, f, m42Var, 2);
                u42Var2.c = obj;
                return u42Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((u42) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((u42) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((u42) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        zc6 c;
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                hre.r(obj);
                a52 a52Var = (a52) this.c;
                long j = ((y78) obj2).a;
                cza czaVar = (cza) a52Var.c;
                zc6 zc6Var = (zc6) czaVar.getValue();
                float t = yz1.t(zc6Var.h * f, zc6Var.i());
                long t2 = uaf.t(zc6Var.j(), zc6Var.a, zc6Var.h, t, j);
                do {
                    value = czaVar.getValue();
                    zc6 zc6Var2 = (zc6) value;
                    zc6 c2 = zc6.c(zc6Var2, 0L, nae.e, null, 0L, null, null, 0L, t, null, null, 8063);
                    c = zc6.c(c2, 0L, nae.e, null, 0L, null, null, yz1.x(y78.j(zc6Var2.g, t2), c2.e(), c2.h()), nae.e, null, null, 8127);
                } while (!czaVar.l(value, c));
                if (c.h > 1.0f) {
                    a52Var.a();
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                z87.v((m82) this.c, null, null, new xe2((ef2) obj2, f, null, 1), 3);
                return pvcVar;
            default:
                hre.r(obj);
                ((wl9) obj2).a = ((i2a) this.c).a(f);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u42(Object obj, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.b = f;
    }
}
