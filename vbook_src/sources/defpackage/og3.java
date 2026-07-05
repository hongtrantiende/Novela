package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: og3  reason: default package */
/* loaded from: classes3.dex */
public final class og3 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pg3 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og3(pg3 pg3Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = pg3Var;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        pg3 pg3Var = this.c;
        switch (i) {
            case 0:
                return new og3(pg3Var, str, m42Var, 0);
            case 1:
                return new og3(pg3Var, str, m42Var, 1);
            case 2:
                return new og3(pg3Var, str, m42Var, 2);
            case 3:
                return new og3(pg3Var, str, m42Var, 3);
            default:
                return new og3(pg3Var, str, m42Var, 4);
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
                return ((og3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((og3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((og3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((og3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((og3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r14 == r5) goto L31;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
