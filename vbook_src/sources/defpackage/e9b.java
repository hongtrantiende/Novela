package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e9b  reason: default package */
/* loaded from: classes.dex */
public final class e9b implements c9b {
    public static final lw2 d = new lw2(3);
    public final Object a = new Object();
    public volatile c9b b;
    public Object c;

    public e9b(c9b c9bVar) {
        c9bVar.getClass();
        this.b = c9bVar;
    }

    @Override // defpackage.c9b
    public final Object get() {
        c9b c9bVar = this.b;
        lw2 lw2Var = d;
        if (c9bVar != lw2Var) {
            synchronized (this.a) {
                try {
                    if (this.b != lw2Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = lw2Var;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
