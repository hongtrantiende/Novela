package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s25  reason: default package */
/* loaded from: classes.dex */
public final class s25 implements Iterator, j76 {
    public final bqa a;
    public final int b;
    public int c;
    public final int d;

    public s25(bqa bqaVar, int i, int i2) {
        this.a = bqaVar;
        this.b = i2;
        this.c = i;
        this.d = bqaVar.D;
        if (bqaVar.C) {
            dqa.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        bqa bqaVar = this.a;
        int i = bqaVar.D;
        int i2 = this.d;
        if (i != i2) {
            dqa.f();
        }
        int i3 = this.c;
        this.c = bqaVar.a[(i3 * 5) + 3] + i3;
        return new cqa(bqaVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
