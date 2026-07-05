package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mve  reason: default package */
/* loaded from: classes.dex */
public final class mve extends tbe implements lne {
    public final a6f a;
    public Boolean b;
    public String c;

    public mve(a6f a6fVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        am8.s(a6fVar);
        this.a = a6fVar;
        this.c = null;
    }

    @Override // defpackage.lne
    public final void B(d8f d8fVar, a5f a5fVar, goe goeVar) {
        f(d8fVar);
        String str = d8fVar.a;
        am8.s(str);
        this.a.f().g0(new sid(this, str, a5fVar, goeVar, 1));
    }

    @Override // defpackage.lne
    public final void C(d8f d8fVar, x1e x1eVar) {
        f(d8fVar);
        R(new gp9(9, this, d8fVar, x1eVar, false));
    }

    @Override // defpackage.lne
    public final void G(i4e i4eVar, d8f d8fVar) {
        am8.s(i4eVar);
        am8.s(i4eVar.c);
        f(d8fVar);
        i4e i4eVar2 = new i4e(i4eVar);
        i4eVar2.a = d8fVar.a;
        R(new gp9(5, this, i4eVar2, d8fVar));
    }

    @Override // defpackage.lne
    public final void H(d8f d8fVar) {
        f(d8fVar);
        R(new ste(this, d8fVar, 1));
    }

    @Override // defpackage.lne
    public final void J(d8f d8fVar) {
        f(d8fVar);
        R(new ste(this, d8fVar, 2));
    }

    @Override // defpackage.lne
    public final void L(d8f d8fVar) {
        am8.p(d8fVar.a);
        am8.s(d8fVar.O);
        e(new ste(this, d8fVar, 5));
    }

