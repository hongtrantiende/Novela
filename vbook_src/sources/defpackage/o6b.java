package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o6b  reason: default package */
/* loaded from: classes.dex */
public final class o6b {
    public final r6b a;
    public be6 b;
    public final n6b c = new n6b(this, 2);
    public final n6b d = new n6b(this, 0);
    public final n6b e = new n6b(this, 1);

    public o6b(r6b r6bVar) {
        this.a = r6bVar;
    }

    public final be6 a() {
        be6 be6Var = this.b;
        if (be6Var != null) {
            return be6Var;
        }
        vs.m("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
