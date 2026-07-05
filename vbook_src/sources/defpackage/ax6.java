package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ax6  reason: default package */
/* loaded from: classes3.dex */
public final class ax6 extends aab implements mu4 {
    public /* synthetic */ oh5 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ ew6 E;
    public final /* synthetic */ List F;
    public xe5 a;
    public StringBuilder b;
    public Throwable c;
    public int d;
    public int e;
    public /* synthetic */ ur9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax6(boolean z, ew6 ew6Var, List list, m42 m42Var) {
        super(3, m42Var);
        this.D = z;
        this.E = ew6Var;
        this.F = list;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ew6 ew6Var = this.E;
        List list = this.F;
        ax6 ax6Var = new ax6(this.D, ew6Var, list, (m42) obj3);
        ax6Var.f = (ur9) obj;
        ax6Var.C = (oh5) obj2;
        return ax6Var.invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
        if (r2.b(r13) != r8) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017d, code lost:
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (r9.b(r13) == r8) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197 A[RETURN] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
