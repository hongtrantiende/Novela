package defpackage;

import android.content.BroadcastReceiver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dfb  reason: default package */
/* loaded from: classes.dex */
public final class dfb implements Runnable {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;
    public final Object d;

    public dfb(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ux7("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.d).b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.d).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [android.content.BroadcastReceiver, cfb] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                oaa A = oaa.A();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (A.D(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.l = true;
                        }
                        if (!firebaseMessaging.j.g()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.l = false;
                            }
                            if (!oaa.A().D(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (oaa.A().C(firebaseMessaging.b) && !a()) {
                            ?? broadcastReceiver = new BroadcastReceiver();
                            broadcastReceiver.a = this;
                            broadcastReceiver.a();
                            if (!oaa.A().D(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.l = false;
                                }
                            } else {
                                firebaseMessaging.g(this.b);
                            }
                            if (!oaa.A().D(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.l = false;
                            if (!oaa.A().D(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (oaa.A().D(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            case 1:
                b1f b1fVar = (b1f) this.d;
                b1fVar.g0((s0f) this.c, false, this.b);
                b1fVar.e = null;
                w2f p = ((lte) b1fVar.a).p();
                p.W();
                p.Y();
                p.l0(new w1f(p, null));
                return;
            default:
                ((og) this.c).run();
                long j = this.b;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                hr7 hr7Var = (hr7) this.d;
                hr7Var.getClass();
                qoc qocVar = new qoc(Executors.callable(this, null));
                fr7 fr7Var = new fr7(qocVar, hr7Var.b.schedule(qocVar, j, timeUnit));
                fr7Var.a(new og(fr7Var, 23), e73.a);
                return;
        }
    }

    public dfb(i7f i7fVar, og ogVar, hr7 hr7Var, long j) {
        this.c = ogVar;
        this.d = hr7Var;
        this.b = j;
    }

    public dfb(b1f b1fVar, s0f s0fVar, long j) {
        this.c = s0fVar;
        this.b = j;
        Objects.requireNonNull(b1fVar);
        this.d = b1fVar;
    }
}
