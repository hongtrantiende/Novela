package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ci0  reason: default package */
/* loaded from: classes.dex */
public abstract class ci0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final cl3 c = new cl3(new CopyOnWriteArrayList(), 0, null);
    public final cl3 d = new cl3(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public aac f;
    public a09 g;

    public final cl3 a(e67 e67Var) {
        return new cl3(this.c.c, 0, e67Var);
    }

    public abstract n57 b(e67 e67Var, ij1 ij1Var, long j);

    public final void c(f67 f67Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(f67Var);
        if (!isEmpty && hashSet.isEmpty()) {
            d();
        }
    }

    public final void e(f67 f67Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(f67Var);
        if (isEmpty) {
            f();
        }
    }

    public aac g() {
        return null;
    }

    public abstract f57 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(f67 f67Var, ys2 ys2Var, a09 a09Var) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        wq9.s(z);
        this.g = a09Var;
        aac aacVar = this.f;
        this.a.add(f67Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(f67Var);
            l(ys2Var);
        } else if (aacVar != null) {
            e(f67Var);
            f67Var.a(this, aacVar);
        }
    }

    public abstract void l(ys2 ys2Var);

    public final void m(aac aacVar) {
        this.f = aacVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f67) obj).a(this, aacVar);
        }
    }

    public abstract void n(n57 n57Var);

    public final void o(f67 f67Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(f67Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            p();
            return;
        }
        c(f67Var);
    }

    public abstract void p();

    public final void q(dl3 dl3Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            bl3 bl3Var = (bl3) it.next();
            if (bl3Var.a == dl3Var) {
                copyOnWriteArrayList.remove(bl3Var);
            }
        }
    }

    public final void r(k67 k67Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j67 j67Var = (j67) it.next();
            if (j67Var.b == k67Var) {
                copyOnWriteArrayList.remove(j67Var);
            }
        }
    }

    public abstract void s(f57 f57Var);

    public void d() {
    }

    public void f() {
    }
}
