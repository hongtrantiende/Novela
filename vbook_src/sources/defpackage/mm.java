package defpackage;

import android.util.LruCache;
import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mm  reason: default package */
/* loaded from: classes3.dex */
public final class mm implements Closeable {
    public final l9b a;
    public final ThreadLocal b;
    public final mfb c;
    public final lm d;
    public final LinkedHashMap e;

    /* JADX WARN: Type inference failed for: r3v6, types: [lm, android.util.LruCache] */
    public mm(l9b l9bVar, it4 it4Var, int i) {
        boolean z;
        this.a = l9bVar;
        if (l9bVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z ^ (it4Var != null)) {
            this.b = new ThreadLocal();
            this.c = new mfb(new t7(4, this, it4Var));
            this.d = new LruCache(i);
            this.e = new LinkedHashMap();
            return;
        }
        vs.m("Failed requirement.");
        throw null;
    }

    public final Object C(Integer num, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2) {
        nm nmVar;
        lm lmVar = this.d;
        if (num != null) {
            nmVar = (nm) lmVar.remove(num);
        } else {
            nmVar = null;
        }
        if (nmVar == null) {
            nmVar = (nm) vt4Var.invoke();
        }
        if (xt4Var != null) {
            try {
                xt4Var.invoke(nmVar);
            } catch (Throwable th) {
                if (num != null) {
                    nm nmVar2 = (nm) lmVar.put(num, nmVar);
                    if (nmVar2 != null) {
                        nmVar2.close();
                    }
                } else {
                    nmVar.close();
                }
                throw th;
            }
        }
        Object invoke = xt4Var2.invoke(nmVar);
        if (num != null) {
            nm nmVar3 = (nm) lmVar.put(num, nmVar);
            if (nmVar3 != null) {
                nmVar3.close();
            }
            return invoke;
        }
        nmVar.close();
        return invoke;
    }

    public final tf9 G(Integer num, String str, xt4 xt4Var, int i, xt4 xt4Var2) {
        str.getClass();
        xt4Var.getClass();
        return new tf9(C(num, new hm(str, this, i, 0), xt4Var2, new im(0, xt4Var)));
    }

    public final it4 Q() {
        return (it4) this.c.getValue();
    }

    public final void S(String... strArr) {
        LinkedHashSet<pl4> linkedHashSet = new LinkedHashSet();
        synchronized (this.e) {
            for (String str : strArr) {
                Set set = (Set) this.e.get(str);
                if (set != null) {
                    linkedHashSet.addAll(set);
                }
            }
        }
        for (pl4 pl4Var : linkedHashSet) {
            pl4Var.a.j(pvc.a);
        }
    }

    public final void V(String[] strArr, pl4 pl4Var) {
        pl4Var.getClass();
        synchronized (this.e) {
            for (String str : strArr) {
                Set set = (Set) this.e.get(str);
                if (set != null) {
                    set.remove(pl4Var);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.evictAll();
        l9b l9bVar = this.a;
        if (l9bVar != null) {
            l9bVar.close();
        } else {
            Q().close();
        }
    }

    public final void o(String[] strArr, pl4 pl4Var) {
        pl4Var.getClass();
        synchronized (this.e) {
            try {
                for (String str : strArr) {
                    LinkedHashMap linkedHashMap = this.e;
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new LinkedHashSet();
                        linkedHashMap.put(str, obj);
                    }
                    ((Set) obj).add(pl4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final tf9 q(Integer num, String str, xt4 xt4Var) {
        return new tf9(C(num, new t7(5, this, str), xt4Var, new y4(13)));
    }

    public /* synthetic */ mm(it4 it4Var) {
        this(null, it4Var, 1);
    }
}
