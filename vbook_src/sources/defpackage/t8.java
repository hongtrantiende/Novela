package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t8  reason: default package */
/* loaded from: classes.dex */
public final class t8 {
    public mn0 a;
    public wke b;
    public boolean c;
    public final Object d = new Object();
    public oae e;
    public final Context f;
    public final long g;

    public t8(Context context) {
        am8.s(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    public static s8 a(Context context) {
        t8 t8Var = new t8(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            t8Var.c();
            s8 e = t8Var.e();
            d(e, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e;
        } finally {
        }
    }

    public static void d(s8 s8Var, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", "1");
            if (s8Var != null) {
                if (true != s8Var.b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = s8Var.c;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new lla(hashMap).start();
        }
    }

    public final void b() {
        am8.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f != null && this.a != null) {
                    if (this.c) {
                        tz1.b().c(this.f, this.a);
                    }
                    this.c = false;
                    this.b = null;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        wke qgeVar;
        am8.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int c = vz4.b.c(context, 12451000);
                    if (c != 0 && c != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    mn0 mn0Var = new mn0();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (tz1.b().a(context, intent, mn0Var, 1)) {
                        this.a = mn0Var;
                        try {
                            IBinder a = mn0Var.a();
                            int i = xie.a;
                            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            if (queryLocalInterface instanceof wke) {
                                qgeVar = (wke) queryLocalInterface;
                            } else {
                                qgeVar = new qge(a);
                            }
                            this.b = qgeVar;
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } else {
                        throw new IOException("Connection failure");
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final s8 e() {
        s8 s8Var;
        am8.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        oae oaeVar = this.e;
                        if (oaeVar == null || !oaeVar.d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                am8.s(this.a);
                am8.s(this.b);
                try {
                    qge qgeVar = (qge) this.b;
                    qgeVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel a = qgeVar.a(obtain, 1);
                    String readString = a.readString();
                    a.recycle();
                    qge qgeVar2 = (qge) this.b;
                    qgeVar2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = jde.a;
                    obtain2.writeInt(1);
                    Parcel a2 = qgeVar2.a(obtain2, 2);
                    if (a2.readInt() == 0) {
                        z = false;
                    }
                    a2.recycle();
                    s8Var = new s8(0, readString, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            oae oaeVar2 = this.e;
            if (oaeVar2 != null) {
                oaeVar2.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new oae(this, j);
            }
        }
        return s8Var;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
