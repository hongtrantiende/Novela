package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tm9  reason: default package */
/* loaded from: classes.dex */
public final class tm9 extends ts5 {
    public static final Object[] E;
    public static final tm9 F;
    public final transient int C;
    public final transient int D;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;

    static {
        Object[] objArr = new Object[0];
        E = objArr;
        F = new tm9(0, 0, 0, objArr, objArr);
    }

    public tm9(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.C = i2;
        this.D = i3;
    }

    @Override // defpackage.is5
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.D;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.is5
    public final Object[] c() {
        return this.d;
    }

    @Override // defpackage.is5, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int B = nqe.B(obj);
                while (true) {
                    int i = B & this.C;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    B = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.is5
    public final int d() {
        return this.D;
    }

    @Override // defpackage.is5
    public final int e() {
        return 0;
    }

    @Override // defpackage.is5
    public final boolean f() {
        return false;
    }

    @Override // defpackage.is5
    public final jwc g() {
        return a().listIterator(0);
    }

    @Override // defpackage.ts5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.ts5
    public final qs5 k() {
        return qs5.h(this.D, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.D;
    }
}
