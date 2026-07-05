package defpackage;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tt6  reason: default package */
/* loaded from: classes3.dex */
public final class tt6 implements Collection, j76 {
    public final hy6 a;
    public final nt6 b;
    public final nt6 c;

    static {
        new tt6(new nt6(1970, 1, 2), new nt6(1970, 1, 1));
    }

    public tt6(nt6 nt6Var, nt6 nt6Var2) {
        long epochDay = nt6Var.a.toEpochDay();
        hy6 hy6Var = new hy6(epochDay, nt6Var2.a.toEpochDay());
        this.a = hy6Var;
        nt6.Companion.getClass();
        this.b = lt6.a(epochDay);
        this.c = lt6.a(hy6Var.b);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof nt6)) {
            return false;
        }
        nt6 nt6Var = this.b;
        nt6Var.getClass();
        LocalDate localDate = nt6Var.a;
        LocalDate localDate2 = ((nt6) obj).a;
        if (localDate.compareTo((ChronoLocalDate) localDate2) <= 0) {
            nt6 nt6Var2 = this.c;
            nt6Var2.getClass();
            if (localDate2.compareTo((ChronoLocalDate) nt6Var2.a) <= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection r4) {
        /*
            r3 = this;
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L10
            return r1
        L10:
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r4.next()
            boolean r2 = r0 instanceof defpackage.nt6
            if (r2 == 0) goto L29
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L29
            goto L14
        L29:
            r3 = 0
            return r3
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt6.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof tt6) {
            if (c16.i(this.a, ((tt6) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        nt6 nt6Var = this.b;
        nt6Var.getClass();
        nt6 nt6Var2 = this.c;
        nt6Var2.getClass();
        if (nt6Var.a.compareTo((ChronoLocalDate) nt6Var2.a) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        hy6 hy6Var = this.a;
        return new st6(new iy6(hy6Var.a, hy6Var.b, hy6Var.c));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        hy6 hy6Var = this.a;
        hy6Var.getClass();
        if (hy6Var.isEmpty()) {
            return 0;
        }
        try {
            long addExact = (Math.addExact(hy6Var.b, -hy6Var.a) / hy6Var.c) + 1;
            if (addExact <= 2147483647L) {
                if (addExact < -2147483648L) {
                    return Integer.MIN_VALUE;
                }
                return (int) addExact;
            }
            return Integer.MAX_VALUE;
        } catch (ArithmeticException unused) {
            return Integer.MAX_VALUE;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return pbe.q(this, objArr);
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return pbe.p(this);
    }
}
