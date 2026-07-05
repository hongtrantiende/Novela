package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fd6  reason: default package */
/* loaded from: classes.dex */
public interface fd6 extends f03 {
    default int H0(ry6 ry6Var, w27 w27Var, int i) {
        return n(new i16(ry6Var, ry6Var.getLayoutDirection()), new qu2(w27Var, q38.b, r38.b, 2), y02.b(0, i, 0, 0, 13)).d();
    }

    default int P0(ry6 ry6Var, w27 w27Var, int i) {
        return n(new i16(ry6Var, ry6Var.getLayoutDirection()), new qu2(w27Var, q38.a, r38.b, 2), y02.b(0, i, 0, 0, 13)).d();
    }

    default int a1(ry6 ry6Var, w27 w27Var, int i) {
        return n(new i16(ry6Var, ry6Var.getLayoutDirection()), new qu2(w27Var, q38.a, r38.a, 2), y02.b(0, 0, 0, i, 7)).e();
    }

    c37 n(e37 e37Var, w27 w27Var, long j);

    default int z(ry6 ry6Var, w27 w27Var, int i) {
        return n(new i16(ry6Var, ry6Var.getLayoutDirection()), new qu2(w27Var, q38.b, r38.a, 2), y02.b(0, 0, 0, i, 7)).e();
    }
}
