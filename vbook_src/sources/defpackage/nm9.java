package defpackage;

import java.util.AbstractMap;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nm9  reason: default package */
/* loaded from: classes.dex */
public final class nm9 extends qs5 {
    public final /* synthetic */ om9 c;

    public nm9(om9 om9Var) {
        this.c = om9Var;
    }

    @Override // defpackage.is5
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        om9 om9Var = this.c;
        wq9.w(i, om9Var.f);
        Object[] objArr = om9Var.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
