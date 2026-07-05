package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jb4  reason: default package */
/* loaded from: classes.dex */
public final class jb4 extends ob4 {
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb4(List list, boolean z) {
        super(list);
        list.getClass();
        this.b = z;
    }

    @Override // defpackage.ob4
    public final ob4 a(q09 q09Var) {
        jq6 t = tl1.t();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t.add(((qd2) list.get(i)).e(q09Var));
        }
        return new jb4(tl1.r(t), this.b);
    }

    public final String toString() {
        return "Corner: cubics=" + sl1.i0(this.a, ", ", null, null, new dw3(25), 30) + " convex=" + this.b;
    }
}
