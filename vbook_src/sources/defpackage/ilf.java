package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ilf  reason: default package */
/* loaded from: classes.dex */
public final class ilf implements Iterator {
    public final sjf a;
    public int b;
    public int c;
    public final /* synthetic */ klf d;

    public /* synthetic */ ilf(klf klfVar, sjf sjfVar, int i) {
        this.d = klfVar;
        this.a = sjfVar;
        int i2 = i & 31;
        this.b = i2;
        this.c = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object v;
        int i = this.b;
        klf klfVar = this.d;
        hre hreVar = klfVar.b;
        int t = hreVar.t();
        if (i >= t) {
            v = klfVar.c.v(i - t);
        } else {
            v = hreVar.v(i);
        }
        Object cast = this.a.b.cast(v);
        int i2 = this.c;
        if (i2 != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
            this.c >>>= numberOfTrailingZeros;
            this.b += numberOfTrailingZeros;
            return cast;
        }
        this.b = -1;
        return cast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
