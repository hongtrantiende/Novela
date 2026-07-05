package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wy4  reason: default package */
/* loaded from: classes.dex */
public interface wy4 extends xy4 {
    @Override // defpackage.xy4
    default Object a(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(obj, this);
    }

    @Override // defpackage.xy4
    default boolean b(xt4 xt4Var) {
        return ((Boolean) xt4Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.xy4
    default boolean c() {
        return Boolean.TRUE.booleanValue();
    }
}
