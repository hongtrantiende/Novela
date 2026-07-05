package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oaa  reason: default package */
/* loaded from: classes.dex */
public final class oaa implements zc4, wra, na4, o8b, t5a, r4d {
    public static oaa D;
    public static oaa f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public static final Object C = new Object();
    public static final x3b E = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oaa(defpackage.o48 r18) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.<init>(o48):void");
    }

    public static synchronized oaa A() {
        oaa oaaVar;
        synchronized (oaa.class) {
            try {
                if (f == null) {
                    f = new oaa(0);
                }
                oaaVar = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oaaVar;
    }

    public static oaa B(ur4 ur4Var) {
        oaa oaaVar;
        synchronized (C) {
            try {
                if (D == null) {
                    D = new oaa(ur4Var.getApplicationContext(), 1);
                }
                oaaVar = D;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oaaVar;
    }

    public static xnc G(hn8 hn8Var) {
        int g0;
        xnc xncVar = new xnc();
        if (pe4.a.j0(hn8Var)) {
            try {
                mj9 mj9Var = new mj9(tl1.J(hn8Var.toFile()));
                while (true) {
                    String S = mj9Var.S();
                    if (S == null) {
                        try {
                            break;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } else if (S.length() != 0 && (g0 = k4b.g0(S, "=", 0, false, 6)) > 0 && g0 != S.length() - 1) {
                        xncVar.a(S.substring(0, g0), S.substring(g0 + 1));
                    }
                }
                mj9Var.close();
                th = null;
                if (th != null) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
        return xncVar;
    }

    public static void L(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    public boolean C(Context context) {
        boolean z;
        if (((Boolean) this.d) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.d = Boolean.valueOf(z);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean D(Context context) {
        boolean z;
        if (((Boolean) this.c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.c = Boolean.valueOf(z);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean E(String str, cp3 cp3Var, g40 g40Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        str.getClass();
        g40Var.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        bx9 bx9Var = new bx9(lowerCase);
        String str2 = g40Var.a;
        str2.getClass();
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        bx9 bx9Var2 = new bx9(lowerCase2);
        Set set = (Set) ((LinkedHashMap) this.c).get(bx9Var);
        if (set != null && set.contains(bx9Var2)) {
            if (linkedHashMap.containsKey(bx9Var)) {
                Object obj = linkedHashMap.get(bx9Var);
                obj.getClass();
                Map map = (Map) obj;
                if (map.containsKey(bx9Var2)) {
                    Object obj2 = map.get(bx9Var2);
                    obj2.getClass();
                    Set<zw9> set2 = (Set) obj2;
                    String a = cp3Var.a(str2);
                    if (a.length() == 0) {
                        a = g40Var.getValue();
                    }
                    g40Var.setValue(a);
                    for (zw9 zw9Var : set2) {
                        String str3 = zw9Var.a;
                        if (str3.equals("#")) {
                            if (r4b.Q(a, "#", false)) {
                                Pattern compile = Pattern.compile(".*\\s.*");
                                compile.getClass();
                                if (!compile.matcher(a).matches()) {
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            String concat = str3.concat(":");
                            String lowerCase3 = a.toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                            if (r4b.Q(lowerCase3, concat, false)) {
                                return true;
                            }
                        }
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            if (((Map) ((LinkedHashMap) this.d).get(bx9Var)) != null) {
                j40 y = y(str);
                if (y.j(str2)) {
                    return y.h(str2).equals(g40Var.getValue());
                }
            }
            if (!str.equals(":all") && E(":all", cp3Var, g40Var)) {
                return true;
            }
        }
        return false;
    }

    public boolean F(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return ((HashSet) this.b).contains(new bx9(lowerCase));
    }

    public void H(ns4 ns4Var) {
        rr4 rr4Var = ns4Var.c;
        String str = rr4Var.e;
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(rr4Var.e, ns4Var);
        if (hs4.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rr4Var);
        }
    }

    public void I(ns4 ns4Var) {
        HashMap hashMap = (HashMap) this.c;
        rr4 rr4Var = ns4Var.c;
        if (rr4Var.Y) {
            ((js4) this.e).h(rr4Var);
        }
        if (hashMap.get(rr4Var.e) == ns4Var && ((ns4) hashMap.put(rr4Var.e, null)) != null && hs4.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rr4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:18:0x0043, B:20:0x0049), top: B:28:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.q91
            if (r0 == 0) goto L13
            r0 = r5
            q91 r0 = (defpackage.q91) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            q91 r0 = new q91
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            sw7 r0 = r0.a
            defpackage.hre.r(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2e:
            defpackage.hre.r(r5)
            java.lang.Object r5 = r4.d
            sw7 r5 = (defpackage.sw7) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.e     // Catch: java.lang.Throwable -> L55
            n91 r5 = (defpackage.n91) r5     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L57
            n91 r5 = new n91     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L55
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L55
            r4.e = r5     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r4 = move-exception
            goto L5b
        L57:
            r0.q(r3)
            return r5
        L5b:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.J(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:18:0x0043, B:20:0x0049, B:23:0x0056), top: B:28:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.up8
            if (r0 == 0) goto L13
            r0 = r5
            up8 r0 = (defpackage.up8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            up8 r0 = new up8
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            sw7 r0 = r0.a
            defpackage.hre.r(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2e:
            defpackage.hre.r(r5)
            java.lang.Object r5 = r4.d
            sw7 r5 = (defpackage.sw7) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.e     // Catch: java.lang.Throwable -> L54
            zg8 r5 = (defpackage.zg8) r5     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L56
            java.lang.Object r5 = r4.b     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L54
            zg8 r5 = defpackage.qka.a(r5)     // Catch: java.lang.Throwable -> L54
            r4.e = r5     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r4 = move-exception
            goto L61
        L56:
            java.lang.Object r4 = r4.e     // Catch: java.lang.Throwable -> L54
            zg8 r4 = (defpackage.zg8) r4     // Catch: java.lang.Throwable -> L54
            r4.getClass()     // Catch: java.lang.Throwable -> L54
            r0.q(r3)
            return r4
        L61:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.K(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r10.o(r1) == r7) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:26:0x005b, B:30:0x0065), top: B:43:0x005b }] */
    /* JADX WARN: Type inference failed for: r2v3, types: [qw7] */
    /* JADX WARN: Type inference failed for: r9v0, types: [oaa] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5, types: [qw7] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [qw7] */
    /* JADX WARN: Type inference failed for: r9v9, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(defpackage.n42 r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            bt1 r0 = (defpackage.bt1) r0
            boolean r1 = r10 instanceof defpackage.qv9
            if (r1 == 0) goto L17
            r1 = r10
            qv9 r1 = (defpackage.qv9) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            qv9 r1 = new qv9
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.b
            int r2 = r1.d
            r3 = 2
            r4 = 1
            pvc r5 = defpackage.pvc.a
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L35
            qw7 r9 = r1.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L33
            goto L71
        L33:
            r10 = move-exception
            goto L7c
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r6
        L3b:
            qw7 r2 = r1.a
            defpackage.hre.r(r10)
            r10 = r2
            goto L5b
        L42:
            defpackage.hre.r(r10)
            boolean r10 = r0.N()
            if (r10 == 0) goto L4c
            return r5
        L4c:
            java.lang.Object r10 = r9.b
            sw7 r10 = (defpackage.sw7) r10
            r1.a = r10
            r1.d = r4
            java.lang.Object r2 = r10.o(r1)
            if (r2 != r7) goto L5b
            goto L6f
        L5b:
            boolean r2 = r0.N()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L65
            r10.q(r6)
            return r5
        L65:
            r1.a = r10     // Catch: java.lang.Throwable -> L78
            r1.d = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = r9.r(r1)     // Catch: java.lang.Throwable -> L78
            if (r9 != r7) goto L70
        L6f:
            return r7
        L70:
            r9 = r10
        L71:
            r0.P(r5)     // Catch: java.lang.Throwable -> L33
            r9.q(r6)
            return r5
        L78:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L7c:
            r9.q(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.M(n42):java.lang.Object");
    }

    public mi0 N(List list) {
        mi0 mi0Var;
        HashMap hashMap = (HashMap) this.d;
        ArrayList n = n(list);
        if (n.size() < 2) {
            return (mi0) yf2.s(n, null);
        }
        Collections.sort(n, new uk(3));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((mi0) n.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= n.size()) {
                break;
            }
            mi0 mi0Var2 = (mi0) n.get(i3);
            if (i2 != mi0Var2.c) {
                if (arrayList.size() == 1) {
                    return (mi0) n.get(0);
                }
            } else {
                arrayList.add(new Pair(mi0Var2.b, Integer.valueOf(mi0Var2.d)));
                i3++;
            }
        }
        mi0 mi0Var3 = (mi0) hashMap.get(arrayList);
        if (mi0Var3 == null) {
            List subList = n.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((mi0) subList.get(i5)).d;
            }
            int nextInt = ((Random) this.e).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i < subList.size()) {
                    mi0Var = (mi0) subList.get(i);
                    i6 += mi0Var.d;
                    if (nextInt < i6) {
                        break;
                    }
                    i++;
                } else {
                    mi0Var = (mi0) yf2.t(subList);
                    break;
                }
            }
            hashMap.put(arrayList, mi0Var);
            return mi0Var;
        }
        return mi0Var3;
    }

    public void O(Intent intent) {
        boolean z;
        synchronized (((HashMap) this.c)) {
            try {
                intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) this.b).getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                if ((intent.getFlags() & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) ((HashMap) this.d).get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.get(0) == null) {
                            if (z) {
                                throw null;
                            }
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bundle P(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public void Q(r09 r09Var) {
        if (((e19) this.c) == e19.b) {
            sc6 sc6Var = (sc6) this.b;
            if (sc6Var != null) {
                nq2.E(r09Var, sc6Var.h0(0L), new f19((g19) this.e, 1), true);
            } else {
                vs.k("layoutCoordinates not set");
                return;
            }
        }
        this.c = e19.c;
    }

    public void R() {
        ((hm8) this.d).setValue(Boolean.valueOf(!((rz) this.b).isEmpty()));
        ((hm8) this.e).setValue(Boolean.valueOf(!((rz) this.c).isEmpty()));
    }

    public void S(qya qyaVar) {
        qyaVar.getClass();
        ex2 ex2Var = new ex2(26, this, qyaVar);
        synchronized (this.d) {
            Runnable runnable = (Runnable) ((LinkedHashMap) this.e).put(qyaVar, ex2Var);
        }
        ((Handler) ((mce) this.b).a).postDelayed(ex2Var, 5400000L);
    }

    @Override // defpackage.wra
    public yma b() {
        return (bx2) this.e;
    }

    @Override // defpackage.wra
    public osa c() {
        return (cx2) this.d;
    }

    @Override // defpackage.wra
    public void cancel() {
        ((Socket) this.b).close();
    }

    public void d(rr4 rr4Var) {
        if (!((ArrayList) this.b).contains(rr4Var)) {
            synchronized (((ArrayList) this.b)) {
                ((ArrayList) this.b).add(rr4Var);
            }
            rr4Var.G = true;
            return;
        }
        cp8.t(rr4Var, "Fragment already added: ");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // defpackage.zc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.util.Map r5, defpackage.m42 r6) {
        /*
            r4 = this;
            int r5 = r4.a
            ks3 r0 = defpackage.ks3.a
            switch(r5) {
                case 5: goto L46;
                default: goto L7;
            }
        L7:
            boolean r5 = r6 instanceof defpackage.rp8
            if (r5 == 0) goto L1a
            r5 = r6
            rp8 r5 = (defpackage.rp8) r5
            int r1 = r5.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L1a
            int r1 = r1 - r2
            r5.c = r1
            goto L21
        L1a:
            rp8 r5 = new rp8
            n42 r6 = (defpackage.n42) r6
            r5.<init>(r4, r6)
        L21:
            java.lang.Object r6 = r5.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            defpackage.hre.r(r6)
            goto L44
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r0 = 0
            goto L46
        L35:
            defpackage.hre.r(r6)
            r5.c = r2
            java.lang.Object r6 = r4.K(r5)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L44
            r0 = r4
            goto L46
        L44:
            zg8 r6 = (defpackage.zg8) r6
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.e(java.util.Map, m42):java.lang.Object");
    }

    @Override // defpackage.k99
    public Object get() {
        return new ug4((qf4) ((nt2) this.b).a, (wba) ((j99) this.c).get(), (d82) ((j99) this.d).get(), (uba) ((j99) this.e).get());
    }

    @Override // defpackage.o4d
    public long h(js jsVar, js jsVar2, js jsVar3) {
        int b = jsVar.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((ks) this.b).get(i).c(jsVar.a(i), jsVar2.a(i), jsVar3.a(i)));
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0318, code lost:
        if (r3 == r9) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
        if (r3 == r9) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3 A[LOOP:0: B:69:0x01dd->B:71:0x01e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0237  */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r38v0, types: [oaa] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    @Override // defpackage.zc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.String r39, java.util.Map r40, defpackage.n42 r41) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.i(java.lang.String, java.util.Map, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r14 == r5) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // defpackage.zc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.m42 r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.j(m42):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.o8b
    public void k(byte[] bArr, int i, int i2, n8b n8bVar, h12 h12Var) {
        int[] iArr;
        td2 td2Var;
        int i3;
        int i4;
        int i5;
        int z;
        int i6;
        int i7;
        int C2;
        pu8 pu8Var = (pu8) this.d;
        km8 km8Var = (km8) this.c;
        km8 km8Var2 = (km8) this.b;
        km8Var2.K(bArr, i + i2);
        km8Var2.M(i);
        if (((Inflater) this.e) == null) {
            this.e = new Inflater();
        }
        Inflater inflater = (Inflater) this.e;
        String str = a2d.a;
        if (km8Var2.a() > 0 && km8Var2.j() == 120 && a2d.J(km8Var2, km8Var, inflater)) {
            km8Var2.K(km8Var.a, km8Var.c);
        }
        int i8 = 0;
        pu8Var.d = 0;
        int[] iArr2 = pu8Var.b;
        km8 km8Var3 = pu8Var.a;
        pu8Var.e = 0;
        pu8Var.f = 0;
        pu8Var.g = 0;
        pu8Var.h = 0;
        pu8Var.i = 0;
        km8Var3.J(0);
        pu8Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (km8Var2.a() >= 3) {
            int i9 = km8Var2.c;
            int z2 = km8Var2.z();
            int G = km8Var2.G();
            int i10 = km8Var2.b + G;
            if (i10 > i9) {
                km8Var2.M(i9);
                i3 = i8;
                iArr = iArr2;
                td2Var = null;
            } else {
                char c = 128;
                if (z2 != 128) {
                    switch (z2) {
                        case 20:
                            if (G % 5 == 2) {
                                km8Var2.N(2);
                                Arrays.fill(iArr2, i8);
                                int i11 = G / 5;
                                int i12 = i8;
                                while (i12 < i11) {
                                    int z3 = km8Var2.z();
                                    char c2 = c;
                                    double z4 = km8Var2.z();
                                    double z5 = km8Var2.z() - 128;
                                    int[] iArr3 = iArr2;
                                    double z6 = km8Var2.z() - 128;
                                    iArr3[z3] = a2d.i((int) ((z6 * 1.772d) + z4), 0, 255) | (km8Var2.z() << 24) | (a2d.i((int) ((1.402d * z5) + z4), 0, 255) << 16) | (a2d.i((int) ((z4 - (0.34414d * z6)) - (z5 * 0.71414d)), 0, 255) << 8);
                                    i12++;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                pu8Var.c = true;
                                break;
                            }
                            iArr = iArr2;
                            break;
                        case 21:
                            if (G >= 4) {
                                km8Var2.N(3);
                                if ((128 & km8Var2.z()) != 0) {
                                    i7 = 1;
                                } else {
                                    i7 = i8;
                                }
                                int i13 = G - 4;
                                if (i7 != 0) {
                                    if (i13 >= 7 && (C2 = km8Var2.C()) >= 4) {
                                        pu8Var.h = km8Var2.G();
                                        pu8Var.i = km8Var2.G();
                                        km8Var3.J(C2 - 4);
                                        i13 = G - 11;
                                    }
                                }
                                int i14 = km8Var3.b;
                                int i15 = km8Var3.c;
                                if (i14 < i15 && i13 > 0) {
                                    int min = Math.min(i13, i15 - i14);
                                    km8Var2.k(km8Var3.a, i14, min);
                                    km8Var3.M(i14 + min);
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (G >= 19) {
                                pu8Var.d = km8Var2.G();
                                pu8Var.e = km8Var2.G();
                                km8Var2.N(11);
                                pu8Var.f = km8Var2.G();
                                pu8Var.g = km8Var2.G();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    i3 = 0;
                    td2Var = null;
                } else {
                    iArr = iArr2;
                    if (pu8Var.d != 0 && pu8Var.e != 0 && pu8Var.h != 0 && pu8Var.i != 0 && (i4 = km8Var3.c) != 0 && km8Var3.b == i4 && pu8Var.c) {
                        km8Var3.M(0);
                        int i16 = pu8Var.h * pu8Var.i;
                        int[] iArr4 = new int[i16];
                        int i17 = 0;
                        while (i17 < i16) {
                            int z7 = km8Var3.z();
                            if (z7 != 0) {
                                i5 = i17 + 1;
                                iArr4[i17] = iArr[z7];
                            } else {
                                int z8 = km8Var3.z();
                                if (z8 != 0) {
                                    if ((z8 & 64) == 0) {
                                        z = z8 & 63;
                                    } else {
                                        z = ((z8 & 63) << 8) | km8Var3.z();
                                    }
                                    if ((z8 & Token.CASE) == 0) {
                                        i6 = iArr[0];
                                    } else {
                                        i6 = iArr[km8Var3.z()];
                                    }
                                    i5 = z + i17;
                                    Arrays.fill(iArr4, i17, i5, i6);
                                }
                            }
                            i17 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr4, pu8Var.h, pu8Var.i, Bitmap.Config.ARGB_8888);
                        float f2 = pu8Var.d;
                        float f3 = pu8Var.e;
                        td2Var = new td2(null, null, null, createBitmap, pu8Var.g / f3, 0, 0, pu8Var.f / f2, 0, Integer.MIN_VALUE, -3.4028235E38f, pu8Var.h / f2, pu8Var.i / f3, false, -16777216, Integer.MIN_VALUE, nae.e, 0);
                    } else {
                        td2Var = null;
                    }
                    i3 = 0;
                    pu8Var.d = 0;
                    pu8Var.e = 0;
                    pu8Var.f = 0;
                    pu8Var.g = 0;
                    pu8Var.h = 0;
                    pu8Var.i = 0;
                    km8Var3.J(0);
                    pu8Var.c = false;
                }
                km8Var2.M(i10);
            }
            if (td2Var != null) {
                arrayList.add(td2Var);
            }
            i8 = i3;
            iArr2 = iArr;
        }
        h12Var.accept(new wd2(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.o4d
    public js l(long j, js jsVar, js jsVar2, js jsVar3) {
        if (((js) this.d) == null) {
            this.d = jsVar3.c();
        }
        js jsVar4 = (js) this.d;
        if (jsVar4 != null) {
            int b = jsVar4.b();
            int i = 0;
            while (true) {
                js jsVar5 = (js) this.d;
                if (i < b) {
                    if (jsVar5 != null) {
                        jsVar5.e(i, ((ks) this.b).get(i).b(j, jsVar.a(i), jsVar2.a(i), jsVar3.a(i)));
                        i++;
                    } else {
                        c16.w("velocityVector");
                        throw null;
                    }
                } else if (jsVar5 != null) {
                    return jsVar5;
                } else {
                    c16.w("velocityVector");
                    throw null;
                }
            }
        } else {
            c16.w("velocityVector");
            throw null;
        }
    }

    @Override // defpackage.o8b
    public int m() {
        return 2;
    }

    public ArrayList n(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        L(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        L(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            mi0 mi0Var = (mi0) list.get(i);
            if (!hashMap.containsKey(mi0Var.b) && !hashMap2.containsKey(Integer.valueOf(mi0Var.c))) {
                arrayList.add(mi0Var);
            }
        }
        return arrayList;
    }

    public void p(qya qyaVar) {
        Runnable runnable;
        qyaVar.getClass();
        synchronized (this.d) {
            runnable = (Runnable) ((LinkedHashMap) this.e).remove(qyaVar);
        }
        if (runnable != null) {
            ((Handler) ((mce) this.b).a).removeCallbacks(runnable);
        }
    }

    public void q(r09 r09Var, boolean z) {
        g19 g19Var = (g19) this.e;
        List list = r09Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((z09) list.get(i)).c()) {
                Q(r09Var);
                return;
            }
        }
        sc6 sc6Var = (sc6) this.b;
        if (sc6Var != null) {
            nq2.E(r09Var, sc6Var.h0(0L), new jk(12, this, g19Var), false);
            if (((e19) this.c) == e19.b) {
                if (z) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((z09) list.get(i2)).a();
                    }
                }
                ejf ejfVar = r09Var.b;
                if (ejfVar != null) {
                    ejfVar.a = !g19Var.c;
                    return;
                }
                return;
            }
            return;
        }
        vs.k("layoutCoordinates not set");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r7 == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r7 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(defpackage.n42 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.e
            gh2 r0 = (defpackage.gh2) r0
            boolean r1 = r7 instanceof defpackage.qg2
            if (r1 == 0) goto L17
            r1 = r7
            qg2 r1 = (defpackage.qg2) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.c = r2
            goto L1c
        L17:
            qg2 r1 = new qg2
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.a
            int r2 = r1.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.hre.r(r7)
            goto L5b
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L33:
            defpackage.hre.r(r7)
            goto L68
        L37:
            defpackage.hre.r(r7)
            java.lang.Object r7 = r6.d
            java.util.List r7 = (java.util.List) r7
            n82 r2 = defpackage.n82.a
            if (r7 == 0) goto L5e
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L49
            goto L5e
        L49:
            dz5 r7 = r0.h()
            tg2 r5 = new tg2
            r5.<init>(r0, r6, r3)
            r1.c = r4
            java.lang.Object r7 = r7.c(r5, r1)
            if (r7 != r2) goto L5b
            goto L67
        L5b:
            uf2 r7 = (defpackage.uf2) r7
            goto L6a
        L5e:
            r1.c = r5
            r6 = 0
            java.lang.Object r7 = defpackage.gh2.g(r0, r6, r1)
            if (r7 != r2) goto L68
        L67:
            return r2
        L68:
            uf2 r7 = (defpackage.uf2) r7
        L6a:
            fz4 r6 = r0.h
            r6.t0(r7)
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.r(n42):java.lang.Object");
    }

    public rr4 s(String str) {
        ns4 ns4Var = (ns4) ((HashMap) this.c).get(str);
        if (ns4Var != null) {
            return ns4Var.c;
        }
        return null;
    }

    public rr4 t(String str) {
        for (ns4 ns4Var : ((HashMap) this.c).values()) {
            if (ns4Var != null) {
                rr4 rr4Var = ns4Var.c;
                if (!str.equals(rr4Var.e)) {
                    rr4Var = rr4Var.R.c.t(str);
                }
                if (rr4Var != null) {
                    return rr4Var;
                }
            }
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                String socket = ((Socket) this.b).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.o4d
    public js u(long j, js jsVar, js jsVar2, js jsVar3) {
        if (((js) this.c) == null) {
            this.c = jsVar.c();
        }
        js jsVar4 = (js) this.c;
        if (jsVar4 != null) {
            int b = jsVar4.b();
            int i = 0;
            while (true) {
                js jsVar5 = (js) this.c;
                if (i < b) {
                    if (jsVar5 != null) {
                        jsVar5.e(i, ((ks) this.b).get(i).e(j, jsVar.a(i), jsVar2.a(i), jsVar3.a(i)));
                        i++;
                    } else {
                        c16.w("valueVector");
                        throw null;
                    }
                } else if (jsVar5 != null) {
                    return jsVar5;
                } else {
                    c16.w("valueVector");
                    throw null;
                }
            }
        } else {
            c16.w("valueVector");
            throw null;
        }
    }

    @Override // defpackage.o4d
    public js v(js jsVar, js jsVar2, js jsVar3) {
        if (((js) this.e) == null) {
            this.e = jsVar3.c();
        }
        js jsVar4 = (js) this.e;
        if (jsVar4 != null) {
            int b = jsVar4.b();
            int i = 0;
            while (true) {
                js jsVar5 = (js) this.e;
                if (i < b) {
                    if (jsVar5 != null) {
                        jsVar5.e(i, ((ks) this.b).get(i).d(jsVar.a(i), jsVar2.a(i), jsVar3.a(i)));
                        i++;
                    } else {
                        c16.w("endVelocityVector");
                        throw null;
                    }
                } else if (jsVar5 != null) {
                    return jsVar5;
                } else {
                    c16.w("endVelocityVector");
                    throw null;
                }
            }
        } else {
            c16.w("endVelocityVector");
            throw null;
        }
    }

    public ArrayList w() {
        ArrayList arrayList = new ArrayList();
        for (ns4 ns4Var : ((HashMap) this.c).values()) {
            if (ns4Var != null) {
                arrayList.add(ns4Var);
            }
        }
        return arrayList;
    }

    public ArrayList x() {
        ArrayList arrayList = new ArrayList();
        for (ns4 ns4Var : ((HashMap) this.c).values()) {
            if (ns4Var != null) {
                arrayList.add(ns4Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public j40 y(String str) {
        str.getClass();
        j40 j40Var = new j40();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        bx9 bx9Var = new bx9(lowerCase);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        if (linkedHashMap.containsKey(bx9Var)) {
            Object obj = linkedHashMap.get(bx9Var);
            obj.getClass();
            Iterator it = ((Map) obj).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                yw9 yw9Var = (yw9) entry.getKey();
                if (entry.getValue() != null) {
                    vm1.h();
                    return null;
                }
                String str2 = yw9Var.a;
                throw null;
            }
        }
        return j40Var;
    }

    public List z() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public oaa(mce mceVar, rwa rwaVar) {
        this.a = 27;
        mceVar.getClass();
        this.b = mceVar;
        this.c = rwaVar;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public oaa(String str, ga4 ga4Var, String str2, byte[] bArr, String str3, String str4) {
        this.a = 9;
        this.c = ga4Var;
        this.b = str2;
        this.d = bArr;
        this.e = str3;
    }

    public oaa(String str, ii2 ii2Var, int i) {
        this.a = i;
        switch (i) {
            case 19:
                this.b = str;
                this.c = ii2Var;
                this.d = new sw7();
                return;
            default:
                this.b = str;
                this.c = ii2Var;
                this.d = new sw7();
                return;
        }
    }

    public oaa(m82 m82Var, u0 u0Var, pg2 pg2Var, cv0 cv0Var) {
        this.a = 25;
        this.b = m82Var;
        this.c = cv0Var;
        this.d = xpe.a(Integer.MAX_VALUE, 6, null);
        this.e = new uwd(5);
        w26 w26Var = (w26) m82Var.q().get(r0f.I);
        if (w26Var != null) {
            w26Var.invokeOnCompletion(new r6a(3, u0Var, this, pg2Var));
        }
    }

    public oaa(m96 m96Var) {
        this.a = 2;
        this.b = m96Var;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        newSetFromMap.getClass();
        this.c = newSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.d = concurrentHashMap;
        x3b x3bVar = E;
        q0a q0aVar = new q0a(x3bVar, "_root_", null, m96Var, 8);
        this.e = q0aVar;
        newSetFromMap.add(x3bVar);
        concurrentHashMap.put("_root_", q0aVar);
    }

    public oaa(Socket socket) {
        this.a = 8;
        this.b = socket;
        this.c = new AtomicInteger();
        this.d = new cx2(this);
        this.e = new bx2(this);
    }

    public oaa(g19 g19Var) {
        this.a = 21;
        this.e = g19Var;
        this.c = e19.a;
    }

    public /* synthetic */ oaa(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public oaa(Typeface typeface, xb7 xb7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a = 14;
        this.e = typeface;
        this.b = xb7Var;
        this.d = new zb7(1024);
        int a = xb7Var.a(6);
        if (a != 0) {
            int i5 = a + xb7Var.a;
            i = ((ByteBuffer) xb7Var.d).getInt(((ByteBuffer) xb7Var.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.c = new char[i * 2];
        int a2 = xb7Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + xb7Var.a;
            i2 = ((ByteBuffer) xb7Var.d).getInt(((ByteBuffer) xb7Var.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            xsc xscVar = new xsc(this, i7);
            wb7 b = xscVar.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.d).getInt(a3 + b.a) : 0, (char[]) this.c, i7 * 2);
            wb7 b2 = xscVar.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                zb7 zb7Var = (zb7) this.d;
                wb7 b3 = xscVar.b();
                int a5 = b3.a(16);
                if (a5 != 0) {
                    int i9 = a5 + b3.a;
                    i4 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                zb7Var.a(xscVar, 0, i4 - 1);
            } else {
                vs.m("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public oaa(Context context, int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = context.getApplicationContext();
                this.c = gp5.o;
                this.d = null;
                this.e = new v94();
                return;
            default:
                this.c = new HashMap();
                this.d = new HashMap();
                this.e = new ArrayList();
                this.b = context;
                new s30(this, context.getMainLooper(), 1);
                return;
        }
    }

    public oaa(int i) {
        this.a = i;
        switch (i) {
            case 4:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            case 6:
                return;
            case 11:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                return;
            case 12:
                this.b = new rz();
                this.c = new rz();
                Boolean bool = Boolean.FALSE;
                this.d = yae.z(bool);
                this.e = yae.z(bool);
                return;
            case 15:
                final hn8 f2 = hn8.f(ie2.u(pe4.a), "analyzer");
                this.b = new mfb(new vt4(this) { // from class: cx7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i2 = r3;
                        hn8 hn8Var = f2;
                        switch (i2) {
                            case 0:
                                return oaa.G(hn8.f(hn8Var, "phienam.txt"));
                            case 1:
                                return oaa.G(hn8.f(hn8Var, "ho.txt"));
                            case 2:
                                return oaa.G(hn8.f(hn8Var, "nhanxung.txt"));
                            default:
                                return oaa.G(hn8.f(hn8Var, "loc.txt"));
                        }
                    }
                });
                this.c = new mfb(new vt4(this) { // from class: cx7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i2 = r3;
                        hn8 hn8Var = f2;
                        switch (i2) {
                            case 0:
                                return oaa.G(hn8.f(hn8Var, "phienam.txt"));
                            case 1:
                                return oaa.G(hn8.f(hn8Var, "ho.txt"));
                            case 2:
                                return oaa.G(hn8.f(hn8Var, "nhanxung.txt"));
                            default:
                                return oaa.G(hn8.f(hn8Var, "loc.txt"));
                        }
                    }
                });
                this.d = new mfb(new vt4(this) { // from class: cx7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i2 = r3;
                        hn8 hn8Var = f2;
                        switch (i2) {
                            case 0:
                                return oaa.G(hn8.f(hn8Var, "phienam.txt"));
                            case 1:
                                return oaa.G(hn8.f(hn8Var, "ho.txt"));
                            case 2:
                                return oaa.G(hn8.f(hn8Var, "nhanxung.txt"));
                            default:
                                return oaa.G(hn8.f(hn8Var, "loc.txt"));
                        }
                    }
                });
                this.e = new mfb(new vt4(this) { // from class: cx7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i2 = r3;
                        hn8 hn8Var = f2;
                        switch (i2) {
                            case 0:
                                return oaa.G(hn8.f(hn8Var, "phienam.txt"));
                            case 1:
                                return oaa.G(hn8.f(hn8Var, "ho.txt"));
                            case 2:
                                return oaa.G(hn8.f(hn8Var, "nhanxung.txt"));
                            default:
                                return oaa.G(hn8.f(hn8Var, "loc.txt"));
                        }
                    }
                });
                return;
            case 20:
                this.b = new km8();
                this.c = new km8();
                this.d = new pu8();
                return;
            case 23:
                this.b = new HashSet();
                this.c = new LinkedHashMap();
                this.d = new LinkedHashMap();
                this.e = new LinkedHashMap();
                return;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                return;
        }
    }

    public oaa(mm9 mm9Var, ix7 ix7Var, eb5 eb5Var, ix7 ix7Var2) {
        Object obj;
        this.a = 16;
        if (mm9Var != null) {
            obj = qs5.l(mm9Var);
        } else {
            ms5 ms5Var = qs5.b;
            obj = mm9.e;
        }
        this.b = obj;
        this.c = ix7Var;
        this.d = eb5Var;
        this.e = ix7Var2;
    }

    public oaa(gh2 gh2Var, List list) {
        this.a = 7;
        this.e = gh2Var;
        this.b = new sw7();
        this.c = jxe.c();
        this.d = sl1.C0(list);
    }

    public oaa(long j, long j2, long j3) {
        this.a = 26;
        this.b = yae.z(new dna(j));
        this.c = yae.z(new y78(j2));
        this.d = yae.z(new y78(j3));
        this.e = yae.z(new y78(j2));
    }

    public oaa(AudioTrack audioTrack, uwd uwdVar) {
        this.a = 3;
        this.b = audioTrack;
        this.c = uwdVar;
        Handler p = a2d.p(null);
        this.d = p;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: k60
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                oaa oaaVar = oaa.this;
                if (((k60) oaaVar.e) == null) {
                    return;
                }
                eg0.s().execute(new b9(8, oaaVar, audioRouting));
            }
        };
        this.e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, p);
    }

    public oaa(ks ksVar) {
        this.a = 29;
        this.b = ksVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oaa(ri4 ri4Var) {
        this(new xk9(ri4Var, 11));
        this.a = 29;
    }

    public oaa(bjc bjcVar, boolean[] zArr) {
        this.a = 22;
        this.b = bjcVar;
        this.c = zArr;
        int i = bjcVar.a;
        this.d = new boolean[i];
        this.e = new boolean[i];
    }

    public oaa(String str, String str2, String str3, tv5 tv5Var) {
        this.a = 18;
        str.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = tv5Var;
    }
}
