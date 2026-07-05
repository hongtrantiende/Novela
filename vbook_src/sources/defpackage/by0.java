package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: by0  reason: default package */
/* loaded from: classes3.dex */
public final class by0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ fy0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ by0(fy0 fy0Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = fy0Var;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        fy0 fy0Var = this.c;
        switch (i) {
            case 0:
                return new by0(fy0Var, str, m42Var, 0);
            case 1:
                return new by0(fy0Var, str, m42Var, 1);
            default:
                return new by0(fy0Var, str, m42Var, 2);
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
                return ((by0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((by0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((by0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010e A[LOOP:0: B:45:0x010e->B:46:0x0123, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
