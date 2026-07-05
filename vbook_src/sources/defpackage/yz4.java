package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yz4  reason: default package */
/* loaded from: classes.dex */
public final class yz4 implements Handler.Callback {
    public static final Status L = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status M = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object N = new Object();
    public static yz4 O;
    public final rwa C;
    public final AtomicInteger D;
    public final AtomicInteger E;
    public final ConcurrentHashMap F;
    public jud G;
    public final a00 H;
    public final a00 I;
    public final ovd J;
    public volatile boolean K;
    public long a;
    public boolean b;
    public elb c;
    public xb4 d;
    public final Context e;
    public final uz4 f;

    /* JADX WARN: Type inference failed for: r2v6, types: [android.os.Handler, ovd] */
    public yz4(Context context, Looper looper) {
        uz4 uz4Var = uz4.e;
        this.a = 10000L;
        this.b = false;
        boolean z = true;
        this.D = new AtomicInteger(1);
        this.E = new AtomicInteger(0);
        this.F = new ConcurrentHashMap(5, 0.75f, 1);
        this.G = null;
        this.H = new a00(0);
        this.I = new a00(0);
        this.K = true;
        this.e = context;
        ?? handler = new Handler(looper, this);
        Looper.getMainLooper();
        this.J = handler;
        this.f = uz4Var;
        this.C = new rwa(14);
        PackageManager packageManager = context.getPackageManager();
        if (p1d.j == null) {
            p1d.j = Boolean.valueOf((yz1.o() && packageManager.hasSystemFeature("android.hardware.type.automotive")) ? z : false);
        }
        if (p1d.j.booleanValue()) {
            this.K = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static Status c(jv jvVar, jz1 jz1Var) {
        String str = (String) jvVar.b.b;
        String valueOf = String.valueOf(jz1Var);
        return new Status(17, nk2.w(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), jz1Var.c, jz1Var);
    }

    public static yz4 d(Context context) {
        yz4 yz4Var;
        HandlerThread handlerThread;
        synchronized (N) {
            if (O == null) {
                synchronized (w6f.g) {
                    handlerThread = w6f.i;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        w6f.i = handlerThread2;
                        handlerThread2.start();
                        handlerThread = w6f.i;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = uz4.d;
                O = new yz4(applicationContext, looper);
            }
            yz4Var = O;
        }
        return yz4Var;
    }

    public final oud a(tz4 tz4Var) {
        jv jvVar = tz4Var.f;
        ConcurrentHashMap concurrentHashMap = this.F;
        oud oudVar = (oud) concurrentHashMap.get(jvVar);
        if (oudVar == null) {
            oudVar = new oud(this, tz4Var);
            concurrentHashMap.put(jvVar, oudVar);
        }
        if (oudVar.b.r()) {
            this.I.add(jvVar);
        }
        oudVar.r();
        return oudVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.gms.tasks.TaskCompletionSource r10, int r11, defpackage.tz4 r12) {
        /*
            r9 = this;
            if (r11 == 0) goto L76
            jv r3 = r12.f
            boolean r12 = r9.f()
            r8 = 1
            if (r12 != 0) goto Lc
            goto L46
        Lc:
            mu9 r12 = defpackage.mu9.s()
            java.lang.Object r12 = r12.a
            nu9 r12 = (defpackage.nu9) r12
            if (r12 == 0) goto L49
            boolean r0 = r12.b
            if (r0 == 0) goto L46
            boolean r12 = r12.c
            java.util.concurrent.ConcurrentHashMap r0 = r9.F
            java.lang.Object r0 = r0.get(r3)
            oud r0 = (defpackage.oud) r0
            if (r0 == 0) goto L4a
            qz4 r1 = r0.b
            boolean r2 = r1 instanceof defpackage.rh0
            if (r2 == 0) goto L46
            rh0 r1 = (defpackage.rh0) r1
            fve r2 = r1.w
            if (r2 == 0) goto L4a
            boolean r2 = r1.q()
            if (r2 != 0) goto L4a
            sz1 r12 = defpackage.rud.a(r0, r1, r11)
            if (r12 == 0) goto L46
            int r1 = r0.q
            int r1 = r1 + r8
            r0.q = r1
            boolean r12 = r12.c
            goto L4a
        L46:
            r11 = 0
            r1 = r9
            goto L63
        L49:
            r12 = r8
        L4a:
            rud r0 = new rud
            r1 = 0
            if (r12 == 0) goto L55
            long r4 = java.lang.System.currentTimeMillis()
            goto L56
        L55:
            r4 = r1
        L56:
            if (r12 == 0) goto L5c
            long r1 = android.os.SystemClock.elapsedRealtime()
        L5c:
            r6 = r1
            r1 = r9
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            r11 = r0
        L63:
            if (r11 == 0) goto L76
            com.google.android.gms.tasks.Task r9 = r10.getTask()
            ovd r10 = r1.J
            java.util.Objects.requireNonNull(r10)
            aq9 r12 = new aq9
            r12.<init>(r10, r8)
            r9.addOnCompleteListener(r12, r11)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz4.b(com.google.android.gms.tasks.TaskCompletionSource, int, tz4):void");
    }

    public final void e(jud judVar) {
        synchronized (N) {
            try {
                if (this.G != judVar) {
                    this.G = judVar;
                    this.H.clear();
                }
                this.H.addAll(judVar.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        int i;
        if (!this.b) {
            nu9 nu9Var = (nu9) mu9.s().a;
            if (nu9Var == null || nu9Var.b) {
                SparseIntArray sparseIntArray = (SparseIntArray) this.C.b;
                synchronized (sparseIntArray) {
                    i = sparseIntArray.get(203400000, -1);
                }
                if (i != -1 && i != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g(jz1 jz1Var, int i) {
        boolean z;
        uz4 uz4Var = this.f;
        uz4Var.getClass();
        Context context = this.e;
        if (!ay5.n(context)) {
            int i2 = jz1Var.b;
            PendingIntent pendingIntent = jz1Var.c;
            if (i2 != 0 && pendingIntent != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                pendingIntent = null;
                Intent a = uz4Var.a(context, null, i2);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                uz4Var.h(context, i2, PendingIntent.getActivity(context, 0, intent, lvd.a | 134217728));
                uz4Var.i(context, jz1Var, false);
                return true;
            }
        }
        return false;
    }

    public final void h(jz1 jz1Var, int i) {
        if (!g(jz1Var, i)) {
            ovd ovdVar = this.J;
            ovdVar.sendMessage(ovdVar.obtainMessage(5, i, 0, jz1Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0307  */
    /* JADX WARN: Type inference failed for: r1v22, types: [xb4, tz4] */
    /* JADX WARN: Type inference failed for: r1v30, types: [xb4, tz4] */
    /* JADX WARN: Type inference failed for: r1v35, types: [xb4, tz4] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz4.handleMessage(android.os.Message):boolean");
    }
}
