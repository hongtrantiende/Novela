package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i92  reason: default package */
/* loaded from: classes.dex */
public final class i92 {
    public static final e92 r = new e92(1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final wf2 b;
    public final s6f c;
    public final oe4 d;
    public final ij1 e;
    public final al5 f;
    public final oe4 g;
    public final vw h;
    public final s6f i;
    public final q92 j;
    public final ad k;
    public final f92 l;
    public final qu1 m;
    public va2 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public i92(Context context, al5 al5Var, wf2 wf2Var, oe4 oe4Var, s6f s6fVar, vw vwVar, oe4 oe4Var2, s6f s6fVar2, qu1 qu1Var, q92 q92Var, ad adVar, f92 f92Var, ij1 ij1Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = al5Var;
        this.b = wf2Var;
        this.g = oe4Var;
        this.c = s6fVar;
        this.h = vwVar;
        this.d = oe4Var2;
        this.i = s6fVar2;
        this.j = q92Var;
        this.k = adVar;
        this.l = f92Var;
        this.m = qu1Var;
        this.e = ij1Var;
    }

    public static Task a(i92 i92Var) {
        Task call;
        i92Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : oe4.f(((File) i92Var.g.d).listFiles(r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new h92(i92Var, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021a  */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [int] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v40, types: [za0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Object, lb0] */
    /* JADX WARN: Type inference failed for: r12v39, types: [vb0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15, types: [za0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r32, defpackage.tc0 r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i92.b(boolean, tc0, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [jb0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [fb0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [wa0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ec0, java.lang.Object] */
    public final void c(String str, Boolean bool) {
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        Integer num;
        Map unmodifiableMap;
        List unmodifiableList;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String m = s21.m("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", m, null);
        }
        Locale locale = Locale.US;
        al5 al5Var = this.f;
        vw vwVar = this.h;
        String str6 = al5Var.c;
        String str7 = vwVar.f;
        String str8 = vwVar.g;
        String str9 = al5Var.c().a;
        if (vwVar.d != null) {
            i = 4;
        } else {
            i = 1;
        }
        hd0 hd0Var = new hd0(str6, str7, str8, str9, nk2.a(i), vwVar.h);
        String str10 = Build.VERSION.RELEASE;
        String str11 = Build.VERSION.CODENAME;
        jd0 jd0Var = new jd0(fca.p());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        uq1 uq1Var = uq1.a;
        String str12 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str12)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            uq1 uq1Var2 = (uq1) uq1.b.get(str12.toLowerCase(locale));
            if (uq1Var2 != null) {
                uq1Var = uq1Var2;
            }
        }
        int ordinal = uq1Var.ordinal();
        String str13 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long e = fca.e(context);
        boolean o = fca.o();
        int i3 = fca.i();
        String str14 = Build.MANUFACTURER;
        String str15 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new gd0(hd0Var, jd0Var, new id0(ordinal, availableProcessors, e, blockCount, o, i3)));
        if (bool.booleanValue() && str != null) {
            oe4 oe4Var = this.d;
            synchronized (((String) oe4Var.b)) {
                oe4Var.b = str;
                k96 k96Var = (k96) ((AtomicMarkableReference) ((o40) oe4Var.e).b).getReference();
                synchronized (k96Var) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(k96Var.a));
                }
                jt1 jt1Var = (jt1) oe4Var.C;
                synchronized (jt1Var) {
                    unmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) jt1Var.c));
                }
                str3 = str14;
                str5 = str13;
                str2 = str11;
                str4 = str15;
                i2 = 4;
                ((wa2) ((ij1) oe4Var.d).c).a(new rw2(oe4Var, str, unmodifiableMap, unmodifiableList, 2));
            }
        } else {
            str2 = str11;
            str3 = str14;
            str4 = str15;
            str5 = str13;
            i2 = 4;
        }
        s6f s6fVar = this.i;
        ((xd4) s6fVar.b).a();
        s6fVar.b = s6f.c;
        if (str != null) {
            s6fVar.b = new zf9(((oe4) s6fVar.a).c(str, "userlog"));
        }
        this.l.a(str);
        qu1 qu1Var = this.m;
        ra2 ra2Var = (ra2) qu1Var.a;
        Charset charset = qa2.a;
        ?? obj = new Object();
        obj.a = "20.0.6";
        vw vwVar2 = ra2Var.c;
        String str16 = vwVar2.a;
        if (str16 != null) {
            obj.b = str16;
            al5 al5Var2 = ra2Var.b;
            String str17 = al5Var2.c().a;
            if (str17 != null) {
                obj.d = str17;
                obj.e = al5Var2.c().b;
                obj.f = al5Var2.c().c;
                String str18 = vwVar2.f;
                if (str18 != null) {
                    obj.h = str18;
                    String str19 = vwVar2.g;
                    if (str19 != null) {
                        obj.i = str19;
                        obj.c = i2;
                        obj.m = (byte) (obj.m | 1);
                        ?? obj2 = new Object();
                        obj2.f = false;
                        obj2.d = currentTimeMillis;
                        obj2.m = (byte) (((byte) (obj2.m | 2)) | 1);
                        if (str != null) {
                            obj2.b = str;
                            String str20 = ra2.g;
                            if (str20 != null) {
                                obj2.a = str20;
                                String str21 = al5Var2.c;
                                if (str21 != null) {
                                    String str22 = al5Var2.c().a;
                                    kw5 kw5Var = vwVar2.h;
                                    if (((k53) kw5Var.c) == null) {
                                        kw5Var.c = new k53(kw5Var);
                                    }
                                    k53 k53Var = (k53) kw5Var.c;
                                    String str23 = k53Var.b;
                                    if (k53Var == null) {
                                        kw5Var.c = new k53(kw5Var);
                                    }
                                    obj2.g = new hb0(str21, str18, str19, str22, str23, ((k53) kw5Var.c).c);
                                    ?? obj3 = new Object();
                                    obj3.a = 3;
                                    obj3.e = (byte) (obj3.e | 1);
                                    if (str10 != null) {
                                        obj3.b = str10;
                                        if (str2 != null) {
                                            obj3.c = str2;
                                            obj3.d = fca.p();
                                            obj3.e = (byte) (obj3.e | 2);
                                            obj2.i = obj3.a();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i4 = 7;
                                            if (!TextUtils.isEmpty(str12) && (num = (Integer) ra2.f.get(str12.toLowerCase(locale))) != null) {
                                                i4 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long e2 = fca.e(ra2Var.a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean o2 = fca.o();
                                            int i5 = fca.i();
                                            ?? obj4 = new Object();
                                            obj4.a = i4;
                                            byte b = (byte) (obj4.j | 1);
                                            obj4.j = b;
                                            if (str5 != null) {
                                                obj4.b = str5;
                                                obj4.c = availableProcessors2;
                                                obj4.d = e2;
                                                obj4.e = blockCount2;
                                                obj4.f = o2;
                                                obj4.g = i5;
                                                obj4.j = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16)) | 32);
                                                String str24 = str3;
                                                if (str24 != null) {
                                                    obj4.h = str24;
                                                    String str25 = str4;
                                                    if (str25 != null) {
                                                        obj4.i = str25;
                                                        obj2.j = obj4.a();
                                                        obj2.l = 3;
                                                        obj2.m = (byte) (obj2.m | 4);
                                                        obj.j = obj2.a();
                                                        xa0 a = obj.a();
                                                        oe4 oe4Var2 = ((ta2) qu1Var.b).b;
                                                        pa2 pa2Var = a.k;
                                                        if (pa2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str26 = ((gb0) pa2Var).b;
                                                        try {
                                                            ta2.g.getClass();
                                                            ta2.f(oe4Var2.c(str26, "report"), sa2.a.h(a));
                                                            File c = oe4Var2.c(str26, "start-time");
                                                            long j = ((gb0) pa2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(c), ta2.e);
                                                            outputStreamWriter.write("");
                                                            c.setLastModified(j * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e3) {
                                                            String m2 = s21.m("Could not persist report for session ", str26);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", m2, e3);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    xk5.k("Null modelClass");
                                                    return;
                                                }
                                                xk5.k("Null manufacturer");
                                                return;
                                            }
                                            xk5.k("Null model");
                                            return;
                                        }
                                        xk5.k("Null buildVersion");
                                        return;
                                    }
                                    xk5.k("Null version");
                                    return;
                                }
                                xk5.k("Null identifier");
                                return;
                            }
                            xk5.k("Null generator");
                            return;
                        }
                        xk5.k("Null identifier");
                        return;
                    }
                    xk5.k("Null displayVersion");
                    return;
                }
                xk5.k("Null buildVersion");
                return;
            }
            xk5.k("Null installationUuid");
            return;
        }
        xk5.k("Null gmpAppId");
    }

    public final boolean d(tc0 tc0Var) {
        ij1.n();
        va2 va2Var = this.n;
        if (va2Var != null && va2Var.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, tc0Var, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet c = ((ta2) this.m.b).c();
        if (!c.isEmpty()) {
            return (String) c.first();
        }
        return null;
    }

    public final String f() {
        String string;
        InputStream resourceAsStream;
        Context context = this.a;
        int l = fca.l(context, "com.google.firebase.crashlytics.version_control_info", "string");
        if (l == 0) {
            string = null;
        } else {
            string = context.getResources().getString(l);
        }
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = i92.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream != null) {
            try {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Read version control info from file", null);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                }
            } catch (Throwable th) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
    }

    public final void g() {
        try {
            String f = f();
            if (f != null) {
                try {
                    this.d.g(f);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void h(Task task) {
        Task task2;
        Task p;
        TaskCompletionSource taskCompletionSource = this.o;
        oe4 oe4Var = ((ta2) this.m.b).b;
        if (oe4.f(((File) oe4Var.f).listFiles()).isEmpty() && oe4.f(((File) oe4Var.C).listFiles()).isEmpty() && oe4.f(((File) oe4Var.D).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        ox9 ox9Var = ox9.E;
        ox9Var.A("Crash reports are available to be sent.");
        wf2 wf2Var = this.b;
        if (wf2Var.j()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            p = Tasks.forResult(Boolean.TRUE);
        } else {
            ox9Var.n("Automatic data collection is disabled.");
            ox9Var.A("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (wf2Var.c) {
                task2 = ((TaskCompletionSource) wf2Var.d).getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new cne(20));
            ox9Var.n("Waiting for send/deleteUnsentReports to be called.");
            p = q1d.p(onSuccessTask, this.p.getTask());
        }
        p.onSuccessTask((wa2) this.e.b, new kw5(this, task));
    }
}
