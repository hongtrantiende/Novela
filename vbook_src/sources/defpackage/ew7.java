package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ew7  reason: default package */
/* loaded from: classes3.dex */
public final class ew7 {
    public final gz5 a;
    public final qra b = new qra();
    public final em8 c = new em8(16);

    public ew7(gz5 gz5Var) {
        this.a = gz5Var;
    }

    public final void a(boolean z) {
        int i;
        em8 em8Var = this.c;
        int h = em8Var.h() & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        em8Var.i(i | h);
    }

    public final void b(boolean z) {
        int i;
        em8 em8Var = this.c;
        int h = em8Var.h() & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        em8Var.i(i | h);
    }

    public final void c(boolean z) {
        em8 em8Var = this.c;
        em8Var.i((z ? 1 : 0) | (em8Var.h() & (-2)));
    }
}
