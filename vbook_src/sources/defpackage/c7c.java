package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c7c  reason: default package */
/* loaded from: classes3.dex */
public abstract class c7c {
    public static final ThreadLocal a = new ThreadLocal();

    public static lx3 a() {
        ThreadLocal threadLocal = a;
        lx3 lx3Var = (lx3) threadLocal.get();
        if (lx3Var == null) {
            kn0 kn0Var = new kn0(Thread.currentThread());
            threadLocal.set(kn0Var);
            return kn0Var;
        }
        return lx3Var;
    }
}
