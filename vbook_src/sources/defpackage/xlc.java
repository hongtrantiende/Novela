package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xlc  reason: default package */
/* loaded from: classes3.dex */
public final class xlc extends aab implements lu4 {
    public final /* synthetic */ String C;
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ylc c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xlc(ylc ylcVar, String str, boolean z, String str2, String str3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ylcVar;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.C = str3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new xlc(this.c, this.d, this.e, this.f, this.C, m42Var, 0);
            case 1:
                return new xlc(this.c, this.d, this.e, this.f, this.C, m42Var, 1);
            default:
                return new xlc(this.c, this.e, this.d, this.f, this.C, m42Var);
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
                return ((xlc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((xlc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((xlc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlc(ylc ylcVar, boolean z, String str, String str2, String str3, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.c = ylcVar;
        this.e = z;
        this.d = str;
        this.f = str2;
        this.C = str3;
    }
}
