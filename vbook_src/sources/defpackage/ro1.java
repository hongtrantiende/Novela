package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ro1  reason: default package */
/* loaded from: classes.dex */
public abstract class ro1 extends ex3 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c;
    public int d;
    public boolean e;

    @Override // defpackage.ex3
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ex3
    public final void e() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((ex3) next).e();
        }
    }

    @Override // defpackage.ex3
    public final boolean f() {
        return this.e;
    }

    public final void g() {
        ArrayList arrayList = this.a;
        this.c = arrayList.size();
        this.d = 0;
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            this.d = ((ex3) next).a() + this.d;
        }
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        wl1.O(new oo1(new c8(12, (byte) 0), 0), arrayList2);
        Iterator it2 = arrayList.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            if (((ex3) next2).f()) {
                this.e = true;
                return;
            }
        }
    }
}
