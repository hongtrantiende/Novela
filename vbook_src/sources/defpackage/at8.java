package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: at8  reason: default package */
/* loaded from: classes3.dex */
public final class at8 extends aab implements lu4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at8(atd atdVar, y78 y78Var, y78 y78Var2, float f, m42 m42Var) {
        super(2, m42Var);
        this.d = atdVar;
        this.e = y78Var;
        this.f = y78Var2;
        this.c = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                return new at8(m42Var, (aw7) obj3, (aw7) obj2, (dt8) this.d);
            case 1:
                at8 at8Var = new at8(this.c, (xr) obj3, (wl9) obj2, m42Var);
                at8Var.d = obj;
                return at8Var;
            default:
                return new at8((atd) this.d, (y78) obj3, (y78) obj2, this.c, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((at8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((at8) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((at8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bd -> B:37:0x00c1). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at8(m42 m42Var, aw7 aw7Var, aw7 aw7Var2, dt8 dt8Var) {
        super(2, m42Var);
        this.d = dt8Var;
        this.e = aw7Var;
        this.f = aw7Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at8(float f, xr xrVar, wl9 wl9Var, m42 m42Var) {
        super(2, m42Var);
        this.c = f;
        this.e = xrVar;
        this.f = wl9Var;
    }
}
