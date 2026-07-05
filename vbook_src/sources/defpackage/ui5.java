package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ui5  reason: default package */
/* loaded from: classes.dex */
public final class ui5 {
    public int a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;

    public ui5(yv yvVar, ArrayList arrayList, int i, t6f t6fVar, int i2) {
        this.c = yvVar;
        this.d = arrayList;
        this.a = i;
        this.e = t6fVar;
        this.b = i2;
    }

    public static String d(qf4 qf4Var) {
        qf4Var.a();
        sg4 sg4Var = qf4Var.c;
        String str = sg4Var.e;
        if (str != null) {
            return str;
        }
        qf4Var.a();
        String str2 = sg4Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            ?? r2 = new int[i2];
            b00.Y(jArr, jArr2, 0, 0, jArr.length);
            b00.Z(0, 0, 14, (int[]) this.d, r2);
            this.c = jArr2;
            this.d = r2;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int length2 = ((int[]) this.e).length;
        if (this.b >= length2) {
            int i4 = length2 * 2;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr[i5] = i6;
                i5 = i6;
            }
            b00.Z(0, 0, 14, (int[]) this.e, iArr);
            this.e = iArr;
        }
        int i7 = this.b;
        int[] iArr2 = (int[]) this.e;
        this.b = iArr2[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr2[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (c16.m(jArr3[i8], j) <= 0) {
                break;
            }
            i(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public ui5 b() {
        return new ui5((yv) this.c, (ArrayList) this.d, this.a, (t6f) this.e, this.b + 1);
    }

    public synchronized String c() {
        try {
            if (((String) this.d) == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    public synchronized int e() {
        PackageInfo f;
        try {
            if (this.a == 0 && (f = f("com.google.android.gms")) != null) {
                this.a = f.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }

    public PackageInfo f(String str) {
        try {
            return ((Context) this.c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public boolean g() {
        int i;
        synchronized (this) {
            i = this.b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!yz1.o()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.b = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.b = 2;
                        i = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (yz1.o()) {
                            this.b = 2;
                        } else {
                            this.b = 1;
                        }
                        i = this.b;
                    }
                }
            }
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public synchronized void h() {
        PackageInfo f = f(((Context) this.c).getPackageName());
        if (f != null) {
            this.d = Integer.toString(f.versionCode);
            this.e = f.versionName;
        }
    }

    public void i(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
