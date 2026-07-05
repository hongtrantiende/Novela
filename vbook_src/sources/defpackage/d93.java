package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d93  reason: default package */
/* loaded from: classes3.dex */
public final class d93 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ h93 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d93(h93 h93Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = h93Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        h93 h93Var = this.c;
        switch (i) {
            case 0:
                return new d93(h93Var, m42Var, 0);
            case 1:
                return new d93(h93Var, m42Var, 1);
            case 2:
                return new d93(h93Var, m42Var, 2);
            default:
                return new d93(h93Var, m42Var, 3);
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
                return ((d93) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((d93) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((d93) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((d93) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        if (r4 == r5) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d93.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
