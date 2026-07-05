package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xqc  reason: default package */
/* loaded from: classes3.dex */
public final class xqc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zqc b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xqc(zqc zqcVar, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = zqcVar;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new xqc(this.b, this.c, m42Var, 0);
            case 1:
                return new xqc(this.b, this.c, m42Var, 1);
            case 2:
                return new xqc(this.b, this.c, m42Var, 2);
            case 3:
                return new xqc(this.b, this.c, m42Var, 3);
            default:
                return new xqc(this.b, this.c, m42Var, 4);
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
                ((xqc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((xqc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((xqc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((xqc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((xqc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
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
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.c;
        zqc zqcVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((qi9) zqcVar.c).a.j.e(xh9.s[8], Boolean.valueOf(z));
                cza czaVar = zqcVar.e;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, wqc.a((wqc) value, 0, 0, false, this.c, false, false, false, 247)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                ((qi9) zqcVar.c).a.k.e(xh9.s[9], Boolean.valueOf(z));
                cza czaVar2 = zqcVar.e;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, wqc.a((wqc) value2, 0, 0, false, false, this.c, false, false, 239)));
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                hre.r(obj);
                ((qi9) zqcVar.c).a.i.e(xh9.s[7], Boolean.valueOf(z));
                cza czaVar3 = zqcVar.e;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, wqc.a((wqc) value3, 0, 0, this.c, false, false, false, false, 251)));
                    return pvcVar;
                }
                return pvcVar;
            case 3:
                hre.r(obj);
                ((qi9) zqcVar.c).a.n.e(xh9.s[12], Boolean.valueOf(z));
                cza czaVar4 = zqcVar.e;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                    } while (!czaVar4.l(value4, wqc.a((wqc) value4, 0, 0, false, false, false, this.c, false, 223)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((qi9) zqcVar.c).a.o.e(xh9.s[13], Boolean.valueOf(z));
                cza czaVar5 = zqcVar.e;
                if (czaVar5 != null) {
                    do {
                        value5 = czaVar5.getValue();
                    } while (!czaVar5.l(value5, wqc.a((wqc) value5, 0, 0, false, false, false, false, this.c, 191)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
