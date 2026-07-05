package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zsa  reason: default package */
/* loaded from: classes3.dex */
public final class zsa extends aab implements lu4 {
    public Object C;
    public boolean D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsa(boolean z, vh3 vh3Var, lu4 lu4Var, xt4 xt4Var, aw7 aw7Var, m82 m82Var, aw7 aw7Var2, vt4 vt4Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.D = z;
        this.e = vh3Var;
        this.F = lu4Var;
        this.c = xt4Var;
        this.G = aw7Var;
        this.d = m82Var;
        this.f = aw7Var2;
        this.C = vt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                zsa zsaVar = new zsa((cta) obj2, m42Var, 0);
                zsaVar.F = obj;
                return zsaVar;
            case 1:
                zsa zsaVar2 = new zsa((cta) obj2, m42Var, 1);
                zsaVar2.F = obj;
                return zsaVar2;
            default:
                zsa zsaVar3 = new zsa(this.D, (vh3) this.e, (lu4) this.F, (xt4) this.c, (aw7) obj2, (m82) this.d, (aw7) this.f, (vt4) this.C, m42Var);
                zsaVar3.b = obj;
                return zsaVar3;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((zsa) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((zsa) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((zsa) create((d19) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x031d -> B:135:0x0320). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01b3 -> B:69:0x01b6). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsa(cta ctaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.G = ctaVar;
    }
}
