package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pk6  reason: default package */
/* loaded from: classes.dex */
public final class pk6 extends g3 implements qk6 {
    public final ArrayList b;

    static {
        new pk6(10).a = false;
    }

    public pk6(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.qk6
    public final qk6 S() {
        if (this.a) {
            return new mwc(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.g3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof qk6) {
            collection = ((qk6) collection).o();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.g3
    public final g3 b(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new pk6(arrayList2);
        }
        p1a.g();
        return null;
    }

    @Override // defpackage.g3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof b31) {
            b31 b31Var = (b31) obj;
            Charset charset = vz5.a;
            if (b31Var.size() == 0) {
                str = "";
            } else {
                str = new String(b31Var.b, b31Var.d(), b31Var.size(), charset);
            }
            int d = b31Var.d();
            if (v1d.a.o(b31Var.b, d, b31Var.size() + d) == 0) {
                arrayList.set(i, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, vz5.a);
        if (v1d.a.o(bArr, 0, bArr.length) == 0) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // defpackage.qk6
    public final List o() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.qk6
    public final void q(b31 b31Var) {
        a();
        this.b.add(b31Var);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.g3, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof b31) {
            b31 b31Var = (b31) remove;
            Charset charset = vz5.a;
            if (b31Var.size() == 0) {
                return "";
            }
            return new String(b31Var.b, b31Var.d(), b31Var.size(), charset);
        }
        return new String((byte[]) remove, vz5.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof b31) {
            b31 b31Var = (b31) obj2;
            Charset charset = vz5.a;
            if (b31Var.size() == 0) {
                return "";
            }
            return new String(b31Var.b, b31Var.d(), b31Var.size(), charset);
        }
        return new String((byte[]) obj2, vz5.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public pk6(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.g3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
