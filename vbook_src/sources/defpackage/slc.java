package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: slc  reason: default package */
/* loaded from: classes3.dex */
public final class slc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ylc b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ slc(ylc ylcVar, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = ylcVar;
        this.c = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.c;
        ylc ylcVar = this.b;
        switch (i) {
            case 0:
                return new slc(ylcVar, str, m42Var, 0);
            default:
                return new slc(ylcVar, str, m42Var, 1);
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
                ((slc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((slc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = this.c;
        ylc ylcVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ylcVar.H = str;
                cza czaVar = ylcVar.D;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, qlc.b((qlc) value, null, ylcVar.H, null, false, 0, null, null, null, 2043)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ylcVar.I = str;
                cza czaVar2 = ylcVar.D;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, qlc.b((qlc) value2, null, null, ylcVar.I, false, 0, null, null, null, 2039)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
