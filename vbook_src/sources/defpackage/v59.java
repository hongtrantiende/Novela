package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v59  reason: default package */
/* loaded from: classes3.dex */
public abstract class v59 extends ql1 {
    public final u59 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v59(s76 s76Var) {
        super(s76Var);
        s76Var.getClass();
        this.b = new u59(s76Var.e());
    }

    @Override // defpackage.ql1, defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        int i = i(obj);
        u59 u59Var = this.b;
        u59Var.getClass();
        jbe k = jbeVar.k(u59Var);
        p(k, obj, i);
        k.K(u59Var);
    }

    @Override // defpackage.w0, defpackage.s76
    public final Object c(yq2 yq2Var) {
        return j(yq2Var);
    }

    @Override // defpackage.s76
    public final o9a e() {
        return this.b;
    }

    @Override // defpackage.w0
    public final Object f() {
        return (t59) l(o());
    }

    @Override // defpackage.w0
    public final int g(Object obj) {
        t59 t59Var = (t59) obj;
        t59Var.getClass();
        return t59Var.d();
    }

    @Override // defpackage.w0
    public final Iterator h(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.w0
    public final Object m(Object obj) {
        t59 t59Var = (t59) obj;
        t59Var.getClass();
        return t59Var.a();
    }

    @Override // defpackage.ql1
    public final void n(int i, Object obj, Object obj2) {
        ((t59) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object o();

    public abstract void p(jbe jbeVar, Object obj, int i);
}
