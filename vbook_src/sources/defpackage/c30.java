package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c30  reason: default package */
/* loaded from: classes.dex */
public final class c30 implements Runnable {
    public static Handler f;
    public final /* synthetic */ awd e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final jq7 a = new jq7(this, new iq7(this, 0));

    public c30(awd awdVar) {
        this.e = awdVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (c30.class) {
            try {
                if (f == null) {
                    f = new Handler(Looper.getMainLooper());
                }
                handler = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new bv4(this, false, obj, 5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b();
    }
}
