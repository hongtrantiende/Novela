package defpackage;

import android.app.Activity;
import android.view.ActionMode;
import android.view.WindowManager;
import com.vbook.android.R;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r6  reason: default package */
/* loaded from: classes.dex */
public final class r6 implements hb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hb3
    public final void a() {
        iya iyaVar;
        boolean isTerminated;
        int i = this.a;
        boolean z = true;
        boolean z2 = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                o6 o6Var = ((i6) obj).a;
                if (o6Var != null) {
                    o6Var.b();
                    return;
                } else {
                    vs.k("Launcher has not been initialized");
                    return;
                }
            case 1:
                z53 z53Var = (z53) obj;
                z53Var.dismiss();
                z53Var.D.e();
                return;
            case 2:
                i29 i29Var = (i29) obj;
                i29Var.e();
                i29Var.setTag(R.id.view_tree_lifecycle_owner, null);
                i29Var.setTag(R.id.view_tree_navigation_event_dispatcher_owner, null);
                i29Var.L.removeViewImmediate(i29Var);
                yz7 navigationEventDispatcher = i29Var.getNavigationEventDispatcher();
                navigationEventDispatcher.d();
                navigationEventDispatcher.b = true;
                rz rzVar = new rz();
                rzVar.addLast(navigationEventDispatcher);
                while (!rzVar.isEmpty()) {
                    yz7 yz7Var = (yz7) rzVar.removeFirst();
                    yz7Var.b = z;
                    lv7 lv7Var = yz7Var.f;
                    lv7 lv7Var2 = yz7Var.g;
                    lv7 lv7Var3 = yz7Var.e;
                    Object[] objArr = lv7Var3.b;
                    long[] jArr = lv7Var3.c;
                    for (int i2 = lv7Var3.e; i2 != Integer.MAX_VALUE; i2 = (int) (2147483647L & (jArr[i2] >> 31))) {
                        rzVar.addLast((yz7) objArr[i2]);
                    }
                    lv7 q = ase.q(lv7Var2);
                    Object[] objArr2 = q.b;
                    long[] jArr2 = q.c;
                    for (int i3 = q.e; i3 != Integer.MAX_VALUE; i3 = (int) ((jArr2[i3] >> 31) & 2147483647L)) {
                        e08 e08Var = (e08) objArr2[i3];
                        f08 f08Var = navigationEventDispatcher.d;
                        f08Var.getClass();
                        e08Var.getClass();
                        f08Var.k.h(e08Var);
                        f08Var.j.h(e08Var);
                        f08Var.i.h(e08Var);
                        e08Var.a = null;
                        e08Var.c();
                    }
                    lv7Var2.b();
                    lv7 q2 = ase.q(lv7Var);
                    Object[] objArr3 = q2.b;
                    long[] jArr3 = q2.c;
                    for (int i4 = q2.e; i4 != Integer.MAX_VALUE; i4 = (int) ((jArr3[i4] >> 31) & 2147483647L)) {
                        ((a08) objArr3[i4]).h();
                    }
                    lv7Var.b();
                    lv7Var3.b();
                    z = true;
                }
                return;
            case 3:
                cn cnVar = (cn) obj;
                sra sraVar = cnVar.e;
                d89 d89Var = sraVar.h;
                if (d89Var != null) {
                    d89Var.a();
                }
                sraVar.a();
                ActionMode actionMode = cnVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                cnVar.h = null;
                return;
            case 4:
                ui0 ui0Var = (ui0) ((vi0) obj).c.getValue();
                if (ui0Var != null) {
                    ui0Var.close();
                    return;
                }
                return;
            case 5:
                ytb ytbVar = (ytb) obj;
                epb epbVar = ytbVar.d.a;
                if (epbVar != null && (iyaVar = epbVar.Q) != null) {
                    iyaVar.cancel(null);
                    epbVar.Q = null;
                }
                ytbVar.k = null;
                return;
            case 6:
                ((lb3) obj).b.invoke();
                return;
            case 7:
                ((gtb) obj).o();
                return;
            case 8:
                dt8 dt8Var = (dt8) obj;
                iya iyaVar2 = dt8Var.e;
                dt8Var.e = null;
                for (xh8 xh8Var : ((zc6) dt8Var.a.d.getValue()).e) {
                    k8c k8cVar = xh8Var.f;
                    k8cVar.d();
                    k27.n(k8cVar.f, null);
                    k8cVar.l.clear();
                    k8cVar.i = new oz9(0L, 7);
                    k27.n(xh8Var.c, null);
                }
                if (iyaVar2 != null && !iyaVar2.N()) {
                    iyaVar2.invokeOnCompletion(new gd3(dt8Var, 1));
                    iyaVar2.cancel(null);
                    return;
                }
                op8 op8Var = dt8Var.b;
                if (op8Var != null) {
                    op8Var.a();
                }
                dt8Var.b = null;
                k27.n(dt8Var.d, null);
                return;
            case 9:
                ((mj4) obj).a.clear();
                return;
            case 10:
                ((ww1) obj).a.a();
                return;
            case 11:
                ((rh6) obj).d = null;
                return;
            case 12:
                ei6 ei6Var = (ei6) obj;
                o40 o40Var = ei6Var.c;
                if (o40Var != null) {
                    o40Var.a = false;
                }
                ei6Var.c = null;
                return;
            case 13:
                ai6 ai6Var = (ai6) obj;
                ai6Var.f = true;
                ai6Var.d = 0;
                ai6Var.b.a.remove(ai6Var);
                ai6 ai6Var2 = ai6Var.e;
                if (ai6Var2 != null) {
                    ai6Var2.b();
                }
                ai6Var.e = null;
                return;
            case 14:
                ((ov7) obj).g = null;
                return;
            case 15:
                t58 t58Var = (t58) obj;
                m82 a = idd.a(t58Var);
                sw2 sw2Var = ab3.a;
                t58Var.f(a, ru2.c, new s58(t58Var, null, 2));
                return;
            case 16:
                vdd vddVar = (vdd) obj;
                if (vddVar instanceof AutoCloseable) {
                    vddVar.close();
                    return;
                } else if (vddVar instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) vddVar;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    p1a.g();
                    return;
                }
            case 17:
                tl tlVar = (tl) obj;
                tlVar.a(false);
                Activity activity = tlVar.a;
                WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                attributes.screenBrightness = -1.0f;
                activity.getWindow().setAttributes(attributes);
                tlVar.b(b1a.a);
                return;
            case 18:
                f7a f7aVar = (f7a) obj;
                f7aVar.l();
                f7aVar.E.setValue(Boolean.FALSE);
                return;
            case 19:
                hoa hoaVar = (hoa) obj;
                hoaVar.a(null);
                hoaVar.b.setValue(null);
                return;
            case 20:
                s8c s8cVar = (s8c) obj;
                LinkedHashMap linkedHashMap = s8cVar.j;
                for (w26 w26Var : linkedHashMap.values()) {
                    w26Var.cancel(null);
                }
                linkedHashMap.clear();
                s8cVar.f.clear();
                jm9 jm9Var = s8cVar.i;
                if (jm9Var != null) {
                    try {
                        eub.v(jm9Var);
                    } catch (Throwable unused2) {
                    }
                }
                s8cVar.i = null;
                return;
            default:
                ((y4a) ((c3e) obj)).i0(null);
                return;
        }
    }
}
