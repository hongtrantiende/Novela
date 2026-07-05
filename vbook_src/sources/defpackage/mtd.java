package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mtd  reason: default package */
/* loaded from: classes.dex */
public final class mtd implements otd {
    public static final Object c = new Object();
    public volatile otd a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mtd] */
    public static mtd b(ntd ntdVar) {
        if (ntdVar instanceof mtd) {
            return (mtd) ntdVar;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = ntdVar;
        return obj;
    }

    @Override // defpackage.otd
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj3) {
                        obj = this.a.a();
                        Object obj4 = this.b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.b = obj;
                        this.a = null;
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
