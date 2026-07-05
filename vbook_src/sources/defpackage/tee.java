package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tee  reason: default package */
/* loaded from: classes.dex */
public final class tee extends jwc {
    public static final Object c = new Object();
    public Object b;

    public tee(Object obj) {
        super(6);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        xk5.g();
        return null;
    }
}
