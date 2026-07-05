package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xxd  reason: default package */
/* loaded from: classes.dex */
public final class xxd extends c41 {
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final AtomicReference g;
    public static final AtomicLong h;
    public static final ConcurrentLinkedQueue i;
    public volatile c41 c;

    static {
        boolean z;
        boolean z2;
        String str = Build.FINGERPRINT;
        boolean z3 = false;
        if (str == null || "robolectric".equals(str)) {
            z = true;
        } else {
            z = false;
        }
        d = z;
        String str2 = Build.HARDWARE;
        if ("goldfish".equals(str2) || "ranchu".equals(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        e = z2;
        String str3 = Build.TYPE;
        if ("eng".equals(str3) || "userdebug".equals(str3)) {
            z3 = true;
        }
        f = z3;
        g = new AtomicReference();
        h = new AtomicLong();
        i = new ConcurrentLinkedQueue();
    }

    public static void j() {
        while (true) {
            wxd wxdVar = (wxd) i.poll();
            if (wxdVar != null) {
                h.getAndDecrement();
                xxd xxdVar = wxdVar.a;
                pif pifVar = wxdVar.b;
                bjf bjfVar = pifVar.c;
                if ((bjfVar != null && Boolean.TRUE.equals(bjfVar.w(ajf.g))) || xxdVar.g(pifVar.a)) {
                    xxdVar.h(pifVar);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.c41
    public final boolean g(Level level) {
        if (this.c != null && !this.c.g(level)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.c41
    public final void h(pif pifVar) {
        if (this.c != null) {
            this.c.h(pifVar);
            return;
        }
        if (h.incrementAndGet() > 20) {
            i.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        i.offer(new wxd(this, pifVar));
        if (this.c != null) {
            j();
        }
    }

    @Override // defpackage.c41
    public final void i(RuntimeException runtimeException, pif pifVar) {
        if (this.c != null) {
            this.c.i(runtimeException, pifVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
