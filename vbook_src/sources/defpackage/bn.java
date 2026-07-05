package defpackage;

import android.content.Intent;
import android.media.AudioTrack;
import android.os.Handler;
import android.view.ActionMode;
import android.view.SurfaceView;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bn(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        lv2 lv2Var = (lv2) this.b;
        axe axeVar = (axe) this.c;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
        try {
            ep4 q = dce.q(lv2Var.a);
            if (q != null) {
                dp4 dp4Var = (dp4) ((bq3) q.b);
                synchronized (dp4Var.d) {
                    dp4Var.f = threadPoolExecutor;
                }
                ((bq3) q.b).b(new eq3(axeVar, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            axeVar.n(th);
            threadPoolExecutor.shutdown();
        }
    }

    private final void b() {
        boolean z;
        v69 v69Var = (v69) this.b;
        s51 s51Var = (s51) this.c;
        nnd nndVar = (nnd) this.d;
        v69Var.getClass();
        try {
            z = ((Boolean) s51Var.b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        synchronized (v69Var.k) {
            try {
                hmd s = dxe.s(nndVar.a);
                String str = s.a;
                if (v69Var.c(str) == nndVar) {
                    v69Var.b(str);
                }
                r95 n = r95.n();
                String str2 = v69.l;
                n.c(str2, v69.class.getSimpleName() + " " + str + " executed; reschedule = " + z);
                ArrayList arrayList = v69Var.j;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((qy3) obj).b(s, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                cn cnVar = (cn) this.b;
                an anVar = (an) this.d;
                ActionMode startActionMode = cnVar.a.startActionMode(new rj4((zm) this.c), 1);
                c16.i(cnVar.h, startActionMode);
                if (startActionMode == null) {
                    anVar.close();
                    return;
                }
                return;
            case 1:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                rr6 rr6Var = (rr6) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new x0(rr6Var, 7));
                    }
                    synchronized (p60.s) {
                        try {
                            int i = p60.u - 1;
                            p60.u = i;
                            if (i == 0) {
                                ScheduledExecutorService scheduledExecutorService = p60.t;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                p60.t = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new x0(rr6Var, 7));
                    }
                    synchronized (p60.s) {
                        try {
                            int i2 = p60.u - 1;
                            p60.u = i2;
                            if (i2 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = p60.t;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                p60.t = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 2:
                String str = (String) this.c;
                lmd lmdVar = (lmd) this.d;
                bnd w = ((WorkDatabase) this.b).w();
                w.getClass();
                str.getClass();
                for (String str2 : (List) gae.l(w.a, true, false, new a23(str, 23))) {
                    obe.s(lmdVar, str2);
                }
                return;
            case 3:
                a();
                return;
            case 4:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                int i3 = EnhancedIntentService.f;
                try {
                    enhancedIntentService.c(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 5:
                e67 e67Var = (e67) this.d;
                ms2 ms2Var = ((q57) this.b).c;
                mm9 g = ((ls5) this.c).g();
                yv yvVar = ms2Var.d;
                cz8 cz8Var = ms2Var.g;
                cz8Var.getClass();
                yvVar.getClass();
                yvVar.b = qs5.l(g);
                if (!g.isEmpty()) {
                    yvVar.e = (e67) g.get(0);
                    e67Var.getClass();
                    yvVar.f = e67Var;
                }
                if (((e67) yvVar.d) == null) {
                    yvVar.d = yv.q(cz8Var, (qs5) yvVar.b, (e67) yvVar.e, (y9c) yvVar.a);
                }
                yvVar.D(((i04) cz8Var).m());
                return;
            case 6:
                i09.a((i09) this.b, (SurfaceView) this.c, (e09) this.d);
                return;
            case 7:
                b();
                return;
            default:
                qya qyaVar = (qya) this.c;
                v69 v69Var = (v69) ((rwa) this.b).b;
                v69Var.getClass();
                Object obj = "Work ";
                hmd hmdVar = qyaVar.a;
                String str3 = hmdVar.a;
                ArrayList arrayList = new ArrayList();
                ymd ymdVar = (ymd) v69Var.e.n(new s03(1, v69Var, arrayList, str3));
                if (ymdVar == null) {
                    r95.n().s(v69.l, "Didn't find WorkSpec for id " + hmdVar);
                    v69Var.d.d.execute(new ex2(21, v69Var, hmdVar));
                    return;
                }
                Object obj2 = v69Var.k;
                synchronized (obj2) {
                    try {
                        try {
                            synchronized (v69Var.k) {
                                if (v69Var.c(str3) != null) {
                                    z = true;
                                }
                            }
                            if (z) {
                                Set set = (Set) v69Var.h.get(str3);
                                if (((qya) set.iterator().next()).a.b == hmdVar.b) {
                                    set.add(qyaVar);
                                    r95.n().c(v69.l, "Work " + hmdVar + " is already enqueued for processing");
                                } else {
                                    v69Var.d.d.execute(new ex2(21, v69Var, hmdVar));
                                }
                                return;
                            } else if (ymdVar.t != hmdVar.b) {
                                v69Var.d.d.execute(new ex2(21, v69Var, hmdVar));
                                return;
                            } else {
                                nnd nndVar = new nnd(new qu1(v69Var.b, v69Var.c, v69Var.d, v69Var, v69Var.e, ymdVar, arrayList));
                                f82 f82Var = nndVar.d.b;
                                y26 c = k27.c();
                                f82Var.getClass();
                                s51 v = que.v(nq2.C(f82Var, c), new lnd(nndVar, null, 1));
                                v.b.a(new bn(7, v69Var, v, nndVar), v69Var.d.d);
                                v69Var.g.put(str3, nndVar);
                                HashSet hashSet = new HashSet();
                                hashSet.add(qyaVar);
                                v69Var.h.put(str3, hashSet);
                                r95.n().c(v69.l, v69.class.getSimpleName() + ": processing " + hmdVar);
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
        }
    }
}
