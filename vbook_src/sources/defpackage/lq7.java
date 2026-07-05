package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lq7  reason: default package */
/* loaded from: classes.dex */
public interface lq7 extends nq7 {
    @Override // defpackage.nq7
    default Object a(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(obj, this);
    }

    @Override // defpackage.nq7
    default boolean m(xt4 xt4Var) {
        return ((Boolean) xt4Var.invoke(this)).booleanValue();
    }
}
