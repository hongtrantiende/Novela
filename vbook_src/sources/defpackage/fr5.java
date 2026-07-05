package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fr5  reason: default package */
/* loaded from: classes3.dex */
public final class fr5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur5 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr5(ur5 ur5Var, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = ur5Var;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new fr5(this.b, this.c, m42Var, 0);
            case 1:
                return new fr5(this.b, this.c, m42Var, 1);
            case 2:
                return new fr5(this.b, this.c, m42Var, 2);
            case 3:
                return new fr5(this.b, this.c, m42Var, 3);
            case 4:
                return new fr5(this.b, this.c, m42Var, 4);
            default:
                return new fr5(this.b, this.c, m42Var, 5);
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
                ((fr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((fr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((fr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((fr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((fr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((fr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.c;
        ur5 ur5Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((cm5) ur5Var.F).a.h.e(xh9.s[6], Boolean.valueOf(z));
                cza czaVar = ur5Var.X;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, dm5.a((dm5) value, 0, 0, nae.e, 0, 0, false, false, false, false, nae.e, 0, 0, false, false, false, false, this.c, false, false, false, 0, 4063231)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                ((cm5) ur5Var.F).a.f.e(xh9.s[4], Boolean.valueOf(z));
                cza czaVar2 = ur5Var.X;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, dm5.a((dm5) value2, 0, 0, nae.e, 0, 0, false, false, false, this.c, nae.e, 0, 0, false, false, false, false, false, false, false, false, 0, 4194047)));
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                hre.r(obj);
                ((cm5) ur5Var.F).b.h.e(so5.l[7], Boolean.valueOf(z));
                cza czaVar3 = ur5Var.X;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, dm5.a((dm5) value3, 0, 0, nae.e, 0, 0, false, false, this.c, false, nae.e, 0, 0, false, false, false, false, false, false, false, false, 0, 4194175)));
                    return pvcVar;
                }
                return pvcVar;
            case 3:
                hre.r(obj);
                ((cm5) ur5Var.F).b.g.e(so5.l[6], Boolean.valueOf(z));
                cza czaVar4 = ur5Var.X;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                    } while (!czaVar4.l(value4, dm5.a((dm5) value4, 0, 0, nae.e, 0, 0, false, this.c, false, false, nae.e, 0, 0, false, false, false, false, false, false, false, false, 0, 4194239)));
                    return pvcVar;
                }
                return pvcVar;
            case 4:
                hre.r(obj);
                ((cm5) ur5Var.F).b.f.e(so5.l[5], Boolean.valueOf(z));
                cza czaVar5 = ur5Var.X;
                if (czaVar5 != null) {
                    do {
                        value5 = czaVar5.getValue();
                    } while (!czaVar5.l(value5, dm5.a((dm5) value5, 0, 0, nae.e, 0, 0, this.c, false, false, false, nae.e, 0, 0, false, false, false, false, false, false, false, false, 0, 4194271)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((cm5) ur5Var.F).b.i.e(so5.l[8], Boolean.valueOf(z));
                cza czaVar6 = ur5Var.X;
                if (czaVar6 != null) {
                    do {
                        value6 = czaVar6.getValue();
                    } while (!czaVar6.l(value6, dm5.a((dm5) value6, 0, 0, nae.e, 0, 0, false, false, false, false, nae.e, 0, 0, false, false, false, false, false, this.c, false, false, 0, 3932159)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
