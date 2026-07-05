package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.LongSparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b9(o92 o92Var, Throwable th) {
        this.a = 17;
        Map map = Collections.EMPTY_MAP;
        this.b = o92Var;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        koc kocVar;
        fz2 fz2Var;
        Object obj;
        switch (this.a) {
            case 0:
                ((lo1) this.b).t((ListenableFuture) this.c);
                return;
            case 1:
                ((lo1) this.b).q((is5) this.c);
                return;
            case 2:
                ih.e((kh) this.b, (LongSparseArray) this.c);
                return;
            case 3:
                r30 r30Var = (r30) this.b;
                ex2 ex2Var = (ex2) this.c;
                r30Var.c.i();
                v30 v30Var = r30Var.b;
                synchronized (v30Var.a) {
                    v30Var.b();
                    ex2Var.run();
                }
                return;
            case 4:
                h50.a = (AudioManager) ((Context) this.b).getSystemService("audio");
                ((vy1) this.c).c();
                return;
            case 5:
                b60 b60Var = (b60) this.b;
                synchronized (((ar2) this.c)) {
                }
                c04 c04Var = b60Var.b;
                String str = a2d.a;
                i04 i04Var = c04Var.a;
                ms2 ms2Var = i04Var.r;
                ms2Var.N(ms2Var.J((e67) ms2Var.d.e), 1013, new gs2(19));
                i04Var.U = null;
                return;
            case 6:
                c04 c04Var2 = ((b60) this.b).b;
                String str2 = a2d.a;
                i04 i04Var2 = c04Var2.a;
                i04Var2.U = (vq4) this.c;
                ms2 ms2Var2 = i04Var2.r;
                ms2Var2.N(ms2Var2.M(), 1009, new gs2(24));
                return;
            case 7:
                c04 c04Var3 = ((b60) this.b).b;
                String str3 = a2d.a;
                kw5.c(c04Var3.a.E, (uk1) this.c);
                return;
            case 8:
                oaa oaaVar = (oaa) this.b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) oaaVar.d).post(new b9(9, oaaVar, routedDevice));
                    return;
                }
                return;
            case 9:
                oaa oaaVar2 = (oaa) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (((k60) oaaVar2.e) != null && (kocVar = ((r60) ((uwd) oaaVar2.c).b).i) != null && !audioDeviceInfo.equals((AudioDeviceInfo) kocVar.j)) {
                    kocVar.j = audioDeviceInfo;
                    Context context = (Context) kocVar.b;
                    List e = kocVar.e();
                    mm9 mm9Var = r40.e;
                    kocVar.f(r40.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), (l40) kocVar.k, audioDeviceInfo, e));
                    return;
                }
                return;
            case 10:
                t6f t6fVar = (t6f) this.b;
                Object apply = ((b04) this.c).apply(t6fVar.C);
                t6fVar.C = apply;
                mg0 mg0Var = new mg0(t6fVar, apply, 1);
                ggb ggbVar = (ggb) t6fVar.d;
                if (ggbVar.a.getLooper().getThread().isAlive()) {
                    ggbVar.d(mg0Var);
                    return;
                }
                return;
            case 11:
                String uuid = ((UUID) this.c).toString();
                uuid.getClass();
                obe.s((lmd) this.b, uuid);
                return;
            case 12:
                bu1 bu1Var = (bu1) this.b;
                bu1Var.a.a(new st1(0, (tb8) this.c, bu1Var));
                return;
            case 13:
                ve8 ve8Var = (ve8) this.b;
                l99 l99Var = (l99) this.c;
                if (ve8Var.b == ve8.d) {
                    synchronized (ve8Var) {
                        fz2Var = ve8Var.a;
                        ve8Var.a = null;
                        ve8Var.b = l99Var;
                    }
                    fz2Var.f(l99Var);
                    return;
                }
                vs.k("provide() can be called only once.");
                return;
            case 14:
                sj6 sj6Var = (sj6) this.b;
                l99 l99Var2 = (l99) this.c;
                synchronized (sj6Var) {
                    try {
                        if (sj6Var.b == null) {
                            sj6Var.a.add(l99Var2);
                        } else {
                            sj6Var.b.add(l99Var2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 15:
                m02 m02Var = (m02) this.c;
                for (fh0 fh0Var : (List) this.b) {
                    Object obj2 = m02Var.e;
                    gh0 gh0Var = fh0Var.a;
                    if (gh0Var.e(obj2)) {
                        obj = new c12(gh0Var.d());
                    } else {
                        obj = b12.a;
                    }
                    y69 y69Var = fh0Var.b;
                    y69Var.getClass();
                    y69Var.j(obj);
                }
                return;
            case 16:
                ((i92) this.b).c((String) this.c, Boolean.FALSE);
                return;
            case 17:
                Throwable th2 = (Throwable) this.c;
                Map map = Collections.EMPTY_MAP;
                i92 i92Var = ((o92) this.b).g;
                Thread currentThread = Thread.currentThread();
                i92Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                va2 va2Var = i92Var.n;
                if (va2Var == null || !va2Var.e.get()) {
                    long j = currentTimeMillis / 1000;
                    String e2 = i92Var.e();
                    if (e2 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    tx3 tx3Var = new tx3(e2, j, map);
                    qu1 qu1Var = i92Var.m;
                    qu1Var.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e2);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    qu1Var.y(th2, currentThread, "error", tx3Var, false);
                    return;
                }
                return;
            case 18:
                ((uwd) ((wb2) this.b).e()).s((rx4) this.c);
                return;
            case 19:
                ((uwd) ((wb2) this.b).e()).r(((zl9) this.c).a);
                return;
            case 20:
                ((uwd) ((wb2) this.b).e()).r((ox4) this.c);
                return;
            case 21:
                ((uwd) ((rb2) this.b)).r(this.c);
                return;
            case 22:
                ((uwd) ((cc2) this.b).e()).s((rx4) this.c);
                return;
            case 23:
                ((uwd) ((cc2) this.b).e()).r(((zl9) this.c).a);
                return;
            case 24:
                ((uwd) ((cc2) this.b).e()).r((ox4) this.c);
                return;
            case 25:
                ((uwd) ((cc2) this.b).e()).r((sx4) this.c);
                return;
            case 26:
                ((uwd) ((rb2) this.b)).r(((zl9) this.c).a);
                return;
            case 27:
                ((uwd) ((rb2) this.b)).r(new e60(((Exception) this.c).getMessage(), 4));
                return;
            case 28:
                me2 me2Var = (me2) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(me2Var.c);
                StrictMode.ThreadPolicy threadPolicy = me2Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            default:
                fu2 fu2Var = (fu2) this.b;
                fu2Var.F = false;
                fu2Var.b((Uri) this.c);
                return;
        }
    }

    public /* synthetic */ b9(b60 b60Var, vq4 vq4Var, er2 er2Var) {
        this.a = 6;
        this.b = b60Var;
        this.c = vq4Var;
    }

    public /* synthetic */ b9(lo1 lo1Var, int i, ListenableFuture listenableFuture) {
        this.a = 0;
        this.b = lo1Var;
        this.c = listenableFuture;
    }

    public /* synthetic */ b9(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
