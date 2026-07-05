package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oy0  reason: default package */
/* loaded from: classes.dex */
public final class oy0 extends f2 {
    public final /* synthetic */ int c = 1;
    public final Object d;

    public oy0(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (hasNext()) {
                    int i2 = this.a;
                    this.a = i2 + 1;
                    return ((Object[]) obj)[i2];
                }
                xk5.g();
                return null;
            default:
                if (hasNext()) {
                    this.a++;
                    return obj;
                }
                xk5.g();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (hasPrevious()) {
                    int i2 = this.a - 1;
                    this.a = i2;
                    return ((Object[]) obj)[i2];
                }
                xk5.g();
                return null;
            default:
                if (hasPrevious()) {
                    this.a--;
                    return obj;
                }
                xk5.g();
                return null;
        }
    }

    public oy0(Object obj, int i) {
        super(i, 1);
        this.d = obj;
    }
}
