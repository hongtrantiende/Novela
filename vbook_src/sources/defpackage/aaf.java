package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aaf  reason: default package */
/* loaded from: classes.dex */
public final class aaf extends m8f {
    public final transient Object d;

    public aaf(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.u7f
    public final iaf a() {
        return new r8f(this.d);
    }

    @Override // defpackage.u7f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.m8f, defpackage.u7f
    public final a8f e() {
        x7f x7fVar = a8f.b;
        Object[] objArr = {this.d};
        lpe.z(0, objArr[0]);
        return a8f.j(1, objArr);
    }

    @Override // defpackage.u7f
    public final boolean f() {
        return false;
    }

    @Override // defpackage.u7f
    public final int g(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // defpackage.m8f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.m8f, defpackage.u7f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return new r8f(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.d.toString();
        return nk2.v(new StringBuilder(String.valueOf(obj).length() + 2), "[", obj, "]");
    }
}
