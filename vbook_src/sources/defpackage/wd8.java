package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wd8  reason: default package */
/* loaded from: classes.dex */
public final class wd8 extends pe8 {
    public static final wd8 c = new pe8(0, 3, 1);

    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        s26 s26Var;
        bqa bqaVar = (bqa) vh1Var.d(1);
        lv4 lv4Var = (lv4) vh1Var.d(0);
        wh4 wh4Var = (wh4) vh1Var.d(2);
        eqa f = bqaVar.f();
        if (qe8Var != null) {
            try {
                s26Var = new s26(10, qe8Var, eqaVar);
            } catch (Throwable th) {
                f.e(false);
                throw th;
            }
        } else {
            s26Var = null;
        }
        if (!wh4Var.l.o()) {
            ex1.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        wh4Var.k.n(nyVar, f, zm9Var, s26Var);
        f.e(true);
        eqaVar.d();
        lv4Var.getClass();
        eqaVar.A(bqaVar, bqaVar.a(lv4Var));
        eqaVar.k();
    }
}
