package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gs8  reason: default package */
/* loaded from: classes3.dex */
public final class gs8 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss8 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs8(ss8 ss8Var, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = ss8Var;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        boolean z = this.c;
        ss8 ss8Var = this.b;
        switch (i) {
            case 0:
                return new gs8(ss8Var, z, m42Var, 0);
            case 1:
                return new gs8(ss8Var, z, m42Var, 1);
            case 2:
                return new gs8(ss8Var, z, m42Var, 2);
            default:
                return new gs8(ss8Var, z, m42Var, 3);
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
                ((gs8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((gs8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((gs8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((gs8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.c;
        ss8 ss8Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((cm5) ss8Var.D).a.h.e(xh9.s[6], Boolean.valueOf(z));
                cza czaVar = ss8Var.Q;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, dm5.a((dm5) value, 0, 0, nae.e, 0, 0, false, false, false, false, nae.e, 0, 0, false, false, false, false, this.c, false, false, false, 0, 4063231)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                ((cm5) ss8Var.D).a.f.e(xh9.s[4], Boolean.valueOf(z));
                cza czaVar2 = ss8Var.Q;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, dm5.a((dm5) value2, 0, 0, nae.e, 0, 0, false, false, false, this.c, nae.e, 0, 0, false, false, false, false, false, false, false, false, 0, 4194047)));
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                hre.r(obj);
                ((cm5) ss8Var.D).b.f.e(so5.l[5], Boolean.valueOf(z));
                cza czaVar3 = ss8Var.Q;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, dm5.a((dm5) value3, 0, 0, nae.e, 0, 0, this.c, false, false, false, nae.e, 0, 0, false, false, false, false, false, false, false, false, 0, 4194271)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((cm5) ss8Var.D).b.i.e(so5.l[8], Boolean.valueOf(z));
                cza czaVar4 = ss8Var.Q;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                    } while (!czaVar4.l(value4, dm5.a((dm5) value4, 0, 0, nae.e, 0, 0, false, false, false, false, nae.e, 0, 0, false, false, false, false, false, this.c, false, false, 0, 3932159)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
