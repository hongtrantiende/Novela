package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pde  reason: default package */
/* loaded from: classes.dex */
public final class pde extends vde {
    public final transient vde D;

    public pde(vde vdeVar) {
        super(4);
        this.D = vdeVar;
    }

    @Override // defpackage.vde, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.D.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        vde vdeVar = this.D;
        ctd.B(i, vdeVar.size());
        return vdeVar.get((vdeVar.size() - 1) - i);
    }

    @Override // defpackage.vde, java.util.List
    public final int indexOf(Object obj) {
        vde vdeVar = this.D;
        int lastIndexOf = vdeVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (vdeVar.size() - 1) - lastIndexOf;
    }

    @Override // defpackage.vde, java.util.List
    public final int lastIndexOf(Object obj) {
        vde vdeVar = this.D;
        int indexOf = vdeVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (vdeVar.size() - 1) - indexOf;
    }

    @Override // defpackage.vde
    public final vde n() {
        return this.D;
    }

    @Override // defpackage.vde, java.util.List
    /* renamed from: p */
    public final vde subList(int i, int i2) {
        vde vdeVar = this.D;
        ctd.C(i, i2, vdeVar.size());
        return vdeVar.subList(vdeVar.size() - i2, vdeVar.size() - i).n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D.size();
    }
}
