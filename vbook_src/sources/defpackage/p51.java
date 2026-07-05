package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p51  reason: default package */
/* loaded from: classes.dex */
public final class p51 {
    public Object a;
    public s51 b;
    public kq9 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        s51 s51Var = this.b;
        if (s51Var != null && s51Var.b.j(obj)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        s51 s51Var = this.b;
        if (s51Var != null && s51Var.b.k(th)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void finalize() {
        kq9 kq9Var;
        s51 s51Var = this.b;
        if (s51Var != null) {
            r51 r51Var = s51Var.b;
            if (!r51Var.isDone()) {
                r51Var.k(new j1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
            }
        }
        if (!this.d && (kq9Var = this.c) != null) {
            kq9Var.j(null);
        }
    }
}
