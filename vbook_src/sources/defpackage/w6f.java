package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w6f  reason: default package */
/* loaded from: classes.dex */
public final class w6f {
    public static final Object g = new Object();
    public static w6f h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile ovd c;
    public final tz1 d;
    public final long e;
    public final long f;

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.Handler, ovd] */
    public w6f(Context context, Looper looper) {
        a4f a4fVar = new a4f(this, 1);
        this.b = context.getApplicationContext();
        ?? handler = new Handler(looper, a4fVar);
        Looper.getMainLooper();
        this.c = handler;
        this.d = tz1.b();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static w6f a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new w6f(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final jz1 b(j2f j2fVar, wie wieVar, String str, Executor executor) {
        jz1 jz1Var;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                y3f y3fVar = (y3f) hashMap.get(j2fVar);
                if (executor == null) {
                    executor = null;
                }
                if (y3fVar == null) {
                    y3fVar = new y3f(this, j2fVar);
                    y3fVar.a.put(wieVar, wieVar);
                    jz1Var = y3fVar.a(str, executor);
                    hashMap.put(j2fVar, y3fVar);
                } else {
                    this.c.removeMessages(0, j2fVar);
                    if (!y3fVar.a.containsKey(wieVar)) {
                        y3fVar.a.put(wieVar, wieVar);
                        int i2 = y3fVar.b;
                        if (i2 != 1) {
                            if (i2 == 2) {
                                jz1Var = y3fVar.a(str, executor);
                            }
                        } else {
                            wieVar.onServiceConnected(y3fVar.f, y3fVar.d);
                        }
                        jz1Var = null;
                    } else {
                        String j2fVar2 = j2fVar.toString();
                        StringBuilder sb = new StringBuilder(j2fVar2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(j2fVar2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                if (y3fVar.c) {
                    return jz1.f;
                }
                if (jz1Var == null) {
                    jz1Var = new jz1(-1, null, null);
                }
                return jz1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        j2f j2fVar = new j2f(str, z);
        am8.t(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                y3f y3fVar = (y3f) hashMap.get(j2fVar);
                if (y3fVar != null) {
                    if (y3fVar.a.containsKey(serviceConnection)) {
                        y3fVar.a.remove(serviceConnection);
                        if (y3fVar.a.isEmpty()) {
                            this.c.sendMessageDelayed(this.c.obtainMessage(0, j2fVar), this.e);
                        }
                    } else {
                        String j2fVar2 = j2fVar.toString();
                        StringBuilder sb = new StringBuilder(j2fVar2.length() + 76);
                        sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                        sb.append(j2fVar2);
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    String j2fVar3 = j2fVar.toString();
                    StringBuilder sb2 = new StringBuilder(j2fVar3.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(j2fVar3);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
