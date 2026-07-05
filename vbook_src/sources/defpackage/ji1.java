package defpackage;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ji1  reason: default package */
/* loaded from: classes3.dex */
public final class ji1 implements x9a, zl8 {
    public final ki1 a = new ki1();
    public final hu4 b;

    public ji1(xt4 xt4Var) {
        this.b = xt4Var;
    }

    @Override // defpackage.x9a
    public s76 a(gi1 gi1Var) {
        Object obj = this.a.get(nmd.B(gi1Var));
        obj.getClass();
        zv7 zv7Var = (zv7) obj;
        Object obj2 = zv7Var.a.get();
        if (obj2 == null) {
            synchronized (zv7Var) {
                obj2 = zv7Var.a.get();
                if (obj2 == null) {
                    obj2 = new v41((s76) ((xt4) this.b).invoke(gi1Var));
                    zv7Var.a = new SoftReference(obj2);
                }
            }
        }
        return ((v41) obj2).a;
    }

    @Override // defpackage.zl8
    public Object b(gi1 gi1Var, ArrayList arrayList) {
        Object gs9Var;
        Object obj = this.a.get(nmd.B(gi1Var));
        obj.getClass();
        zv7 zv7Var = (zv7) obj;
        Object obj2 = zv7Var.a.get();
        if (obj2 == null) {
            synchronized (zv7Var) {
                obj2 = zv7Var.a.get();
                if (obj2 == null) {
                    obj2 = new yl8();
                    zv7Var.a = new SoftReference(obj2);
                }
            }
        }
        yl8 yl8Var = (yl8) obj2;
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            arrayList2.add(new x76((t76) obj3));
        }
        ConcurrentHashMap concurrentHashMap = yl8Var.a;
        Object obj4 = concurrentHashMap.get(arrayList2);
        if (obj4 == null) {
            try {
                gs9Var = (s76) ((lu4) this.b).invoke(gi1Var, arrayList);
            } catch (Throwable th) {
                gs9Var = new gs9(th);
            }
            hs9 hs9Var = new hs9(gs9Var);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, hs9Var);
            if (putIfAbsent == null) {
                obj4 = hs9Var;
            } else {
                obj4 = putIfAbsent;
            }
        }
        return ((hs9) obj4).a;
    }

    public ji1(lu4 lu4Var) {
        this.b = lu4Var;
    }
}
