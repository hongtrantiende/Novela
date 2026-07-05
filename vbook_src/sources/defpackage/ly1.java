package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ly1  reason: default package */
/* loaded from: classes.dex */
public final class ly1 extends f99 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public ly1(xt4 xt4Var) {
        super(new cd1(19));
        this.c = new my1(xt4Var);
    }

    @Override // defpackage.f99
    public final i99 a(Object obj) {
        boolean z;
        boolean z2;
        switch (this.b) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                return new i99(this, obj, z, null, null, true);
            default:
                if (obj == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new i99(this, obj, z2, (kra) this.c, null, true);
        }
    }

    @Override // defpackage.f99
    public z3d b() {
        switch (this.b) {
            case 0:
                return (my1) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly1(vt4 vt4Var) {
        super(vt4Var);
        zj1 zj1Var = zj1.G;
        this.c = zj1Var;
    }
}
