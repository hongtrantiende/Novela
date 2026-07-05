package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: veb  reason: default package */
/* loaded from: classes3.dex */
public final class veb extends aab implements lu4 {
    public final /* synthetic */ boolean C;
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ web c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public veb(web webVar, boolean z, boolean z2, boolean z3, boolean z4, m42 m42Var) {
        super(2, m42Var);
        this.c = webVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.C = z4;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        veb vebVar = new veb(this.c, this.d, this.e, this.f, this.C, m42Var);
        vebVar.b = obj;
        return vebVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((veb) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0094 A[RETURN] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.veb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
