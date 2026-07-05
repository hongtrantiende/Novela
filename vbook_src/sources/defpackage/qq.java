package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qq  reason: default package */
/* loaded from: classes.dex */
public final class qq implements hb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qq(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.hb3
    public final void a() {
        xn6 k;
        boolean isTerminated;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((ora) obj3).remove(obj2);
                ((er) obj).e.l(obj2);
                return;
            case 1:
                uo3 uo3Var = (uo3) obj3;
                ym0 ym0Var = (ym0) obj2;
                wm0 wm0Var = (wm0) obj;
                uo3Var.getClass();
                ym0Var.getClass();
                wm0Var.getClass();
                if (uo3Var.c == ym0Var && uo3Var.d == wm0Var) {
                    uo3Var.c = null;
                    uo3Var.d = null;
                    return;
                }
                return;
            case 2:
                ((un6) obj3).k().f((pn6) obj2);
                ohc ohcVar = (ohc) ((zl9) obj).a;
                return;
            case 3:
                ((un6) obj3).k().f((pn6) obj2);
                eo6 eo6Var = (eo6) ((zl9) obj).a;
                if (eo6Var != null) {
                    eo6Var.a();
                    return;
                }
                return;
            case 4:
                un6 un6Var = (un6) obj3;
                if (un6Var != null && (k = un6Var.k()) != null) {
                    k.f((an9) obj2);
                }
                cw1 cw1Var = (cw1) obj;
                jn6 jn6Var = jn6.ON_DESTROY;
                cw1Var.getClass();
                cw1Var.b = jn6Var.a();
                cw1Var.a();
                return;
            case 5:
                vdd vddVar = (vdd) obj3;
                if (vddVar instanceof AutoCloseable) {
                    vddVar.close();
                } else if (vddVar instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) vddVar;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    p1a.g();
                    return;
                }
                if (((xn6) obj2).h.compareTo(kn6.c) >= 0) {
                    ydd yddVar = (ydd) obj;
                    wdd wddVar = (wdd) yddVar.a().b.g(kh5.a0);
                    if (wddVar == null || wddVar.c <= 0) {
                        yddVar.a().d();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                tx9 tx9Var = (tx9) obj3;
                by9 by9Var = (by9) obj;
                if (tx9Var.b.l(obj2) == by9Var) {
                    Map map = tx9Var.a;
                    Map d = by9Var.d();
                    if (d.isEmpty()) {
                        map.remove(obj2);
                        return;
                    } else {
                        map.put(obj2, d);
                        return;
                    }
                }
                return;
            case 7:
                uo3 uo3Var2 = (uo3) obj3;
                String str = ((xl0) obj2).a;
                ppb ppbVar = (ppb) obj;
                uo3Var2.getClass();
                str.getClass();
                ppbVar.getClass();
                LinkedHashMap linkedHashMap = uo3Var2.f;
                Set set = (Set) linkedHashMap.get(new pm0(str));
                if (set != null) {
                    set.remove(ppbVar);
                    if (set.isEmpty()) {
                        linkedHashMap.remove(new pm0(str));
                        return;
                    }
                    return;
                }
                return;
            default:
                gcd gcdVar = (gcd) obj3;
                ((lu4) obj2).invoke(Long.valueOf(((Number) gcdVar.g.a.getValue()).longValue()), Long.valueOf(((Number) gcdVar.h.a.getValue()).longValue()));
                ((j9d) obj).close();
                gcdVar.c();
                return;
        }
    }
}
