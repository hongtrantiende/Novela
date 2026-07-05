package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a53  reason: default package */
/* loaded from: classes3.dex */
public final class a53 extends aab implements lu4 {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;
    public Object d;
    public int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a53(i53 i53Var, m42 m42Var) {
        super(2, m42Var);
        this.C = i53Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                a53 a53Var = new a53((i53) this.C, m42Var);
                a53Var.d = obj;
                return a53Var;
            default:
                return new a53((kda) this.K, m42Var);
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
                return ((a53) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((a53) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:143:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x056f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x0538 -> B:57:0x02c2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x019c -> B:36:0x01b2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01f4 -> B:42:0x01f6). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a53.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a53(kda kdaVar, m42 m42Var) {
        super(2, m42Var);
        this.K = kdaVar;
    }
}
