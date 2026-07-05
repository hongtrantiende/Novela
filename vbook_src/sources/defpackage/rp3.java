package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rp3  reason: default package */
/* loaded from: classes.dex */
public final class rp3 extends up3 {
    public long c;
    public sna d;

    public rp3() {
        super(0, 3);
        this.c = 9205357640488583168L;
        this.d = rna.a;
    }

    @Override // defpackage.lp3
    public final xy4 a() {
        xy4 a;
        lp3 lp3Var = (lp3) sl1.s0(this.b);
        if (lp3Var != null && (a = lp3Var.a()) != null) {
            return a;
        }
        return s9e.r(vy4.a);
    }

    @Override // defpackage.lp3
    public final void b(xy4 xy4Var) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    @Override // defpackage.lp3
    public final lp3 c() {
        rp3 rp3Var = new rp3();
        rp3Var.c = this.c;
        rp3Var.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((lp3) obj).c());
        }
        rp3Var.b.addAll(arrayList2);
        return rp3Var;
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) ug3.c(this.c)) + ", sizeMode=" + this.d + ", children=[\n" + d() + "\n])";
    }
}
