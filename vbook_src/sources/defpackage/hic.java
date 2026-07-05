package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hic  reason: default package */
/* loaded from: classes.dex */
public final class hic implements Runnable {
    public static final Object C = new Object();
    public static Boolean D;
    public static Boolean E;
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public hic(fic ficVar, Context context, ui5 ui5Var, long j) {
        this.a = 0;
        this.f = ficVar;
        this.c = context;
        this.b = j;
        this.d = ui5Var;
        this.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (C) {
            try {
                Boolean bool = E;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                E = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (C) {
            try {
                Boolean bool = D;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                D = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z = true;
                }
            }
            z = false;
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                fic ficVar = (fic) obj3;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj4;
                if (c(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    try {
                        ficVar.b(true);
                        if (!((ui5) obj2).g()) {
                            ficVar.b(false);
                            if (!c(context)) {
                                return;
                            }
                        } else if (a(context) && !d()) {
                            new gic(this, this).a();
                            if (!c(context)) {
                                return;
                            }
                        } else {
                            if (ficVar.d()) {
                                ficVar.b(false);
                            } else {
                                ficVar.e(j);
                            }
                            if (!c(context)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                        ficVar.b(false);
                        if (!c(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                } catch (Throwable th) {
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            case 1:
                String str = (String) obj2;
                mve mveVar = (mve) obj3;
                String str2 = (String) obj4;
                if (str2 == null) {
                    a6f a6fVar = mveVar.a;
                    a6fVar.f().W();
                    String str3 = a6fVar.c0;
                    if (str3 == null || str3.equals(str)) {
                        a6fVar.c0 = str;
                        a6fVar.b0 = null;
                        return;
                    }
                    return;
                }
                s0f s0fVar = new s0f(j, (String) obj, str2);
                a6f a6fVar2 = mveVar.a;
                a6fVar2.f().W();
                String str4 = a6fVar2.c0;
                if (str4 != null) {
                    str4.equals(str);
                }
                a6fVar2.c0 = str;
                a6fVar2.b0 = s0fVar;
                return;
            case 2:
                Object obj5 = this.e;
                ((yze) obj3).i0(this.b, obj5, (String) obj4, (String) obj2);
                return;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                b1f b1fVar = (b1f) obj3;
                l6f l6fVar = ((lte) b1fVar.a).E;
                lte.k(l6fVar);
                b1fVar.d0((s0f) obj2, (s0f) obj, this.b, true, l6fVar.h0("screen_view", bundle, null, false));
                return;
        }
    }

    public hic(b1f b1fVar, Bundle bundle, s0f s0fVar, s0f s0fVar2, long j) {
        this.a = 3;
        this.c = bundle;
        this.d = s0fVar;
        this.e = s0fVar2;
        this.b = j;
        Objects.requireNonNull(b1fVar);
        this.f = b1fVar;
    }

    public /* synthetic */ hic(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.a = i;
        this.c = str;
        this.d = str2;
        this.e = obj2;
        this.b = j;
        this.f = obj;
    }
}
