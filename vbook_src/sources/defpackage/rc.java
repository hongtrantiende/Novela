package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rc  reason: default package */
/* loaded from: classes.dex */
public final class rc extends fs9 implements lu4 {
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xt4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc(int i, m42 m42Var, xt4 xt4Var) {
        super(2, m42Var);
        this.b = i;
        this.e = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        xt4 xt4Var = this.e;
        switch (i) {
            case 0:
                rc rcVar = new rc(0, m42Var, xt4Var);
                rcVar.d = obj;
                return rcVar;
            case 1:
                rc rcVar2 = new rc(1, m42Var, xt4Var);
                rcVar2.d = obj;
                return rcVar2;
            case 2:
                rc rcVar3 = new rc(2, m42Var, xt4Var);
                rcVar3.d = obj;
                return rcVar3;
            default:
                rc rcVar4 = new rc(3, m42Var, xt4Var);
                rcVar4.d = obj;
                return rcVar4;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        gab gabVar = (gab) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((rc) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((rc) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((rc) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            default:
                ((rc) create(gabVar, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003b -> B:13:0x003e). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
