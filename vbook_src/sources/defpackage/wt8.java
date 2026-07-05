package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wt8  reason: default package */
/* loaded from: classes.dex */
public final class wt8 extends au8 {
    public xt8 C;

    @Override // defpackage.au8, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof f99)) {
            return false;
        }
        return super.containsKey((f99) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof z3d)) {
            return false;
        }
        return super.containsValue((z3d) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [yt8] */
    @Override // defpackage.au8
    /* renamed from: d */
    public final xt8 b() {
        znc zncVar = this.c;
        xt8 xt8Var = this.C;
        znc zncVar2 = xt8Var.a;
        xt8 xt8Var2 = xt8Var;
        if (zncVar != zncVar2) {
            this.b = new cne(29);
            xt8Var2 = new yt8(this.c, this.f);
        }
        this.C = xt8Var2;
        return xt8Var2;
    }

    @Override // defpackage.au8, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof f99)) {
            return null;
        }
        return (z3d) super.get((f99) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof f99)) {
            return obj2;
        }
        return (z3d) super.getOrDefault((f99) obj, (z3d) obj2);
    }

    @Override // defpackage.au8, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof f99)) {
            return null;
        }
        return (z3d) super.remove((f99) obj);
    }
}
