package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: es9  reason: default package */
/* loaded from: classes3.dex */
public abstract class es9 extends hh0 {
    public es9(m42 m42Var) {
        super(m42Var);
        if (m42Var != null && m42Var.getContext() != gs3.a) {
            vs.m("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return gs3.a;
    }
}
