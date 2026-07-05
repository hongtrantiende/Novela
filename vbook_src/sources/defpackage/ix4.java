package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ix4  reason: default package */
/* loaded from: classes.dex */
public final class ix4 extends fs9 implements lu4 {
    public final /* synthetic */ int b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix4(long j, yl9 yl9Var, m42 m42Var) {
        super(2, m42Var);
        this.b = 4;
        this.c = j;
        this.f = yl9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ix4 ix4Var = new ix4((z09) obj2, m42Var, 0);
                ix4Var.e = obj;
                return ix4Var;
            case 1:
                ix4 ix4Var2 = new ix4((z09) obj2, m42Var, 1);
                ix4Var2.e = obj;
                return ix4Var2;
            case 2:
                ix4 ix4Var3 = new ix4((z09) obj2, m42Var, 2);
                ix4Var3.e = obj;
                return ix4Var3;
            case 3:
                ix4 ix4Var4 = new ix4((z09) obj2, m42Var, 3);
                ix4Var4.e = obj;
                return ix4Var4;
            default:
                ix4 ix4Var5 = new ix4(this.c, (yl9) obj2, m42Var);
                ix4Var5.e = obj;
                return ix4Var5;
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
                return ((ix4) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ix4) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((ix4) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((ix4) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ix4) create(gabVar, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a2 -> B:32:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e2 -> B:44:0x00e6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0122 -> B:56:0x0126). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x015d -> B:68:0x0161). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix4(z09 z09Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.f = z09Var;
    }
}
