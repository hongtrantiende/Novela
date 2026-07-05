package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zu4  reason: default package */
/* loaded from: classes3.dex */
public interface zu4 extends sj4 {
    static /* synthetic */ sj4 d(zu4 zu4Var, d82 d82Var, int i, py0 py0Var, int i2) {
        if ((i2 & 1) != 0) {
            d82Var = gs3.a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            py0Var = py0.a;
        }
        return zu4Var.c(d82Var, i, py0Var);
    }

    sj4 c(d82 d82Var, int i, py0 py0Var);
}
