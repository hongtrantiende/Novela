package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k97  reason: default package */
/* loaded from: classes.dex */
public final class k97 implements r41 {
    public final j97 a;

    public k97(int i) {
        this.a = new j97(i, this);
    }

    @Override // defpackage.r41
    public final void a(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.a.m(obj, obj2);
    }

    public final void b() {
        this.a.p(-1);
    }

    public final Object c(Object obj) {
        obj.getClass();
        return this.a.h(obj);
    }

    public final void d(int i) {
        j97 j97Var = this.a;
        j97Var.getClass();
        if (i > 0) {
            synchronized (((kh5) j97Var.g)) {
                j97Var.b = i;
            }
            j97Var.p(i);
            return;
        }
        vs.m("maxSize <= 0");
    }
}
