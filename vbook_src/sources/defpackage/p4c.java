package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p4c  reason: default package */
/* loaded from: classes3.dex */
public final class p4c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4c(Object obj, int i, int i2, int i3, int i4, m42 m42Var, int i5) {
        super(2, m42Var);
        this.a = i5;
        this.e = obj;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = i4;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new p4c((y5c) obj2, this.b, this.c, this.d, this.f, m42Var, 0);
            case 1:
                return new p4c(this.f, m42Var, (y5c) obj2);
            default:
                return new p4c((List) obj2, this.b, this.c, this.d, this.f, m42Var, 2);
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
                ((p4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                return ((p4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((p4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0185, code lost:
        if (r0 != r6) goto L46;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4c(int i, m42 m42Var, y5c y5cVar) {
        super(2, m42Var);
        this.a = 1;
        this.e = y5cVar;
        this.f = i;
    }
}
