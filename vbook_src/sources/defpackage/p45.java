package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p45  reason: default package */
/* loaded from: classes3.dex */
public final class p45 extends fs9 implements lu4 {
    public Object C;
    public Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p45(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.E = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                p45 p45Var = new p45((q45) obj2, m42Var, 0);
                p45Var.f = obj;
                return p45Var;
            default:
                p45 p45Var2 = new p45((l36) obj2, m42Var, 1);
                p45Var2.f = obj;
                return p45Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        c9a c9aVar = (c9a) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((p45) create(c9aVar, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((p45) create(c9aVar, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0072 -> B:25:0x0088). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c2 -> B:36:0x00cb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d3 -> B:41:0x00ed). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p45.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
