package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: np3  reason: default package */
/* loaded from: classes.dex */
public final class np3 extends up3 {
    public xy4 c;
    public int d;
    public int e;

    public np3() {
        super(0, 3);
        this.c = vy4.a;
        this.d = 0;
        this.e = 0;
    }

    @Override // defpackage.lp3
    public final xy4 a() {
        return this.c;
    }

    @Override // defpackage.lp3
    public final void b(xy4 xy4Var) {
        this.c = xy4Var;
    }

    @Override // defpackage.lp3
    public final lp3 c() {
        np3 np3Var = new np3();
        np3Var.c = this.c;
        np3Var.d = this.d;
        np3Var.e = this.e;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((lp3) obj).c());
        }
        np3Var.b.addAll(arrayList2);
        return np3Var;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.c + ", verticalAlignment=" + ((Object) bc.b(this.d)) + ", horizontalAlignment=" + ((Object) ac.b(this.e)) + ", children=[\n" + d() + "\n])";
    }
}
