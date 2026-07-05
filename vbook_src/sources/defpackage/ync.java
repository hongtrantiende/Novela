package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ync  reason: default package */
/* loaded from: classes.dex */
public final class ync extends f2 {
    public int c;
    public Object[] d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public ync(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        ?? r5;
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.d = objArr2;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.e = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        Object obj = this.d[this.c - 1];
        obj.getClass();
        return ((Object[]) obj)[this.a & 31];
    }

    public final void b(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.d;
            Object[] objArr2 = objArr[i2 - 1];
            objArr2.getClass();
            objArr[i2] = objArr2[hma.u(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (hma.u(this.a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.a, ((this.c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a = a();
            int i = this.a + 1;
            this.a = i;
            if (i == this.b) {
                this.e = true;
                return a;
            }
            c(0);
            return a;
        }
        xk5.g();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.a--;
            if (this.e) {
                this.e = false;
                return a();
            }
            c(31);
            return a();
        }
        xk5.g();
        return null;
    }
}
