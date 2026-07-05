package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jpe  reason: default package */
/* loaded from: classes.dex */
public final class jpe implements Runnable {
    public final Object C;
    public final /* synthetic */ int a = 1;
    public final int b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;

    public /* synthetic */ jpe(String str, tpe tpeVar, int i, IOException iOException, byte[] bArr, Map map) {
        am8.s(tpeVar);
        this.d = tpeVar;
        this.b = i;
        this.e = iOException;
        this.f = bArr;
        this.c = str;
        this.C = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                ppe ppeVar = (ppe) this.C;
                dre dreVar = ((lte) ppeVar.a).e;
                lte.k(dreVar);
                if (dreVar.b) {
                    if (ppeVar.c == 0) {
                        t7e t7eVar = ((lte) ppeVar.a).d;
                        if (t7eVar.e == null) {
                            synchronized (t7eVar) {
                                try {
                                    if (t7eVar.e == null) {
                                        lte lteVar = (lte) t7eVar.a;
                                        ApplicationInfo applicationInfo = lteVar.a.getApplicationInfo();
                                        String p = ru.p();
                                        if (applicationInfo != null) {
                                            String str = applicationInfo.processName;
                                            if (str != null && str.equals(p)) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            t7eVar.e = Boolean.valueOf(z);
                                        }
                                        if (t7eVar.e == null) {
                                            t7eVar.e = Boolean.TRUE;
                                            ppe ppeVar2 = lteVar.f;
                                            lte.m(ppeVar2);
                                            ppeVar2.f.e("My process not in the list of running processes");
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (t7eVar.e.booleanValue()) {
                            ppeVar.c = 'C';
                        } else {
                            ppeVar.c = 'c';
                        }
                    }
                    if (ppeVar.d < 0) {
                        ((lte) ppeVar.a).d.d0();
                        ppeVar.d = 161000L;
                    }
                    int i = this.b;
                    char c = ppeVar.c;
                    long j = ppeVar.d;
                    String str2 = this.c;
                    Object obj = this.d;
                    Object obj2 = this.e;
                    Object obj3 = this.f;
                    char charAt = "01VDIWEA?".charAt(i);
                    String i0 = ppe.i0(true, str2, obj, obj2, obj3);
                    StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + i0.length());
                    sb.append("2");
                    sb.append(charAt);
                    sb.append(c);
                    sb.append(j);
                    sb.append(":");
                    sb.append(i0);
                    String sb2 = sb.toString();
                    if (sb2.length() > 1024) {
                        sb2 = str2.substring(0, 1024);
                    }
                    zqe zqeVar = dreVar.e;
                    if (zqeVar != null) {
                        String str3 = (String) zqeVar.d;
                        dre dreVar2 = (dre) zqeVar.e;
                        dreVar2.W();
                        if (((dre) zqeVar.e).b0().getLong((String) zqeVar.b, 0L) == 0) {
                            zqeVar.b();
                        }
                        SharedPreferences b0 = dreVar2.b0();
                        String str4 = (String) zqeVar.c;
                        long j2 = b0.getLong(str4, 0L);
                        if (j2 <= 0) {
                            SharedPreferences.Editor edit = dreVar2.b0().edit();
                            edit.putString(str3, sb2);
                            edit.putLong(str4, 1L);
                            edit.apply();
                            return;
                        }
                        l6f l6fVar = ((lte) dreVar2.a).E;
                        lte.k(l6fVar);
                        long j3 = j2 + 1;
                        SharedPreferences.Editor edit2 = dreVar2.b0().edit();
                        if ((l6fVar.X0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
                            edit2.putString(str3, sb2);
                        }
                        edit2.putLong(str4, j3);
                        edit2.apply();
                        return;
                    }
                    return;
                }
                Log.println(6, ppeVar.h0(), "Persisted config not initialized. Not logging error/warn");
                return;
            default:
                ((tpe) this.d).a(this.c, this.b, (Throwable) this.e, (byte[]) this.f, (Map) this.C);
                return;
        }
    }

    public jpe(ppe ppeVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.C = ppeVar;
    }
}
