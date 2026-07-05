package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qfe  reason: default package */
/* loaded from: classes.dex */
public final class qfe extends dee {
    public static final Object[] J;
    public static final qfe K;
    public final transient Object[] E;
    public final transient int F;
    public final transient Object[] G;
    public final transient int H;
    public final transient int I;

    static {
        Object[] objArr = new Object[0];
        J = objArr;
        K = new qfe(0, 0, 0, objArr, objArr);
    }

    public qfe(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(4);
        this.E = objArr;
        this.F = i;
        this.G = objArr2;
        this.H = i2;
        this.I = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.G;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i = rotateLeft & this.H;
                    Object obj2 = objArr[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        rotateLeft = i + 1;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // defpackage.hwd
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.E;
        int i = this.I;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.hwd
    public final int g() {
        return this.I;
    }

    @Override // defpackage.dee, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.F;
    }

    @Override // defpackage.hwd
    public final int i() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return r().listIterator(0);
    }

    @Override // defpackage.hwd
    public final jwc k() {
        return r().listIterator(0);
    }

    @Override // defpackage.hwd
    public final Object[] l() {
        return this.E;
    }

    @Override // defpackage.dee
    public final vde s() {
        return vde.r(this.I, this.E);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.I;
    }
}
