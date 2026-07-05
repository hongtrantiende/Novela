package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lq0  reason: default package */
/* loaded from: classes3.dex */
public final class lq0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(m42 m42Var, xt4 xt4Var, fu9 fu9Var, boolean z) {
        super(2, m42Var);
        this.a = 1;
        this.d = fu9Var;
        this.c = z;
        this.e = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        boolean z = this.c;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                lq0 lq0Var = new lq0((mq0) obj2, z, m42Var, 0);
                lq0Var.d = obj;
                return lq0Var;
            case 1:
                return new lq0(m42Var, (xt4) obj2, (fu9) this.d, z);
            case 2:
                return new lq0((c4c) this.d, this.c, (String) obj2, m42Var, 2);
            case 3:
                return new lq0((y5c) this.d, this.c, (String) obj2, m42Var, 3);
            case 4:
                return new lq0((y5c) obj2, z, m42Var, 4);
            case 5:
                return new lq0(5, m42Var, (aw7) this.d, (e3a) obj2, this.c);
            default:
                return new lq0(6, m42Var, (qi8) this.d, (dm8) obj2, this.c);
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
                return ((lq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((lq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((lq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((lq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((lq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((lq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((lq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0130, code lost:
        if (r6 == r7) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq0(int i, m42 m42Var, Object obj, Object obj2, boolean z) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq0(fdd fddVar, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = fddVar;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq0(fdd fddVar, boolean z, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = fddVar;
        this.e = str;
        this.c = z;
    }
}
