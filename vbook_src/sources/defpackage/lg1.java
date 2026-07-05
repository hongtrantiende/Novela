package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lg1  reason: default package */
/* loaded from: classes3.dex */
public final class lg1 extends aab implements lu4 {
    public final /* synthetic */ fdd C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ long c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg1(ng1 ng1Var, long j, String str, f76 f76Var, m42 m42Var) {
        super(2, m42Var);
        this.C = ng1Var;
        this.c = j;
        this.D = str;
        this.E = f76Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.E;
        Object obj3 = this.D;
        fdd fddVar = this.C;
        switch (i) {
            case 0:
                lg1 lg1Var = new lg1((ng1) fddVar, this.c, (String) obj3, (f76) obj2, m42Var);
                lg1Var.e = obj;
                return lg1Var;
            default:
                return new lg1((y5c) fddVar, (pwb) obj3, this.c, (ikb) obj2, m42Var);
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
                return ((lg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((lg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0199, code lost:
        if (defpackage.ng1.k(r11, (defpackage.j62) r0, r45) == r8) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0089 -> B:19:0x008d). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg1(y5c y5cVar, pwb pwbVar, long j, ikb ikbVar, m42 m42Var) {
        super(2, m42Var);
        this.C = y5cVar;
        this.D = pwbVar;
        this.c = j;
        this.E = ikbVar;
    }
}
