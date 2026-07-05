package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lu8  reason: default package */
/* loaded from: classes.dex */
public final class lu8 extends f2 {
    public final Object[] c;
    public final ync d;

    public lu8(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new ync(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            ync yncVar = this.d;
            if (yncVar.hasNext()) {
                this.a++;
                return yncVar.next();
            }
            int i = this.a;
            this.a = i + 1;
            return this.c[i - yncVar.b];
        }
        xk5.g();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.a;
            ync yncVar = this.d;
            int i2 = yncVar.b;
            if (i > i2) {
                int i3 = i - 1;
                this.a = i3;
                return this.c[i3 - i2];
            }
            this.a = i - 1;
            return yncVar.previous();
        }
        xk5.g();
        return null;
    }
}
