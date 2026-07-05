package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: he8  reason: default package */
/* loaded from: classes.dex */
public final class he8 extends pe8 {
    public static final he8 c = new pe8(0, 1, 1);

    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        ro8 ro8Var;
        ek9 ek9Var = (ek9) vh1Var.d(0);
        tv7 tv7Var = (tv7) zm9Var.j;
        if (tv7Var != null) {
            ro8Var = (ro8) tv7Var.g(ek9Var);
        } else {
            ro8Var = null;
        }
        if (ro8Var != null) {
            ArrayList arrayList = (ArrayList) zm9Var.k;
            if (arrayList == null) {
                arrayList = new ArrayList();
                zm9Var.k = arrayList;
            }
            arrayList.add((gw7) zm9Var.d);
            zm9Var.d = ro8Var.b;
        }
    }
}
