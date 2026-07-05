package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e5c  reason: default package */
/* loaded from: classes3.dex */
public final class e5c extends aab implements lu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public qw7 a;
    public y5c b;
    public int c;
    public int d;
    public int e;
    public final /* synthetic */ y5c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5c(int i, int i2, m42 m42Var, y5c y5cVar) {
        super(2, m42Var);
        this.f = y5cVar;
        this.C = i;
        this.D = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new e5c(this.C, this.D, m42Var, this.f);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((e5c) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x014b, code lost:
        if (((defpackage.gwb) r0).d == (((defpackage.gwb) r0).f - 1)) goto L9;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e5c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
