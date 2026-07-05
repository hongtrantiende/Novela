package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kyd  reason: default package */
/* loaded from: classes.dex */
public final class kyd extends AbstractSet {
    public final int a;
    public final /* synthetic */ lyd b;

    public kyd(lyd lydVar, int i) {
        this.b = lydVar;
        this.a = i;
    }

    public final int a() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.b[i];
    }

    public final int b() {
        return this.b.b[this.a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        roa roaVar;
        int a = a();
        int b = b();
        if (this.a == -1) {
            roaVar = lyd.f;
        } else {
            roaVar = myd.b;
        }
        if (Arrays.binarySearch(this.b.a, a, b, obj, roaVar) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jyd(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b() - a();
    }
}
