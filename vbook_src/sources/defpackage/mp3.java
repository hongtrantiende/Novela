package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mp3  reason: default package */
/* loaded from: classes.dex */
public final class mp3 extends up3 {
    public xy4 c;
    public cc d;

    public mp3() {
        super(0, 3);
        this.c = vy4.a;
        this.d = cc.c;
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
        mp3 mp3Var = new mp3();
        mp3Var.c = this.c;
        mp3Var.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((lp3) obj).c());
        }
        mp3Var.b.addAll(arrayList2);
        return mp3Var;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.c + ", contentAlignment=" + this.d + "children=[\n" + d() + "\n])";
    }
}
