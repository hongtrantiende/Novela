package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fs7  reason: default package */
/* loaded from: classes.dex */
public final class fs7 extends fs9 implements lu4 {
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ is7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs7(is7 is7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.e = is7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        is7 is7Var = this.e;
        switch (i) {
            case 0:
                fs7 fs7Var = new fs7(is7Var, m42Var, 0);
                fs7Var.d = obj;
                return fs7Var;
            default:
                fs7 fs7Var2 = new fs7(is7Var, m42Var, 1);
                fs7Var2.d = obj;
                return fs7Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        gab gabVar = (gab) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((fs7) create(gabVar, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            default:
                ((fs7) create(gabVar, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:13:0x0037). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00eb -> B:36:0x00ee). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
