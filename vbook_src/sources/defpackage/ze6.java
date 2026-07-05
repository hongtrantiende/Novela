package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ze6  reason: default package */
/* loaded from: classes.dex */
public final class ze6 implements l99 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile l99 b;

    public ze6(l99 l99Var) {
        this.b = l99Var;
    }

    @Override // defpackage.l99
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj3) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
