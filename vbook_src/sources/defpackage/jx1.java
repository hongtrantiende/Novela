package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jx1  reason: default package */
/* loaded from: classes.dex */
public abstract class jx1 extends ci0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public ys2 j;

    @Override // defpackage.ci0
    public final void d() {
        for (ix1 ix1Var : this.h.values()) {
            ix1Var.a.c(ix1Var.b);
        }
    }

    @Override // defpackage.ci0
    public final void f() {
        for (ix1 ix1Var : this.h.values()) {
            ix1Var.a.e(ix1Var.b);
        }
    }

    @Override // defpackage.ci0
    public void j() {
        for (ix1 ix1Var : this.h.values()) {
            ix1Var.a.j();
        }
    }

    @Override // defpackage.ci0
    public void p() {
        HashMap hashMap = this.h;
        for (ix1 ix1Var : hashMap.values()) {
            ci0 ci0Var = ix1Var.a;
            hx1 hx1Var = ix1Var.c;
            ci0Var.o(ix1Var.b);
            ci0Var.r(hx1Var);
            ci0Var.q(hx1Var);
        }
        hashMap.clear();
    }

    public abstract e67 t(Object obj, e67 e67Var);

    public abstract void w(Object obj, ci0 ci0Var, aac aacVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [bl3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [gx1, f67] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, j67] */
    public final void x(final Integer num, ci0 ci0Var) {
        HashMap hashMap = this.h;
        wq9.s(!hashMap.containsKey(num));
        ?? r1 = new f67() { // from class: gx1
            @Override // defpackage.f67
            public final void a(ci0 ci0Var2, aac aacVar) {
                jx1.this.w(num, ci0Var2, aacVar);
            }
        };
        hx1 hx1Var = new hx1(this, num);
        hashMap.put(num, new ix1(ci0Var, r1, hx1Var));
        Handler handler = this.i;
        handler.getClass();
        ci0Var.getClass();
        cl3 cl3Var = ci0Var.c;
        cl3Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = cl3Var.c;
        ?? obj = new Object();
        obj.a = handler;
        obj.b = hx1Var;
        copyOnWriteArrayList.add(obj);
        this.i.getClass();
        cl3 cl3Var2 = ci0Var.d;
        cl3Var2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = cl3Var2.c;
        ?? obj2 = new Object();
        obj2.a = hx1Var;
        copyOnWriteArrayList2.add(obj2);
        ys2 ys2Var = this.j;
        a09 a09Var = this.g;
        a09Var.getClass();
        ci0Var.k(r1, ys2Var, a09Var);
        if (this.b.isEmpty()) {
            ci0Var.c(r1);
        }
    }

    public long u(Object obj, long j) {
        return j;
    }

    public int v(int i, Object obj) {
        return i;
    }
}
