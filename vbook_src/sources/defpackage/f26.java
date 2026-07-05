package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f26  reason: default package */
/* loaded from: classes.dex */
public final class f26 extends jwc {
    public final Object b;
    public boolean c;

    public f26(Object obj) {
        super(0);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c) {
            this.c = true;
            return this.b;
        }
        xk5.g();
        return null;
    }
}
