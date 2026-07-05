package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ip  reason: default package */
/* loaded from: classes.dex */
public final class ip extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ long c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip(long j, Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = j;
        this.d = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new ip((kp) this.d, this.c, m42Var, 0);
            case 1:
                return new ip((a52) this.d, this.c, m42Var, 1);
            case 2:
                ip ipVar = new ip(this.c, m42Var);
                ipVar.d = obj;
                return ipVar;
            case 3:
                return new ip((mo9) this.d, this.c, m42Var, 3);
            case 4:
                return new ip((lq) this.d, this.c, m42Var, 4);
            case 5:
                return new ip(this.c, (gab) this.d, m42Var, 5);
            case 6:
                return new ip((ssb) this.d, this.c, m42Var, 6);
            case 7:
                return new ip((shc) this.d, this.c, m42Var, 7);
            default:
                return new ip(this.c, (t7d) this.d, m42Var, 8);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((ip) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((ip) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                ((ip) create((y69) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82.a;
            case 3:
                return ((ip) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((ip) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((ip) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((ip) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((ip) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((ip) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [wl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01ad -> B:85:0x0195). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(long j, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip(Object obj, long j, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.c = j;
    }
}
