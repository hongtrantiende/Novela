package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rh0  reason: default package */
/* loaded from: classes.dex */
public abstract class rh0 {
    public static final mb4[] y = new mb4[0];
    public s8 b;
    public final Context c;
    public final w6f d;
    public final vz4 e;
    public final lae f;
    public gxd i;
    public qh0 j;
    public IInterface k;
    public wie m;
    public final oh0 o;
    public final ph0 p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile mu9 t;
    public volatile String a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public int n = 1;
    public jz1 u = null;
    public boolean v = false;
    public volatile fve w = null;
    public final AtomicInteger x = new AtomicInteger(0);

    public rh0(Context context, Looper looper, w6f w6fVar, vz4 vz4Var, int i, oh0 oh0Var, ph0 ph0Var, String str) {
        am8.t(context, "Context must not be null");
        this.c = context;
        am8.t(looper, "Looper must not be null");
        am8.t(w6fVar, "Supervisor must not be null");
        this.d = w6fVar;
        am8.t(vz4Var, "API availability must not be null");
        this.e = vz4Var;
        this.f = new lae(this, looper);
        this.q = i;
        this.o = oh0Var;
        this.p = ph0Var;
        this.r = str;
    }

    public final void a() {
        int c = this.e.c(this.c, i());
        if (c != 0) {
            u(1, null);
            this.j = new mce(this);
            int i = this.x.get();
            lae laeVar = this.f;
            laeVar.sendMessage(laeVar.obtainMessage(3, i, c, null));
            return;
        }
        this.j = new mce(this);
        u(2, null);
    }

    public abstract IInterface b(IBinder iBinder);

    public final void c() {
        this.x.incrementAndGet();
        ArrayList arrayList = this.l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    exd exdVar = (exd) arrayList.get(i);
                    synchronized (exdVar) {
                        exdVar.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        u(1, null);
    }

    public final void d(String str) {
        this.a = str;
        c();
    }

    public Account e() {
        return null;
    }

    public mb4[] f() {
        return y;
    }

    public Executor g() {
        return null;
    }

    public Bundle h() {
        return new Bundle();
    }

    public abstract int i();

    public final void j(ij5 ij5Var, Set set) {
        String attributionTag;
        Bundle h = h();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.s;
        } else if (this.t == null) {
            attributionTag = this.s;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.t.a;
            if (attributionSource == null) {
                attributionTag = this.s;
            } else if (attributionSource.getAttributionTag() == null) {
                attributionTag = this.s;
            } else {
                attributionTag = attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag;
        int i = this.q;
        int i2 = vz4.a;
        Scope[] scopeArr = yx4.K;
        Bundle bundle = new Bundle();
        mb4[] mb4VarArr = yx4.L;
        yx4 yx4Var = new yx4(6, i, i2, null, null, scopeArr, bundle, null, mb4VarArr, mb4VarArr, true, 0, false, str);
        yx4Var.d = this.c.getPackageName();
        yx4Var.C = h;
        if (set != null) {
            yx4Var.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (r()) {
            Account e = e();
            if (e == null) {
                e = new Account("<<default account>>", "com.google");
            }
            yx4Var.D = e;
            if (ij5Var != null) {
                yx4Var.e = ((ftd) ij5Var).b;
            }
        }
        yx4Var.E = y;
        yx4Var.F = f();
        if (s()) {
            yx4Var.I = true;
        }
        try {
            synchronized (this.h) {
                try {
                    gxd gxdVar = this.i;
                    if (gxdVar != null) {
                        gxdVar.a(new oge(this, this.x.get()), yx4Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i3 = this.x.get();
            lae laeVar = this.f;
            laeVar.sendMessage(laeVar.obtainMessage(6, i3, 3));
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.x.get();
            tke tkeVar = new tke(this, 8, null, null);
            lae laeVar2 = this.f;
            laeVar2.sendMessage(laeVar2.obtainMessage(1, i4, -1, tkeVar));
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i42 = this.x.get();
            tke tkeVar2 = new tke(this, 8, null, null);
            lae laeVar22 = this.f;
            laeVar22.sendMessage(laeVar22.obtainMessage(1, i42, -1, tkeVar2));
        }
    }

    public Set k() {
        return Collections.EMPTY_SET;
    }

    public final IInterface l() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n != 5) {
                    if (p()) {
                        iInterface = this.k;
                        am8.t(iInterface, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String m();

    public abstract String n();

    public boolean o() {
        if (i() >= 211700000) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.g) {
            if (this.n == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return this instanceof bs9;
    }

    public final /* synthetic */ boolean t(int i, int i2, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.n != i) {
                    return false;
                }
                u(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        boolean z3;
        s8 s8Var;
        boolean z4 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        am8.n(z3);
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                Bundle bundle = null;
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4) {
                            am8.s(iInterface);
                            System.currentTimeMillis();
                        }
                    } else {
                        wie wieVar = this.m;
                        if (wieVar != null && (s8Var = this.b) != null) {
                            String str = s8Var.c;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + "com.google.android.gms".length());
                            sb.append("Calling connect() while still connected, missing disconnect() for ");
                            sb.append(str);
                            sb.append(" on com.google.android.gms");
                            Log.e("GmsClient", sb.toString());
                            w6f w6fVar = this.d;
                            String str2 = this.b.c;
                            am8.s(str2);
                            this.b.getClass();
                            if (this.r == null) {
                                this.c.getClass();
                            }
                            w6fVar.c(str2, wieVar, this.b.b);
                            this.x.incrementAndGet();
                        }
                        wie wieVar2 = new wie(this, this.x.get());
                        this.m = wieVar2;
                        String n = n();
                        boolean o = o();
                        this.b = new s8(2, n, o);
                        if (o && i() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.c)));
                        }
                        w6f w6fVar2 = this.d;
                        String str3 = this.b.c;
                        am8.s(str3);
                        this.b.getClass();
                        String str4 = this.r;
                        if (str4 == null) {
                            str4 = this.c.getClass().getName();
                        }
                        jz1 b = w6fVar2.b(new j2f(str3, this.b.b), wieVar2, str4, g());
                        if (b.b == 0) {
                            z4 = true;
                        }
                        if (!z4) {
                            String str5 = this.b.c;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                            sb2.append("unable to connect to service: ");
                            sb2.append(str5);
                            sb2.append(" on com.google.android.gms");
                            Log.w("GmsClient", sb2.toString());
                            int i2 = b.b;
                            if (i2 == -1) {
                                i2 = 16;
                            }
                            if (b.c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b.c);
                            }
                            int i3 = this.x.get();
                            ene eneVar = new ene(this, i2, bundle);
                            lae laeVar = this.f;
                            laeVar.sendMessage(laeVar.obtainMessage(7, i3, -1, eneVar));
                        }
                    }
                } else {
                    wie wieVar3 = this.m;
                    if (wieVar3 != null) {
                        w6f w6fVar3 = this.d;
                        String str6 = this.b.c;
                        am8.s(str6);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        w6fVar3.c(str6, wieVar3, this.b.b);
                        this.m = null;
                    }
                }
            } finally {
            }
        }
    }
}
