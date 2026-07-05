package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xt8  reason: default package */
/* loaded from: classes.dex */
public final class xt8 extends yt8 implements yx1, vx1 {
    public static final xt8 d = new yt8(znc.e, 0);

    @Override // defpackage.vx1
    public final Object N0(f99 f99Var) {
        return qye.m(this, f99Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [au8, wt8] */
    @Override // defpackage.yt8
    public final au8 a() {
        ?? au8Var = new au8(this);
        au8Var.C = this;
        return au8Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [au8, wt8] */
    @Override // defpackage.yt8
    public final au8 b() {
        ?? au8Var = new au8(this);
        au8Var.C = this;
        return au8Var;
    }

    @Override // defpackage.yt8, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof f99)) {
            return false;
        }
        return super.containsKey((f99) obj);
    }

    @Override // defpackage.yt8, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof z3d)) {
            return false;
        }
        return super.containsValue((z3d) obj);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [yt8, xt8] */
    public final xt8 d(f99 f99Var, z3d z3dVar) {
        jt1 u = this.a.u(f99Var.hashCode(), f99Var, z3dVar, 0);
        if (u == null) {
            return this;
        }
        return new yt8((znc) u.c, this.b + u.b);
    }

    @Override // defpackage.yt8, java.util.Map
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
}
