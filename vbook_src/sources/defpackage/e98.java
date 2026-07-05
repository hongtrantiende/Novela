package defpackage;

import okhttp3.Request;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e98  reason: default package */
/* loaded from: classes3.dex */
public final class e98 extends aab implements lu4 {
    public Object a;
    public Object b;
    public qy0 c;
    public int d;
    public final /* synthetic */ f98 e;
    public final /* synthetic */ Request f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e98(f98 f98Var, Request request, m42 m42Var) {
        super(2, m42Var);
        this.e = f98Var;
        this.f = request;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new e98(this.e, this.f, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((e98) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r14 != r4) goto L8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006c -> B:24:0x006f). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e98.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
