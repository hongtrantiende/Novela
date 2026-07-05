package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u1e  reason: default package */
/* loaded from: classes.dex */
public final class u1e extends e4e {
    public final transient e4e D;

    public u1e(e4e e4eVar) {
        super(2);
        this.D = e4eVar;
    }

    @Override // defpackage.e4e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.D.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        e4e e4eVar = this.D;
        fpe.z(i, e4eVar.size());
        return e4eVar.get((e4eVar.size() - 1) - i);
    }

    @Override // defpackage.e4e, java.util.List
    public final int indexOf(Object obj) {
        e4e e4eVar = this.D;
        int lastIndexOf = e4eVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (e4eVar.size() - 1) - lastIndexOf;
    }

    @Override // defpackage.e4e, java.util.List
    public final int lastIndexOf(Object obj) {
        e4e e4eVar = this.D;
        int indexOf = e4eVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (e4eVar.size() - 1) - indexOf;
    }

    @Override // defpackage.e4e
    public final e4e n() {
        return this.D;
    }

    @Override // defpackage.e4e, java.util.List
    /* renamed from: p */
    public final e4e subList(int i, int i2) {
        e4e e4eVar = this.D;
        fpe.A(i, i2, e4eVar.size());
        return e4eVar.subList(e4eVar.size() - i2, e4eVar.size() - i).n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D.size();
    }
}
