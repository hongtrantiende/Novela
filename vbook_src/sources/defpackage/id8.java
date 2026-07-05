package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: id8  reason: default package */
/* loaded from: classes.dex */
public final class id8 extends pe8 {
    public static final id8 c = new pe8(0, 2, 1);

    /* JADX WARN: Type inference failed for: r0v2, types: [p88, java.lang.Object] */
    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        int i;
        s26 s26Var;
        wy5 wy5Var = (wy5) vh1Var.d(1);
        if (wy5Var != null) {
            i = wy5Var.a;
        } else {
            i = 0;
        }
        pa1 pa1Var = (pa1) vh1Var.d(0);
        if (i > 0) {
            ?? obj = new Object();
            obj.c = nyVar;
            obj.a = i;
            nyVar = obj;
        }
        if (qe8Var != null) {
            s26Var = new s26(10, qe8Var, eqaVar);
        } else {
            s26Var = null;
        }
        pa1Var.x(nyVar, eqaVar, zm9Var, s26Var);
    }
}
