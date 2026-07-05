package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.Editable;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kw5  reason: default package */
/* loaded from: classes.dex */
public class kw5 implements qj1, vfd, x9a, SuccessContinuation, x00, y75 {
    public static lld e;
    public static volatile kw5 f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public static final Object d = new Object();
    public static final Object C = new Object();

    public kw5(int i) {
        this.a = i;
        switch (i) {
            case 21:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                return;
            case 23:
                this.b = new HashMap();
                this.c = uk1.b;
                return;
            case 27:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                return;
            case 28:
                this.b = new HashMap();
                return;
            default:
                return;
        }
    }

    public static void c(kw5 kw5Var, uk1 uk1Var) {
        kw5Var.getClass();
        for (Map.Entry entry : new HashMap((HashMap) kw5Var.b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!n(uk1Var, list).equals(n((uk1) kw5Var.c, list))) {
                    throw null;
                }
            } else {
                vm1.h();
                return;
            }
        }
        kw5Var.c = uk1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kw5 d(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            kw5 r2 = new kw5     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 15
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw5.d(android.content.Context):kw5");
    }

    public static Task i(Context context, Intent intent, boolean z) {
        lld lldVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (d) {
            try {
                if (e == null) {
                    e = new lld(context);
                }
                lldVar = e;
            } finally {
            }
        }
        if (z) {
            if (oaa.A().D(context)) {
                synchronized (zr1.f) {
                    try {
                        zr1.j(context);
                        boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                        if (!booleanExtra) {
                            zr1.g.a();
                        }
                        lldVar.b(intent).addOnCompleteListener(new d89(intent, 13));
                    } finally {
                    }
                }
            } else {
                lldVar.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return lldVar.b(intent).continueWith(new az(1), new fb4(1));
    }

    public static uk1 n(uk1 uk1Var, List list) {
        uk1Var.getClass();
        Map map = uk1Var.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new uk1(hashMap);
    }

    public static int v(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        if (i3 + 1 > i2) {
            return i4 + 1;
        }
        return i4;
    }

    public Task A(final Intent intent) {
        boolean z;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.b;
        az azVar = (az) this.c;
        final boolean z2 = true;
        if (yz1.o() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z2 = false;
        }
        if (z && !z2) {
            return i(context, intent, z2);
        }
        return Tasks.call(azVar, new db4(0, context, intent)).continueWithTask(azVar, new Continuation() { // from class: eb4
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (yz1.o() && ((Integer) task.getResult()).intValue() == 402) {
                    return kw5.i(context, intent, z2).continueWith(new az(1), new fb4(0));
                }
                return task;
            }
        });
    }

    public void B() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    public InputMethodManager C() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.c;
        if (inputMethodManager == null) {
            Object systemService = ((View) this.b).getContext().getSystemService("input_method");
            systemService.getClass();
            InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
            this.c = inputMethodManager2;
            return inputMethodManager2;
        }
        return inputMethodManager;
    }

