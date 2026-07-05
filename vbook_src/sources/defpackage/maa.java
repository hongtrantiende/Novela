package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: maa  reason: default package */
/* loaded from: classes.dex */
public final class maa implements Runnable {
    public final xn6 a;
    public final jn6 b;
    public boolean c;

    public maa(xn6 xn6Var, jn6 jn6Var) {
        xn6Var.getClass();
        jn6Var.getClass();
        this.a = xn6Var;
        this.b = jn6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c) {
            this.a.d(this.b);
            this.c = true;
        }
    }
}
