package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w36  reason: default package */
/* loaded from: classes3.dex */
public final class w36 implements s76 {
    public static final w36 a = new Object();
    public static final v36 b = v36.b;

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        t36 t36Var = (t36) obj;
        t36Var.getClass();
        o28.q(jbeVar);
        n46 n46Var = n46.a;
        o9a e = n46Var.e();
        e.getClass();
        qz qzVar = new qz(e, 1);
        int size = t36Var.size();
        jbe k = jbeVar.k(qzVar);
        Iterator<k46> it = t36Var.iterator();
        for (int i = 0; i < size; i++) {
            k.F(qzVar, i, n46Var, it.next());
        }
        k.K(qzVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o28.r(yq2Var);
        return new t36((List) new sz(n46.a, 0).j(yq2Var));
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
