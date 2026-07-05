package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yqc  reason: default package */
/* loaded from: classes3.dex */
public final class yqc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zqc b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yqc(zqc zqcVar, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.b = zqcVar;
        this.c = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new yqc(this.b, this.c, m42Var, 0);
            default:
                return new yqc(this.b, this.c, m42Var, 1);
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
                ((yqc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((yqc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.c;
        zqc zqcVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((qi9) zqcVar.c).a.m.e(xh9.s[11], Integer.valueOf(i2));
                cza czaVar = zqcVar.e;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, wqc.a((wqc) value, 0, this.c, false, false, false, false, false, 253)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((qi9) zqcVar.c).a.l.e(xh9.s[10], Integer.valueOf(i2));
                cza czaVar2 = zqcVar.e;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, wqc.a((wqc) value2, this.c, 0, false, false, false, false, false, 254)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
