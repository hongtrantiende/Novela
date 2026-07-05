package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zt8  reason: default package */
/* loaded from: classes.dex */
public abstract class zt8 implements Iterator, j76 {
    public final aoc[] a;
    public int b;
    public boolean c = true;

    public zt8(znc zncVar, aoc[] aocVarArr) {
        this.a = aocVarArr;
        aocVarArr[0].a(zncVar.d, Integer.bitCount(zncVar.a) * 2, 0);
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        aoc[] aocVarArr = this.a;
        aoc aocVar = aocVarArr[i];
        if (aocVar.c < aocVar.b) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                aoc aocVar2 = aocVarArr[i];
                int i2 = aocVar2.c;
                Object[] objArr = aocVar2.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    aocVar2.c = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.b = b;
                return;
            }
            if (i > 0) {
                aoc aocVar3 = aocVarArr[i - 1];
                int i3 = aocVar3.c;
                int length2 = aocVar3.a.length;
                aocVar3.c = i3 + 1;
            }
            aocVarArr[i].a(znc.e.d, 0, 0);
            i--;
        }
        this.c = false;
    }

    public final int b(int i) {
        aoc[] aocVarArr = this.a;
        aoc aocVar = aocVarArr[i];
        int i2 = aocVar.c;
        if (i2 < aocVar.b) {
            return i;
        }
        Object[] objArr = aocVar.a;
        if (i2 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i2];
            obj.getClass();
            znc zncVar = (znc) obj;
            if (i == 6) {
                aoc aocVar2 = aocVarArr[i + 1];
                Object[] objArr2 = zncVar.d;
                aocVar2.a(objArr2, objArr2.length, 0);
            } else {
                aocVarArr[i + 1].a(zncVar.d, Integer.bitCount(zncVar.a) * 2, 0);
            }
            return b(i + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.c) {
            Object next = this.a[this.b].next();
            a();
            return next;
        }
        xk5.g();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
