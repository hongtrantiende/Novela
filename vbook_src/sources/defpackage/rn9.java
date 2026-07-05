package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rn9  reason: default package */
/* loaded from: classes.dex */
public final class rn9 extends up3 {
    public final int c;
    public xy4 d;

    public rn9(int i) {
        super(i, 2);
        this.c = i;
        this.d = vy4.a;
    }

    @Override // defpackage.lp3
    public final xy4 a() {
        return this.d;
    }

    @Override // defpackage.lp3
    public final void b(xy4 xy4Var) {
        this.d = xy4Var;
    }

    @Override // defpackage.lp3
    public final lp3 c() {
        rn9 rn9Var = new rn9(this.c);
        rn9Var.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((lp3) obj).c());
        }
        rn9Var.b.addAll(arrayList2);
        return rn9Var;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.d + ", children=[\n" + d() + "\n])";
    }
}
