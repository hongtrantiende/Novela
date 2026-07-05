package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t04  reason: default package */
/* loaded from: classes.dex */
public final class t04 extends fs9 implements lu4 {
    public /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int b;
    public Object c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t04(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.D = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        Object obj2 = this.D;
        switch (i) {
            case 0:
                t04 t04Var = new t04((sjc) obj2, m42Var, 0);
                t04Var.C = obj;
                return t04Var;
            case 1:
                t04 t04Var2 = new t04((sjc) obj2, m42Var, 1);
                t04Var2.C = obj;
                return t04Var2;
            default:
                t04 t04Var3 = new t04((cra) obj2, m42Var, 2);
                t04Var3.C = obj;
                return t04Var3;
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
                return ((t04) create(c9aVar, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((t04) create(c9aVar, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((t04) create(c9aVar, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008d -> B:27:0x00a3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cd -> B:10:0x0036). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t04.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
