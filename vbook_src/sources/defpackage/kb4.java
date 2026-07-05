package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kb4  reason: default package */
/* loaded from: classes.dex */
public final class kb4 extends ob4 {
    @Override // defpackage.ob4
    public final ob4 a(q09 q09Var) {
        jq6 t = tl1.t();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t.add(((qd2) list.get(i)).e(q09Var));
        }
        jq6 r = tl1.r(t);
        r.getClass();
        return new ob4(r);
    }

    public final String toString() {
        return "Edge";
    }
}
