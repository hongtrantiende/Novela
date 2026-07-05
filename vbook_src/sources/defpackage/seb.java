package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: seb  reason: default package */
/* loaded from: classes3.dex */
public final class seb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ web d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ seb(web webVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = webVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        web webVar = this.d;
        switch (i) {
            case 0:
                seb sebVar = new seb(webVar, m42Var, 0);
                sebVar.c = obj;
                return sebVar;
            default:
                seb sebVar2 = new seb(webVar, m42Var, 1);
                sebVar2.c = obj;
                return sebVar2;
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
                return ((seb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((seb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0193  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.seb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
