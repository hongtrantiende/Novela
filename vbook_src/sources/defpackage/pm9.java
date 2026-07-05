package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pm9  reason: default package */
/* loaded from: classes.dex */
public final class pm9 extends ts5 {
    public final transient rm9 d;
    public final transient qm9 e;

    public pm9(rm9 rm9Var, qm9 qm9Var) {
        this.d = rm9Var;
        this.e = qm9Var;
    }

    @Override // defpackage.ts5, defpackage.is5
    public final qs5 a() {
        return this.e;
    }

    @Override // defpackage.is5
    public final int b(int i, Object[] objArr) {
        return this.e.b(i, objArr);
    }

    @Override // defpackage.is5, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.is5
    public final boolean f() {
        return true;
    }

    @Override // defpackage.is5
    public final jwc g() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