    public fjc E(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 < iArr.length) {
                if (i == iArr[i2]) {
                    return ((fx9[]) this.c)[i2];
                }
                i2++;
            } else {
                st0.h("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new n73();
            }
        }
    }

    public void F(int i, int i2, int i3) {
        int i4;
        if (i == i2 && i3 == 0) {
            return;
        }
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i5 = i3 - (max - min);
        int i6 = 0;
        ra1 ra1Var = null;
        boolean z = false;
        while (true) {
            gw7 gw7Var = (gw7) this.b;
            if (i6 >= gw7Var.c) {
                break;
            }
            ra1 ra1Var2 = (ra1) gw7Var.a[i6];
            int i7 = ra1Var2.a;
            if ((min <= i7 && i7 <= max) || ((min <= (i4 = ra1Var2.b) && i4 <= max) || ((min <= i4 && i7 <= min) || (max <= i4 && i7 <= max)))) {
                if (ra1Var == null) {
                    ra1Var = ra1Var2;
                } else {
                    ra1Var.b = ra1Var2.b;
                    ra1Var.d = ra1Var2.d;
                }
            } else {
                if (i7 > max && !z) {
                    f(ra1Var, min, max, i5);
                    z = true;
                }
                if (z) {
                    ra1Var2.a += i5;
                    ra1Var2.b += i5;
                }
                ((gw7) this.c).b(ra1Var2);
            }
            i6++;
        }
        if (!z) {
            f(ra1Var, min, max, i5);
        }
        gw7 gw7Var2 = (gw7) this.b;
        this.b = (gw7) this.c;
        this.c = gw7Var2;
        gw7Var2.g();
    }

    public void G() {
        synchronized (this) {
            ((AtomicInteger) this.b).decrementAndGet();
            if (((AtomicInteger) this.b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // defpackage.x9a
    public s76 a(gi1 gi1Var) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class B = nmd.B(gi1Var);
        Object obj = concurrentHashMap.get(B);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(B, (obj = new v41((s76) ((xt4) this.b).invoke(gi1Var))))) != null) {
            obj = putIfAbsent;
        }
        return ((v41) obj).a;
    }

    @Override // defpackage.vfd
    public void b(String str) {
        this.b = str;
    }

    @Override // defpackage.x00
    public ListenableFuture call() {
        int i = ty3.e;
        if (!((ty3) this.b).compareAndSet(sy3.a, sy3.c)) {
            ds5 ds5Var = ds5.D;
            if (ds5Var != null) {
                return ds5Var;
            }
            return new ds5();
        }
        return ((x00) this.c).call();
    }

    public void e(gi1 gi1Var, xt4 xt4Var, xt4 xt4Var2, tu1 tu1Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (!linkedHashMap.containsKey(gi1Var)) {
            linkedHashMap.put(gi1Var, new nu3(gi1Var, xt4Var, xt4Var2, tu1Var));
        } else {
            p1a.k(hl5.n("An `entry` with the same `clazz` has already been added: ", gi1Var.g(), "."));
        }
    }

    public void f(ra1 ra1Var, int i, int i2, int i3) {
        int i4;
        gw7 gw7Var = (gw7) this.c;
        int i5 = gw7Var.c;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 != 0) {
            ra1 ra1Var2 = (ra1) gw7Var.a[i5 - 1];
            i4 = ra1Var2.b - ra1Var2.d;
        } else {
            p1a.l("MutableVector is empty.");
            return;
        }
        if (ra1Var == null) {
            int i6 = i - i4;
            ra1Var = new ra1(i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (ra1Var.a > i) {
                ra1Var.a = i;
                ra1Var.c = i;
            }
            int i7 = ra1Var.b;
            if (i2 > i7) {
                ra1Var.b = i2;
                ra1Var.d = i2 - (i7 - ra1Var.d);
            }
            ra1Var.b += i3;
        }
        gw7Var.b(ra1Var);
    }

    @Override // defpackage.vfd
    public ygd g(String str) {
        fy0 fy0Var = (fy0) this.c;
        if (((lx0) fy0Var.D.getValue()).b) {
            if (((Boolean) z87.C(gs3.a, new by0(fy0Var, str, null, 2))).booleanValue()) {
                return new ygd(new byte[0]);
            }
        }
        return null;
    }

    @Override // defpackage.y75
    public an8 h(u75 u75Var, q75 q75Var) {
        return new s6f(((y75) this.b).h(u75Var, q75Var), (List) this.c);
    }

    public boolean j() {
        synchronized (this) {
            if (((AtomicBoolean) this.c).get()) {
                return false;
            }
            ((AtomicInteger) this.b).incrementAndGet();
            return true;
        }
    }

    public void k() {
        ((gw7) this.b).g();
    }

    @Override // defpackage.y75
    public an8 m() {
        return new s6f(((y75) this.b).m(), (List) this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public ArrayList o() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.b;
        Class cls = (Class) ((mce) this.c).a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), Token.CASE);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new gu1(str2, 0));
        }
        return arrayList2;
    }

    public ClipboardManager p() {
        ClipboardManager clipboardManager = (ClipboardManager) this.c;
        if (clipboardManager == null) {
            Object systemService = ((Context) this.b).getSystemService("clipboard");
            systemService.getClass();
            ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
            this.c = clipboardManager2;
            return clipboardManager2;
        }
        return clipboardManager;
    }

    public r94 q(Object... objArr) {
        Constructor a;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a = ((ls2) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating extension", e2);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (r94) a.newInstance(objArr);
        } catch (Exception e3) {
            throw new IllegalStateException("Unexpected error creating extractor", e3);
        }
    }

    public InputMethodManager r() {
        return (InputMethodManager) ((ye6) this.c).getValue();
    }

    public b37 t() {
        return (b37) ((hm8) this.c).getValue();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        i92 i92Var = (i92) this.c;
        if (!bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            oe4 oe4Var = i92Var.g;
            for (File file : oe4.f(((File) oe4Var.d).listFiles(i92.r))) {
                file.delete();
            }
            oe4 oe4Var2 = ((ta2) i92Var.m.b).b;
            ta2.a(oe4.f(((File) oe4Var2.f).listFiles()));
            ta2.a(oe4.f(((File) oe4Var2.C).listFiles()));
            ta2.a(oe4.f(((File) oe4Var2.D).listFiles()));
            i92Var.q.trySetResult(null);
            return Tasks.forResult(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean booleanValue = bool.booleanValue();
        wf2 wf2Var = i92Var.b;
        if (booleanValue) {
            ((TaskCompletionSource) wf2Var.e).trySetResult(null);
            return ((Task) this.b).onSuccessTask((wa2) i92Var.e.b, new mu9(this));
        }
        wf2Var.getClass();
        vs.k("An invalid data collection token was used.");
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                gw7 gw7Var = (gw7) this.b;
                Object[] objArr = gw7Var.a;
                int i = gw7Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ra1 ra1Var = (ra1) objArr[i2];
                    sb.append(hl5.j(ra1Var.a, ra1Var.b, ",", ")", hl5.r(ra1Var.c, ra1Var.d, "(", ",", ")->(")));
                    if (i2 < ((gw7) this.b).c - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            case 22:
                return ((x00) this.c).toString();
            default:
                return super.toString();
        }
    }

    public synchronized Map u() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.c;
    }

    @Override // defpackage.vfd
    public void w(String str, nl5 nl5Var) {
        str.getClass();
        fy0 fy0Var = (fy0) this.c;
        hk1 a = jdd.a(fy0Var);
        sw2 sw2Var = ab3.a;
        fy0Var.f(a, ru2.c, new by0(fy0Var, str, null, 0));
        fy0Var.l();
    }

    @Override // defpackage.vfd
    public void x(String str) {
        fy0 fy0Var = (fy0) this.c;
        hk1 a = jdd.a(fy0Var);
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        fy0Var.f(a, ru2Var, new by0(fy0Var, str, null, 0));
        fy0Var.f(jdd.a(fy0Var), ru2Var, new zx0(fy0Var, (String) this.b, str, null, 0));
    }

    public void y() {
        ((SparseIntArray) this.b).clear();
    }

    public void z(hpc hpcVar) {
        AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) this.b;
        m41 m41Var = androidTextToSpeechService.L;
        sw2 sw2Var = ab3.a;
        z87.v(m41Var, zz6.a.f, null, new lo(0, null, androidTextToSpeechService), 2);
        AndroidTextToSpeechService.a((AndroidTextToSpeechService) this.b).d(false, false);
        AndroidTextToSpeechService.S = false;
        AndroidTextToSpeechService.a((AndroidTextToSpeechService) this.b).c();
        ix3.a(hpcVar);
    }

    public void D() {
    }

    public /* synthetic */ kw5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ kw5(Object obj, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = null;
    }

    public kw5(String str, String str2) {
        this.a = 26;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.b = str;
            this.c = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public kw5(kw5 kw5Var) {
        gw7 gw7Var;
        this.a = 8;
        this.b = new gw7(new ra1[16], 0);
        this.c = new gw7(new ra1[16], 0);
        if (kw5Var == null || (gw7Var = (gw7) kw5Var.b) == null) {
            return;
        }
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ra1 ra1Var = (ra1) objArr[i2];
            ((gw7) this.b).b(new ra1(ra1Var.a, ra1Var.b, ra1Var.c, ra1Var.d));
        }
    }

    public kw5(od6 od6Var, b37 b37Var) {
        this.a = 29;
        this.b = od6Var;
        this.c = yae.z(b37Var);
    }

    public kw5(m96 m96Var) {
        this.a = 13;
        this.b = m96Var;
        this.c = new ArrayList();
    }

    public kw5(yw7 yw7Var) {
        this.a = 9;
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
    }

    public kw5(Context context, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = new AtomicLong(-1L);
                this.b = new tz4(context, null, xb4.n, new flb("module:cronet_dynamite"), sz4.c);
                return;
            default:
                this.b = context;
                this.c = new az(1);
                return;
        }
    }

    public kw5(View view) {
        this.a = 0;
        this.b = view;
        this.c = ipe.x(sk6.c, new t42(this, 27));
    }

    public /* synthetic */ kw5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public kw5(fy0 fy0Var) {
        this.a = 7;
        this.c = fy0Var;
        this.b = "";
    }

    public kw5(xt4 xt4Var) {
        this.a = 12;
        this.b = xt4Var;
        this.c = new ConcurrentHashMap();
    }

    public kw5(Animator animator) {
        this.a = 25;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.text.Editable$Factory, gq3] */
    public kw5(wv wvVar) {
        this.a = 20;
        this.b = wvVar;
        yr3 yr3Var = new yr3(wvVar);
        this.c = yr3Var;
        wvVar.addTextChangedListener(yr3Var);
        if (gq3.b == null) {
            synchronized (gq3.a) {
                try {
                    if (gq3.b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            gq3.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, gq3.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        gq3.b = factory;
                    }
                } finally {
                }
            }
        }
        wvVar.setEditableFactory(gq3.b);
    }

    public kw5(wy2 wy2Var) {
        this.a = 18;
        this.c = wy2Var;
    }

    public kw5(i92 i92Var, Task task) {
        this.a = 14;
        this.c = i92Var;
        this.b = task;
    }

    public kw5(ls2 ls2Var) {
        this.a = 17;
        this.b = ls2Var;
        this.c = new AtomicBoolean(false);
    }
}