    public final void Q(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        a6f a6fVar = this.a;
        if (!isEmpty) {
            if (z) {
                try {
                    if (this.b == null) {
                        boolean z2 = true;
                        if (!"com.google.android.gms".equals(this.c) && !xbe.E(a6fVar.H.a, Binder.getCallingUid()) && !b15.a(a6fVar.H.a).b(Binder.getCallingUid())) {
                            z2 = false;
                        }
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    a6fVar.c().f.f(ppe.f0(str), "Measurement Service called with invalid calling package. appId");
                    throw e;
                }
            }
            if (this.c == null) {
                Context context = a6fVar.H.a;
                int callingUid = Binder.getCallingUid();
                int i = s05.e;
                if (xbe.M(context, str, callingUid)) {
                    this.c = str;
                }
            }
            if (str.equals(this.c)) {
                return;
            }
            throw new SecurityException("Unknown calling package name '" + str + "'.");
        }
        a6fVar.c().f.e("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void R(Runnable runnable) {
        a6f a6fVar = this.a;
        if (a6fVar.f().d0()) {
            runnable.run();
        } else {
            a6fVar.f().g0(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v14, types: [ftd] */
    /* JADX WARN: Type inference failed for: r5v16, types: [ftd] */
    @Override // defpackage.tbe
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        ?? r12;
        List list;
        a6f a6fVar = this.a;
        ArrayList arrayList = null;
        wne wneVar = null;
        goe goeVar = null;
        boolean z = false;
        switch (i) {
            case 1:
                wbe.d(parcel);
                p((ibe) wbe.a(parcel, ibe.CREATOR), (d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                wbe.d(parcel);
                z((g6f) wbe.a(parcel, g6f.CREATOR), (d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                wbe.d(parcel);
                c((d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                ibe ibeVar = (ibe) wbe.a(parcel, ibe.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                wbe.d(parcel);
                am8.s(ibeVar);
                am8.p(readString);
                Q(readString, true);
                R(new gp9(7, this, ibeVar, readString));
                parcel2.writeNoException();
                return true;
            case 6:
                wbe.d(parcel);
                J((d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                d8f d8fVar = (d8f) wbe.a(parcel, d8f.CREATOR);
                if (parcel.readInt() != 0) {
                    r12 = true;
                } else {
                    r12 = false;
                }
                wbe.d(parcel);
                f(d8fVar);
                String str = d8fVar.a;
                am8.s(str);
                try {
                    List<j6f> list2 = (List) a6fVar.f().e0(new pte(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (j6f j6fVar : list2) {
                        if (r12 == false && l6f.C0(j6fVar.c)) {
                        }
                        arrayList2.add(new g6f(j6fVar));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    a6fVar.c().f.g(ppe.f0(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    a6fVar.c().f.g(ppe.f0(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                String readString2 = parcel.readString();
                wbe.d(parcel);
                byte[] w = w(readString2, (ibe) wbe.a(parcel, ibe.CREATOR));
                parcel2.writeNoException();
                parcel2.writeByteArray(w);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                wbe.d(parcel);
                l(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                wbe.d(parcel);
                String q = q((d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(q);
                return true;
            case 12:
                wbe.d(parcel);
                G((i4e) wbe.a(parcel, i4e.CREATOR), (d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                i4e i4eVar = (i4e) wbe.a(parcel, i4e.CREATOR);
                wbe.d(parcel);
                am8.s(i4eVar);
                am8.s(i4eVar.c);
                am8.p(i4eVar.a);
                Q(i4eVar.a, true);
                R(new bv4(this, false, new i4e(i4eVar), 22));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = wbe.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                wbe.d(parcel);
                List d = d(readString6, readString7, z, (d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(d);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = wbe.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                wbe.d(parcel);
                List r = r(readString8, z, readString9, readString10);
                parcel2.writeNoException();
                parcel2.writeTypedList(r);
                return true;
            case 16:
                wbe.d(parcel);
                List t = t(parcel.readString(), parcel.readString(), (d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(t);
                return true;
            case 17:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                wbe.d(parcel);
                List n = n(readString11, readString12, readString13);
                parcel2.writeNoException();
                parcel2.writeTypedList(n);
                return true;
            case 18:
                wbe.d(parcel);
                y((d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                wbe.d(parcel);
                g((Bundle) wbe.a(parcel, Bundle.CREATOR), (d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                wbe.d(parcel);
                o((d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                wbe.d(parcel);
                h9e u = u((d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                if (u == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                u.writeToParcel(parcel2, 1);
                return true;
            case 24:
                d8f d8fVar2 = (d8f) wbe.a(parcel, d8f.CREATOR);
                Bundle bundle = (Bundle) wbe.a(parcel, Bundle.CREATOR);
                wbe.d(parcel);
                f(d8fVar2);
                String str2 = d8fVar2.a;
                am8.s(str2);
                if (a6fVar.f0().i0(null, yme.T0)) {
                    try {
                        list = (List) a6fVar.f().f0(new xue(this, d8fVar2, bundle, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        a6fVar.c().f.g(ppe.f0(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) a6fVar.f().e0(new xue(this, d8fVar2, bundle, 1)).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        a6fVar.c().f.g(ppe.f0(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                break;
            case 25:
                wbe.d(parcel);
                k((d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                wbe.d(parcel);
                L((d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                wbe.d(parcel);
                H((d8f) wbe.a(parcel, d8f.CREATOR));
                parcel2.writeNoException();
                return true;
            case 29:
                d8f d8fVar3 = (d8f) wbe.a(parcel, d8f.CREATOR);
                a5f a5fVar = (a5f) wbe.a(parcel, a5f.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    if (queryLocalInterface instanceof goe) {
                        goeVar = (goe) queryLocalInterface;
                    } else {
                        goeVar = new ftd(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 4);
                    }
                }
                wbe.d(parcel);
                B(d8fVar3, a5fVar, goeVar);
                parcel2.writeNoException();
                return true;
            case 30:
                wbe.d(parcel);
                C((d8f) wbe.a(parcel, d8f.CREATOR), (x1e) wbe.a(parcel, x1e.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                d8f d8fVar4 = (d8f) wbe.a(parcel, d8f.CREATOR);
                Bundle bundle2 = (Bundle) wbe.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    if (queryLocalInterface2 instanceof wne) {
                        wneVar = (wne) queryLocalInterface2;
                    } else {
                        wneVar = new ftd(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 4);
                    }
                }
                wbe.d(parcel);
                v(d8fVar4, bundle2, wneVar);
                parcel2.writeNoException();
                return true;
        }
        return true;
    }

    @Override // defpackage.lne
    public final void c(d8f d8fVar) {
        f(d8fVar);
        R(new ste(this, d8fVar, 0));
    }

    @Override // defpackage.lne
    public final List d(String str, String str2, boolean z, d8f d8fVar) {
        f(d8fVar);
        String str3 = d8fVar.a;
        am8.s(str3);
        a6f a6fVar = this.a;
        try {
            List<j6f> list = (List) a6fVar.f().e0(new eue(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (j6f j6fVar : list) {
                if (!z && l6f.C0(j6fVar.c)) {
                }
                arrayList.add(new g6f(j6fVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            a6fVar.c().f.g(ppe.f0(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            a6fVar.c().f.g(ppe.f0(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void e(Runnable runnable) {
        a6f a6fVar = this.a;
        if (a6fVar.f().d0()) {
            runnable.run();
        } else {
            a6fVar.f().i0(runnable);
        }
    }

    public final void f(d8f d8fVar) {
        am8.s(d8fVar);
        String str = d8fVar.a;
        am8.p(str);
        Q(str, false);
        this.a.l0().d0(d8fVar.b);
    }

    @Override // defpackage.lne
    public final void g(Bundle bundle, d8f d8fVar) {
        f(d8fVar);
        String str = d8fVar.a;
        am8.s(str);
        R(new sid(this, bundle, str, d8fVar, 3));
    }

    @Override // defpackage.lne
    public final void k(d8f d8fVar) {
        am8.p(d8fVar.a);
        am8.s(d8fVar.O);
        e(new ste(this, d8fVar, 6));
    }

    @Override // defpackage.lne
    public final void l(long j, String str, String str2, String str3) {
        R(new hic(this, str2, str3, str, j, 1));
    }

    @Override // defpackage.lne
    public final List n(String str, String str2, String str3) {
        Q(str, true);
        a6f a6fVar = this.a;
        try {
            return (List) a6fVar.f().e0(new eue(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            a6fVar.c().f.f(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.lne
    public final void o(d8f d8fVar) {
        am8.p(d8fVar.a);
        am8.s(d8fVar.O);
        e(new ste(this, d8fVar, 4));
    }

    @Override // defpackage.lne
    public final void p(ibe ibeVar, d8f d8fVar) {
        am8.s(ibeVar);
        f(d8fVar);
        R(new gp9(6, this, ibeVar, d8fVar));
    }

    @Override // defpackage.lne
    public final String q(d8f d8fVar) {
        f(d8fVar);
        a6f a6fVar = this.a;
        try {
            return (String) a6fVar.f().e0(new pte(a6fVar, d8fVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a6fVar.c().f.g(ppe.f0(d8fVar.a), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // defpackage.lne
    public final List r(String str, boolean z, String str2, String str3) {
        Q(str, true);
        a6f a6fVar = this.a;
        try {
            List<j6f> list = (List) a6fVar.f().e0(new eue(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (j6f j6fVar : list) {
                if (!z && l6f.C0(j6fVar.c)) {
                }
                arrayList.add(new g6f(j6fVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            a6fVar.c().f.g(ppe.f0(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            a6fVar.c().f.g(ppe.f0(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.lne
    public final List t(String str, String str2, d8f d8fVar) {
        f(d8fVar);
        String str3 = d8fVar.a;
        am8.s(str3);
        a6f a6fVar = this.a;
        try {
            return (List) a6fVar.f().e0(new eue(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            a6fVar.c().f.f(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.lne
    public final h9e u(d8f d8fVar) {
        f(d8fVar);
        String str = d8fVar.a;
        am8.p(str);
        a6f a6fVar = this.a;
        try {
            return (h9e) a6fVar.f().f0(new pte(this, d8fVar, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a6fVar.c().f.g(ppe.f0(str), e, "Failed to get consent. appId");
            return new h9e(null);
        }
    }

    @Override // defpackage.lne
    public final void v(d8f d8fVar, Bundle bundle, wne wneVar) {
        f(d8fVar);
        String str = d8fVar.a;
        am8.s(str);
        this.a.f().g0(new dve(this, d8fVar, bundle, wneVar, str, 0));
    }

    @Override // defpackage.lne
    public final byte[] w(String str, ibe ibeVar) {
        am8.p(str);
        am8.s(ibeVar);
        Q(str, true);
        a6f a6fVar = this.a;
        s56 s56Var = a6fVar.c().I;
        lte lteVar = a6fVar.H;
        yoe yoeVar = lteVar.F;
        String str2 = ibeVar.a;
        s56Var.f(yoeVar.a(str2), "Log and bundle. event");
        a6fVar.e().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) a6fVar.f().f0(new iq7(this, ibeVar, str)).get();
            if (bArr == null) {
                a6fVar.c().f.f(ppe.f0(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            a6fVar.e().getClass();
            a6fVar.c().I.h("Log and bundle processed. event, size, time_ms", lteVar.F.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            a6fVar.c().f.h("Failed to log and bundle. appId, event, error", ppe.f0(str), lteVar.F.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            a6fVar.c().f.h("Failed to log and bundle. appId, event, error", ppe.f0(str), lteVar.F.a(str2), e);
            return null;
        }
    }

    @Override // defpackage.lne
    public final void y(d8f d8fVar) {
        String str = d8fVar.a;
        am8.p(str);
        Q(str, false);
        R(new ste(this, d8fVar, 3));
    }

    @Override // defpackage.lne
    public final void z(g6f g6fVar, d8f d8fVar) {
        am8.s(g6fVar);
        f(d8fVar);
        R(new gp9(8, this, g6fVar, d8fVar));
    }
}
