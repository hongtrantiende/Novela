package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: re3  reason: default package */
/* loaded from: classes.dex */
public final class re3 implements j99 {
    public static final Object c = new Object();
    public volatile na4 a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [re3, java.lang.Object, j99] */
    public static j99 a(na4 na4Var) {
        if (na4Var instanceof re3) {
            return na4Var;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = na4Var;
        return obj;
    }

    @Override // defpackage.k99
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
