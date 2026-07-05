package defpackage;

import java.util.Arrays;
import java.util.Collection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hs5  reason: default package */
/* loaded from: classes.dex */
public abstract class hs5 {
    public Object[] a;
    public int b;
    public boolean c;

    public hs5(int i) {
        kue.e(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public static int e(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        vs.m("cannot store more than MAX_VALUE elements");
        return 0;
    }

    public abstract hs5 a(Object obj);

    public final void b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(collection.size());
            if (collection instanceof is5) {
                this.b = ((is5) collection).b(this.b, this.a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void d(int i) {
        Object[] objArr = this.a;
        int e = e(objArr.length, this.b + i);
        if (e <= objArr.length && !this.c) {
            return;
        }
        this.a = Arrays.copyOf(this.a, e);
        this.c = false;
    }
}
