package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: koc  reason: default package */
/* loaded from: classes.dex */
public final class koc {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    /* JADX WARN: Type inference failed for: r3v10, types: [mu9, java.lang.Object] */
    public koc(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, mz1 mz1Var) {
        String str;
        this.b = workDatabase_Impl;
        this.c = linkedHashMap;
        this.d = linkedHashMap2;
        this.a = z;
        this.f = mz1Var;
        this.j = new AtomicBoolean(false);
        this.k = new sc8(23);
        this.e = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            ((LinkedHashMap) this.e).put(lowerCase, Integer.valueOf(i));
            String str3 = (String) ((LinkedHashMap) this.c).get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            lowerCase2.getClass();
            if (((LinkedHashMap) this.e).containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.e;
                linkedHashMap3.put(lowerCase3, o17.p(lowerCase2, linkedHashMap3));
            }
        }
        this.h = new o40(((String[]) this.g).length);
        int length2 = ((String[]) this.g).length;
        ?? obj = new Object();
        obj.a = dza.a(new int[length2]);
        this.i = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r4 == r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.koc r4, defpackage.p19 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.doc
            if (r0 == 0) goto L13
            r0 = r6
            doc r0 = (defpackage.doc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            doc r0 = new doc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.b
            int r6 = r0.d
            r1 = 2
            r2 = 1
            n82 r3 = defpackage.n82.a
            if (r6 == 0) goto L3d
            if (r6 == r2) goto L35
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.a
            java.util.Set r5 = (java.util.Set) r5
            defpackage.hre.r(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.a
            p19 r5 = (defpackage.p19) r5
            defpackage.hre.r(r4)
            goto L54
        L3d:
            defpackage.hre.r(r4)
            txb r4 = new txb
            r6 = 26
            r4.<init>(r6)
            r0.a = r5
            r0.d = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r6, r4, r0)
            if (r4 != r3) goto L54
            goto L6b
        L54:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6c
            r0.a = r4
            r0.d = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.s9e.p(r5, r6, r0)
            if (r5 != r3) goto L6c
        L6b:
            return r3
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koc.a(koc, p19, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:32:0x007f, B:34:0x008a, B:47:0x00c7, B:37:0x009b, B:38:0x009f, B:40:0x00ac, B:42:0x00b6, B:44:0x00bc, B:43:0x00ba, B:45:0x00c1, B:20:0x0049, B:24:0x0057, B:28:0x006b), top: B:58:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.koc r11, defpackage.n42 r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koc.b(koc, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (defpackage.s9e.p(r1, r3, r4) == r8) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
        if (defpackage.s9e.p(r10, r3, r4) == r8) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e0 -> B:28:0x00e3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.koc r17, defpackage.xjc r18, int r19, defpackage.n42 r20) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koc.c(koc, xjc, int, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Type inference failed for: r3v4, types: [p19] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0083 -> B:19:0x0086). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.koc r7, defpackage.xjc r8, int r9, defpackage.n42 r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.ioc
            if (r0 == 0) goto L16
            r0 = r10
            ioc r0 = (defpackage.ioc) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.D = r1
            goto L1b
        L16:
            ioc r0 = new ioc
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f
            int r1 = r0.D
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.e
            int r8 = r0.d
            java.lang.String[] r9 = r0.c
            java.lang.String r1 = r0.b
            p19 r3 = r0.a
            defpackage.hre.r(r10)
            r10 = r9
            r9 = r3
            goto L86
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L3b:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.g
            java.lang.String[] r7 = (java.lang.String[]) r7
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.koc.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4f:
            if (r8 >= r7) goto L88
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.eub.n(r5, r4, r3)
            r0.a = r9
            r0.b = r1
            r0.c = r10
            r0.d = r8
            r0.e = r7
            r0.D = r2
            java.lang.Object r3 = defpackage.s9e.p(r9, r3, r0)
            n82 r4 = defpackage.n82.a
            if (r3 != r4) goto L86
            return r4
        L86:
            int r8 = r8 + r2
            goto L4f
        L88:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koc.d(koc, xjc, int, n42):java.lang.Object");
    }

    public List e() {
        hwa hwaVar;
        if (Build.VERSION.SDK_INT >= 32 && (hwaVar = (hwa) this.h) != null) {
            return hwaVar.b();
        }
        ms5 ms5Var = qs5.b;
        return mm9.e;
    }

    public void f(r40 r40Var) {
        if (this.a && !r40Var.equals((r40) this.i)) {
            this.i = r40Var;
            r60 r60Var = (r60) ((q6) this.c).b;
            r60Var.f();
            r40 r40Var2 = r60Var.h;
            if (r40Var2 != null && !r40Var.equals(r40Var2)) {
                r60Var.h = r40Var;
                rr6 rr6Var = r60Var.f;
                if (rr6Var != null) {
                    rr6Var.e(-1, new vs(12));
                }
            }
        }
    }

    public void g(vt4 vt4Var, vt4 vt4Var2) {
        vt4Var.getClass();
        vt4Var2.getClass();
        if (((AtomicBoolean) this.j).compareAndSet(false, true)) {
            vt4Var.invoke();
            m41 m41Var = ((WorkDatabase_Impl) this.b).a;
            if (m41Var != null) {
                z87.v(m41Var, new i82("Room Invalidation Tracker Refresh"), null, new q4c(this, vt4Var2, null, 13), 2);
            } else {
                c16.w("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(defpackage.n42 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0
            boolean r1 = r8 instanceof defpackage.joc
            if (r1 == 0) goto L17
            r1 = r8
            joc r1 = (defpackage.joc) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            joc r1 = new joc
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.b
            int r2 = r1.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            kw5 r7 = r1.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2c
            goto L54
        L2c:
            r8 = move-exception
            goto L5c
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r3
        L34:
            defpackage.hre.r(r8)
            kw5 r8 = r0.f
            boolean r2 = r8.j()
            if (r2 == 0) goto L60
            goc r2 = new goc     // Catch: java.lang.Throwable -> L58
            r5 = 2
            r2.<init>(r7, r3, r5)     // Catch: java.lang.Throwable -> L58
            r1.a = r8     // Catch: java.lang.Throwable -> L58
            r1.d = r4     // Catch: java.lang.Throwable -> L58
            r7 = 0
            java.lang.Object r7 = r0.q(r7, r2, r1)     // Catch: java.lang.Throwable -> L58
            n82 r0 = defpackage.n82.a
            if (r7 != r0) goto L53
            return r0
        L53:
            r7 = r8
        L54:
            r7.G()
            goto L60
        L58:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L5c:
            r7.G()
            throw r8
        L60:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koc.h(n42):java.lang.Object");
    }

    public void i() {
        List e = e();
        Context context = (Context) this.b;
        mm9 mm9Var = r40.e;
        f(r40.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), (l40) this.k, (AudioDeviceInfo) this.j, e));
    }

    public koc(Context context, q6 q6Var, l40 l40Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = q6Var;
        this.k = l40Var;
        this.j = audioDeviceInfo;
        String str = a2d.a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.e = new s40(this);
        this.f = new u40(this, 0);
        mm9 mm9Var = r40.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new t40(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }
}
